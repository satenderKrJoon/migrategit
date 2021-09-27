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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TTestAggregation
public final class TTestAggregation extends Aggregation {
	@Nullable
	private final TestPopulation a;

	@Nullable
	private final TestPopulation b;

	@Nullable
	private final JsonValue type;

	// ---------------------------------------------------------------------------------------------

	protected TTestAggregation(Builder builder) {
		super(builder);
		this.a = builder.a;
		this.b = builder.b;
		this.type = builder.type;

	}

	/**
	 * API name: {@code a}
	 */
	@Nullable
	public TestPopulation a() {
		return this.a;
	}

	/**
	 * API name: {@code b}
	 */
	@Nullable
	public TestPopulation b() {
		return this.b;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public JsonValue type() {
		return this.type;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.a != null) {

			generator.writeKey("a");
			this.a.toJsonp(generator, mapper);

		}
		if (this.b != null) {

			generator.writeKey("b");
			this.b.toJsonp(generator, mapper);

		}
		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TTestAggregation}.
	 */
	public static class Builder extends Aggregation.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TTestAggregation> {
		@Nullable
		private TestPopulation a;

		@Nullable
		private TestPopulation b;

		@Nullable
		private JsonValue type;

		/**
		 * API name: {@code a}
		 */
		public Builder a(@Nullable TestPopulation value) {
			this.a = value;
			return this;
		}

		/**
		 * API name: {@code a}
		 */
		public Builder a(Function<TestPopulation.Builder, ObjectBuilder<TestPopulation>> fn) {
			return this.a(fn.apply(new TestPopulation.Builder()).build());
		}

		/**
		 * API name: {@code b}
		 */
		public Builder b(@Nullable TestPopulation value) {
			this.b = value;
			return this;
		}

		/**
		 * API name: {@code b}
		 */
		public Builder b(Function<TestPopulation.Builder, ObjectBuilder<TestPopulation>> fn) {
			return this.b(fn.apply(new TestPopulation.Builder()).build());
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable JsonValue value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TTestAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TTestAggregation build() {

			return new TTestAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TTestAggregation
	 */
	public static final JsonpDeserializer<TTestAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TTestAggregation::setupTTestAggregationDeserializer);

	protected static void setupTTestAggregationDeserializer(DelegatingDeserializer<TTestAggregation.Builder> op) {
		Aggregation.setupAggregationDeserializer(op);
		op.add(Builder::a, TestPopulation.DESERIALIZER, "a");
		op.add(Builder::b, TestPopulation.DESERIALIZER, "b");
		op.add(Builder::type, JsonpDeserializer.jsonValueDeserializer(), "type");

	}

}
