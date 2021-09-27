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

package co.elastic.clients.elasticsearch.ml;

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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.RuleCondition
public final class RuleCondition implements ToJsonp {
	private final JsonValue appliesTo;

	private final JsonValue operator;

	private final Number value;

	// ---------------------------------------------------------------------------------------------

	protected RuleCondition(Builder builder) {

		this.appliesTo = Objects.requireNonNull(builder.appliesTo, "applies_to");
		this.operator = Objects.requireNonNull(builder.operator, "operator");
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * API name: {@code applies_to}
	 */
	public JsonValue appliesTo() {
		return this.appliesTo;
	}

	/**
	 * API name: {@code operator}
	 */
	public JsonValue operator() {
		return this.operator;
	}

	/**
	 * API name: {@code value}
	 */
	public Number value() {
		return this.value;
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

		generator.writeKey("applies_to");
		generator.write(this.appliesTo);

		generator.writeKey("operator");
		generator.write(this.operator);

		generator.writeKey("value");
		generator.write(this.value.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuleCondition}.
	 */
	public static class Builder implements ObjectBuilder<RuleCondition> {
		private JsonValue appliesTo;

		private JsonValue operator;

		private Number value;

		/**
		 * API name: {@code applies_to}
		 */
		public Builder appliesTo(JsonValue value) {
			this.appliesTo = value;
			return this;
		}

		/**
		 * API name: {@code operator}
		 */
		public Builder operator(JsonValue value) {
			this.operator = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(Number value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link RuleCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RuleCondition build() {

			return new RuleCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RuleCondition
	 */
	public static final JsonpDeserializer<RuleCondition> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RuleCondition::setupRuleConditionDeserializer);

	protected static void setupRuleConditionDeserializer(DelegatingDeserializer<RuleCondition.Builder> op) {

		op.add(Builder::appliesTo, JsonpDeserializer.jsonValueDeserializer(), "applies_to");
		op.add(Builder::operator, JsonpDeserializer.jsonValueDeserializer(), "operator");
		op.add(Builder::value, JsonpDeserializer.numberDeserializer(), "value");

	}

}
