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
import co.elastic.clients.elasticsearch.security.create_api_key.RoleDescriptor;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.create_api_key.Request
public final class CreateApiKeyRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final JsonValue refresh;

	@Nullable
	private final JsonValue expiration;

	@Nullable
	private final String name;

	@Nullable
	private final Map<String, RoleDescriptor> roleDescriptors;

	@Nullable
	private final Map<String, JsonValue> metadata;

	// ---------------------------------------------------------------------------------------------

	protected CreateApiKeyRequest(Builder builder) {

		this.refresh = builder.refresh;
		this.expiration = builder.expiration;
		this.name = builder.name;
		this.roleDescriptors = builder.roleDescriptors;
		this.metadata = builder.metadata;

	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue refresh() {
		return this.refresh;
	}

	/**
	 * Expiration time for the API key. By default, API keys never expire.
	 *
	 * API name: {@code expiration}
	 */
	@Nullable
	public JsonValue expiration() {
		return this.expiration;
	}

	/**
	 * Specifies the name for this API key.
	 *
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * An array of role descriptors for this API key. This parameter is optional.
	 * When it is not specified or is an empty array, then the API key will have a
	 * point in time snapshot of permissions of the authenticated user. If you
	 * supply role descriptors then the resultant permissions would be an
	 * intersection of API keys permissions and authenticated user’s permissions
	 * thereby limiting the access scope for API keys. The structure of role
	 * descriptor is the same as the request for create role API. For more details,
	 * see create or update roles API.
	 *
	 * API name: {@code role_descriptors}
	 */
	@Nullable
	public Map<String, RoleDescriptor> roleDescriptors() {
		return this.roleDescriptors;
	}

	/**
	 * Arbitrary metadata that you want to associate with the API key. It supports
	 * nested data structure. Within the metadata object, keys beginning with _ are
	 * reserved for system usage.
	 *
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonValue> metadata() {
		return this.metadata;
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

		if (this.expiration != null) {

			generator.writeKey("expiration");
			generator.write(this.expiration);

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.roleDescriptors != null) {

			generator.writeKey("role_descriptors");
			generator.writeStartObject();
			for (Map.Entry<String, RoleDescriptor> item0 : this.roleDescriptors.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateApiKeyRequest}.
	 */
	public static class Builder implements ObjectBuilder<CreateApiKeyRequest> {
		@Nullable
		private JsonValue refresh;

		@Nullable
		private JsonValue expiration;

		@Nullable
		private String name;

		@Nullable
		private Map<String, RoleDescriptor> roleDescriptors;

		@Nullable
		private Map<String, JsonValue> metadata;

		/**
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Expiration time for the API key. By default, API keys never expire.
		 *
		 * API name: {@code expiration}
		 */
		public Builder expiration(@Nullable JsonValue value) {
			this.expiration = value;
			return this;
		}

		/**
		 * Specifies the name for this API key.
		 *
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * An array of role descriptors for this API key. This parameter is optional.
		 * When it is not specified or is an empty array, then the API key will have a
		 * point in time snapshot of permissions of the authenticated user. If you
		 * supply role descriptors then the resultant permissions would be an
		 * intersection of API keys permissions and authenticated user’s permissions
		 * thereby limiting the access scope for API keys. The structure of role
		 * descriptor is the same as the request for create role API. For more details,
		 * see create or update roles API.
		 *
		 * API name: {@code role_descriptors}
		 */
		public Builder roleDescriptors(@Nullable Map<String, RoleDescriptor> value) {
			this.roleDescriptors = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #roleDescriptors(Map)}, creating the map if needed.
		 */
		public Builder putRoleDescriptors(String key, RoleDescriptor value) {
			if (this.roleDescriptors == null) {
				this.roleDescriptors = new HashMap<>();
			}
			this.roleDescriptors.put(key, value);
			return this;
		}

		/**
		 * Set {@link #roleDescriptors(Map)} to a singleton map.
		 */
		public Builder roleDescriptors(String key, Function<RoleDescriptor.Builder, ObjectBuilder<RoleDescriptor>> fn) {
			return this.roleDescriptors(Collections.singletonMap(key, fn.apply(new RoleDescriptor.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #roleDescriptors(Map)}, creating the map if needed.
		 */
		public Builder putRoleDescriptors(String key,
				Function<RoleDescriptor.Builder, ObjectBuilder<RoleDescriptor>> fn) {
			return this.putRoleDescriptors(key, fn.apply(new RoleDescriptor.Builder()).build());
		}

		/**
		 * Arbitrary metadata that you want to associate with the API key. It supports
		 * nested data structure. Within the metadata object, keys beginning with _ are
		 * reserved for system usage.
		 *
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonValue> value) {
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
		 * Builds a {@link CreateApiKeyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateApiKeyRequest build() {

			return new CreateApiKeyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CreateApiKeyRequest
	 */
	public static final JsonpDeserializer<CreateApiKeyRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CreateApiKeyRequest::setupCreateApiKeyRequestDeserializer);

	protected static void setupCreateApiKeyRequestDeserializer(DelegatingDeserializer<CreateApiKeyRequest.Builder> op) {

		op.add(Builder::expiration, JsonpDeserializer.jsonValueDeserializer(), "expiration");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::roleDescriptors, JsonpDeserializer.stringMapDeserializer(RoleDescriptor.DESERIALIZER),
				"role_descriptors");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"metadata");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.create_api_key}".
	 */
	public static final Endpoint<CreateApiKeyRequest, CreateApiKeyResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_security/api_key";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, CreateApiKeyResponse.DESERIALIZER);
}
