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

import co.elastic.clients.elasticsearch.security.get_api_key.ApiKey;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_api_key.Response
public final class GetApiKeyResponse implements ToJsonp {
	private final List<ApiKey> apiKeys;

	// ---------------------------------------------------------------------------------------------

	protected GetApiKeyResponse(Builder builder) {

		this.apiKeys = Objects.requireNonNull(builder.apiKeys, "api_keys");

	}

	/**
	 * API name: {@code api_keys}
	 */
	public List<ApiKey> apiKeys() {
		return this.apiKeys;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("api_keys");
		generator.writeStartArray();
		for (ApiKey item0 : this.apiKeys) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetApiKeyResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetApiKeyResponse> {
		private List<ApiKey> apiKeys;

		/**
		 * API name: {@code api_keys}
		 */
		public Builder apiKeys(List<ApiKey> value) {
			this.apiKeys = value;
			return this;
		}

		/**
		 * API name: {@code api_keys}
		 */
		public Builder apiKeys(ApiKey... value) {
			this.apiKeys = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #apiKeys(List)}, creating the list if needed.
		 */
		public Builder addApiKeys(ApiKey value) {
			if (this.apiKeys == null) {
				this.apiKeys = new ArrayList<>();
			}
			this.apiKeys.add(value);
			return this;
		}

		/**
		 * Set {@link #apiKeys(List)} to a singleton list.
		 */
		public Builder apiKeys(Function<ApiKey.Builder, ObjectBuilder<ApiKey>> fn) {
			return this.apiKeys(fn.apply(new ApiKey.Builder()).build());
		}

		/**
		 * Add a value to {@link #apiKeys(List)}, creating the list if needed.
		 */
		public Builder addApiKeys(Function<ApiKey.Builder, ObjectBuilder<ApiKey>> fn) {
			return this.addApiKeys(fn.apply(new ApiKey.Builder()).build());
		}

		/**
		 * Builds a {@link GetApiKeyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetApiKeyResponse build() {

			return new GetApiKeyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetApiKeyResponse
	 */
	public static final JsonpDeserializer<GetApiKeyResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetApiKeyResponse::setupGetApiKeyResponseDeserializer);

	protected static void setupGetApiKeyResponseDeserializer(DelegatingDeserializer<GetApiKeyResponse.Builder> op) {

		op.add(Builder::apiKeys, JsonpDeserializer.arrayDeserializer(ApiKey.DESERIALIZER), "api_keys");

	}

}
