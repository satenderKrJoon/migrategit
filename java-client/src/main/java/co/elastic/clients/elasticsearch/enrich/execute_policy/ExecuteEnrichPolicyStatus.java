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

package co.elastic.clients.elasticsearch.enrich.execute_policy;

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

// typedef: enrich.execute_policy.ExecuteEnrichPolicyStatus
public final class ExecuteEnrichPolicyStatus implements ToJsonp {
	private final JsonValue phase;

	// ---------------------------------------------------------------------------------------------

	protected ExecuteEnrichPolicyStatus(Builder builder) {

		this.phase = Objects.requireNonNull(builder.phase, "phase");

	}

	/**
	 * API name: {@code phase}
	 */
	public JsonValue phase() {
		return this.phase;
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

		generator.writeKey("phase");
		generator.write(this.phase);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecuteEnrichPolicyStatus}.
	 */
	public static class Builder implements ObjectBuilder<ExecuteEnrichPolicyStatus> {
		private JsonValue phase;

		/**
		 * API name: {@code phase}
		 */
		public Builder phase(JsonValue value) {
			this.phase = value;
			return this;
		}

		/**
		 * Builds a {@link ExecuteEnrichPolicyStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecuteEnrichPolicyStatus build() {

			return new ExecuteEnrichPolicyStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ExecuteEnrichPolicyStatus
	 */
	public static final JsonpDeserializer<ExecuteEnrichPolicyStatus> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ExecuteEnrichPolicyStatus::setupExecuteEnrichPolicyStatusDeserializer);

	protected static void setupExecuteEnrichPolicyStatusDeserializer(
			DelegatingDeserializer<ExecuteEnrichPolicyStatus.Builder> op) {

		op.add(Builder::phase, JsonpDeserializer.jsonValueDeserializer(), "phase");

	}

}
