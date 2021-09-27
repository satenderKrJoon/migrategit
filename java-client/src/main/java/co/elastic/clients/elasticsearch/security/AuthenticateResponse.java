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

import co.elastic.clients.elasticsearch.security.authenticate.Token;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.authenticate.Response
public final class AuthenticateResponse implements ToJsonp {
	private final RealmInfo authenticationRealm;

	@Nullable
	private final String email;

	@Nullable
	private final String fullName;

	private final RealmInfo lookupRealm;

	private final Map<String, JsonValue> metadata;

	private final List<String> roles;

	private final String username;

	private final Boolean enabled;

	private final String authenticationType;

	@Nullable
	private final Token token;

	// ---------------------------------------------------------------------------------------------

	protected AuthenticateResponse(Builder builder) {

		this.authenticationRealm = Objects.requireNonNull(builder.authenticationRealm, "authentication_realm");
		this.email = builder.email;
		this.fullName = builder.fullName;
		this.lookupRealm = Objects.requireNonNull(builder.lookupRealm, "lookup_realm");
		this.metadata = Objects.requireNonNull(builder.metadata, "metadata");
		this.roles = Objects.requireNonNull(builder.roles, "roles");
		this.username = Objects.requireNonNull(builder.username, "username");
		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");
		this.authenticationType = Objects.requireNonNull(builder.authenticationType, "authentication_type");
		this.token = builder.token;

	}

	/**
	 * API name: {@code authentication_realm}
	 */
	public RealmInfo authenticationRealm() {
		return this.authenticationRealm;
	}

	/**
	 * API name: {@code email}
	 */
	@Nullable
	public String email() {
		return this.email;
	}

	/**
	 * API name: {@code full_name}
	 */
	@Nullable
	public String fullName() {
		return this.fullName;
	}

	/**
	 * API name: {@code lookup_realm}
	 */
	public RealmInfo lookupRealm() {
		return this.lookupRealm;
	}

	/**
	 * API name: {@code metadata}
	 */
	public Map<String, JsonValue> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code roles}
	 */
	public List<String> roles() {
		return this.roles;
	}

	/**
	 * API name: {@code username}
	 */
	public String username() {
		return this.username;
	}

	/**
	 * API name: {@code enabled}
	 */
	public Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code authentication_type}
	 */
	public String authenticationType() {
		return this.authenticationType;
	}

	/**
	 * API name: {@code token}
	 */
	@Nullable
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

		generator.writeKey("authentication_realm");
		this.authenticationRealm.toJsonp(generator, mapper);

		if (this.email != null) {

			generator.writeKey("email");
			generator.write(this.email);

		}
		if (this.fullName != null) {

			generator.writeKey("full_name");
			generator.write(this.fullName);

		}

		generator.writeKey("lookup_realm");
		this.lookupRealm.toJsonp(generator, mapper);

		generator.writeKey("metadata");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.metadata.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("roles");
		generator.writeStartArray();
		for (String item0 : this.roles) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("username");
		generator.write(this.username);

		generator.writeKey("enabled");
		generator.write(this.enabled);

		generator.writeKey("authentication_type");
		generator.write(this.authenticationType);

		if (this.token != null) {

			generator.writeKey("token");
			this.token.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AuthenticateResponse}.
	 */
	public static class Builder implements ObjectBuilder<AuthenticateResponse> {
		private RealmInfo authenticationRealm;

		@Nullable
		private String email;

		@Nullable
		private String fullName;

		private RealmInfo lookupRealm;

		private Map<String, JsonValue> metadata;

		private List<String> roles;

		private String username;

		private Boolean enabled;

		private String authenticationType;

		@Nullable
		private Token token;

		/**
		 * API name: {@code authentication_realm}
		 */
		public Builder authenticationRealm(RealmInfo value) {
			this.authenticationRealm = value;
			return this;
		}

		/**
		 * API name: {@code authentication_realm}
		 */
		public Builder authenticationRealm(Function<RealmInfo.Builder, ObjectBuilder<RealmInfo>> fn) {
			return this.authenticationRealm(fn.apply(new RealmInfo.Builder()).build());
		}

		/**
		 * API name: {@code email}
		 */
		public Builder email(@Nullable String value) {
			this.email = value;
			return this;
		}

		/**
		 * API name: {@code full_name}
		 */
		public Builder fullName(@Nullable String value) {
			this.fullName = value;
			return this;
		}

		/**
		 * API name: {@code lookup_realm}
		 */
		public Builder lookupRealm(RealmInfo value) {
			this.lookupRealm = value;
			return this;
		}

		/**
		 * API name: {@code lookup_realm}
		 */
		public Builder lookupRealm(Function<RealmInfo.Builder, ObjectBuilder<RealmInfo>> fn) {
			return this.lookupRealm(fn.apply(new RealmInfo.Builder()).build());
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(Map<String, JsonValue> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonValue value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(List<String> value) {
			this.roles = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(String... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #roles(List)}, creating the list if needed.
		 */
		public Builder addRoles(String value) {
			if (this.roles == null) {
				this.roles = new ArrayList<>();
			}
			this.roles.add(value);
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * API name: {@code enabled}
		 */
		public Builder enabled(Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code authentication_type}
		 */
		public Builder authenticationType(String value) {
			this.authenticationType = value;
			return this;
		}

		/**
		 * API name: {@code token}
		 */
		public Builder token(@Nullable Token value) {
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
		 * Builds a {@link AuthenticateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AuthenticateResponse build() {

			return new AuthenticateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AuthenticateResponse
	 */
	public static final JsonpDeserializer<AuthenticateResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AuthenticateResponse::setupAuthenticateResponseDeserializer);

	protected static void setupAuthenticateResponseDeserializer(
			DelegatingDeserializer<AuthenticateResponse.Builder> op) {

		op.add(Builder::authenticationRealm, RealmInfo.DESERIALIZER, "authentication_realm");
		op.add(Builder::email, JsonpDeserializer.stringDeserializer(), "email");
		op.add(Builder::fullName, JsonpDeserializer.stringDeserializer(), "full_name");
		op.add(Builder::lookupRealm, RealmInfo.DESERIALIZER, "lookup_realm");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"metadata");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::authenticationType, JsonpDeserializer.stringDeserializer(), "authentication_type");
		op.add(Builder::token, Token.DESERIALIZER, "token");

	}

}
