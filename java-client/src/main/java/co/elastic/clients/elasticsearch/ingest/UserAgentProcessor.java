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

// typedef: ingest._types.UserAgentProcessor
public final class UserAgentProcessor extends ProcessorBase {
	private final String field;

	private final Boolean ignoreMissing;

	private final List<JsonValue> options;

	private final String regexFile;

	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	protected UserAgentProcessor(Builder builder) {
		super(builder);
		this.field = Objects.requireNonNull(builder.field, "field");
		this.ignoreMissing = Objects.requireNonNull(builder.ignoreMissing, "ignore_missing");
		this.options = Objects.requireNonNull(builder.options, "options");
		this.regexFile = Objects.requireNonNull(builder.regexFile, "regex_file");
		this.targetField = Objects.requireNonNull(builder.targetField, "target_field");

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	public Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * API name: {@code options}
	 */
	public List<JsonValue> options() {
		return this.options;
	}

	/**
	 * API name: {@code regex_file}
	 */
	public String regexFile() {
		return this.regexFile;
	}

	/**
	 * API name: {@code target_field}
	 */
	public String targetField() {
		return this.targetField;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("ignore_missing");
		generator.write(this.ignoreMissing);

		generator.writeKey("options");
		generator.writeStartArray();
		for (JsonValue item0 : this.options) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("regex_file");
		generator.write(this.regexFile);

		generator.writeKey("target_field");
		generator.write(this.targetField);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UserAgentProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UserAgentProcessor> {
		private String field;

		private Boolean ignoreMissing;

		private List<JsonValue> options;

		private String regexFile;

		private String targetField;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing}
		 */
		public Builder ignoreMissing(Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * API name: {@code options}
		 */
		public Builder options(List<JsonValue> value) {
			this.options = value;
			return this;
		}

		/**
		 * API name: {@code options}
		 */
		public Builder options(JsonValue... value) {
			this.options = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #options(List)}, creating the list if needed.
		 */
		public Builder addOptions(JsonValue value) {
			if (this.options == null) {
				this.options = new ArrayList<>();
			}
			this.options.add(value);
			return this;
		}

		/**
		 * API name: {@code regex_file}
		 */
		public Builder regexFile(String value) {
			this.regexFile = value;
			return this;
		}

		/**
		 * API name: {@code target_field}
		 */
		public Builder targetField(String value) {
			this.targetField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UserAgentProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UserAgentProcessor build() {

			return new UserAgentProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for UserAgentProcessor
	 */
	public static final JsonpDeserializer<UserAgentProcessor> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, UserAgentProcessor::setupUserAgentProcessorDeserializer);

	protected static void setupUserAgentProcessorDeserializer(DelegatingDeserializer<UserAgentProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::options, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"options");
		op.add(Builder::regexFile, JsonpDeserializer.stringDeserializer(), "regex_file");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
