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

package co.elastic.clients.elasticsearch.searchable_snapshots;

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
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: searchable_snapshots.mount.Request
public final class MountRequest extends RequestBase implements ToJsonp {
	private final String repository;

	private final String snapshot;

	@Nullable
	private final JsonValue masterTimeout;

	@Nullable
	private final Boolean waitForCompletion;

	@Nullable
	private final String storage;

	private final String index;

	@Nullable
	private final String renamedIndex;

	@Nullable
	private final Map<String, JsonValue> indexSettings;

	@Nullable
	private final List<String> ignoreIndexSettings;

	// ---------------------------------------------------------------------------------------------

	protected MountRequest(Builder builder) {

		this.repository = Objects.requireNonNull(builder.repository, "repository");
		this.snapshot = Objects.requireNonNull(builder.snapshot, "snapshot");
		this.masterTimeout = builder.masterTimeout;
		this.waitForCompletion = builder.waitForCompletion;
		this.storage = builder.storage;
		this.index = Objects.requireNonNull(builder.index, "index");
		this.renamedIndex = builder.renamedIndex;
		this.indexSettings = builder.indexSettings;
		this.ignoreIndexSettings = builder.ignoreIndexSettings;

	}

	/**
	 * API name: {@code repository}
	 */
	public String repository() {
		return this.repository;
	}

	/**
	 * API name: {@code snapshot}
	 */
	public String snapshot() {
		return this.snapshot;
	}

	/**
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	/**
	 * API name: {@code storage}
	 */
	@Nullable
	public String storage() {
		return this.storage;
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code renamed_index}
	 */
	@Nullable
	public String renamedIndex() {
		return this.renamedIndex;
	}

	/**
	 * API name: {@code index_settings}
	 */
	@Nullable
	public Map<String, JsonValue> indexSettings() {
		return this.indexSettings;
	}

	/**
	 * API name: {@code ignore_index_settings}
	 */
	@Nullable
	public List<String> ignoreIndexSettings() {
		return this.ignoreIndexSettings;
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

		generator.writeKey("index");
		generator.write(this.index);

		if (this.renamedIndex != null) {

			generator.writeKey("renamed_index");
			generator.write(this.renamedIndex);

		}
		if (this.indexSettings != null) {

			generator.writeKey("index_settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.indexSettings.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.ignoreIndexSettings != null) {

			generator.writeKey("ignore_index_settings");
			generator.writeStartArray();
			for (String item0 : this.ignoreIndexSettings) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MountRequest}.
	 */
	public static class Builder implements ObjectBuilder<MountRequest> {
		private String repository;

		private String snapshot;

		@Nullable
		private JsonValue masterTimeout;

		@Nullable
		private Boolean waitForCompletion;

		@Nullable
		private String storage;

		private String index;

		@Nullable
		private String renamedIndex;

		@Nullable
		private Map<String, JsonValue> indexSettings;

		@Nullable
		private List<String> ignoreIndexSettings;

		/**
		 * API name: {@code repository}
		 */
		public Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(String value) {
			this.snapshot = value;
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
		 * API name: {@code wait_for_completion}
		 */
		public Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		/**
		 * API name: {@code storage}
		 */
		public Builder storage(@Nullable String value) {
			this.storage = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code renamed_index}
		 */
		public Builder renamedIndex(@Nullable String value) {
			this.renamedIndex = value;
			return this;
		}

		/**
		 * API name: {@code index_settings}
		 */
		public Builder indexSettings(@Nullable Map<String, JsonValue> value) {
			this.indexSettings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indexSettings(Map)}, creating the map if needed.
		 */
		public Builder putIndexSettings(String key, JsonValue value) {
			if (this.indexSettings == null) {
				this.indexSettings = new HashMap<>();
			}
			this.indexSettings.put(key, value);
			return this;
		}

		/**
		 * API name: {@code ignore_index_settings}
		 */
		public Builder ignoreIndexSettings(@Nullable List<String> value) {
			this.ignoreIndexSettings = value;
			return this;
		}

		/**
		 * API name: {@code ignore_index_settings}
		 */
		public Builder ignoreIndexSettings(String... value) {
			this.ignoreIndexSettings = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ignoreIndexSettings(List)}, creating the list if
		 * needed.
		 */
		public Builder addIgnoreIndexSettings(String value) {
			if (this.ignoreIndexSettings == null) {
				this.ignoreIndexSettings = new ArrayList<>();
			}
			this.ignoreIndexSettings.add(value);
			return this;
		}

		/**
		 * Builds a {@link MountRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MountRequest build() {

			return new MountRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MountRequest
	 */
	public static final JsonpDeserializer<MountRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MountRequest::setupMountRequestDeserializer);

	protected static void setupMountRequestDeserializer(DelegatingDeserializer<MountRequest.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::renamedIndex, JsonpDeserializer.stringDeserializer(), "renamed_index");
		op.add(Builder::indexSettings,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "index_settings");
		op.add(Builder::ignoreIndexSettings,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ignore_index_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code searchable_snapshots.mount}".
	 */
	public static final Endpoint<MountRequest, MountResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				if (request.repository() != null)
					propsSet |= _repository;
				if (request.snapshot() != null)
					propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					buf.append(request.repository);
					buf.append("/");
					buf.append(request.snapshot);
					buf.append("/_mount");
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
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				if (request.storage != null) {
					params.put("storage", request.storage);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, MountResponse.DESERIALIZER);
}
