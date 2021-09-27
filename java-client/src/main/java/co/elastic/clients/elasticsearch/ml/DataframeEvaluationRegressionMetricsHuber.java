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
import java.lang.Number;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationRegressionMetricsHuber
public final class DataframeEvaluationRegressionMetricsHuber implements ToJsonp {
	@Nullable
	private final Number delta;

	// ---------------------------------------------------------------------------------------------

	protected DataframeEvaluationRegressionMetricsHuber(Builder builder) {

		this.delta = builder.delta;

	}

	/**
	 * Approximates 1/2 (prediction - actual)2 for values much less than delta and
	 * approximates a straight line with slope delta for values much larger than
	 * delta. Defaults to 1. Delta needs to be greater than 0.
	 *
	 * API name: {@code delta}
	 */
	@Nullable
	public Number delta() {
		return this.delta;
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

		if (this.delta != null) {

			generator.writeKey("delta");
			generator.write(this.delta.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationRegressionMetricsHuber}.
	 */
	public static class Builder implements ObjectBuilder<DataframeEvaluationRegressionMetricsHuber> {
		@Nullable
		private Number delta;

		/**
		 * Approximates 1/2 (prediction - actual)2 for values much less than delta and
		 * approximates a straight line with slope delta for values much larger than
		 * delta. Defaults to 1. Delta needs to be greater than 0.
		 *
		 * API name: {@code delta}
		 */
		public Builder delta(@Nullable Number value) {
			this.delta = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationRegressionMetricsHuber}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationRegressionMetricsHuber build() {

			return new DataframeEvaluationRegressionMetricsHuber(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataframeEvaluationRegressionMetricsHuber
	 */
	public static final JsonpDeserializer<DataframeEvaluationRegressionMetricsHuber> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					DataframeEvaluationRegressionMetricsHuber::setupDataframeEvaluationRegressionMetricsHuberDeserializer);

	protected static void setupDataframeEvaluationRegressionMetricsHuberDeserializer(
			DelegatingDeserializer<DataframeEvaluationRegressionMetricsHuber.Builder> op) {

		op.add(Builder::delta, JsonpDeserializer.numberDeserializer(), "delta");

	}

}
