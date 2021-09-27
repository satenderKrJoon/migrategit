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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.elasticsearch.ingest.geo_ip_stats.GeoIpDownloadStatistics;
import co.elastic.clients.elasticsearch.ingest.geo_ip_stats.GeoIpNodeDatabases;
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

// typedef: ingest.geo_ip_stats.Response
public final class GeoIpStatsResponse implements ToJsonp {
	private final GeoIpDownloadStatistics stats;

	private final Map<String, GeoIpNodeDatabases> nodes;

	// ---------------------------------------------------------------------------------------------

	protected GeoIpStatsResponse(Builder builder) {

		this.stats = Objects.requireNonNull(builder.stats, "stats");
		this.nodes = Objects.requireNonNull(builder.nodes, "nodes");

	}

	/**
	 * Download statistics for all GeoIP2 databases.
	 *
	 * API name: {@code stats}
	 */
	public GeoIpDownloadStatistics stats() {
		return this.stats;
	}

	/**
	 * Downloaded GeoIP2 databases for each node.
	 *
	 * API name: {@code nodes}
	 */
	public Map<String, GeoIpNodeDatabases> nodes() {
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

		generator.writeKey("stats");
		this.stats.toJsonp(generator, mapper);

		generator.writeKey("nodes");
		generator.writeStartObject();
		for (Map.Entry<String, GeoIpNodeDatabases> item0 : this.nodes.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoIpStatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GeoIpStatsResponse> {
		private GeoIpDownloadStatistics stats;

		private Map<String, GeoIpNodeDatabases> nodes;

		/**
		 * Download statistics for all GeoIP2 databases.
		 *
		 * API name: {@code stats}
		 */
		public Builder stats(GeoIpDownloadStatistics value) {
			this.stats = value;
			return this;
		}

		/**
		 * Download statistics for all GeoIP2 databases.
		 *
		 * API name: {@code stats}
		 */
		public Builder stats(Function<GeoIpDownloadStatistics.Builder, ObjectBuilder<GeoIpDownloadStatistics>> fn) {
			return this.stats(fn.apply(new GeoIpDownloadStatistics.Builder()).build());
		}

		/**
		 * Downloaded GeoIP2 databases for each node.
		 *
		 * API name: {@code nodes}
		 */
		public Builder nodes(Map<String, GeoIpNodeDatabases> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, GeoIpNodeDatabases value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<GeoIpNodeDatabases.Builder, ObjectBuilder<GeoIpNodeDatabases>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new GeoIpNodeDatabases.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key,
				Function<GeoIpNodeDatabases.Builder, ObjectBuilder<GeoIpNodeDatabases>> fn) {
			return this.putNodes(key, fn.apply(new GeoIpNodeDatabases.Builder()).build());
		}

		/**
		 * Builds a {@link GeoIpStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoIpStatsResponse build() {

			return new GeoIpStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GeoIpStatsResponse
	 */
	public static final JsonpDeserializer<GeoIpStatsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GeoIpStatsResponse::setupGeoIpStatsResponseDeserializer);

	protected static void setupGeoIpStatsResponseDeserializer(DelegatingDeserializer<GeoIpStatsResponse.Builder> op) {

		op.add(Builder::stats, GeoIpDownloadStatistics.DESERIALIZER, "stats");
		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(GeoIpNodeDatabases.DESERIALIZER), "nodes");

	}

}
