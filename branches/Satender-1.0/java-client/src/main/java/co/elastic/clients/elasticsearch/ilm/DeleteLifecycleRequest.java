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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ilm.delete_lifecycle.Request
public final class DeleteLifecycleRequest extends RequestBase {
	@Nullable
	private final String policy;

	private final String policyId;

	// ---------------------------------------------------------------------------------------------

	protected DeleteLifecycleRequest(Builder builder) {

		this.policy = builder.policy;
		this.policyId = Objects.requireNonNull(builder.policyId, "policy_id");

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
	public String policyId() {
		return this.policyId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteLifecycleRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteLifecycleRequest> {
		@Nullable
		private String policy;

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
		public Builder policyId(String value) {
			this.policyId = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteLifecycleRequest build() {

			return new DeleteLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ilm.delete_lifecycle}".
	 */
	public static final Endpoint<DeleteLifecycleRequest, DeleteLifecycleResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "DELETE";

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

			}, Endpoint.Simple.emptyMap(), false, DeleteLifecycleResponse.DESERIALIZER);
}
