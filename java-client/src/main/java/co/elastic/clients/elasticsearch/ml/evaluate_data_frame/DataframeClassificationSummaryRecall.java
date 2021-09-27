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

package co.elastic.clients.elasticsearch.ml.evaluate_data_frame;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeClassificationSummaryRecall
public final class DataframeClassificationSummaryRecall implements ToJsonp {
	private final List<DataframeEvaluationClass> classes;

	private final Number avgRecall;

	// ---------------------------------------------------------------------------------------------

	protected DataframeClassificationSummaryRecall(Builder builder) {

		this.classes = Objects.requireNonNull(builder.classes, "classes");
		this.avgRecall = Objects.requireNonNull(builder.avgRecall, "avg_recall");

	}

	/**
	 * API name: {@code classes}
	 */
	public List<DataframeEvaluationClass> classes() {
		return this.classes;
	}

	/**
	 * API name: {@code avg_recall}
	 */
	public Number avgRecall() {
		return this.avgRecall;
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

		generator.writeKey("classes");
		generator.writeStartArray();
		for (DataframeEvaluationClass item0 : this.classes) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("avg_recall");
		generator.write(this.avgRecall.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeClassificationSummaryRecall}.
	 */
	public static class Builder implements ObjectBuilder<DataframeClassificationSummaryRecall> {
		private List<DataframeEvaluationClass> classes;

		private Number avgRecall;

		/**
		 * API name: {@code classes}
		 */
		public Builder classes(List<DataframeEvaluationClass> value) {
			this.classes = value;
			return this;
		}

		/**
		 * API name: {@code classes}
		 */
		public Builder classes(DataframeEvaluationClass... value) {
			this.classes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #classes(List)}, creating the list if needed.
		 */
		public Builder addClasses(DataframeEvaluationClass value) {
			if (this.classes == null) {
				this.classes = new ArrayList<>();
			}
			this.classes.add(value);
			return this;
		}

		/**
		 * Set {@link #classes(List)} to a singleton list.
		 */
		public Builder classes(Function<DataframeEvaluationClass.Builder, ObjectBuilder<DataframeEvaluationClass>> fn) {
			return this.classes(fn.apply(new DataframeEvaluationClass.Builder()).build());
		}

		/**
		 * Add a value to {@link #classes(List)}, creating the list if needed.
		 */
		public Builder addClasses(
				Function<DataframeEvaluationClass.Builder, ObjectBuilder<DataframeEvaluationClass>> fn) {
			return this.addClasses(fn.apply(new DataframeEvaluationClass.Builder()).build());
		}

		/**
		 * API name: {@code avg_recall}
		 */
		public Builder avgRecall(Number value) {
			this.avgRecall = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeClassificationSummaryRecall}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeClassificationSummaryRecall build() {

			return new DataframeClassificationSummaryRecall(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataframeClassificationSummaryRecall
	 */
	public static final JsonpDeserializer<DataframeClassificationSummaryRecall> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					DataframeClassificationSummaryRecall::setupDataframeClassificationSummaryRecallDeserializer);

	protected static void setupDataframeClassificationSummaryRecallDeserializer(
			DelegatingDeserializer<DataframeClassificationSummaryRecall.Builder> op) {

		op.add(Builder::classes, JsonpDeserializer.arrayDeserializer(DataframeEvaluationClass.DESERIALIZER), "classes");
		op.add(Builder::avgRecall, JsonpDeserializer.numberDeserializer(), "avg_recall");

	}

}
