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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ingest._types.AppendProcessor
public final class AppendProcessor extends ProcessorBase {
	private final String field;

	private final List<JsonValue> value;

	@Nullable
	private final Boolean allowDuplicates;

	// ---------------------------------------------------------------------------------------------

	protected AppendProcessor(Builder builder) {
		super(builder);
		this.field = Objects.requireNonNull(builder.field, "field");
		this.value = Objects.requireNonNull(builder.value, "value");
		this.allowDuplicates = builder.allowDuplicates;

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code value}
	 */
	public List<JsonValue> value() {
		return this.value;
	}

	/**
	 * API name: {@code allow_duplicates}
	 */
	@Nullable
	public Boolean allowDuplicates() {
		return this.allowDuplicates;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("value");
		generator.writeStartArray();
		for (JsonValue item0 : this.value) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.allowDuplicates != null) {

			generator.writeKey("allow_duplicates");
			generator.write(this.allowDuplicates);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AppendProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AppendProcessor> {
		private String field;

		private List<JsonValue> value;

		@Nullable
		private Boolean allowDuplicates;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(List<JsonValue> value) {
			this.value = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(JsonValue... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(JsonValue value) {
			if (this.value == null) {
				this.value = new ArrayList<>();
			}
			this.value.add(value);
			return this;
		}

		/**
		 * API name: {@code allow_duplicates}
		 */
		public Builder allowDuplicates(@Nullable Boolean value) {
			this.allowDuplicates = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AppendProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AppendProcessor build() {

			return new AppendProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AppendProcessor
	 */
	public static final JsonpDeserializer<AppendProcessor> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AppendProcessor::setupAppendProcessorDeserializer);

	protected static void setupAppendProcessorDeserializer(DelegatingDeserializer<AppendProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::value, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "value");
		op.add(Builder::allowDuplicates, JsonpDeserializer.booleanDeserializer(), "allow_duplicates");

	}

}
