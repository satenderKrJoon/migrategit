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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch.indices.segments.IndexSegment;
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

// typedef: indices.segments.Response
public final class SegmentsResponse implements ToJsonp {
	private final Map<String, IndexSegment> indices;

	private final ShardStatistics shards;

	// ---------------------------------------------------------------------------------------------

	protected SegmentsResponse(Builder builder) {

		this.indices = Objects.requireNonNull(builder.indices, "indices");
		this.shards = Objects.requireNonNull(builder.shards, "_shards");

	}

	/**
	 * API name: {@code indices}
	 */
	public Map<String, IndexSegment> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics shards() {
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

		generator.writeKey("indices");
		generator.writeStartObject();
		for (Map.Entry<String, IndexSegment> item0 : this.indices.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("_shards");
		this.shards.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SegmentsResponse}.
	 */
	public static class Builder implements ObjectBuilder<SegmentsResponse> {
		private Map<String, IndexSegment> indices;

		private ShardStatistics shards;

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(Map<String, IndexSegment> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, IndexSegment value) {
			if (this.indices == null) {
				this.indices = new HashMap<>();
			}
			this.indices.put(key, value);
			return this;
		}

		/**
		 * Set {@link #indices(Map)} to a singleton map.
		 */
		public Builder indices(String key, Function<IndexSegment.Builder, ObjectBuilder<IndexSegment>> fn) {
			return this.indices(Collections.singletonMap(key, fn.apply(new IndexSegment.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, Function<IndexSegment.Builder, ObjectBuilder<IndexSegment>> fn) {
			return this.putIndices(key, fn.apply(new IndexSegment.Builder()).build());
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Builds a {@link SegmentsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SegmentsResponse build() {

			return new SegmentsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SegmentsResponse
	 */
	public static final JsonpDeserializer<SegmentsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SegmentsResponse::setupSegmentsResponseDeserializer);

	protected static void setupSegmentsResponseDeserializer(DelegatingDeserializer<SegmentsResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(IndexSegment.DESERIALIZER), "indices");
		op.add(Builder::shards, ShardStatistics.DESERIALIZER, "_shards");

	}

}
