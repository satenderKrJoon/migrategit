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

package co.elastic.clients.elasticsearch.ml;

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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.flush_job.Response
public final class FlushJobResponse implements ToJsonp {
	private final Boolean flushed;

	@Nullable
	private final Number lastFinalizedBucketEnd;

	// ---------------------------------------------------------------------------------------------

	protected FlushJobResponse(Builder builder) {

		this.flushed = Objects.requireNonNull(builder.flushed, "flushed");
		this.lastFinalizedBucketEnd = builder.lastFinalizedBucketEnd;

	}

	/**
	 * API name: {@code flushed}
	 */
	public Boolean flushed() {
		return this.flushed;
	}

	/**
	 * API name: {@code last_finalized_bucket_end}
	 */
	@Nullable
	public Number lastFinalizedBucketEnd() {
		return this.lastFinalizedBucketEnd;
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

		generator.writeKey("flushed");
		generator.write(this.flushed);

		if (this.lastFinalizedBucketEnd != null) {

			generator.writeKey("last_finalized_bucket_end");
			generator.write(this.lastFinalizedBucketEnd.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FlushJobResponse}.
	 */
	public static class Builder implements ObjectBuilder<FlushJobResponse> {
		private Boolean flushed;

		@Nullable
		private Number lastFinalizedBucketEnd;

		/**
		 * API name: {@code flushed}
		 */
		public Builder flushed(Boolean value) {
			this.flushed = value;
			return this;
		}

		/**
		 * API name: {@code last_finalized_bucket_end}
		 */
		public Builder lastFinalizedBucketEnd(@Nullable Number value) {
			this.lastFinalizedBucketEnd = value;
			return this;
		}

		/**
		 * Builds a {@link FlushJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FlushJobResponse build() {

			return new FlushJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FlushJobResponse
	 */
	public static final JsonpDeserializer<FlushJobResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FlushJobResponse::setupFlushJobResponseDeserializer);

	protected static void setupFlushJobResponseDeserializer(DelegatingDeserializer<FlushJobResponse.Builder> op) {

		op.add(Builder::flushed, JsonpDeserializer.booleanDeserializer(), "flushed");
		op.add(Builder::lastFinalizedBucketEnd, JsonpDeserializer.numberDeserializer(), "last_finalized_bucket_end");

	}

}
