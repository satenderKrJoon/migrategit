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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: security.clear_cached_roles.Request
public final class ClearCachedRolesRequest extends RequestBase {
	private final List<String> name;

	// ---------------------------------------------------------------------------------------------

	protected ClearCachedRolesRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");

	}

	/**
	 * API name: {@code name}
	 */
	public List<String> name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCachedRolesRequest}.
	 */
	public static class Builder implements ObjectBuilder<ClearCachedRolesRequest> {
		private List<String> name;

		/**
		 * API name: {@code name}
		 */
		public Builder name(List<String> value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String... value) {
			this.name = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #name(List)}, creating the list if needed.
		 */
		public Builder addName(String value) {
			if (this.name == null) {
				this.name = new ArrayList<>();
			}
			this.name.add(value);
			return this;
		}

		/**
		 * Builds a {@link ClearCachedRolesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCachedRolesRequest build() {

			return new ClearCachedRolesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.clear_cached_roles}".
	 */
	public static final Endpoint<ClearCachedRolesRequest, ClearCachedRolesResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role");
					buf.append("/");
					buf.append(request.name.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_clear_cache");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, ClearCachedRolesResponse.DESERIALIZER);
}
