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

package co.elastic.clients.elasticsearch._global.termvectors;

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

// typedef: _global.termvectors.FieldStatistics
public final class FieldStatistics implements ToJsonp {
	private final Number docCount;

	private final Number sumDocFreq;

	private final Number sumTtf;

	// ---------------------------------------------------------------------------------------------

	protected FieldStatistics(Builder builder) {

		this.docCount = Objects.requireNonNull(builder.docCount, "doc_count");
		this.sumDocFreq = Objects.requireNonNull(builder.sumDocFreq, "sum_doc_freq");
		this.sumTtf = Objects.requireNonNull(builder.sumTtf, "sum_ttf");

	}

	/**
	 * API name: {@code doc_count}
	 */
	public Number docCount() {
		return this.docCount;
	}

	/**
	 * API name: {@code sum_doc_freq}
	 */
	public Number sumDocFreq() {
		return this.sumDocFreq;
	}

	/**
	 * API name: {@code sum_ttf}
	 */
	public Number sumTtf() {
		return this.sumTtf;
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

		generator.writeKey("doc_count");
		generator.write(this.docCount.doubleValue());

		generator.writeKey("sum_doc_freq");
		generator.write(this.sumDocFreq.doubleValue());

		generator.writeKey("sum_ttf");
		generator.write(this.sumTtf.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldStatistics}.
	 */
	public static class Builder implements ObjectBuilder<FieldStatistics> {
		private Number docCount;

		private Number sumDocFreq;

		private Number sumTtf;

		/**
		 * API name: {@code doc_count}
		 */
		public Builder docCount(Number value) {
			this.docCount = value;
			return this;
		}

		/**
		 * API name: {@code sum_doc_freq}
		 */
		public Builder sumDocFreq(Number value) {
			this.sumDocFreq = value;
			return this;
		}

		/**
		 * API name: {@code sum_ttf}
		 */
		public Builder sumTtf(Number value) {
			this.sumTtf = value;
			return this;
		}

		/**
		 * Builds a {@link FieldStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldStatistics build() {

			return new FieldStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldStatistics
	 */
	public static final JsonpDeserializer<FieldStatistics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FieldStatistics::setupFieldStatisticsDeserializer);

	protected static void setupFieldStatisticsDeserializer(DelegatingDeserializer<FieldStatistics.Builder> op) {

		op.add(Builder::docCount, JsonpDeserializer.numberDeserializer(), "doc_count");
		op.add(Builder::sumDocFreq, JsonpDeserializer.numberDeserializer(), "sum_doc_freq");
		op.add(Builder::sumTtf, JsonpDeserializer.numberDeserializer(), "sum_ttf");

	}

}
