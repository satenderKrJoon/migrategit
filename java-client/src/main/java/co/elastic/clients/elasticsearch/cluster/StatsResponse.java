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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch.cluster.stats.ClusterIndices;
import co.elastic.clients.elasticsearch.cluster.stats.ClusterNodes;
import co.elastic.clients.elasticsearch.nodes.NodesResponseBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.Response
public final class StatsResponse extends NodesResponseBase {
	private final String clusterName;

	private final String clusterUuid;

	private final ClusterIndices indices;

	private final ClusterNodes nodes;

	private final JsonValue status;

	private final Number timestamp;

	// ---------------------------------------------------------------------------------------------

	protected StatsResponse(Builder builder) {
		super(builder);
		this.clusterName = Objects.requireNonNull(builder.clusterName, "cluster_name");
		this.clusterUuid = Objects.requireNonNull(builder.clusterUuid, "cluster_uuid");
		this.indices = Objects.requireNonNull(builder.indices, "indices");
		this.nodes = Objects.requireNonNull(builder.nodes, "nodes");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	/**
	 * Name of the cluster, based on the Cluster name setting setting.
	 *
	 * API name: {@code cluster_name}
	 */
	public String clusterName() {
		return this.clusterName;
	}

	/**
	 * Unique identifier for the cluster.
	 *
	 * API name: {@code cluster_uuid}
	 */
	public String clusterUuid() {
		return this.clusterUuid;
	}

	/**
	 * Contains statistics about indices with shards assigned to selected nodes.
	 *
	 * API name: {@code indices}
	 */
	public ClusterIndices indices() {
		return this.indices;
	}

	/**
	 * Contains statistics about nodes selected by the request’s node filters.
	 *
	 * API name: {@code nodes}
	 */
	public ClusterNodes nodes() {
		return this.nodes;
	}

	/**
	 * Health status of the cluster, based on the state of its primary and replica
	 * shards.
	 *
	 * API name: {@code status}
	 */
	public JsonValue status() {
		return this.status;
	}

	/**
	 * Unix timestamp, in milliseconds, of the last time the cluster statistics were
	 * refreshed.
	 *
	 * API name: {@code timestamp}
	 */
	public Number timestamp() {
		return this.timestamp;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("cluster_uuid");
		generator.write(this.clusterUuid);

		generator.writeKey("indices");
		this.indices.toJsonp(generator, mapper);

		generator.writeKey("nodes");
		this.nodes.toJsonp(generator, mapper);

		generator.writeKey("status");
		generator.write(this.status);

		generator.writeKey("timestamp");
		generator.write(this.timestamp.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatsResponse}.
	 */
	public static class Builder extends NodesResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StatsResponse> {
		private String clusterName;

		private String clusterUuid;

		private ClusterIndices indices;

		private ClusterNodes nodes;

		private JsonValue status;

		private Number timestamp;

		/**
		 * Name of the cluster, based on the Cluster name setting setting.
		 *
		 * API name: {@code cluster_name}
		 */
		public Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * Unique identifier for the cluster.
		 *
		 * API name: {@code cluster_uuid}
		 */
		public Builder clusterUuid(String value) {
			this.clusterUuid = value;
			return this;
		}

		/**
		 * Contains statistics about indices with shards assigned to selected nodes.
		 *
		 * API name: {@code indices}
		 */
		public Builder indices(ClusterIndices value) {
			this.indices = value;
			return this;
		}

		/**
		 * Contains statistics about indices with shards assigned to selected nodes.
		 *
		 * API name: {@code indices}
		 */
		public Builder indices(Function<ClusterIndices.Builder, ObjectBuilder<ClusterIndices>> fn) {
			return this.indices(fn.apply(new ClusterIndices.Builder()).build());
		}

		/**
		 * Contains statistics about nodes selected by the request’s node filters.
		 *
		 * API name: {@code nodes}
		 */
		public Builder nodes(ClusterNodes value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Contains statistics about nodes selected by the request’s node filters.
		 *
		 * API name: {@code nodes}
		 */
		public Builder nodes(Function<ClusterNodes.Builder, ObjectBuilder<ClusterNodes>> fn) {
			return this.nodes(fn.apply(new ClusterNodes.Builder()).build());
		}

		/**
		 * Health status of the cluster, based on the state of its primary and replica
		 * shards.
		 *
		 * API name: {@code status}
		 */
		public Builder status(JsonValue value) {
			this.status = value;
			return this;
		}

		/**
		 * Unix timestamp, in milliseconds, of the last time the cluster statistics were
		 * refreshed.
		 *
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(Number value) {
			this.timestamp = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatsResponse build() {

			return new StatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for StatsResponse
	 */
	public static final JsonpDeserializer<StatsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StatsResponse::setupStatsResponseDeserializer);

	protected static void setupStatsResponseDeserializer(DelegatingDeserializer<StatsResponse.Builder> op) {
		NodesResponseBase.setupNodesResponseBaseDeserializer(op);
		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::clusterUuid, JsonpDeserializer.stringDeserializer(), "cluster_uuid");
		op.add(Builder::indices, ClusterIndices.DESERIALIZER, "indices");
		op.add(Builder::nodes, ClusterNodes.DESERIALIZER, "nodes");
		op.add(Builder::status, JsonpDeserializer.jsonValueDeserializer(), "status");
		op.add(Builder::timestamp, JsonpDeserializer.numberDeserializer(), "timestamp");

	}

}
