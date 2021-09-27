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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.sql;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: sql.translate.Response
public final class TranslateResponse implements ToJsonp {
	private final Number size;

	private final JsonValue source;

	private final List<Map<String, String>> fields;

	private final List<JsonValue> sort;

	// ---------------------------------------------------------------------------------------------

	protected TranslateResponse(Builder builder) {

		this.size = Objects.requireNonNull(builder.size, "size");
		this.source = Objects.requireNonNull(builder.source, "_source");
		this.fields = Objects.requireNonNull(builder.fields, "fields");
		this.sort = Objects.requireNonNull(builder.sort, "sort");

	}

	/**
	 * API name: {@code size}
	 */
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code _source}
	 */
	public JsonValue source() {
		return this.source;
	}

	/**
	 * API name: {@code fields}
	 */
	public List<Map<String, String>> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code sort}
	 */
	public List<JsonValue> sort() {
		return this.sort;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("size");
		generator.write(this.size.doubleValue());

		generator.writeKey("_source");
		generator.write(this.source);

		generator.writeKey("fields");
		generator.writeStartArray();
		for (Map<String, String> item0 : this.fields) {
			generator.writeStartObject();
			for (Map.Entry<String, String> item1 : item0.entrySet()) {
				generator.writeKey(item1.getKey());
				generator.write(item1.getValue());

			}
			generator.writeEnd();

		}
		generator.writeEnd();

		generator.writeKey("sort");
		generator.writeStartArray();
		for (JsonValue item0 : this.sort) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TranslateResponse}.
	 */
	public static class Builder implements ObjectBuilder<TranslateResponse> {
		private Number size;

		private JsonValue source;

		private List<Map<String, String>> fields;

		private List<JsonValue> sort;

		/**
		 * API name: {@code size}
		 */
		public Builder size(Number value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder source(JsonValue value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(List<Map<String, String>> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(Map<String, String>... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(Map<String, String> value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(List<JsonValue> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(JsonValue... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder addSort(JsonValue value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		/**
		 * Builds a {@link TranslateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TranslateResponse build() {

			return new TranslateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TranslateResponse
	 */
	public static final JsonpDeserializer<TranslateResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TranslateResponse::setupTranslateResponseDeserializer);

	protected static void setupTranslateResponseDeserializer(DelegatingDeserializer<TranslateResponse.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");
		op.add(Builder::source, JsonpDeserializer.jsonValueDeserializer(), "_source");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer())), "fields");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");

	}

}
