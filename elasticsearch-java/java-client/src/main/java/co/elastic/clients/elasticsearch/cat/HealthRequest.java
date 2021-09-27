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
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: cat.health.Request
public final class HealthRequest extends CatRequestBase {
	@Nullable
	private final Boolean includeTimestamp;

	@Nullable
	private final Boolean ts;

	// ---------------------------------------------------------------------------------------------

	protected HealthRequest(Builder builder) {

		this.includeTimestamp = builder.includeTimestamp;
		this.ts = builder.ts;

	}

	/**
	 * API name: {@code include_timestamp}
	 */
	@Nullable
	public Boolean includeTimestamp() {
		return this.includeTimestamp;
	}

	/**
	 * API name: {@code ts}
	 */
	@Nullable
	public Boolean ts() {
		return this.ts;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HealthRequest}.
	 */
	public static class Builder implements ObjectBuilder<HealthRequest> {
		@Nullable
		private Boolean includeTimestamp;

		@Nullable
		private Boolean ts;

		/**
		 * API name: {@code include_timestamp}
		 */
		public Builder includeTimestamp(@Nullable Boolean value) {
			this.includeTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code ts}
		 */
		public Builder ts(@Nullable Boolean value) {
			this.ts = value;
			return this;
		}

		/**
		 * Builds a {@link HealthRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HealthRequest build() {

			return new HealthRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.health}".
	 */
	public static final Endpoint<HealthRequest, HealthResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/health";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.includeTimestamp != null) {
					params.put("include_timestamp", String.valueOf(request.includeTimestamp));
				}
				if (request.ts != null) {
					params.put("ts", String.valueOf(request.ts));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, HealthResponse.DESERIALIZER);
}
