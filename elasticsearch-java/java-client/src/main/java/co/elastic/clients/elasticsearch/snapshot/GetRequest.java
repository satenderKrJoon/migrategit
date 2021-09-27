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

package co.elastic.clients.elasticsearch.snapshot;

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

// typedef: snapshot.get.Request
public final class GetRequest extends RequestBase {
	private final String repository;

	private final List<String> snapshot;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final JsonValue masterTimeout;

	@Nullable
	private final Boolean verbose;

	@Nullable
	private final Boolean indexDetails;

	@Nullable
	private final Boolean human;

	// ---------------------------------------------------------------------------------------------

	protected GetRequest(Builder builder) {

		this.repository = Objects.requireNonNull(builder.repository, "repository");
		this.snapshot = Objects.requireNonNull(builder.snapshot, "snapshot");
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.masterTimeout = builder.masterTimeout;
		this.verbose = builder.verbose;
		this.indexDetails = builder.indexDetails;
		this.human = builder.human;

	}

	/**
	 * API name: {@code repository}
	 */
	public String repository() {
		return this.repository;
	}

	/**
	 * API name: {@code snapshot}
	 */
	public List<String> snapshot() {
		return this.snapshot;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code verbose}
	 */
	@Nullable
	public Boolean verbose() {
		return this.verbose;
	}

	/**
	 * API name: {@code index_details}
	 */
	@Nullable
	public Boolean indexDetails() {
		return this.indexDetails;
	}

	/**
	 * API name: {@code human}
	 */
	@Nullable
	public Boolean human() {
		return this.human;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetRequest> {
		private String repository;

		private List<String> snapshot;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private JsonValue masterTimeout;

		@Nullable
		private Boolean verbose;

		@Nullable
		private Boolean indexDetails;

		@Nullable
		private Boolean human;

		/**
		 * API name: {@code repository}
		 */
		public Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(List<String> value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(String... value) {
			this.snapshot = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #snapshot(List)}, creating the list if needed.
		 */
		public Builder addSnapshot(String value) {
			if (this.snapshot == null) {
				this.snapshot = new ArrayList<>();
			}
			this.snapshot.add(value);
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
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * API name: {@code verbose}
		 */
		public Builder verbose(@Nullable Boolean value) {
			this.verbose = value;
			return this;
		}

		/**
		 * API name: {@code index_details}
		 */
		public Builder indexDetails(@Nullable Boolean value) {
			this.indexDetails = value;
			return this;
		}

		/**
		 * API name: {@code human}
		 */
		public Builder human(@Nullable Boolean value) {
			this.human = value;
			return this;
		}

		/**
		 * Builds a {@link GetRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRequest build() {

			return new GetRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.get}".
	 */
	public static final Endpoint<GetRequest, GetResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				if (request.repository() != null)
					propsSet |= _repository;
				if (request.snapshot() != null)
					propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					buf.append(request.repository);
					buf.append("/");
					buf.append(request.snapshot.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				if (request.verbose != null) {
					params.put("verbose", String.valueOf(request.verbose));
				}
				if (request.indexDetails != null) {
					params.put("index_details", String.valueOf(request.indexDetails));
				}
				if (request.human != null) {
					params.put("human", String.valueOf(request.human));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, GetResponse.DESERIALIZER);
}
