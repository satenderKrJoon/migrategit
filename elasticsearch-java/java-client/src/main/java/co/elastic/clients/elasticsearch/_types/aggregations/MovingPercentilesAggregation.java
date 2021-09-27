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
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MovingPercentilesAggregation
public final class MovingPercentilesAggregation extends PipelineAggregationBase {
	@Nullable
	private final Number window;

	@Nullable
	private final Number shift;

	// ---------------------------------------------------------------------------------------------

	protected MovingPercentilesAggregation(Builder builder) {
		super(builder);
		this.window = builder.window;
		this.shift = builder.shift;

	}

	/**
	 * API name: {@code window}
	 */
	@Nullable
	public Number window() {
		return this.window;
	}

	/**
	 * API name: {@code shift}
	 */
	@Nullable
	public Number shift() {
		return this.shift;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.window != null) {

			generator.writeKey("window");
			generator.write(this.window.doubleValue());

		}
		if (this.shift != null) {

			generator.writeKey("shift");
			generator.write(this.shift.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MovingPercentilesAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MovingPercentilesAggregation> {
		@Nullable
		private Number window;

		@Nullable
		private Number shift;

		/**
		 * API name: {@code window}
		 */
		public Builder window(@Nullable Number value) {
			this.window = value;
			return this;
		}

		/**
		 * API name: {@code shift}
		 */
		public Builder shift(@Nullable Number value) {
			this.shift = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MovingPercentilesAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MovingPercentilesAggregation build() {

			return new MovingPercentilesAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MovingPercentilesAggregation
	 */
	public static final JsonpDeserializer<MovingPercentilesAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MovingPercentilesAggregation::setupMovingPercentilesAggregationDeserializer);

	protected static void setupMovingPercentilesAggregationDeserializer(
			DelegatingDeserializer<MovingPercentilesAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::window, JsonpDeserializer.numberDeserializer(), "window");
		op.add(Builder::shift, JsonpDeserializer.numberDeserializer(), "shift");

	}

}
