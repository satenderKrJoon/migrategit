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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSearch
public final class NodeInfoSearch implements ToJsonp {
	private final NodeInfoSearchRemote remote;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoSearch(Builder builder) {

		this.remote = Objects.requireNonNull(builder.remote, "remote");

	}

	/**
	 * API name: {@code remote}
	 */
	public NodeInfoSearchRemote remote() {
		return this.remote;
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

		generator.writeKey("remote");
		this.remote.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSearch}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSearch> {
		private NodeInfoSearchRemote remote;

		/**
		 * API name: {@code remote}
		 */
		public Builder remote(NodeInfoSearchRemote value) {
			this.remote = value;
			return this;
		}

		/**
		 * API name: {@code remote}
		 */
		public Builder remote(Function<NodeInfoSearchRemote.Builder, ObjectBuilder<NodeInfoSearchRemote>> fn) {
			return this.remote(fn.apply(new NodeInfoSearchRemote.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoSearch}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSearch build() {

			return new NodeInfoSearch(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoSearch
	 */
	public static final JsonpDeserializer<NodeInfoSearch> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoSearch::setupNodeInfoSearchDeserializer);

	protected static void setupNodeInfoSearchDeserializer(DelegatingDeserializer<NodeInfoSearch.Builder> op) {

		op.add(Builder::remote, NodeInfoSearchRemote.DESERIALIZER, "remote");

	}

}
