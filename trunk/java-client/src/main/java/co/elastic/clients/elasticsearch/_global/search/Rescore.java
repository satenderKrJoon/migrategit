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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.Rescore
public final class Rescore implements ToJsonp {
	private final RescoreQuery query;

	@Nullable
	private final Number windowSize;

	// ---------------------------------------------------------------------------------------------

	protected Rescore(Builder builder) {

		this.query = Objects.requireNonNull(builder.query, "query");
		this.windowSize = builder.windowSize;

	}

	/**
	 * API name: {@code query}
	 */
	public RescoreQuery query() {
		return this.query;
	}

	/**
	 * API name: {@code window_size}
	 */
	@Nullable
	public Number windowSize() {
		return this.windowSize;
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

		generator.writeKey("query");
		this.query.toJsonp(generator, mapper);

		if (this.windowSize != null) {

			generator.writeKey("window_size");
			generator.write(this.windowSize.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Rescore}.
	 */
	public static class Builder implements ObjectBuilder<Rescore> {
		private RescoreQuery query;

		@Nullable
		private Number windowSize;

		/**
		 * API name: {@code query}
		 */
		public Builder query(RescoreQuery value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<RescoreQuery.Builder, ObjectBuilder<RescoreQuery>> fn) {
			return this.query(fn.apply(new RescoreQuery.Builder()).build());
		}

		/**
		 * API name: {@code window_size}
		 */
		public Builder windowSize(@Nullable Number value) {
			this.windowSize = value;
			return this;
		}

		/**
		 * Builds a {@link Rescore}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Rescore build() {

			return new Rescore(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Rescore
	 */
	public static final JsonpDeserializer<Rescore> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Rescore::setupRescoreDeserializer);

	protected static void setupRescoreDeserializer(DelegatingDeserializer<Rescore.Builder> op) {

		op.add(Builder::query, RescoreQuery.DESERIALIZER, "query");
		op.add(Builder::windowSize, JsonpDeserializer.numberDeserializer(), "window_size");

	}

}
