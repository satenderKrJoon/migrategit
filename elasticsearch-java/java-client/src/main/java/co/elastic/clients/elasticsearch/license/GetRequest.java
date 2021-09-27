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

// typedef: license.get.Request
public final class GetRequest extends RequestBase {
	@Nullable
	private final Boolean acceptEnterprise;

	@Nullable
	private final Boolean local;

	// ---------------------------------------------------------------------------------------------

	protected GetRequest(Builder builder) {

		this.acceptEnterprise = builder.acceptEnterprise;
		this.local = builder.local;

	}

	/**
	 * API name: {@code accept_enterprise}
	 */
	@Nullable
	public Boolean acceptEnterprise() {
		return this.acceptEnterprise;
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
	 * Builder for {@link GetRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetRequest> {
		@Nullable
		private Boolean acceptEnterprise;

		@Nullable
		private Boolean local;

		/**
		 * API name: {@code accept_enterprise}
		 */
		public Builder acceptEnterprise(@Nullable Boolean value) {
			this.acceptEnterprise = value;
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
	 * Endpoint "{@code license.get}".
	 */
	public static final Endpoint<GetRequest, GetResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_license";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.acceptEnterprise != null) {
					params.put("accept_enterprise", String.valueOf(request.acceptEnterprise));
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, GetResponse.DESERIALIZER);
}
