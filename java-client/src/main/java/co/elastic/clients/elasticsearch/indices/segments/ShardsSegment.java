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

package co.elastic.clients.elasticsearch.indices.segments;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.segments.ShardsSegment
public final class ShardsSegment implements ToJsonp {
	private final Number numCommittedSegments;

	private final ShardSegmentRouting routing;

	private final Number numSearchSegments;

	private final Map<String, Segment> segments;

	// ---------------------------------------------------------------------------------------------

	protected ShardsSegment(Builder builder) {

		this.numCommittedSegments = Objects.requireNonNull(builder.numCommittedSegments, "num_committed_segments");
		this.routing = Objects.requireNonNull(builder.routing, "routing");
		this.numSearchSegments = Objects.requireNonNull(builder.numSearchSegments, "num_search_segments");
		this.segments = Objects.requireNonNull(builder.segments, "segments");

	}

	/**
	 * API name: {@code num_committed_segments}
	 */
	public Number numCommittedSegments() {
		return this.numCommittedSegments;
	}

	/**
	 * API name: {@code routing}
	 */
	public ShardSegmentRouting routing() {
		return this.routing;
	}

	/**
	 * API name: {@code num_search_segments}
	 */
	public Number numSearchSegments() {
		return this.numSearchSegments;
	}

	/**
	 * API name: {@code segments}
	 */
	public Map<String, Segment> segments() {
		return this.segments;
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

		generator.writeKey("num_committed_segments");
		generator.write(this.numCommittedSegments.doubleValue());

		generator.writeKey("routing");
		this.routing.toJsonp(generator, mapper);

		generator.writeKey("num_search_segments");
		generator.write(this.numSearchSegments.doubleValue());

		generator.writeKey("segments");
		generator.writeStartObject();
		for (Map.Entry<String, Segment> item0 : this.segments.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsSegment}.
	 */
	public static class Builder implements ObjectBuilder<ShardsSegment> {
		private Number numCommittedSegments;

		private ShardSegmentRouting routing;

		private Number numSearchSegments;

		private Map<String, Segment> segments;

		/**
		 * API name: {@code num_committed_segments}
		 */
		public Builder numCommittedSegments(Number value) {
			this.numCommittedSegments = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(ShardSegmentRouting value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(Function<ShardSegmentRouting.Builder, ObjectBuilder<ShardSegmentRouting>> fn) {
			return this.routing(fn.apply(new ShardSegmentRouting.Builder()).build());
		}

		/**
		 * API name: {@code num_search_segments}
		 */
		public Builder numSearchSegments(Number value) {
			this.numSearchSegments = value;
			return this;
		}

		/**
		 * API name: {@code segments}
		 */
		public Builder segments(Map<String, Segment> value) {
			this.segments = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #segments(Map)}, creating the map if needed.
		 */
		public Builder putSegments(String key, Segment value) {
			if (this.segments == null) {
				this.segments = new HashMap<>();
			}
			this.segments.put(key, value);
			return this;
		}

		/**
		 * Set {@link #segments(Map)} to a singleton map.
		 */
		public Builder segments(String key, Function<Segment.Builder, ObjectBuilder<Segment>> fn) {
			return this.segments(Collections.singletonMap(key, fn.apply(new Segment.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #segments(Map)}, creating the map if needed.
		 */
		public Builder putSegments(String key, Function<Segment.Builder, ObjectBuilder<Segment>> fn) {
			return this.putSegments(key, fn.apply(new Segment.Builder()).build());
		}

		/**
		 * Builds a {@link ShardsSegment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsSegment build() {

			return new ShardsSegment(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardsSegment
	 */
	public static final JsonpDeserializer<ShardsSegment> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardsSegment::setupShardsSegmentDeserializer);

	protected static void setupShardsSegmentDeserializer(DelegatingDeserializer<ShardsSegment.Builder> op) {

		op.add(Builder::numCommittedSegments, JsonpDeserializer.numberDeserializer(), "num_committed_segments");
		op.add(Builder::routing, ShardSegmentRouting.DESERIALIZER, "routing");
		op.add(Builder::numSearchSegments, JsonpDeserializer.numberDeserializer(), "num_search_segments");
		op.add(Builder::segments, JsonpDeserializer.stringMapDeserializer(Segment.DESERIALIZER), "segments");

	}

}
