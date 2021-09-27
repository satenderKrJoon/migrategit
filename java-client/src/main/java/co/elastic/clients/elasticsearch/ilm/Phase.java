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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ilm._types.Phase
public final class Phase implements ToJsonp {
	private final JsonValue actions;

	@Nullable
	private final JsonValue minAge;

	// ---------------------------------------------------------------------------------------------

	protected Phase(Builder builder) {

		this.actions = Objects.requireNonNull(builder.actions, "actions");
		this.minAge = builder.minAge;

	}

	/**
	 * API name: {@code actions}
	 */
	public JsonValue actions() {
		return this.actions;
	}

	/**
	 * API name: {@code min_age}
	 */
	@Nullable
	public JsonValue minAge() {
		return this.minAge;
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

		generator.writeKey("actions");
		generator.write(this.actions);

		if (this.minAge != null) {

			generator.writeKey("min_age");
			generator.write(this.minAge);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Phase}.
	 */
	public static class Builder implements ObjectBuilder<Phase> {
		private JsonValue actions;

		@Nullable
		private JsonValue minAge;

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(JsonValue value) {
			this.actions = value;
			return this;
		}

		/**
		 * API name: {@code min_age}
		 */
		public Builder minAge(@Nullable JsonValue value) {
			this.minAge = value;
			return this;
		}

		/**
		 * Builds a {@link Phase}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Phase build() {

			return new Phase(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Phase
	 */
	public static final JsonpDeserializer<Phase> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Phase::setupPhaseDeserializer);

	protected static void setupPhaseDeserializer(DelegatingDeserializer<Phase.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.jsonValueDeserializer(), "actions");
		op.add(Builder::minAge, JsonpDeserializer.jsonValueDeserializer(), "min_age");

	}

}
