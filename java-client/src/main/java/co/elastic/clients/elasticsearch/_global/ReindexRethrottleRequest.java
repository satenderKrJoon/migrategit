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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.reindex_rethrottle.Request
public final class ReindexRethrottleRequest extends RequestBase {
	private final String taskId;

	@Nullable
	private final Number requestsPerSecond;

	// ---------------------------------------------------------------------------------------------

	protected ReindexRethrottleRequest(Builder builder) {

		this.taskId = Objects.requireNonNull(builder.taskId, "task_id");
		this.requestsPerSecond = builder.requestsPerSecond;

	}

	/**
	 * API name: {@code task_id}
	 */
	public String taskId() {
		return this.taskId;
	}

	/**
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public Number requestsPerSecond() {
		return this.requestsPerSecond;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexRethrottleRequest}.
	 */
	public static class Builder implements ObjectBuilder<ReindexRethrottleRequest> {
		private String taskId;

		@Nullable
		private Number requestsPerSecond;

		/**
		 * API name: {@code task_id}
		 */
		public Builder taskId(String value) {
			this.taskId = value;
			return this;
		}

		/**
		 * API name: {@code requests_per_second}
		 */
		public Builder requestsPerSecond(@Nullable Number value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * Builds a {@link ReindexRethrottleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexRethrottleRequest build() {

			return new ReindexRethrottleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code reindex_rethrottle}".
	 */
	public static final Endpoint<ReindexRethrottleRequest, ReindexRethrottleResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _taskId = 1 << 0;

				int propsSet = 0;

				if (request.taskId() != null)
					propsSet |= _taskId;

				if (propsSet == (_taskId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_reindex");
					buf.append("/");
					buf.append(request.taskId);
					buf.append("/_rethrottle");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.requestsPerSecond != null) {
					params.put("requests_per_second", request.requestsPerSecond.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, ReindexRethrottleResponse.DESERIALIZER);
}
