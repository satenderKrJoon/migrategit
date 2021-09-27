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
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.ConfusionMatrixPrediction
public final class ConfusionMatrixPrediction implements ToJsonp {
	private final String predictedClass;

	private final Number count;

	// ---------------------------------------------------------------------------------------------

	protected ConfusionMatrixPrediction(Builder builder) {

		this.predictedClass = Objects.requireNonNull(builder.predictedClass, "predicted_class");
		this.count = Objects.requireNonNull(builder.count, "count");

	}

	/**
	 * API name: {@code predicted_class}
	 */
	public String predictedClass() {
		return this.predictedClass;
	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
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

		generator.writeKey("predicted_class");
		generator.write(this.predictedClass);

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConfusionMatrixPrediction}.
	 */
	public static class Builder implements ObjectBuilder<ConfusionMatrixPrediction> {
		private String predictedClass;

		private Number count;

		/**
		 * API name: {@code predicted_class}
		 */
		public Builder predictedClass(String value) {
			this.predictedClass = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * Builds a {@link ConfusionMatrixPrediction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ConfusionMatrixPrediction build() {

			return new ConfusionMatrixPrediction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ConfusionMatrixPrediction
	 */
	public static final JsonpDeserializer<ConfusionMatrixPrediction> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ConfusionMatrixPrediction::setupConfusionMatrixPredictionDeserializer);

	protected static void setupConfusionMatrixPredictionDeserializer(
			DelegatingDeserializer<ConfusionMatrixPrediction.Builder> op) {

		op.add(Builder::predictedClass, JsonpDeserializer.stringDeserializer(), "predicted_class");
		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");

	}

}
