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

package co.elastic.clients.elasticsearch.cluster.stats;

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

// typedef: cluster.stats.ClusterIndicesShardsIndex
public final class ClusterIndicesShardsIndex implements ToJsonp {
	private final ClusterShardMetrics primaries;

	private final ClusterShardMetrics replication;

	private final ClusterShardMetrics shards;

	// ---------------------------------------------------------------------------------------------

	protected ClusterIndicesShardsIndex(Builder builder) {

		this.primaries = Objects.requireNonNull(builder.primaries, "primaries");
		this.replication = Objects.requireNonNull(builder.replication, "replication");
		this.shards = Objects.requireNonNull(builder.shards, "shards");

	}

	/**
	 * Contains statistics about the number of primary shards assigned to selected
	 * nodes.
	 *
	 * API name: {@code primaries}
	 */
	public ClusterShardMetrics primaries() {
		return this.primaries;
	}

	/**
	 * Contains statistics about the number of replication shards assigned to
	 * selected nodes.
	 *
	 * API name: {@code replication}
	 */
	public ClusterShardMetrics replication() {
		return this.replication;
	}

	/**
	 * Contains statistics about the number of shards assigned to selected nodes.
	 *
	 * API name: {@code shards}
	 */
	public ClusterShardMetrics shards() {
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

		generator.writeKey("primaries");
		this.primaries.toJsonp(generator, mapper);

		generator.writeKey("replication");
		this.replication.toJsonp(generator, mapper);

		generator.writeKey("shards");
		this.shards.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterIndicesShardsIndex}.
	 */
	public static class Builder implements ObjectBuilder<ClusterIndicesShardsIndex> {
		private ClusterShardMetrics primaries;

		private ClusterShardMetrics replication;

		private ClusterShardMetrics shards;

		/**
		 * Contains statistics about the number of primary shards assigned to selected
		 * nodes.
		 *
		 * API name: {@code primaries}
		 */
		public Builder primaries(ClusterShardMetrics value) {
			this.primaries = value;
			return this;
		}

		/**
		 * Contains statistics about the number of primary shards assigned to selected
		 * nodes.
		 *
		 * API name: {@code primaries}
		 */
		public Builder primaries(Function<ClusterShardMetrics.Builder, ObjectBuilder<ClusterShardMetrics>> fn) {
			return this.primaries(fn.apply(new ClusterShardMetrics.Builder()).build());
		}

		/**
		 * Contains statistics about the number of replication shards assigned to
		 * selected nodes.
		 *
		 * API name: {@code replication}
		 */
		public Builder replication(ClusterShardMetrics value) {
			this.replication = value;
			return this;
		}

		/**
		 * Contains statistics about the number of replication shards assigned to
		 * selected nodes.
		 *
		 * API name: {@code replication}
		 */
		public Builder replication(Function<ClusterShardMetrics.Builder, ObjectBuilder<ClusterShardMetrics>> fn) {
			return this.replication(fn.apply(new ClusterShardMetrics.Builder()).build());
		}

		/**
		 * Contains statistics about the number of shards assigned to selected nodes.
		 *
		 * API name: {@code shards}
		 */
		public Builder shards(ClusterShardMetrics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Contains statistics about the number of shards assigned to selected nodes.
		 *
		 * API name: {@code shards}
		 */
		public Builder shards(Function<ClusterShardMetrics.Builder, ObjectBuilder<ClusterShardMetrics>> fn) {
			return this.shards(fn.apply(new ClusterShardMetrics.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterIndicesShardsIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterIndicesShardsIndex build() {

			return new ClusterIndicesShardsIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterIndicesShardsIndex
	 */
	public static final JsonpDeserializer<ClusterIndicesShardsIndex> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterIndicesShardsIndex::setupClusterIndicesShardsIndexDeserializer);

	protected static void setupClusterIndicesShardsIndexDeserializer(
			DelegatingDeserializer<ClusterIndicesShardsIndex.Builder> op) {

		op.add(Builder::primaries, ClusterShardMetrics.DESERIALIZER, "primaries");
		op.add(Builder::replication, ClusterShardMetrics.DESERIALIZER, "replication");
		op.add(Builder::shards, ClusterShardMetrics.DESERIALIZER, "shards");

	}

}
