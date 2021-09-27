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
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationMetrics
public abstract class DataframeEvaluationMetrics implements ToJsonp {
	@Nullable
	private final DataframeEvaluationClassificationMetricsAucRoc aucRoc;

	@Nullable
	private final Map<String, JsonValue> precision;

	@Nullable
	private final Map<String, JsonValue> recall;

	// ---------------------------------------------------------------------------------------------

	protected DataframeEvaluationMetrics(AbstractBuilder<?> builder) {

		this.aucRoc = builder.aucRoc;
		this.precision = builder.precision;
		this.recall = builder.recall;

	}

	/**
	 * The AUC ROC (area under the curve of the receiver operating characteristic)
	 * score and optionally the curve. It is calculated for a specific class
	 * (provided as "class_name") treated as positive.
	 *
	 * API name: {@code auc_roc}
	 */
	@Nullable
	public DataframeEvaluationClassificationMetricsAucRoc aucRoc() {
		return this.aucRoc;
	}

	/**
	 * Precision of predictions (per-class and average).
	 *
	 * API name: {@code precision}
	 */
	@Nullable
	public Map<String, JsonValue> precision() {
		return this.precision;
	}

	/**
	 * Recall of predictions (per-class and average).
	 *
	 * API name: {@code recall}
	 */
	@Nullable
	public Map<String, JsonValue> recall() {
		return this.recall;
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

		if (this.aucRoc != null) {

			generator.writeKey("auc_roc");
			this.aucRoc.toJsonp(generator, mapper);

		}
		if (this.precision != null) {

			generator.writeKey("precision");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.precision.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.recall != null) {

			generator.writeKey("recall");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.recall.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private DataframeEvaluationClassificationMetricsAucRoc aucRoc;

		@Nullable
		private Map<String, JsonValue> precision;

		@Nullable
		private Map<String, JsonValue> recall;

		/**
		 * The AUC ROC (area under the curve of the receiver operating characteristic)
		 * score and optionally the curve. It is calculated for a specific class
		 * (provided as "class_name") treated as positive.
		 *
		 * API name: {@code auc_roc}
		 */
		public BuilderT aucRoc(@Nullable DataframeEvaluationClassificationMetricsAucRoc value) {
			this.aucRoc = value;
			return self();
		}

		/**
		 * The AUC ROC (area under the curve of the receiver operating characteristic)
		 * score and optionally the curve. It is calculated for a specific class
		 * (provided as "class_name") treated as positive.
		 *
		 * API name: {@code auc_roc}
		 */
		public BuilderT aucRoc(
				Function<DataframeEvaluationClassificationMetricsAucRoc.Builder, ObjectBuilder<DataframeEvaluationClassificationMetricsAucRoc>> fn) {
			return this.aucRoc(fn.apply(new DataframeEvaluationClassificationMetricsAucRoc.Builder()).build());
		}

		/**
		 * Precision of predictions (per-class and average).
		 *
		 * API name: {@code precision}
		 */
		public BuilderT precision(@Nullable Map<String, JsonValue> value) {
			this.precision = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #precision(Map)}, creating the map if needed.
		 */
		public BuilderT putPrecision(String key, JsonValue value) {
			if (this.precision == null) {
				this.precision = new HashMap<>();
			}
			this.precision.put(key, value);
			return self();
		}

		/**
		 * Recall of predictions (per-class and average).
		 *
		 * API name: {@code recall}
		 */
		public BuilderT recall(@Nullable Map<String, JsonValue> value) {
			this.recall = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #recall(Map)}, creating the map if needed.
		 */
		public BuilderT putRecall(String key, JsonValue value) {
			if (this.recall == null) {
				this.recall = new HashMap<>();
			}
			this.recall.put(key, value);
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDataframeEvaluationMetricsDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::aucRoc, DataframeEvaluationClassificationMetricsAucRoc.DESERIALIZER, "auc_roc");
		op.add(AbstractBuilder::precision,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "precision");
		op.add(AbstractBuilder::recall,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "recall");

	}

}
