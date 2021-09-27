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

package co.elastic.clients.elasticsearch.enrich;

import co.elastic.clients.elasticsearch.enrich.execute_policy.ExecuteEnrichPolicyStatus;
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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.execute_policy.Response
public final class ExecutePolicyResponse implements ToJsonp {
	private final ExecuteEnrichPolicyStatus status;

	@Nullable
	private final JsonValue taskId;

	// ---------------------------------------------------------------------------------------------

	protected ExecutePolicyResponse(Builder builder) {

		this.status = Objects.requireNonNull(builder.status, "status");
		this.taskId = builder.taskId;

	}

	/**
	 * API name: {@code status}
	 */
	public ExecuteEnrichPolicyStatus status() {
		return this.status;
	}

	/**
	 * API name: {@code task_id}
	 */
	@Nullable
	public JsonValue taskId() {
		return this.taskId;
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

		generator.writeKey("status");
		this.status.toJsonp(generator, mapper);

		if (this.taskId != null) {

			generator.writeKey("task_id");
			generator.write(this.taskId);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutePolicyResponse}.
	 */
	public static class Builder implements ObjectBuilder<ExecutePolicyResponse> {
		private ExecuteEnrichPolicyStatus status;

		@Nullable
		private JsonValue taskId;

		/**
		 * API name: {@code status}
		 */
		public Builder status(ExecuteEnrichPolicyStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(
				Function<ExecuteEnrichPolicyStatus.Builder, ObjectBuilder<ExecuteEnrichPolicyStatus>> fn) {
			return this.status(fn.apply(new ExecuteEnrichPolicyStatus.Builder()).build());
		}

		/**
		 * API name: {@code task_id}
		 */
		public Builder taskId(@Nullable JsonValue value) {
			this.taskId = value;
			return this;
		}

		/**
		 * Builds a {@link ExecutePolicyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutePolicyResponse build() {

			return new ExecutePolicyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ExecutePolicyResponse
	 */
	public static final JsonpDeserializer<ExecutePolicyResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ExecutePolicyResponse::setupExecutePolicyResponseDeserializer);

	protected static void setupExecutePolicyResponseDeserializer(
			DelegatingDeserializer<ExecutePolicyResponse.Builder> op) {

		op.add(Builder::status, ExecuteEnrichPolicyStatus.DESERIALIZER, "status");
		op.add(Builder::taskId, JsonpDeserializer.jsonValueDeserializer(), "task_id");

	}

}
