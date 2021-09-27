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

package co.elastic.clients.elasticsearch.indices.data_streams_stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.data_streams_stats.DataStreamsStatsItem
public final class DataStreamsStatsItem implements ToJsonp {
	private final Number backingIndices;

	private final String dataStream;

	@Nullable
	private final JsonValue storeSize;

	private final Number storeSizeBytes;

	private final Number maximumTimestamp;

	// ---------------------------------------------------------------------------------------------

	protected DataStreamsStatsItem(Builder builder) {

		this.backingIndices = Objects.requireNonNull(builder.backingIndices, "backing_indices");
		this.dataStream = Objects.requireNonNull(builder.dataStream, "data_stream");
		this.storeSize = builder.storeSize;
		this.storeSizeBytes = Objects.requireNonNull(builder.storeSizeBytes, "store_size_bytes");
		this.maximumTimestamp = Objects.requireNonNull(builder.maximumTimestamp, "maximum_timestamp");

	}

	/**
	 * API name: {@code backing_indices}
	 */
	public Number backingIndices() {
		return this.backingIndices;
	}

	/**
	 * API name: {@code data_stream}
	 */
	public String dataStream() {
		return this.dataStream;
	}

	/**
	 * API name: {@code store_size}
	 */
	@Nullable
	public JsonValue storeSize() {
		return this.storeSize;
	}

	/**
	 * API name: {@code store_size_bytes}
	 */
	public Number storeSizeBytes() {
		return this.storeSizeBytes;
	}

	/**
	 * API name: {@code maximum_timestamp}
	 */
	public Number maximumTimestamp() {
		return this.maximumTimestamp;
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

		generator.writeKey("backing_indices");
		generator.write(this.backingIndices.doubleValue());

		generator.writeKey("data_stream");
		generator.write(this.dataStream);

		if (this.storeSize != null) {

			generator.writeKey("store_size");
			generator.write(this.storeSize);

		}

		generator.writeKey("store_size_bytes");
		generator.write(this.storeSizeBytes.doubleValue());

		generator.writeKey("maximum_timestamp");
		generator.write(this.maximumTimestamp.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamsStatsItem}.
	 */
	public static class Builder implements ObjectBuilder<DataStreamsStatsItem> {
		private Number backingIndices;

		private String dataStream;

		@Nullable
		private JsonValue storeSize;

		private Number storeSizeBytes;

		private Number maximumTimestamp;

		/**
		 * API name: {@code backing_indices}
		 */
		public Builder backingIndices(Number value) {
			this.backingIndices = value;
			return this;
		}

		/**
		 * API name: {@code data_stream}
		 */
		public Builder dataStream(String value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * API name: {@code store_size}
		 */
		public Builder storeSize(@Nullable JsonValue value) {
			this.storeSize = value;
			return this;
		}

		/**
		 * API name: {@code store_size_bytes}
		 */
		public Builder storeSizeBytes(Number value) {
			this.storeSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code maximum_timestamp}
		 */
		public Builder maximumTimestamp(Number value) {
			this.maximumTimestamp = value;
			return this;
		}

		/**
		 * Builds a {@link DataStreamsStatsItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamsStatsItem build() {

			return new DataStreamsStatsItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataStreamsStatsItem
	 */
	public static final JsonpDeserializer<DataStreamsStatsItem> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DataStreamsStatsItem::setupDataStreamsStatsItemDeserializer);

	protected static void setupDataStreamsStatsItemDeserializer(
			DelegatingDeserializer<DataStreamsStatsItem.Builder> op) {

		op.add(Builder::backingIndices, JsonpDeserializer.numberDeserializer(), "backing_indices");
		op.add(Builder::dataStream, JsonpDeserializer.stringDeserializer(), "data_stream");
		op.add(Builder::storeSize, JsonpDeserializer.jsonValueDeserializer(), "store_size");
		op.add(Builder::storeSizeBytes, JsonpDeserializer.numberDeserializer(), "store_size_bytes");
		op.add(Builder::maximumTimestamp, JsonpDeserializer.numberDeserializer(), "maximum_timestamp");

	}

}
