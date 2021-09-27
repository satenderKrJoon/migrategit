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

package co.elastic.clients.elasticsearch.eql;

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

// typedef: eql.get.Request
public final class GetRequest extends RequestBase {
	private final String id;

	@Nullable
	private final JsonValue keepAlive;

	@Nullable
	private final JsonValue waitForCompletionTimeout;

	// ---------------------------------------------------------------------------------------------

	protected GetRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.keepAlive = builder.keepAlive;
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;

	}

	/**
	 * Identifier for the search.
	 *
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Period for which the search and its results are stored on the cluster.
	 * Defaults to the keep_alive value set by the search’s EQL search API request.
	 *
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public JsonValue keepAlive() {
		return this.keepAlive;
	}

	/**
	 * Timeout duration to wait for the request to finish. Defaults to no timeout,
	 * meaning the request waits for complete search results.
	 *
	 * API name: {@code wait_for_completion_timeout}
	 */
	@Nullable
	public JsonValue waitForCompletionTimeout() {
		return this.waitForCompletionTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetRequest> {
		private String id;

		@Nullable
		private JsonValue keepAlive;

		@Nullable
		private JsonValue waitForCompletionTimeout;

		/**
		 * Identifier for the search.
		 *
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Period for which the search and its results are stored on the cluster.
		 * Defaults to the keep_alive value set by the search’s EQL search API request.
		 *
		 * API name: {@code keep_alive}
		 */
		public Builder keepAlive(@Nullable JsonValue value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Timeout duration to wait for the request to finish. Defaults to no timeout,
		 * meaning the request waits for complete search results.
		 *
		 * API name: {@code wait_for_completion_timeout}
		 */
		public Builder waitForCompletionTimeout(@Nullable JsonValue value) {
			this.waitForCompletionTimeout = value;
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
	 * Endpoint "{@code eql.get}".
	 */
	private static final Endpoint.Simple<GetRequest, Void> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_eql");
					buf.append("/search");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.keepAlive != null) {
					params.put("keep_alive", request.keepAlive.toString());
				}
				if (request.waitForCompletionTimeout != null) {
					params.put("wait_for_completion_timeout", request.waitForCompletionTimeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, null);

	/**
	 * Create an "{@code eql.get}" endpoint.
	 */
	public static <TEvent> Endpoint<GetRequest, GetResponse<TEvent>, ElasticsearchError> createGetEndpoint(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ENDPOINT.withResponseDeserializer(GetResponse.createGetResponseDeserializer(tEventDeserializer));
	}
}
