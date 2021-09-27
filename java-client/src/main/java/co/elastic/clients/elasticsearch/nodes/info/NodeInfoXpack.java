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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpack
public final class NodeInfoXpack implements ToJsonp {
	@Nullable
	private final NodeInfoXpackLicense license;

	private final NodeInfoXpackSecurity security;

	@Nullable
	private final Map<String, JsonValue> notification;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoXpack(Builder builder) {

		this.license = builder.license;
		this.security = Objects.requireNonNull(builder.security, "security");
		this.notification = builder.notification;

	}

	/**
	 * API name: {@code license}
	 */
	@Nullable
	public NodeInfoXpackLicense license() {
		return this.license;
	}

	/**
	 * API name: {@code security}
	 */
	public NodeInfoXpackSecurity security() {
		return this.security;
	}

	/**
	 * API name: {@code notification}
	 */
	@Nullable
	public Map<String, JsonValue> notification() {
		return this.notification;
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

		if (this.license != null) {

			generator.writeKey("license");
			this.license.toJsonp(generator, mapper);

		}

		generator.writeKey("security");
		this.security.toJsonp(generator, mapper);

		if (this.notification != null) {

			generator.writeKey("notification");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.notification.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpack}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoXpack> {
		@Nullable
		private NodeInfoXpackLicense license;

		private NodeInfoXpackSecurity security;

		@Nullable
		private Map<String, JsonValue> notification;

		/**
		 * API name: {@code license}
		 */
		public Builder license(@Nullable NodeInfoXpackLicense value) {
			this.license = value;
			return this;
		}

		/**
		 * API name: {@code license}
		 */
		public Builder license(Function<NodeInfoXpackLicense.Builder, ObjectBuilder<NodeInfoXpackLicense>> fn) {
			return this.license(fn.apply(new NodeInfoXpackLicense.Builder()).build());
		}

		/**
		 * API name: {@code security}
		 */
		public Builder security(NodeInfoXpackSecurity value) {
			this.security = value;
			return this;
		}

		/**
		 * API name: {@code security}
		 */
		public Builder security(Function<NodeInfoXpackSecurity.Builder, ObjectBuilder<NodeInfoXpackSecurity>> fn) {
			return this.security(fn.apply(new NodeInfoXpackSecurity.Builder()).build());
		}

		/**
		 * API name: {@code notification}
		 */
		public Builder notification(@Nullable Map<String, JsonValue> value) {
			this.notification = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #notification(Map)}, creating the map if needed.
		 */
		public Builder putNotification(String key, JsonValue value) {
			if (this.notification == null) {
				this.notification = new HashMap<>();
			}
			this.notification.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link NodeInfoXpack}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpack build() {

			return new NodeInfoXpack(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoXpack
	 */
	public static final JsonpDeserializer<NodeInfoXpack> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoXpack::setupNodeInfoXpackDeserializer);

	protected static void setupNodeInfoXpackDeserializer(DelegatingDeserializer<NodeInfoXpack.Builder> op) {

		op.add(Builder::license, NodeInfoXpackLicense.DESERIALIZER, "license");
		op.add(Builder::security, NodeInfoXpackSecurity.DESERIALIZER, "security");
		op.add(Builder::notification,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "notification");

	}

}
