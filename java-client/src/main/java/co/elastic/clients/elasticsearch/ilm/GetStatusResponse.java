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

// typedef: ilm.get_status.Response
public final class GetStatusResponse implements ToJsonp {
	private final JsonValue operationMode;

	// ---------------------------------------------------------------------------------------------

	protected GetStatusResponse(Builder builder) {

		this.operationMode = Objects.requireNonNull(builder.operationMode, "operation_mode");

	}

	/**
	 * API name: {@code operation_mode}
	 */
	public JsonValue operationMode() {
		return this.operationMode;
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

		generator.writeKey("operation_mode");
		generator.write(this.operationMode);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetStatusResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetStatusResponse> {
		private JsonValue operationMode;

		/**
		 * API name: {@code operation_mode}
		 */
		public Builder operationMode(JsonValue value) {
			this.operationMode = value;
			return this;
		}

		/**
		 * Builds a {@link GetStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetStatusResponse build() {

			return new GetStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetStatusResponse
	 */
	public static final JsonpDeserializer<GetStatusResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetStatusResponse::setupGetStatusResponseDeserializer);

	protected static void setupGetStatusResponseDeserializer(DelegatingDeserializer<GetStatusResponse.Builder> op) {

		op.add(Builder::operationMode, JsonpDeserializer.jsonValueDeserializer(), "operation_mode");

	}

}
