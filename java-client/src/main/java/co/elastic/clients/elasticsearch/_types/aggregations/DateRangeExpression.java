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

package co.elastic.clients.elasticsearch._types.aggregations;

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
import javax.annotation.Nullable;

// typedef: _types.aggregations.DateRangeExpression
public final class DateRangeExpression implements ToJsonp {
	@Nullable
	private final JsonValue from;

	@Nullable
	private final String fromAsString;

	@Nullable
	private final String toAsString;

	@Nullable
	private final String key;

	@Nullable
	private final JsonValue to;

	@Nullable
	private final Number docCount;

	// ---------------------------------------------------------------------------------------------

	protected DateRangeExpression(Builder builder) {

		this.from = builder.from;
		this.fromAsString = builder.fromAsString;
		this.toAsString = builder.toAsString;
		this.key = builder.key;
		this.to = builder.to;
		this.docCount = builder.docCount;

	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public JsonValue from() {
		return this.from;
	}

	/**
	 * API name: {@code from_as_string}
	 */
	@Nullable
	public String fromAsString() {
		return this.fromAsString;
	}

	/**
	 * API name: {@code to_as_string}
	 */
	@Nullable
	public String toAsString() {
		return this.toAsString;
	}

	/**
	 * API name: {@code key}
	 */
	@Nullable
	public String key() {
		return this.key;
	}

	/**
	 * API name: {@code to}
	 */
	@Nullable
	public JsonValue to() {
		return this.to;
	}

	/**
	 * API name: {@code doc_count}
	 */
	@Nullable
	public Number docCount() {
		return this.docCount;
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

		if (this.from != null) {

			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.fromAsString != null) {

			generator.writeKey("from_as_string");
			generator.write(this.fromAsString);

		}
		if (this.toAsString != null) {

			generator.writeKey("to_as_string");
			generator.write(this.toAsString);

		}
		if (this.key != null) {

			generator.writeKey("key");
			generator.write(this.key);

		}
		if (this.to != null) {

			generator.writeKey("to");
			generator.write(this.to);

		}
		if (this.docCount != null) {

			generator.writeKey("doc_count");
			generator.write(this.docCount.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateRangeExpression}.
	 */
	public static class Builder implements ObjectBuilder<DateRangeExpression> {
		@Nullable
		private JsonValue from;

		@Nullable
		private String fromAsString;

		@Nullable
		private String toAsString;

		@Nullable
		private String key;

		@Nullable
		private JsonValue to;

		@Nullable
		private Number docCount;

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable JsonValue value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code from_as_string}
		 */
		public Builder fromAsString(@Nullable String value) {
			this.fromAsString = value;
			return this;
		}

		/**
		 * API name: {@code to_as_string}
		 */
		public Builder toAsString(@Nullable String value) {
			this.toAsString = value;
			return this;
		}

		/**
		 * API name: {@code key}
		 */
		public Builder key(@Nullable String value) {
			this.key = value;
			return this;
		}

		/**
		 * API name: {@code to}
		 */
		public Builder to(@Nullable JsonValue value) {
			this.to = value;
			return this;
		}

		/**
		 * API name: {@code doc_count}
		 */
		public Builder docCount(@Nullable Number value) {
			this.docCount = value;
			return this;
		}

		/**
		 * Builds a {@link DateRangeExpression}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateRangeExpression build() {

			return new DateRangeExpression(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DateRangeExpression
	 */
	public static final JsonpDeserializer<DateRangeExpression> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DateRangeExpression::setupDateRangeExpressionDeserializer);

	protected static void setupDateRangeExpressionDeserializer(DelegatingDeserializer<DateRangeExpression.Builder> op) {

		op.add(Builder::from, JsonpDeserializer.jsonValueDeserializer(), "from");
		op.add(Builder::fromAsString, JsonpDeserializer.stringDeserializer(), "from_as_string");
		op.add(Builder::toAsString, JsonpDeserializer.stringDeserializer(), "to_as_string");
		op.add(Builder::key, JsonpDeserializer.stringDeserializer(), "key");
		op.add(Builder::to, JsonpDeserializer.jsonValueDeserializer(), "to");
		op.add(Builder::docCount, JsonpDeserializer.numberDeserializer(), "doc_count");

	}

}
