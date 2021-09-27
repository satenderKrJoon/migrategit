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

package co.elastic.clients.elasticsearch.indices.get_data_stream;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_data_stream.IndicesGetDataStreamItem
public final class IndicesGetDataStreamItem implements ToJsonp {
	private final String name;

	private final IndicesGetDataStreamItemTimestampField timestampField;

	private final List<IndicesGetDataStreamItemIndex> indices;

	private final Number generation;

	private final String template;

	private final Boolean hidden;

	@Nullable
	private final Boolean system;

	private final JsonValue status;

	@Nullable
	private final String ilmPolicy;

	@Nullable
	private final Map<String, JsonValue> meta;

	// ---------------------------------------------------------------------------------------------

	protected IndicesGetDataStreamItem(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.timestampField = Objects.requireNonNull(builder.timestampField, "timestamp_field");
		this.indices = Objects.requireNonNull(builder.indices, "indices");
		this.generation = Objects.requireNonNull(builder.generation, "generation");
		this.template = Objects.requireNonNull(builder.template, "template");
		this.hidden = Objects.requireNonNull(builder.hidden, "hidden");
		this.system = builder.system;
		this.status = Objects.requireNonNull(builder.status, "status");
		this.ilmPolicy = builder.ilmPolicy;
		this.meta = builder.meta;

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code timestamp_field}
	 */
	public IndicesGetDataStreamItemTimestampField timestampField() {
		return this.timestampField;
	}

	/**
	 * API name: {@code indices}
	 */
	public List<IndicesGetDataStreamItemIndex> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code generation}
	 */
	public Number generation() {
		return this.generation;
	}

	/**
	 * API name: {@code template}
	 */
	public String template() {
		return this.template;
	}

	/**
	 * API name: {@code hidden}
	 */
	public Boolean hidden() {
		return this.hidden;
	}

	/**
	 * API name: {@code system}
	 */
	@Nullable
	public Boolean system() {
		return this.system;
	}

	/**
	 * API name: {@code status}
	 */
	public JsonValue status() {
		return this.status;
	}

	/**
	 * API name: {@code ilm_policy}
	 */
	@Nullable
	public String ilmPolicy() {
		return this.ilmPolicy;
	}

	/**
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonValue> meta() {
		return this.meta;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("timestamp_field");
		this.timestampField.toJsonp(generator, mapper);

		generator.writeKey("indices");
		generator.writeStartArray();
		for (IndicesGetDataStreamItemIndex item0 : this.indices) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("generation");
		generator.write(this.generation.doubleValue());

		generator.writeKey("template");
		generator.write(this.template);

		generator.writeKey("hidden");
		generator.write(this.hidden);

		if (this.system != null) {

			generator.writeKey("system");
			generator.write(this.system);

		}

		generator.writeKey("status");
		generator.write(this.status);

		if (this.ilmPolicy != null) {

			generator.writeKey("ilm_policy");
			generator.write(this.ilmPolicy);

		}
		if (this.meta != null) {

			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesGetDataStreamItem}.
	 */
	public static class Builder implements ObjectBuilder<IndicesGetDataStreamItem> {
		private String name;

		private IndicesGetDataStreamItemTimestampField timestampField;

		private List<IndicesGetDataStreamItemIndex> indices;

		private Number generation;

		private String template;

		private Boolean hidden;

		@Nullable
		private Boolean system;

		private JsonValue status;

		@Nullable
		private String ilmPolicy;

		@Nullable
		private Map<String, JsonValue> meta;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code timestamp_field}
		 */
		public Builder timestampField(IndicesGetDataStreamItemTimestampField value) {
			this.timestampField = value;
			return this;
		}

		/**
		 * API name: {@code timestamp_field}
		 */
		public Builder timestampField(
				Function<IndicesGetDataStreamItemTimestampField.Builder, ObjectBuilder<IndicesGetDataStreamItemTimestampField>> fn) {
			return this.timestampField(fn.apply(new IndicesGetDataStreamItemTimestampField.Builder()).build());
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(List<IndicesGetDataStreamItemIndex> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(IndicesGetDataStreamItemIndex... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(IndicesGetDataStreamItemIndex value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * Set {@link #indices(List)} to a singleton list.
		 */
		public Builder indices(
				Function<IndicesGetDataStreamItemIndex.Builder, ObjectBuilder<IndicesGetDataStreamItemIndex>> fn) {
			return this.indices(fn.apply(new IndicesGetDataStreamItemIndex.Builder()).build());
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(
				Function<IndicesGetDataStreamItemIndex.Builder, ObjectBuilder<IndicesGetDataStreamItemIndex>> fn) {
			return this.addIndices(fn.apply(new IndicesGetDataStreamItemIndex.Builder()).build());
		}

		/**
		 * API name: {@code generation}
		 */
		public Builder generation(Number value) {
			this.generation = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(String value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code hidden}
		 */
		public Builder hidden(Boolean value) {
			this.hidden = value;
			return this;
		}

		/**
		 * API name: {@code system}
		 */
		public Builder system(@Nullable Boolean value) {
			this.system = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(JsonValue value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code ilm_policy}
		 */
		public Builder ilmPolicy(@Nullable String value) {
			this.ilmPolicy = value;
			return this;
		}

		/**
		 * API name: {@code _meta}
		 */
		public Builder meta(@Nullable Map<String, JsonValue> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public Builder putMeta(String key, JsonValue value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link IndicesGetDataStreamItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesGetDataStreamItem build() {

			return new IndicesGetDataStreamItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndicesGetDataStreamItem
	 */
	public static final JsonpDeserializer<IndicesGetDataStreamItem> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndicesGetDataStreamItem::setupIndicesGetDataStreamItemDeserializer);

	protected static void setupIndicesGetDataStreamItemDeserializer(
			DelegatingDeserializer<IndicesGetDataStreamItem.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::timestampField, IndicesGetDataStreamItemTimestampField.DESERIALIZER, "timestamp_field");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesGetDataStreamItemIndex.DESERIALIZER),
				"indices");
		op.add(Builder::generation, JsonpDeserializer.numberDeserializer(), "generation");
		op.add(Builder::template, JsonpDeserializer.stringDeserializer(), "template");
		op.add(Builder::hidden, JsonpDeserializer.booleanDeserializer(), "hidden");
		op.add(Builder::system, JsonpDeserializer.booleanDeserializer(), "system");
		op.add(Builder::status, JsonpDeserializer.jsonValueDeserializer(), "status");
		op.add(Builder::ilmPolicy, JsonpDeserializer.stringDeserializer(), "ilm_policy");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"_meta");

	}

}
