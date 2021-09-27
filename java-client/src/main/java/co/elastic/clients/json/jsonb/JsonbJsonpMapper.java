/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.json.jsonb;

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpDeserializer;
import jakarta.json.bind.spi.JsonbProvider;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.util.EnumSet;

public class JsonbJsonpMapper implements JsonpMapper {

    private final JsonProvider jsonProvider;
    private final JsonbProvider jsonbProvider;

    public JsonbJsonpMapper(JsonProvider jsonProvider, JsonbProvider jsonbProvider) {
        this.jsonProvider = jsonProvider;
        this.jsonbProvider = jsonbProvider;
    }

    public JsonbJsonpMapper() {
        this(JsonProvider.provider(), JsonbProvider.provider());
    }

    @Override
    public <T> JsonpDeserializer<T> getDeserializer(Class<T> clazz) {
        return new Deserializer<>(clazz);
    }

    @Override
    public <T> void serialize(T value, JsonGenerator generator) {
        // Jsonb doesn't offer a way to serialize to a json generator, so we have to roundtrip via a string representation.
        CharArrayWriter caw = new CharArrayWriter();
        jsonbProvider.create().withProvider(jsonProvider).build().toJson(value, caw);

        CharArrayReader car = new CharArrayReader(caw.toCharArray());
        JsonParser parser = jsonProvider.createParser(car);
        transferAll(parser, generator);
    }

    @Override
    public JsonProvider jsonpProvider() {
        return jsonProvider;
    }

    private class Deserializer<T> extends JsonpDeserializer<T> {
        private final Class<T> clazz;

        Deserializer(Class<T> clazz) {
            super(EnumSet.allOf(JsonParser.Event.class));
            this.clazz = clazz;
        }

        @Override
        public T deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

            CharArrayWriter caw = new CharArrayWriter();
            JsonGenerator generator = jsonProvider.createGenerator(caw);
            transferAll(parser, event, generator);
            generator.close();

            CharArrayReader car = new CharArrayReader(caw.toCharArray());
            return jsonbProvider.create().withProvider(jsonProvider).build().fromJson(car, clazz);
        }
    }

    private void transferAll(JsonParser from, JsonGenerator to) {
        transferAll(from, from.next(), to);
    }

    /**
     * Pipe a JSON parser to a JSON generator.
     */
    private void transferAll(JsonParser from, JsonParser.Event event, JsonGenerator to) {
        transferEvent(from, event, to);
        switch(event) {
            case START_OBJECT: {
                int depth = 1;
                do {
                    event = from.next();
                    transferEvent(from, event, to);
                    switch (event) {
                        case START_OBJECT:
                            depth++;
                            break;
                        case END_OBJECT:
                            depth--;
                            break;
                    }
                } while(!(event == Event.END_OBJECT && depth == 0));
            }
            break;

            case START_ARRAY: {
                int depth = 1;
                do {
                    event = from.next();
                    transferEvent(from, event, to);
                    switch (event) {
                        case START_ARRAY:
                            depth++;
                            break;
                        case END_ARRAY:
                            depth--;
                            break;
                    }
                } while(!(event == Event.END_ARRAY && depth == 0));
            }
            break;

            default:
                // nothing more
        }
    }

    /**
     * Transfer a single event from a parser to a generator
     */
    private void transferEvent(JsonParser from, JsonParser.Event event, JsonGenerator to) {
        switch (event) {
            case START_OBJECT:
                to.writeStartObject();
                break;

            case START_ARRAY:
                to.writeStartArray();
                break;

            case END_OBJECT:
            case END_ARRAY:
                to.writeEnd();
                break;

            case KEY_NAME:
                to.writeKey(from.getString());
                break;

            case VALUE_STRING:
                to.write(from.getString());
                break;

            case VALUE_NUMBER:
                if (from.isIntegralNumber()) {
                    to.write(from.getLong());
                } else {
                    to.write(from.getBigDecimal());
                }
                break;

            case VALUE_NULL:
                to.writeNull();
                break;

            case VALUE_TRUE:
                to.write(true);
                break;

            case VALUE_FALSE:
                to.write(false);
                break;
        }
    }
}
