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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelInferenceStats
public final class TrainedModelInferenceStats implements ToJsonp {
	private final Number failureCount;

	private final Number inferenceCount;

	private final Number cacheMissCount;

	private final Number missingAllFieldsCount;

	private final JsonValue timestamp;

	// ---------------------------------------------------------------------------------------------

	protected TrainedModelInferenceStats(Builder builder) {

		this.failureCount = Objects.requireNonNull(builder.failureCount, "failure_count");
		this.inferenceCount = Objects.requireNonNull(builder.inferenceCount, "inference_count");
		this.cacheMissCount = Objects.requireNonNull(builder.cacheMissCount, "cache_miss_count");
		this.missingAllFieldsCount = Objects.requireNonNull(builder.missingAllFieldsCount, "missing_all_fields_count");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	/**
	 * The number of failures when using the model for inference.
	 *
	 * API name: {@code failure_count}
	 */
	public Number failureCount() {
		return this.failureCount;
	}

	/**
	 * The total number of times the model has been called for inference. This is
	 * across all inference contexts, including all pipelines.
	 *
	 * API name: {@code inference_count}
	 */
	public Number inferenceCount() {
		return this.inferenceCount;
	}

	/**
	 * The number of times the model was loaded for inference and was not retrieved
	 * from the cache. If this number is close to the inference_count, then the
	 * cache is not being appropriately used. This can be solved by increasing the
	 * cache size or its time-to-live (TTL). See General machine learning settings
	 * for the appropriate settings.
	 *
	 * API name: {@code cache_miss_count}
	 */
	public Number cacheMissCount() {
		return this.cacheMissCount;
	}

	/**
	 * The number of inference calls where all the training features for the model
	 * were missing.
	 *
	 * API name: {@code missing_all_fields_count}
	 */
	public Number missingAllFieldsCount() {
		return this.missingAllFieldsCount;
	}

	/**
	 * The time when the statistics were last updated.
	 *
	 * API name: {@code timestamp}
	 */
	public JsonValue timestamp() {
		return this.timestamp;
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

		generator.writeKey("failure_count");
		generator.write(this.failureCount.doubleValue());

		generator.writeKey("inference_count");
		generator.write(this.inferenceCount.doubleValue());

		generator.writeKey("cache_miss_count");
		generator.write(this.cacheMissCount.doubleValue());

		generator.writeKey("missing_all_fields_count");
		generator.write(this.missingAllFieldsCount.doubleValue());

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelInferenceStats}.
	 */
	public static class Builder implements ObjectBuilder<TrainedModelInferenceStats> {
		private Number failureCount;

		private Number inferenceCount;

		private Number cacheMissCount;

		private Number missingAllFieldsCount;

		private JsonValue timestamp;

		/**
		 * The number of failures when using the model for inference.
		 *
		 * API name: {@code failure_count}
		 */
		public Builder failureCount(Number value) {
			this.failureCount = value;
			return this;
		}

		/**
		 * The total number of times the model has been called for inference. This is
		 * across all inference contexts, including all pipelines.
		 *
		 * API name: {@code inference_count}
		 */
		public Builder inferenceCount(Number value) {
			this.inferenceCount = value;
			return this;
		}

		/**
		 * The number of times the model was loaded for inference and was not retrieved
		 * from the cache. If this number is close to the inference_count, then the
		 * cache is not being appropriately used. This can be solved by increasing the
		 * cache size or its time-to-live (TTL). See General machine learning settings
		 * for the appropriate settings.
		 *
		 * API name: {@code cache_miss_count}
		 */
		public Builder cacheMissCount(Number value) {
			this.cacheMissCount = value;
			return this;
		}

		/**
		 * The number of inference calls where all the training features for the model
		 * were missing.
		 *
		 * API name: {@code missing_all_fields_count}
		 */
		public Builder missingAllFieldsCount(Number value) {
			this.missingAllFieldsCount = value;
			return this;
		}

		/**
		 * The time when the statistics were last updated.
		 *
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(JsonValue value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link TrainedModelInferenceStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelInferenceStats build() {

			return new TrainedModelInferenceStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TrainedModelInferenceStats
	 */
	public static final JsonpDeserializer<TrainedModelInferenceStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TrainedModelInferenceStats::setupTrainedModelInferenceStatsDeserializer);

	protected static void setupTrainedModelInferenceStatsDeserializer(
			DelegatingDeserializer<TrainedModelInferenceStats.Builder> op) {

		op.add(Builder::failureCount, JsonpDeserializer.numberDeserializer(), "failure_count");
		op.add(Builder::inferenceCount, JsonpDeserializer.numberDeserializer(), "inference_count");
		op.add(Builder::cacheMissCount, JsonpDeserializer.numberDeserializer(), "cache_miss_count");
		op.add(Builder::missingAllFieldsCount, JsonpDeserializer.numberDeserializer(), "missing_all_fields_count");
		op.add(Builder::timestamp, JsonpDeserializer.jsonValueDeserializer(), "timestamp");

	}

}
