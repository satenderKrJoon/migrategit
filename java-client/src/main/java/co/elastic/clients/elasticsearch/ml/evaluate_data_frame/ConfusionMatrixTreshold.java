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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.ConfusionMatrixTreshold
public final class ConfusionMatrixTreshold implements ToJsonp {
	private final Number truePositive;

	private final Number falsePositive;

	private final Number trueNegative;

	private final Number falseNegative;

	// ---------------------------------------------------------------------------------------------

	protected ConfusionMatrixTreshold(Builder builder) {

		this.truePositive = Objects.requireNonNull(builder.truePositive, "tp");
		this.falsePositive = Objects.requireNonNull(builder.falsePositive, "fp");
		this.trueNegative = Objects.requireNonNull(builder.trueNegative, "tn");
		this.falseNegative = Objects.requireNonNull(builder.falseNegative, "fn");

	}

	/**
	 * True Positive
	 *
	 * API name: {@code tp}
	 */
	public Number truePositive() {
		return this.truePositive;
	}

	/**
	 * False Positive
	 *
	 * API name: {@code fp}
	 */
	public Number falsePositive() {
		return this.falsePositive;
	}

	/**
	 * True Negative
	 *
	 * API name: {@code tn}
	 */
	public Number trueNegative() {
		return this.trueNegative;
	}

	/**
	 * False Negative
	 *
	 * API name: {@code fn}
	 */
	public Number falseNegative() {
		return this.falseNegative;
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

		generator.writeKey("tp");
		generator.write(this.truePositive.doubleValue());

		generator.writeKey("fp");
		generator.write(this.falsePositive.doubleValue());

		generator.writeKey("tn");
		generator.write(this.trueNegative.doubleValue());

		generator.writeKey("fn");
		generator.write(this.falseNegative.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConfusionMatrixTreshold}.
	 */
	public static class Builder implements ObjectBuilder<ConfusionMatrixTreshold> {
		private Number truePositive;

		private Number falsePositive;

		private Number trueNegative;

		private Number falseNegative;

		/**
		 * True Positive
		 *
		 * API name: {@code tp}
		 */
		public Builder truePositive(Number value) {
			this.truePositive = value;
			return this;
		}

		/**
		 * False Positive
		 *
		 * API name: {@code fp}
		 */
		public Builder falsePositive(Number value) {
			this.falsePositive = value;
			return this;
		}

		/**
		 * True Negative
		 *
		 * API name: {@code tn}
		 */
		public Builder trueNegative(Number value) {
			this.trueNegative = value;
			return this;
		}

		/**
		 * False Negative
		 *
		 * API name: {@code fn}
		 */
		public Builder falseNegative(Number value) {
			this.falseNegative = value;
			return this;
		}

		/**
		 * Builds a {@link ConfusionMatrixTreshold}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ConfusionMatrixTreshold build() {

			return new ConfusionMatrixTreshold(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ConfusionMatrixTreshold
	 */
	public static final JsonpDeserializer<ConfusionMatrixTreshold> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ConfusionMatrixTreshold::setupConfusionMatrixTresholdDeserializer);

	protected static void setupConfusionMatrixTresholdDeserializer(
			DelegatingDeserializer<ConfusionMatrixTreshold.Builder> op) {

		op.add(Builder::truePositive, JsonpDeserializer.numberDeserializer(), "tp");
		op.add(Builder::falsePositive, JsonpDeserializer.numberDeserializer(), "fp");
		op.add(Builder::trueNegative, JsonpDeserializer.numberDeserializer(), "tn");
		op.add(Builder::falseNegative, JsonpDeserializer.numberDeserializer(), "fn");

	}

}
