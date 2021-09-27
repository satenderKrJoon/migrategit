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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cat.snapshots.Request
public final class SnapshotsRequest extends CatRequestBase {
	@Nullable
	private final List<String> repository;

	@Nullable
	private final Boolean ignoreUnavailable;

	// ---------------------------------------------------------------------------------------------

	protected SnapshotsRequest(Builder builder) {

		this.repository = builder.repository;
		this.ignoreUnavailable = builder.ignoreUnavailable;

	}

	/**
	 * API name: {@code repository}
	 */
	@Nullable
	public List<String> repository() {
		return this.repository;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotsRequest}.
	 */
	public static class Builder implements ObjectBuilder<SnapshotsRequest> {
		@Nullable
		private List<String> repository;

		@Nullable
		private Boolean ignoreUnavailable;

		/**
		 * API name: {@code repository}
		 */
		public Builder repository(@Nullable List<String> value) {
			this.repository = value;
			return this;
		}

		/**
		 * API name: {@code repository}
		 */
		public Builder repository(String... value) {
			this.repository = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #repository(List)}, creating the list if needed.
		 */
		public Builder addRepository(String value) {
			if (this.repository == null) {
				this.repository = new ArrayList<>();
			}
			this.repository.add(value);
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
		 * Builds a {@link SnapshotsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotsRequest build() {

			return new SnapshotsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.snapshots}".
	 */
	public static final Endpoint<SnapshotsRequest, SnapshotsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;

				int propsSet = 0;

				if (request.repository() != null)
					propsSet |= _repository;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/snapshots");
					return buf.toString();
				}
				if (propsSet == (_repository)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/snapshots");
					buf.append("/");
					buf.append(request.repository.stream().map(v -> v).collect(Collectors.joining(",")));
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
				return params;

			}, Endpoint.Simple.emptyMap(), false, SnapshotsResponse.DESERIALIZER);
}
