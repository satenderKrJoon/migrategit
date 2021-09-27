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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.IndexingStats
public final class IndexingStats implements ToJsonp {
	private final Number indexCurrent;

	private final Number deleteCurrent;

	@Nullable
	private final String deleteTime;

	private final Number deleteTimeInMillis;

	private final Number deleteTotal;

	private final Boolean isThrottled;

	private final Number noopUpdateTotal;

	@Nullable
	private final String throttleTime;

	private final Number throttleTimeInMillis;

	@Nullable
	private final String indexTime;

	private final Number indexTimeInMillis;

	private final Number indexTotal;

	private final Number indexFailed;

	@Nullable
	private final Map<String, co.elastic.clients.elasticsearch._types.IndexingStats> types;

	// ---------------------------------------------------------------------------------------------

	protected IndexingStats(Builder builder) {

		this.indexCurrent = Objects.requireNonNull(builder.indexCurrent, "index_current");
		this.deleteCurrent = Objects.requireNonNull(builder.deleteCurrent, "delete_current");
		this.deleteTime = builder.deleteTime;
		this.deleteTimeInMillis = Objects.requireNonNull(builder.deleteTimeInMillis, "delete_time_in_millis");
		this.deleteTotal = Objects.requireNonNull(builder.deleteTotal, "delete_total");
		this.isThrottled = Objects.requireNonNull(builder.isThrottled, "is_throttled");
		this.noopUpdateTotal = Objects.requireNonNull(builder.noopUpdateTotal, "noop_update_total");
		this.throttleTime = builder.throttleTime;
		this.throttleTimeInMillis = Objects.requireNonNull(builder.throttleTimeInMillis, "throttle_time_in_millis");
		this.indexTime = builder.indexTime;
		this.indexTimeInMillis = Objects.requireNonNull(builder.indexTimeInMillis, "index_time_in_millis");
		this.indexTotal = Objects.requireNonNull(builder.indexTotal, "index_total");
		this.indexFailed = Objects.requireNonNull(builder.indexFailed, "index_failed");
		this.types = builder.types;

	}

	/**
	 * API name: {@code index_current}
	 */
	public Number indexCurrent() {
		return this.indexCurrent;
	}

	/**
	 * API name: {@code delete_current}
	 */
	public Number deleteCurrent() {
		return this.deleteCurrent;
	}

	/**
	 * API name: {@code delete_time}
	 */
	@Nullable
	public String deleteTime() {
		return this.deleteTime;
	}

	/**
	 * API name: {@code delete_time_in_millis}
	 */
	public Number deleteTimeInMillis() {
		return this.deleteTimeInMillis;
	}

	/**
	 * API name: {@code delete_total}
	 */
	public Number deleteTotal() {
		return this.deleteTotal;
	}

	/**
	 * API name: {@code is_throttled}
	 */
	public Boolean isThrottled() {
		return this.isThrottled;
	}

	/**
	 * API name: {@code noop_update_total}
	 */
	public Number noopUpdateTotal() {
		return this.noopUpdateTotal;
	}

	/**
	 * API name: {@code throttle_time}
	 */
	@Nullable
	public String throttleTime() {
		return this.throttleTime;
	}

	/**
	 * API name: {@code throttle_time_in_millis}
	 */
	public Number throttleTimeInMillis() {
		return this.throttleTimeInMillis;
	}

	/**
	 * API name: {@code index_time}
	 */
	@Nullable
	public String indexTime() {
		return this.indexTime;
	}

	/**
	 * API name: {@code index_time_in_millis}
	 */
	public Number indexTimeInMillis() {
		return this.indexTimeInMillis;
	}

	/**
	 * API name: {@code index_total}
	 */
	public Number indexTotal() {
		return this.indexTotal;
	}

	/**
	 * API name: {@code index_failed}
	 */
	public Number indexFailed() {
		return this.indexFailed;
	}

	/**
	 * API name: {@code types}
	 */
	@Nullable
	public Map<String, co.elastic.clients.elasticsearch._types.IndexingStats> types() {
		return this.types;
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

		generator.writeKey("index_current");
		generator.write(this.indexCurrent.doubleValue());

		generator.writeKey("delete_current");
		generator.write(this.deleteCurrent.doubleValue());

		if (this.deleteTime != null) {

			generator.writeKey("delete_time");
			generator.write(this.deleteTime);

		}

		generator.writeKey("delete_time_in_millis");
		generator.write(this.deleteTimeInMillis.doubleValue());

		generator.writeKey("delete_total");
		generator.write(this.deleteTotal.doubleValue());

		generator.writeKey("is_throttled");
		generator.write(this.isThrottled);

		generator.writeKey("noop_update_total");
		generator.write(this.noopUpdateTotal.doubleValue());

		if (this.throttleTime != null) {

			generator.writeKey("throttle_time");
			generator.write(this.throttleTime);

		}

		generator.writeKey("throttle_time_in_millis");
		generator.write(this.throttleTimeInMillis.doubleValue());

		if (this.indexTime != null) {

			generator.writeKey("index_time");
			generator.write(this.indexTime);

		}

		generator.writeKey("index_time_in_millis");
		generator.write(this.indexTimeInMillis.doubleValue());

		generator.writeKey("index_total");
		generator.write(this.indexTotal.doubleValue());

		generator.writeKey("index_failed");
		generator.write(this.indexFailed.doubleValue());

		if (this.types != null) {

			generator.writeKey("types");
			generator.writeStartObject();
			for (Map.Entry<String, co.elastic.clients.elasticsearch._types.IndexingStats> item0 : this.types
					.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexingStats}.
	 */
	public static class Builder implements ObjectBuilder<IndexingStats> {
		private Number indexCurrent;

		private Number deleteCurrent;

		@Nullable
		private String deleteTime;

		private Number deleteTimeInMillis;

		private Number deleteTotal;

		private Boolean isThrottled;

		private Number noopUpdateTotal;

		@Nullable
		private String throttleTime;

		private Number throttleTimeInMillis;

		@Nullable
		private String indexTime;

		private Number indexTimeInMillis;

		private Number indexTotal;

		private Number indexFailed;

		@Nullable
		private Map<String, co.elastic.clients.elasticsearch._types.IndexingStats> types;

		/**
		 * API name: {@code index_current}
		 */
		public Builder indexCurrent(Number value) {
			this.indexCurrent = value;
			return this;
		}

		/**
		 * API name: {@code delete_current}
		 */
		public Builder deleteCurrent(Number value) {
			this.deleteCurrent = value;
			return this;
		}

		/**
		 * API name: {@code delete_time}
		 */
		public Builder deleteTime(@Nullable String value) {
			this.deleteTime = value;
			return this;
		}

		/**
		 * API name: {@code delete_time_in_millis}
		 */
		public Builder deleteTimeInMillis(Number value) {
			this.deleteTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code delete_total}
		 */
		public Builder deleteTotal(Number value) {
			this.deleteTotal = value;
			return this;
		}

		/**
		 * API name: {@code is_throttled}
		 */
		public Builder isThrottled(Boolean value) {
			this.isThrottled = value;
			return this;
		}

		/**
		 * API name: {@code noop_update_total}
		 */
		public Builder noopUpdateTotal(Number value) {
			this.noopUpdateTotal = value;
			return this;
		}

		/**
		 * API name: {@code throttle_time}
		 */
		public Builder throttleTime(@Nullable String value) {
			this.throttleTime = value;
			return this;
		}

		/**
		 * API name: {@code throttle_time_in_millis}
		 */
		public Builder throttleTimeInMillis(Number value) {
			this.throttleTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code index_time}
		 */
		public Builder indexTime(@Nullable String value) {
			this.indexTime = value;
			return this;
		}

		/**
		 * API name: {@code index_time_in_millis}
		 */
		public Builder indexTimeInMillis(Number value) {
			this.indexTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code index_total}
		 */
		public Builder indexTotal(Number value) {
			this.indexTotal = value;
			return this;
		}

		/**
		 * API name: {@code index_failed}
		 */
		public Builder indexFailed(Number value) {
			this.indexFailed = value;
			return this;
		}

		/**
		 * API name: {@code types}
		 */
		public Builder types(@Nullable Map<String, co.elastic.clients.elasticsearch._types.IndexingStats> value) {
			this.types = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #types(Map)}, creating the map if needed.
		 */
		public Builder putTypes(String key, co.elastic.clients.elasticsearch._types.IndexingStats value) {
			if (this.types == null) {
				this.types = new HashMap<>();
			}
			this.types.put(key, value);
			return this;
		}

		/**
		 * Set {@link #types(Map)} to a singleton map.
		 */
		public Builder types(String key,
				Function<co.elastic.clients.elasticsearch._types.IndexingStats.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.IndexingStats>> fn) {
			return this.types(Collections.singletonMap(key,
					fn.apply(new co.elastic.clients.elasticsearch._types.IndexingStats.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #types(Map)}, creating the map if needed.
		 */
		public Builder putTypes(String key,
				Function<co.elastic.clients.elasticsearch._types.IndexingStats.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.IndexingStats>> fn) {
			return this.putTypes(key,
					fn.apply(new co.elastic.clients.elasticsearch._types.IndexingStats.Builder()).build());
		}

		/**
		 * Builds a {@link IndexingStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexingStats build() {

			return new IndexingStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndexingStats
	 */
	public static final JsonpDeserializer<IndexingStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexingStats::setupIndexingStatsDeserializer);

	protected static void setupIndexingStatsDeserializer(DelegatingDeserializer<IndexingStats.Builder> op) {

		op.add(Builder::indexCurrent, JsonpDeserializer.numberDeserializer(), "index_current");
		op.add(Builder::deleteCurrent, JsonpDeserializer.numberDeserializer(), "delete_current");
		op.add(Builder::deleteTime, JsonpDeserializer.stringDeserializer(), "delete_time");
		op.add(Builder::deleteTimeInMillis, JsonpDeserializer.numberDeserializer(), "delete_time_in_millis");
		op.add(Builder::deleteTotal, JsonpDeserializer.numberDeserializer(), "delete_total");
		op.add(Builder::isThrottled, JsonpDeserializer.booleanDeserializer(), "is_throttled");
		op.add(Builder::noopUpdateTotal, JsonpDeserializer.numberDeserializer(), "noop_update_total");
		op.add(Builder::throttleTime, JsonpDeserializer.stringDeserializer(), "throttle_time");
		op.add(Builder::throttleTimeInMillis, JsonpDeserializer.numberDeserializer(), "throttle_time_in_millis");
		op.add(Builder::indexTime, JsonpDeserializer.stringDeserializer(), "index_time");
		op.add(Builder::indexTimeInMillis, JsonpDeserializer.numberDeserializer(), "index_time_in_millis");
		op.add(Builder::indexTotal, JsonpDeserializer.numberDeserializer(), "index_total");
		op.add(Builder::indexFailed, JsonpDeserializer.numberDeserializer(), "index_failed");
		op.add(Builder::types, JsonpDeserializer
				.stringMapDeserializer(co.elastic.clients.elasticsearch._types.IndexingStats.DESERIALIZER), "types");

	}

}
