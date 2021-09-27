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

package co.elastic.clients.elasticsearch._global.search;

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

// typedef: _global.search._types.StupidBackoffSmoothingModel
public final class StupidBackoffSmoothingModel implements ToJsonp {
	private final Number discount;

	// ---------------------------------------------------------------------------------------------

	protected StupidBackoffSmoothingModel(Builder builder) {

		this.discount = Objects.requireNonNull(builder.discount, "discount");

	}

	/**
	 * API name: {@code discount}
	 */
	public Number discount() {
		return this.discount;
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

		generator.writeKey("discount");
		generator.write(this.discount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StupidBackoffSmoothingModel}.
	 */
	public static class Builder implements ObjectBuilder<StupidBackoffSmoothingModel> {
		private Number discount;

		/**
		 * API name: {@code discount}
		 */
		public Builder discount(Number value) {
			this.discount = value;
			return this;
		}

		/**
		 * Builds a {@link StupidBackoffSmoothingModel}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StupidBackoffSmoothingModel build() {

			return new StupidBackoffSmoothingModel(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for StupidBackoffSmoothingModel
	 */
	public static final JsonpDeserializer<StupidBackoffSmoothingModel> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StupidBackoffSmoothingModel::setupStupidBackoffSmoothingModelDeserializer);

	protected static void setupStupidBackoffSmoothingModelDeserializer(
			DelegatingDeserializer<StupidBackoffSmoothingModel.Builder> op) {

		op.add(Builder::discount, JsonpDeserializer.numberDeserializer(), "discount");

	}

}
