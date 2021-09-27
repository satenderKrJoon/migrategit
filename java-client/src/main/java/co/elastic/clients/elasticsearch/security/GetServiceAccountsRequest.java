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

package co.elastic.clients.elasticsearch.security;

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
import javax.annotation.Nullable;

// typedef: security.get_service_accounts.Request
public final class GetServiceAccountsRequest extends RequestBase {
	@Nullable
	private final String namespace;

	@Nullable
	private final String service;

	// ---------------------------------------------------------------------------------------------

	protected GetServiceAccountsRequest(Builder builder) {

		this.namespace = builder.namespace;
		this.service = builder.service;

	}

	/**
	 * API name: {@code namespace}
	 */
	@Nullable
	public String namespace() {
		return this.namespace;
	}

	/**
	 * API name: {@code service}
	 */
	@Nullable
	public String service() {
		return this.service;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetServiceAccountsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetServiceAccountsRequest> {
		@Nullable
		private String namespace;

		@Nullable
		private String service;

		/**
		 * API name: {@code namespace}
		 */
		public Builder namespace(@Nullable String value) {
			this.namespace = value;
			return this;
		}

		/**
		 * API name: {@code service}
		 */
		public Builder service(@Nullable String value) {
			this.service = value;
			return this;
		}

		/**
		 * Builds a {@link GetServiceAccountsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetServiceAccountsRequest build() {

			return new GetServiceAccountsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_service_accounts}".
	 */
	public static final Endpoint<GetServiceAccountsRequest, GetServiceAccountsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _namespace = 1 << 0;
				final int _service = 1 << 1;

				int propsSet = 0;

				if (request.namespace() != null)
					propsSet |= _namespace;
				if (request.service() != null)
					propsSet |= _service;

				if (propsSet == (_namespace | _service)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					buf.append(request.namespace);
					buf.append("/");
					buf.append(request.service);
					return buf.toString();
				}
				if (propsSet == (_namespace)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					buf.append(request.namespace);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, GetServiceAccountsResponse.DESERIALIZER);
}
