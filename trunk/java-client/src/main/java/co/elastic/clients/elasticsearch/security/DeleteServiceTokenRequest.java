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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.delete_service_token.Request
public final class DeleteServiceTokenRequest extends RequestBase {
	private final String namespace;

	private final String service;

	private final String name;

	@Nullable
	private final JsonValue refresh;

	// ---------------------------------------------------------------------------------------------

	protected DeleteServiceTokenRequest(Builder builder) {

		this.namespace = Objects.requireNonNull(builder.namespace, "namespace");
		this.service = Objects.requireNonNull(builder.service, "service");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.refresh = builder.refresh;

	}

	/**
	 * API name: {@code namespace}
	 */
	public String namespace() {
		return this.namespace;
	}

	/**
	 * API name: {@code service}
	 */
	public String service() {
		return this.service;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue refresh() {
		return this.refresh;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteServiceTokenRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteServiceTokenRequest> {
		private String namespace;

		private String service;

		private String name;

		@Nullable
		private JsonValue refresh;

		/**
		 * API name: {@code namespace}
		 */
		public Builder namespace(String value) {
			this.namespace = value;
			return this;
		}

		/**
		 * API name: {@code service}
		 */
		public Builder service(String value) {
			this.service = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteServiceTokenRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteServiceTokenRequest build() {

			return new DeleteServiceTokenRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.delete_service_token}".
	 */
	public static final Endpoint<DeleteServiceTokenRequest, DeleteServiceTokenResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _namespace = 1 << 0;
				final int _service = 1 << 1;
				final int _name = 1 << 2;

				int propsSet = 0;

				if (request.namespace() != null)
					propsSet |= _namespace;
				if (request.service() != null)
					propsSet |= _service;
				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_namespace | _service | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					buf.append(request.namespace);
					buf.append("/");
					buf.append(request.service);
					buf.append("/credential");
					buf.append("/token");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, DeleteServiceTokenResponse.DESERIALIZER);
}
