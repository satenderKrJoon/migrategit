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
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpackSecurityAuthcRealms
public final class NodeInfoXpackSecurityAuthcRealms implements ToJsonp {
	@Nullable
	private final Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> file;

	@Nullable
	private final Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> native_;

	@Nullable
	private final Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> pki;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoXpackSecurityAuthcRealms(Builder builder) {

		this.file = builder.file;
		this.native_ = builder.native_;
		this.pki = builder.pki;

	}

	/**
	 * API name: {@code file}
	 */
	@Nullable
	public Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> file() {
		return this.file;
	}

	/**
	 * API name: {@code native}
	 */
	@Nullable
	public Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> native_() {
		return this.native_;
	}

	/**
	 * API name: {@code pki}
	 */
	@Nullable
	public Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> pki() {
		return this.pki;
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

		if (this.file != null) {

			generator.writeKey("file");
			generator.writeStartObject();
			for (Map.Entry<String, NodeInfoXpackSecurityAuthcRealmsStatus> item0 : this.file.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.native_ != null) {

			generator.writeKey("native");
			generator.writeStartObject();
			for (Map.Entry<String, NodeInfoXpackSecurityAuthcRealmsStatus> item0 : this.native_.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.pki != null) {

			generator.writeKey("pki");
			generator.writeStartObject();
			for (Map.Entry<String, NodeInfoXpackSecurityAuthcRealmsStatus> item0 : this.pki.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackSecurityAuthcRealms}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoXpackSecurityAuthcRealms> {
		@Nullable
		private Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> file;

		@Nullable
		private Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> native_;

		@Nullable
		private Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> pki;

		/**
		 * API name: {@code file}
		 */
		public Builder file(@Nullable Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> value) {
			this.file = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #file(Map)}, creating the map if needed.
		 */
		public Builder putFile(String key, NodeInfoXpackSecurityAuthcRealmsStatus value) {
			if (this.file == null) {
				this.file = new HashMap<>();
			}
			this.file.put(key, value);
			return this;
		}

		/**
		 * Set {@link #file(Map)} to a singleton map.
		 */
		public Builder file(String key,
				Function<NodeInfoXpackSecurityAuthcRealmsStatus.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcRealmsStatus>> fn) {
			return this.file(Collections.singletonMap(key,
					fn.apply(new NodeInfoXpackSecurityAuthcRealmsStatus.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #file(Map)}, creating the map if needed.
		 */
		public Builder putFile(String key,
				Function<NodeInfoXpackSecurityAuthcRealmsStatus.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcRealmsStatus>> fn) {
			return this.putFile(key, fn.apply(new NodeInfoXpackSecurityAuthcRealmsStatus.Builder()).build());
		}

		/**
		 * API name: {@code native}
		 */
		public Builder native_(@Nullable Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> value) {
			this.native_ = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #native_(Map)}, creating the map if needed.
		 */
		public Builder putNative_(String key, NodeInfoXpackSecurityAuthcRealmsStatus value) {
			if (this.native_ == null) {
				this.native_ = new HashMap<>();
			}
			this.native_.put(key, value);
			return this;
		}

		/**
		 * Set {@link #native_(Map)} to a singleton map.
		 */
		public Builder native_(String key,
				Function<NodeInfoXpackSecurityAuthcRealmsStatus.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcRealmsStatus>> fn) {
			return this.native_(Collections.singletonMap(key,
					fn.apply(new NodeInfoXpackSecurityAuthcRealmsStatus.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #native_(Map)}, creating the map if needed.
		 */
		public Builder putNative_(String key,
				Function<NodeInfoXpackSecurityAuthcRealmsStatus.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcRealmsStatus>> fn) {
			return this.putNative_(key, fn.apply(new NodeInfoXpackSecurityAuthcRealmsStatus.Builder()).build());
		}

		/**
		 * API name: {@code pki}
		 */
		public Builder pki(@Nullable Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> value) {
			this.pki = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #pki(Map)}, creating the map if needed.
		 */
		public Builder putPki(String key, NodeInfoXpackSecurityAuthcRealmsStatus value) {
			if (this.pki == null) {
				this.pki = new HashMap<>();
			}
			this.pki.put(key, value);
			return this;
		}

		/**
		 * Set {@link #pki(Map)} to a singleton map.
		 */
		public Builder pki(String key,
				Function<NodeInfoXpackSecurityAuthcRealmsStatus.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcRealmsStatus>> fn) {
			return this.pki(Collections.singletonMap(key,
					fn.apply(new NodeInfoXpackSecurityAuthcRealmsStatus.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #pki(Map)}, creating the map if needed.
		 */
		public Builder putPki(String key,
				Function<NodeInfoXpackSecurityAuthcRealmsStatus.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcRealmsStatus>> fn) {
			return this.putPki(key, fn.apply(new NodeInfoXpackSecurityAuthcRealmsStatus.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoXpackSecurityAuthcRealms}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackSecurityAuthcRealms build() {

			return new NodeInfoXpackSecurityAuthcRealms(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoXpackSecurityAuthcRealms
	 */
	public static final JsonpDeserializer<NodeInfoXpackSecurityAuthcRealms> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					NodeInfoXpackSecurityAuthcRealms::setupNodeInfoXpackSecurityAuthcRealmsDeserializer);

	protected static void setupNodeInfoXpackSecurityAuthcRealmsDeserializer(
			DelegatingDeserializer<NodeInfoXpackSecurityAuthcRealms.Builder> op) {

		op.add(Builder::file,
				JsonpDeserializer.stringMapDeserializer(NodeInfoXpackSecurityAuthcRealmsStatus.DESERIALIZER), "file");
		op.add(Builder::native_,
				JsonpDeserializer.stringMapDeserializer(NodeInfoXpackSecurityAuthcRealmsStatus.DESERIALIZER), "native");
		op.add(Builder::pki,
				JsonpDeserializer.stringMapDeserializer(NodeInfoXpackSecurityAuthcRealmsStatus.DESERIALIZER), "pki");

	}

}
