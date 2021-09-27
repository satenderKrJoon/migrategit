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

package co.elastic.clients.elasticsearch._global.rank_eval;

import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
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

// typedef: _global.rank_eval.RankEvalQuery
public final class RankEvalQuery implements ToJsonp {
	private final QueryContainer query;

	@Nullable
	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected RankEvalQuery(Builder builder) {

		this.query = Objects.requireNonNull(builder.query, "query");
		this.size = builder.size;

	}

	/**
	 * API name: {@code query}
	 */
	public QueryContainer query() {
		return this.query;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
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

		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalQuery}.
	 */
	public static class Builder implements ObjectBuilder<RankEvalQuery> {
		private QueryContainer query;

		@Nullable
		private Number size;

		/**
		 * API name: {@code query}
		 */
		public Builder query(QueryContainer value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link RankEvalQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalQuery build() {

			return new RankEvalQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RankEvalQuery
	 */
	public static final JsonpDeserializer<RankEvalQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RankEvalQuery::setupRankEvalQueryDeserializer);

	protected static void setupRankEvalQueryDeserializer(DelegatingDeserializer<RankEvalQuery.Builder> op) {

		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");

	}

}
