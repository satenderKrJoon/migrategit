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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ingest._types.DateProcessor
public final class DateProcessor extends ProcessorBase {
	private final String field;

	private final List<String> formats;

	@Nullable
	private final String locale;

	@Nullable
	private final String targetField;

	@Nullable
	private final String timezone;

	// ---------------------------------------------------------------------------------------------

	protected DateProcessor(Builder builder) {
		super(builder);
		this.field = Objects.requireNonNull(builder.field, "field");
		this.formats = Objects.requireNonNull(builder.formats, "formats");
		this.locale = builder.locale;
		this.targetField = builder.targetField;
		this.timezone = builder.timezone;

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code formats}
	 */
	public List<String> formats() {
		return this.formats;
	}

	/**
	 * API name: {@code locale}
	 */
	@Nullable
	public String locale() {
		return this.locale;
	}

	/**
	 * API name: {@code target_field}
	 */
	@Nullable
	public String targetField() {
		return this.targetField;
	}

	/**
	 * API name: {@code timezone}
	 */
	@Nullable
	public String timezone() {
		return this.timezone;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("formats");
		generator.writeStartArray();
		for (String item0 : this.formats) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.locale != null) {

			generator.writeKey("locale");
			generator.write(this.locale);

		}
		if (this.targetField != null) {

			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (this.timezone != null) {

			generator.writeKey("timezone");
			generator.write(this.timezone);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<DateProcessor> {
		private String field;

		private List<String> formats;

		@Nullable
		private String locale;

		@Nullable
		private String targetField;

		@Nullable
		private String timezone;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code formats}
		 */
		public Builder formats(List<String> value) {
			this.formats = value;
			return this;
		}

		/**
		 * API name: {@code formats}
		 */
		public Builder formats(String... value) {
			this.formats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #formats(List)}, creating the list if needed.
		 */
		public Builder addFormats(String value) {
			if (this.formats == null) {
				this.formats = new ArrayList<>();
			}
			this.formats.add(value);
			return this;
		}

		/**
		 * API name: {@code locale}
		 */
		public Builder locale(@Nullable String value) {
			this.locale = value;
			return this;
		}

		/**
		 * API name: {@code target_field}
		 */
		public Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * API name: {@code timezone}
		 */
		public Builder timezone(@Nullable String value) {
			this.timezone = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DateProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateProcessor build() {

			return new DateProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DateProcessor
	 */
	public static final JsonpDeserializer<DateProcessor> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DateProcessor::setupDateProcessorDeserializer);

	protected static void setupDateProcessorDeserializer(DelegatingDeserializer<DateProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::formats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"formats");
		op.add(Builder::locale, JsonpDeserializer.stringDeserializer(), "locale");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::timezone, JsonpDeserializer.stringDeserializer(), "timezone");

	}

}
