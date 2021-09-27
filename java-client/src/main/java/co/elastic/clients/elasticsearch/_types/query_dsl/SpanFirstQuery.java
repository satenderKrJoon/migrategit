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
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanFirstQuery
public final class SpanFirstQuery extends QueryBase {
	@Nullable
	private final Number end;

	@Nullable
	private final SpanQuery match;

	// ---------------------------------------------------------------------------------------------

	protected SpanFirstQuery(Builder builder) {
		super(builder);
		this.end = builder.end;
		this.match = builder.match;

	}

	/**
	 * API name: {@code end}
	 */
	@Nullable
	public Number end() {
		return this.end;
	}

	/**
	 * API name: {@code match}
	 */
	@Nullable
	public SpanQuery match() {
		return this.match;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.end != null) {

			generator.writeKey("end");
			generator.write(this.end.doubleValue());

		}
		if (this.match != null) {

			generator.writeKey("match");
			this.match.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanFirstQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanFirstQuery> {
		@Nullable
		private Number end;

		@Nullable
		private SpanQuery match;

		/**
		 * API name: {@code end}
		 */
		public Builder end(@Nullable Number value) {
			this.end = value;
			return this;
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(@Nullable SpanQuery value) {
			this.match = value;
			return this;
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.match(fn.apply(new SpanQuery.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanFirstQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanFirstQuery build() {

			return new SpanFirstQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SpanFirstQuery
	 */
	public static final JsonpDeserializer<SpanFirstQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SpanFirstQuery::setupSpanFirstQueryDeserializer);

	protected static void setupSpanFirstQueryDeserializer(DelegatingDeserializer<SpanFirstQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::end, JsonpDeserializer.numberDeserializer(), "end");
		op.add(Builder::match, SpanQuery.DESERIALIZER, "match");

	}

}
