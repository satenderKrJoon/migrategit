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

// typedef: security.delete_privileges.Request
public final class DeletePrivilegesRequest extends RequestBase {
	private final String application;

	private final String name;

	@Nullable
	private final JsonValue refresh;

	// ---------------------------------------------------------------------------------------------

	protected DeletePrivilegesRequest(Builder builder) {

		this.application = Objects.requireNonNull(builder.application, "application");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.refresh = builder.refresh;

	}

	/**
	 * API name: {@code application}
	 */
	public String application() {
		return this.application;
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
	 * Builder for {@link DeletePrivilegesRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeletePrivilegesRequest> {
		private String application;

		private String name;

		@Nullable
		private JsonValue refresh;

		/**
		 * API name: {@code application}
		 */
		public Builder application(String value) {
			this.application = value;
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
		 * Builds a {@link DeletePrivilegesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeletePrivilegesRequest build() {

			return new DeletePrivilegesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.delete_privileges}".
	 */
	public static final Endpoint<DeletePrivilegesRequest, DeletePrivilegesResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _application = 1 << 0;
				final int _name = 1 << 1;

				int propsSet = 0;

				if (request.application() != null)
					propsSet |= _application;
				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_application | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/privilege");
					buf.append("/");
					buf.append(request.application);
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

			}, Endpoint.Simple.emptyMap(), false, DeletePrivilegesResponse.DESERIALIZER);
}
