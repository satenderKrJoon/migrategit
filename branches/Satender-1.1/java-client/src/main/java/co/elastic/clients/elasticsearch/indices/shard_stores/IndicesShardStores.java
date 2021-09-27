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

package co.elastic.clients.elasticsearch.indices.shard_stores;

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

// typedef: indices.shard_stores.IndicesShardStores
public final class IndicesShardStores implements ToJsonp {
	private final Map<String, ShardStoreWrapper> shards;

	// ---------------------------------------------------------------------------------------------

	protected IndicesShardStores(Builder builder) {

		this.shards = Objects.requireNonNull(builder.shards, "shards");

	}

	/**
	 * API name: {@code shards}
	 */
	public Map<String, ShardStoreWrapper> shards() {
		return this.shards;
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

		generator.writeKey("shards");
		generator.writeStartObject();
		for (Map.Entry<String, ShardStoreWrapper> item0 : this.shards.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesShardStores}.
	 */
	public static class Builder implements ObjectBuilder<IndicesShardStores> {
		private Map<String, ShardStoreWrapper> shards;

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(Map<String, ShardStoreWrapper> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #shards(Map)}, creating the map if needed.
		 */
		public Builder putShards(String key, ShardStoreWrapper value) {
			if (this.shards == null) {
				this.shards = new HashMap<>();
			}
			this.shards.put(key, value);
			return this;
		}

		/**
		 * Set {@link #shards(Map)} to a singleton map.
		 */
		public Builder shards(String key, Function<ShardStoreWrapper.Builder, ObjectBuilder<ShardStoreWrapper>> fn) {
			return this.shards(Collections.singletonMap(key, fn.apply(new ShardStoreWrapper.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #shards(Map)}, creating the map if needed.
		 */
		public Builder putShards(String key, Function<ShardStoreWrapper.Builder, ObjectBuilder<ShardStoreWrapper>> fn) {
			return this.putShards(key, fn.apply(new ShardStoreWrapper.Builder()).build());
		}

		/**
		 * Builds a {@link IndicesShardStores}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesShardStores build() {

			return new IndicesShardStores(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndicesShardStores
	 */
	public static final JsonpDeserializer<IndicesShardStores> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndicesShardStores::setupIndicesShardStoresDeserializer);

	protected static void setupIndicesShardStoresDeserializer(DelegatingDeserializer<IndicesShardStores.Builder> op) {

		op.add(Builder::shards, JsonpDeserializer.stringMapDeserializer(ShardStoreWrapper.DESERIALIZER), "shards");

	}

}
