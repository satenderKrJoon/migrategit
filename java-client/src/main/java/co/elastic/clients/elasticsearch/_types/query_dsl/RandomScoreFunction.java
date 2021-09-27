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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.RandomScoreFunction
public final class RandomScoreFunction extends ScoreFunctionBase {
	@Nullable
	private final String field;

	@Nullable
	private final JsonValue seed;

	// ---------------------------------------------------------------------------------------------

	protected RandomScoreFunction(Builder builder) {
		super(builder);
		this.field = builder.field;
		this.seed = builder.seed;

	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code seed}
	 */
	@Nullable
	public JsonValue seed() {
		return this.seed;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.seed != null) {

			generator.writeKey("seed");
			generator.write(this.seed);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RandomScoreFunction}.
	 */
	public static class Builder extends ScoreFunctionBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RandomScoreFunction> {
		@Nullable
		private String field;

		@Nullable
		private JsonValue seed;

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code seed}
		 */
		public Builder seed(@Nullable JsonValue value) {
			this.seed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RandomScoreFunction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RandomScoreFunction build() {

			return new RandomScoreFunction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RandomScoreFunction
	 */
	public static final JsonpDeserializer<RandomScoreFunction> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RandomScoreFunction::setupRandomScoreFunctionDeserializer);

	protected static void setupRandomScoreFunctionDeserializer(DelegatingDeserializer<RandomScoreFunction.Builder> op) {
		ScoreFunctionBase.setupScoreFunctionBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::seed, JsonpDeserializer.jsonValueDeserializer(), "seed");

	}

}
