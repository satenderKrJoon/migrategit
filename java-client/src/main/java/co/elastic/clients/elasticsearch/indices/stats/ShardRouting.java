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

package co.elastic.clients.elasticsearch.indices.stats;

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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.stats.ShardRouting
public final class ShardRouting implements ToJsonp {
	private final String node;

	private final Boolean primary;

	@Nullable
	private final String relocatingNode;

	private final JsonValue state;

	// ---------------------------------------------------------------------------------------------

	protected ShardRouting(Builder builder) {

		this.node = Objects.requireNonNull(builder.node, "node");
		this.primary = Objects.requireNonNull(builder.primary, "primary");
		this.relocatingNode = builder.relocatingNode;
		this.state = Objects.requireNonNull(builder.state, "state");

	}

	/**
	 * API name: {@code node}
	 */
	public String node() {
		return this.node;
	}

	/**
	 * API name: {@code primary}
	 */
	public Boolean primary() {
		return this.primary;
	}

	/**
	 * API name: {@code relocating_node}
	 */
	@Nullable
	public String relocatingNode() {
		return this.relocatingNode;
	}

	/**
	 * API name: {@code state}
	 */
	public JsonValue state() {
		return this.state;
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

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("primary");
		generator.write(this.primary);

		if (this.relocatingNode != null) {

			generator.writeKey("relocating_node");
			generator.write(this.relocatingNode);

		}

		generator.writeKey("state");
		generator.write(this.state);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardRouting}.
	 */
	public static class Builder implements ObjectBuilder<ShardRouting> {
		private String node;

		private Boolean primary;

		@Nullable
		private String relocatingNode;

		private JsonValue state;

		/**
		 * API name: {@code node}
		 */
		public Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code primary}
		 */
		public Builder primary(Boolean value) {
			this.primary = value;
			return this;
		}

		/**
		 * API name: {@code relocating_node}
		 */
		public Builder relocatingNode(@Nullable String value) {
			this.relocatingNode = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(JsonValue value) {
			this.state = value;
			return this;
		}

		/**
		 * Builds a {@link ShardRouting}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardRouting build() {

			return new ShardRouting(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardRouting
	 */
	public static final JsonpDeserializer<ShardRouting> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardRouting::setupShardRoutingDeserializer);

	protected static void setupShardRoutingDeserializer(DelegatingDeserializer<ShardRouting.Builder> op) {

		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::primary, JsonpDeserializer.booleanDeserializer(), "primary");
		op.add(Builder::relocatingNode, JsonpDeserializer.stringDeserializer(), "relocating_node");
		op.add(Builder::state, JsonpDeserializer.jsonValueDeserializer(), "state");

	}

}
