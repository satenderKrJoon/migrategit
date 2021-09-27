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

package co.elastic.clients.elasticsearch.experiments.generics;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Supplier;

public class GenericClass<GenParam> implements ToJsonp {

    // Serializers for generic parameters
    private final JsonpSerializer<GenParam> genParamSerializer;

    // Properties
    private final GenParam genParam;

    protected GenericClass(Builder<GenParam> builder) {
        this.genParamSerializer = builder.genParamSerializer;
        this.genParam = builder.genParam;
    }

    public GenParam genParam() {
        return this.genParam;
    }

    @Override
    public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartObject();
        generator.writeKey("genParam");
        JsonpUtils.serialize(genParam, generator, genParamSerializer, mapper);
        generator.writeEnd();
    }

    public static class Builder<GenParam> implements ObjectBuilder<GenericClass<GenParam>> {
        private GenParam genParam;
        private JsonpSerializer<GenParam> genParamSerializer;

        /**
         * Sets the JSON serializer for {@link GenParam} values. If not set, the client will try to find a suitable
         * serializer in the {@link JsonpMapper} and will fail if none is found.
         */
        // Internal generic parameters always call this method to avoid runtime lookup
        public Builder<GenParam> genParamSerializer(JsonpSerializer<GenParam> value) {
            this.genParamSerializer = value;
            return this;
        }

        public Builder<GenParam> genParam(GenParam value) {
            this.genParam = value;
            return this;
        }

        @Override
        public GenericClass<GenParam> build() {
            return null;
        }
    }

    public static <GenParam> JsonpDeserializer<GenericClass<GenParam>> parser(
        // A deserializer for each generic parameter
        JsonpDeserializer<GenParam> getParamDeserializer
    ) {

        return ObjectBuilderDeserializer.createForObject(
            (Supplier<Builder<GenParam>>) Builder::new,
            (op) -> GenericClass.setupParser(op, getParamDeserializer)
        );
    }

    private static <GenParam> void setupParser(DelegatingDeserializer<Builder<GenParam>> op, JsonpDeserializer<GenParam> deserializer) {
        op.add(Builder::genParam, deserializer, "genParam");
    }


    public static <GenParam> Endpoint<Boolean, GenericClass<GenParam>, ElasticsearchError> endpoint(
        JsonpDeserializer<GenParam> genParamDeserializer
    ) {
        return new Endpoint.Simple<>(
            // Request method
            request -> "GET",

            // Request path
            request -> "/genclass",

            // Request parameters
            Endpoint.Simple.emptyMap(),
            Endpoint.Simple.emptyMap(),
            true,
            GenericClass.parser(genParamDeserializer)
        );
    }

}
