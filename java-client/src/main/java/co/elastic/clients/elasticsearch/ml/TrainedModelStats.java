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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelStats
public final class TrainedModelStats implements ToJsonp {
	private final String modelId;

	private final Number pipelineCount;

	@Nullable
	private final TrainedModelInferenceStats inferenceStats;

	@Nullable
	private final Map<String, JsonValue> ingest;

	// ---------------------------------------------------------------------------------------------

	protected TrainedModelStats(Builder builder) {

		this.modelId = Objects.requireNonNull(builder.modelId, "model_id");
		this.pipelineCount = Objects.requireNonNull(builder.pipelineCount, "pipeline_count");
		this.inferenceStats = builder.inferenceStats;
		this.ingest = builder.ingest;

	}

	/**
	 * The unique identifier of the trained model.
	 *
	 * API name: {@code model_id}
	 */
	public String modelId() {
		return this.modelId;
	}

	/**
	 * The number of ingest pipelines that currently refer to the model.
	 *
	 * API name: {@code pipeline_count}
	 */
	public Number pipelineCount() {
		return this.pipelineCount;
	}

	/**
	 * A collection of inference stats fields.
	 *
	 * API name: {@code inference_stats}
	 */
	@Nullable
	public TrainedModelInferenceStats inferenceStats() {
		return this.inferenceStats;
	}

	/**
	 * A collection of ingest stats for the model across all nodes. The values are
	 * summations of the individual node statistics. The format matches the ingest
	 * section in Nodes stats.
	 *
	 * API name: {@code ingest}
	 */
	@Nullable
	public Map<String, JsonValue> ingest() {
		return this.ingest;
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

		generator.writeKey("model_id");
		generator.write(this.modelId);

		generator.writeKey("pipeline_count");
		generator.write(this.pipelineCount.doubleValue());

		if (this.inferenceStats != null) {

			generator.writeKey("inference_stats");
			this.inferenceStats.toJsonp(generator, mapper);

		}
		if (this.ingest != null) {

			generator.writeKey("ingest");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.ingest.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelStats}.
	 */
	public static class Builder implements ObjectBuilder<TrainedModelStats> {
		private String modelId;

		private Number pipelineCount;

		@Nullable
		private TrainedModelInferenceStats inferenceStats;

		@Nullable
		private Map<String, JsonValue> ingest;

		/**
		 * The unique identifier of the trained model.
		 *
		 * API name: {@code model_id}
		 */
		public Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * The number of ingest pipelines that currently refer to the model.
		 *
		 * API name: {@code pipeline_count}
		 */
		public Builder pipelineCount(Number value) {
			this.pipelineCount = value;
			return this;
		}

		/**
		 * A collection of inference stats fields.
		 *
		 * API name: {@code inference_stats}
		 */
		public Builder inferenceStats(@Nullable TrainedModelInferenceStats value) {
			this.inferenceStats = value;
			return this;
		}

		/**
		 * A collection of inference stats fields.
		 *
		 * API name: {@code inference_stats}
		 */
		public Builder inferenceStats(
				Function<TrainedModelInferenceStats.Builder, ObjectBuilder<TrainedModelInferenceStats>> fn) {
			return this.inferenceStats(fn.apply(new TrainedModelInferenceStats.Builder()).build());
		}

		/**
		 * A collection of ingest stats for the model across all nodes. The values are
		 * summations of the individual node statistics. The format matches the ingest
		 * section in Nodes stats.
		 *
		 * API name: {@code ingest}
		 */
		public Builder ingest(@Nullable Map<String, JsonValue> value) {
			this.ingest = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #ingest(Map)}, creating the map if needed.
		 */
		public Builder putIngest(String key, JsonValue value) {
			if (this.ingest == null) {
				this.ingest = new HashMap<>();
			}
			this.ingest.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link TrainedModelStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelStats build() {

			return new TrainedModelStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TrainedModelStats
	 */
	public static final JsonpDeserializer<TrainedModelStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TrainedModelStats::setupTrainedModelStatsDeserializer);

	protected static void setupTrainedModelStatsDeserializer(DelegatingDeserializer<TrainedModelStats.Builder> op) {

		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::pipelineCount, JsonpDeserializer.numberDeserializer(), "pipeline_count");
		op.add(Builder::inferenceStats, TrainedModelInferenceStats.DESERIALIZER, "inference_stats");
		op.add(Builder::ingest, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"ingest");

	}

}
