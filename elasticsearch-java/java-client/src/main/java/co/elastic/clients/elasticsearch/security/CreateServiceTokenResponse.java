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

import co.elastic.clients.elasticsearch.security.create_service_token.Token;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.create_service_token.Response
public final class CreateServiceTokenResponse implements ToJsonp {
	private final Boolean created;

	private final Token token;

	// ---------------------------------------------------------------------------------------------

	protected CreateServiceTokenResponse(Builder builder) {

		this.created = Objects.requireNonNull(builder.created, "created");
		this.token = Objects.requireNonNull(builder.token, "token");

	}

	/**
	 * API name: {@code created}
	 */
	public Boolean created() {
		return this.created;
	}

	/**
	 * API name: {@code token}
	 */
	public Token token() {
		return this.token;
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

		generator.writeKey("created");
		generator.write(this.created);

		generator.writeKey("token");
		this.token.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateServiceTokenResponse}.
	 */
	public static class Builder implements ObjectBuilder<CreateServiceTokenResponse> {
		private Boolean created;

		private Token token;

		/**
		 * API name: {@code created}
		 */
		public Builder created(Boolean value) {
			this.created = value;
			return this;
		}

		/**
		 * API name: {@code token}
		 */
		public Builder token(Token value) {
			this.token = value;
			return this;
		}

		/**
		 * API name: {@code token}
		 */
		public Builder token(Function<Token.Builder, ObjectBuilder<Token>> fn) {
			return this.token(fn.apply(new Token.Builder()).build());
		}

		/**
		 * Builds a {@link CreateServiceTokenResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateServiceTokenResponse build() {

			return new CreateServiceTokenResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CreateServiceTokenResponse
	 */
	public static final JsonpDeserializer<CreateServiceTokenResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CreateServiceTokenResponse::setupCreateServiceTokenResponseDeserializer);

	protected static void setupCreateServiceTokenResponseDeserializer(
			DelegatingDeserializer<CreateServiceTokenResponse.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.booleanDeserializer(), "created");
		op.add(Builder::token, Token.DESERIALIZER, "token");

	}

}
