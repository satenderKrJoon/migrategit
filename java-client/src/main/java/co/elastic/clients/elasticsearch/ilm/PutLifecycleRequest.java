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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import javax.annotation.Nullable;

// typedef: ilm.put_lifecycle.Request
public final class PutLifecycleRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String policy;

	@Nullable
	private final String policyId;

	// ---------------------------------------------------------------------------------------------

	protected PutLifecycleRequest(Builder builder) {

		this.policy = builder.policy;
		this.policyId = builder.policyId;

	}

	/**
	 * API name: {@code policy}
	 */
	@Nullable
	public String policy() {
		return this.policy;
	}

	/**
	 * API name: {@code policy_id}
	 */
	@Nullable
	public String policyId() {
		return this.policyId;
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutLifecycleRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutLifecycleRequest> {
		@Nullable
		private String policy;

		@Nullable
		private String policyId;

		/**
		 * API name: {@code policy}
		 */
		public Builder policy(@Nullable String value) {
			this.policy = value;
			return this;
		}

		/**
		 * API name: {@code policy_id}
		 */
		public Builder policyId(@Nullable String value) {
			this.policyId = value;
			return this;
		}

		/**
		 * Builds a {@link PutLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutLifecycleRequest build() {

			return new PutLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutLifecycleRequest
	 */
	public static final JsonpDeserializer<PutLifecycleRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutLifecycleRequest::setupPutLifecycleRequestDeserializer);

	protected static void setupPutLifecycleRequestDeserializer(DelegatingDeserializer<PutLifecycleRequest.Builder> op) {

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ilm.put_lifecycle}".
	 */
	public static final Endpoint<PutLifecycleRequest, PutLifecycleResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _policy = 1 << 0;
				final int _policyId = 1 << 1;

				int propsSet = 0;

				if (request.policy() != null)
					propsSet |= _policy;
				if (request.policyId() != null)
					propsSet |= _policyId;

				if (propsSet == (_policy)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ilm");
					buf.append("/policy");
					buf.append("/");
					buf.append(request.policy);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PutLifecycleResponse.DESERIALIZER);
}
