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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.exists_alias.Request
public final class ExistsAliasRequest extends RequestBase {
	private final List<String> name;

	@Nullable
	private final List<String> index;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final JsonValue expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean local;

	// ---------------------------------------------------------------------------------------------

	protected ExistsAliasRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.index = builder.index;
		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = builder.expandWildcards;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.local = builder.local;

	}

	/**
	 * API name: {@code name}
	 */
	public List<String> name() {
		return this.name;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code local}
	 */
	@Nullable
	public Boolean local() {
		return this.local;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExistsAliasRequest}.
	 */
	public static class Builder implements ObjectBuilder<ExistsAliasRequest> {
		private List<String> name;

		@Nullable
		private List<String> index;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private JsonValue expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean local;

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
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code local}
		 */
		public Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		/**
		 * Builds a {@link ExistsAliasRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExistsAliasRequest build() {

			return new ExistsAliasRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.exists_alias}".
	 */
	public static final Endpoint<ExistsAliasRequest, BooleanResponse, ElasticsearchError> ENDPOINT = new Endpoint.Boolean<>(
			// Request method
			request -> {
				return "HEAD";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;
				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_alias");
					buf.append("/");
					buf.append(request.name.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				if (propsSet == (_index | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_alias");
					buf.append("/");
					buf.append(request.name.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards", request.expandWildcards.toString());
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, null);
}
