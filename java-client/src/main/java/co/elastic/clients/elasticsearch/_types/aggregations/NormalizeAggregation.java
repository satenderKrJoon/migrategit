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
import javax.annotation.Nullable;

// typedef: _types.aggregations.NormalizeAggregation
public final class NormalizeAggregation extends PipelineAggregationBase {
	@Nullable
	private final JsonValue method;

	// ---------------------------------------------------------------------------------------------

	protected NormalizeAggregation(Builder builder) {
		super(builder);
		this.method = builder.method;

	}

	/**
	 * API name: {@code method}
	 */
	@Nullable
	public JsonValue method() {
		return this.method;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.method != null) {

			generator.writeKey("method");
			generator.write(this.method);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NormalizeAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NormalizeAggregation> {
		@Nullable
		private JsonValue method;

		/**
		 * API name: {@code method}
		 */
		public Builder method(@Nullable JsonValue value) {
			this.method = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NormalizeAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NormalizeAggregation build() {

			return new NormalizeAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NormalizeAggregation
	 */
	public static final JsonpDeserializer<NormalizeAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NormalizeAggregation::setupNormalizeAggregationDeserializer);

	protected static void setupNormalizeAggregationDeserializer(
			DelegatingDeserializer<NormalizeAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::method, JsonpDeserializer.jsonValueDeserializer(), "method");

	}

}
