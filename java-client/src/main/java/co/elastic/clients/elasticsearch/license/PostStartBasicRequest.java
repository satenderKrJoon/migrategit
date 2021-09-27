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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: license.post_start_basic.Request
public final class PostStartBasicRequest extends RequestBase {
	@Nullable
	private final Boolean acknowledge;

	// ---------------------------------------------------------------------------------------------

	protected PostStartBasicRequest(Builder builder) {

		this.acknowledge = builder.acknowledge;

	}

	/**
	 * API name: {@code acknowledge}
	 */
	@Nullable
	public Boolean acknowledge() {
		return this.acknowledge;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostStartBasicRequest}.
	 */
	public static class Builder implements ObjectBuilder<PostStartBasicRequest> {
		@Nullable
		private Boolean acknowledge;

		/**
		 * API name: {@code acknowledge}
		 */
		public Builder acknowledge(@Nullable Boolean value) {
			this.acknowledge = value;
			return this;
		}

		/**
		 * Builds a {@link PostStartBasicRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostStartBasicRequest build() {

			return new PostStartBasicRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code license.post_start_basic}".
	 */
	public static final Endpoint<PostStartBasicRequest, PostStartBasicResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_license/start_basic";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.acknowledge != null) {
					params.put("acknowledge", String.valueOf(request.acknowledge));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, PostStartBasicResponse.DESERIALIZER);
}
