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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import javax.annotation.Nullable;

// typedef: security.invalidate_token.Request
public final class InvalidateTokenRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String token;

	@Nullable
	private final String refreshToken;

	@Nullable
	private final String realmName;

	@Nullable
	private final String username;

	// ---------------------------------------------------------------------------------------------

	protected InvalidateTokenRequest(Builder builder) {

		this.token = builder.token;
		this.refreshToken = builder.refreshToken;
		this.realmName = builder.realmName;
		this.username = builder.username;

	}

	/**
	 * API name: {@code token}
	 */
	@Nullable
	public String token() {
		return this.token;
	}

	/**
	 * API name: {@code refresh_token}
	 */
	@Nullable
	public String refreshToken() {
		return this.refreshToken;
	}

	/**
	 * API name: {@code realm_name}
	 */
	@Nullable
	public String realmName() {
		return this.realmName;
	}

	/**
	 * API name: {@code username}
	 */
	@Nullable
	public String username() {
		return this.username;
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

		if (this.token != null) {

			generator.writeKey("token");
			generator.write(this.token);

		}
		if (this.refreshToken != null) {

			generator.writeKey("refresh_token");
			generator.write(this.refreshToken);

		}
		if (this.realmName != null) {

			generator.writeKey("realm_name");
			generator.write(this.realmName);

		}
		if (this.username != null) {

			generator.writeKey("username");
			generator.write(this.username);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InvalidateTokenRequest}.
	 */
	public static class Builder implements ObjectBuilder<InvalidateTokenRequest> {
		@Nullable
		private String token;

		@Nullable
		private String refreshToken;

		@Nullable
		private String realmName;

		@Nullable
		private String username;

		/**
		 * API name: {@code token}
		 */
		public Builder token(@Nullable String value) {
			this.token = value;
			return this;
		}

		/**
		 * API name: {@code refresh_token}
		 */
		public Builder refreshToken(@Nullable String value) {
			this.refreshToken = value;
			return this;
		}

		/**
		 * API name: {@code realm_name}
		 */
		public Builder realmName(@Nullable String value) {
			this.realmName = value;
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		/**
		 * Builds a {@link InvalidateTokenRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InvalidateTokenRequest build() {

			return new InvalidateTokenRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for InvalidateTokenRequest
	 */
	public static final JsonpDeserializer<InvalidateTokenRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InvalidateTokenRequest::setupInvalidateTokenRequestDeserializer);

	protected static void setupInvalidateTokenRequestDeserializer(
			DelegatingDeserializer<InvalidateTokenRequest.Builder> op) {

		op.add(Builder::token, JsonpDeserializer.stringDeserializer(), "token");
		op.add(Builder::refreshToken, JsonpDeserializer.stringDeserializer(), "refresh_token");
		op.add(Builder::realmName, JsonpDeserializer.stringDeserializer(), "realm_name");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.invalidate_token}".
	 */
	public static final Endpoint<InvalidateTokenRequest, InvalidateTokenResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				return "/_security/oauth2/token";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, InvalidateTokenResponse.DESERIALIZER);
}
