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

package co.elastic.clients.elasticsearch.indices;

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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.split.Request
public final class SplitRequest extends RequestBase implements ToJsonp {
	private final String index;

	private final String target;

	@Nullable
	private final JsonValue masterTimeout;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final JsonValue waitForActiveShards;

	@Nullable
	private final Map<String, Alias> aliases;

	@Nullable
	private final Map<String, JsonValue> settings;

	// ---------------------------------------------------------------------------------------------

	protected SplitRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.target = Objects.requireNonNull(builder.target, "target");
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.aliases = builder.aliases;
		this.settings = builder.settings;

	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code target}
	 */
	public String target() {
		return this.target;
	}

	/**
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * API name: {@code aliases}
	 */
	@Nullable
	public Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public Map<String, JsonValue> settings() {
		return this.settings;
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

		if (this.aliases != null) {

			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, Alias> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.settings != null) {

			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SplitRequest}.
	 */
	public static class Builder implements ObjectBuilder<SplitRequest> {
		private String index;

		private String target;

		@Nullable
		private JsonValue masterTimeout;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private JsonValue waitForActiveShards;

		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private Map<String, JsonValue> settings;

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code target}
		 */
		public Builder target(String value) {
			this.target = value;
			return this;
		}

		/**
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder waitForActiveShards(@Nullable JsonValue value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(@Nullable Map<String, Alias> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, Alias value) {
			if (this.aliases == null) {
				this.aliases = new HashMap<>();
			}
			this.aliases.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new Alias.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return this.putAliases(key, fn.apply(new Alias.Builder()).build());
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable Map<String, JsonValue> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #settings(Map)}, creating the map if needed.
		 */
		public Builder putSettings(String key, JsonValue value) {
			if (this.settings == null) {
				this.settings = new HashMap<>();
			}
			this.settings.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link SplitRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SplitRequest build() {

			return new SplitRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SplitRequest
	 */
	public static final JsonpDeserializer<SplitRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SplitRequest::setupSplitRequestDeserializer);

	protected static void setupSplitRequestDeserializer(DelegatingDeserializer<SplitRequest.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias.DESERIALIZER), "aliases");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.split}".
	 */
	public static final Endpoint<SplitRequest, SplitResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _target = 1 << 1;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;
				if (request.target() != null)
					propsSet |= _target;

				if (propsSet == (_index | _target)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_split");
					buf.append("/");
					buf.append(request.target);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, SplitResponse.DESERIALIZER);
}
