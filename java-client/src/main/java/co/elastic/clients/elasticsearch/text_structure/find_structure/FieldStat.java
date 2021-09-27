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

package co.elastic.clients.elasticsearch.text_structure.find_structure;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: text_structure.find_structure.FieldStat
public final class FieldStat implements ToJsonp {
	private final Number count;

	private final Number cardinality;

	private final List<TopHit> topHits;

	@Nullable
	private final Number meanValue;

	@Nullable
	private final Number medianValue;

	@Nullable
	private final Number maxValue;

	@Nullable
	private final Number minValue;

	@Nullable
	private final String earliest;

	@Nullable
	private final String latest;

	// ---------------------------------------------------------------------------------------------

	protected FieldStat(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.cardinality = Objects.requireNonNull(builder.cardinality, "cardinality");
		this.topHits = Objects.requireNonNull(builder.topHits, "top_hits");
		this.meanValue = builder.meanValue;
		this.medianValue = builder.medianValue;
		this.maxValue = builder.maxValue;
		this.minValue = builder.minValue;
		this.earliest = builder.earliest;
		this.latest = builder.latest;

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code cardinality}
	 */
	public Number cardinality() {
		return this.cardinality;
	}

	/**
	 * API name: {@code top_hits}
	 */
	public List<TopHit> topHits() {
		return this.topHits;
	}

	/**
	 * API name: {@code mean_value}
	 */
	@Nullable
	public Number meanValue() {
		return this.meanValue;
	}

	/**
	 * API name: {@code median_value}
	 */
	@Nullable
	public Number medianValue() {
		return this.medianValue;
	}

	/**
	 * API name: {@code max_value}
	 */
	@Nullable
	public Number maxValue() {
		return this.maxValue;
	}

	/**
	 * API name: {@code min_value}
	 */
	@Nullable
	public Number minValue() {
		return this.minValue;
	}

	/**
	 * API name: {@code earliest}
	 */
	@Nullable
	public String earliest() {
		return this.earliest;
	}

	/**
	 * API name: {@code latest}
	 */
	@Nullable
	public String latest() {
		return this.latest;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("cardinality");
		generator.write(this.cardinality.doubleValue());

		generator.writeKey("top_hits");
		generator.writeStartArray();
		for (TopHit item0 : this.topHits) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		if (this.meanValue != null) {

			generator.writeKey("mean_value");
			generator.write(this.meanValue.doubleValue());

		}
		if (this.medianValue != null) {

			generator.writeKey("median_value");
			generator.write(this.medianValue.doubleValue());

		}
		if (this.maxValue != null) {

			generator.writeKey("max_value");
			generator.write(this.maxValue.doubleValue());

		}
		if (this.minValue != null) {

			generator.writeKey("min_value");
			generator.write(this.minValue.doubleValue());

		}
		if (this.earliest != null) {

			generator.writeKey("earliest");
			generator.write(this.earliest);

		}
		if (this.latest != null) {

			generator.writeKey("latest");
			generator.write(this.latest);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldStat}.
	 */
	public static class Builder implements ObjectBuilder<FieldStat> {
		private Number count;

		private Number cardinality;

		private List<TopHit> topHits;

		@Nullable
		private Number meanValue;

		@Nullable
		private Number medianValue;

		@Nullable
		private Number maxValue;

		@Nullable
		private Number minValue;

		@Nullable
		private String earliest;

		@Nullable
		private String latest;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code cardinality}
		 */
		public Builder cardinality(Number value) {
			this.cardinality = value;
			return this;
		}

		/**
		 * API name: {@code top_hits}
		 */
		public Builder topHits(List<TopHit> value) {
			this.topHits = value;
			return this;
		}

		/**
		 * API name: {@code top_hits}
		 */
		public Builder topHits(TopHit... value) {
			this.topHits = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #topHits(List)}, creating the list if needed.
		 */
		public Builder addTopHits(TopHit value) {
			if (this.topHits == null) {
				this.topHits = new ArrayList<>();
			}
			this.topHits.add(value);
			return this;
		}

		/**
		 * Set {@link #topHits(List)} to a singleton list.
		 */
		public Builder topHits(Function<TopHit.Builder, ObjectBuilder<TopHit>> fn) {
			return this.topHits(fn.apply(new TopHit.Builder()).build());
		}

		/**
		 * Add a value to {@link #topHits(List)}, creating the list if needed.
		 */
		public Builder addTopHits(Function<TopHit.Builder, ObjectBuilder<TopHit>> fn) {
			return this.addTopHits(fn.apply(new TopHit.Builder()).build());
		}

		/**
		 * API name: {@code mean_value}
		 */
		public Builder meanValue(@Nullable Number value) {
			this.meanValue = value;
			return this;
		}

		/**
		 * API name: {@code median_value}
		 */
		public Builder medianValue(@Nullable Number value) {
			this.medianValue = value;
			return this;
		}

		/**
		 * API name: {@code max_value}
		 */
		public Builder maxValue(@Nullable Number value) {
			this.maxValue = value;
			return this;
		}

		/**
		 * API name: {@code min_value}
		 */
		public Builder minValue(@Nullable Number value) {
			this.minValue = value;
			return this;
		}

		/**
		 * API name: {@code earliest}
		 */
		public Builder earliest(@Nullable String value) {
			this.earliest = value;
			return this;
		}

		/**
		 * API name: {@code latest}
		 */
		public Builder latest(@Nullable String value) {
			this.latest = value;
			return this;
		}

		/**
		 * Builds a {@link FieldStat}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldStat build() {

			return new FieldStat(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldStat
	 */
	public static final JsonpDeserializer<FieldStat> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FieldStat::setupFieldStatDeserializer);

	protected static void setupFieldStatDeserializer(DelegatingDeserializer<FieldStat.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::cardinality, JsonpDeserializer.numberDeserializer(), "cardinality");
		op.add(Builder::topHits, JsonpDeserializer.arrayDeserializer(TopHit.DESERIALIZER), "top_hits");
		op.add(Builder::meanValue, JsonpDeserializer.numberDeserializer(), "mean_value");
		op.add(Builder::medianValue, JsonpDeserializer.numberDeserializer(), "median_value");
		op.add(Builder::maxValue, JsonpDeserializer.numberDeserializer(), "max_value");
		op.add(Builder::minValue, JsonpDeserializer.numberDeserializer(), "min_value");
		op.add(Builder::earliest, JsonpDeserializer.stringDeserializer(), "earliest");
		op.add(Builder::latest, JsonpDeserializer.stringDeserializer(), "latest");

	}

}
