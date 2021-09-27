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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.elasticsearch._global.reindex_rethrottle.ReindexNode;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.reindex_rethrottle.Response
public final class ReindexRethrottleResponse implements ToJsonp {
	private final Map<String, ReindexNode> nodes;

	// ---------------------------------------------------------------------------------------------

	protected ReindexRethrottleResponse(Builder builder) {

		this.nodes = Objects.requireNonNull(builder.nodes, "nodes");

	}

	/**
	 * API name: {@code nodes}
	 */
	public Map<String, ReindexNode> nodes() {
		return this.nodes;
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

		generator.writeKey("nodes");
		generator.writeStartObject();
		for (Map.Entry<String, ReindexNode> item0 : this.nodes.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexRethrottleResponse}.
	 */
	public static class Builder implements ObjectBuilder<ReindexRethrottleResponse> {
		private Map<String, ReindexNode> nodes;

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(Map<String, ReindexNode> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, ReindexNode value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<ReindexNode.Builder, ObjectBuilder<ReindexNode>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new ReindexNode.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, Function<ReindexNode.Builder, ObjectBuilder<ReindexNode>> fn) {
			return this.putNodes(key, fn.apply(new ReindexNode.Builder()).build());
		}

		/**
		 * Builds a {@link ReindexRethrottleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexRethrottleResponse build() {

			return new ReindexRethrottleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ReindexRethrottleResponse
	 */
	public static final JsonpDeserializer<ReindexRethrottleResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ReindexRethrottleResponse::setupReindexRethrottleResponseDeserializer);

	protected static void setupReindexRethrottleResponseDeserializer(
			DelegatingDeserializer<ReindexRethrottleResponse.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(ReindexNode.DESERIALIZER), "nodes");

	}

}
