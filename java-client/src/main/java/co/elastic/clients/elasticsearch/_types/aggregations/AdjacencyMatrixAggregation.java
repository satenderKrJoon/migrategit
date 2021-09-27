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

import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.AdjacencyMatrixAggregation
public final class AdjacencyMatrixAggregation extends BucketAggregationBase {
	@Nullable
	private final Map<String, QueryContainer> filters;

	// ---------------------------------------------------------------------------------------------

	protected AdjacencyMatrixAggregation(Builder builder) {
		super(builder);
		this.filters = builder.filters;

	}

	/**
	 * API name: {@code filters}
	 */
	@Nullable
	public Map<String, QueryContainer> filters() {
		return this.filters;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.filters != null) {

			generator.writeKey("filters");
			generator.writeStartObject();
			for (Map.Entry<String, QueryContainer> item0 : this.filters.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AdjacencyMatrixAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AdjacencyMatrixAggregation> {
		@Nullable
		private Map<String, QueryContainer> filters;

		/**
		 * API name: {@code filters}
		 */
		public Builder filters(@Nullable Map<String, QueryContainer> value) {
			this.filters = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #filters(Map)}, creating the map if needed.
		 */
		public Builder putFilters(String key, QueryContainer value) {
			if (this.filters == null) {
				this.filters = new HashMap<>();
			}
			this.filters.put(key, value);
			return this;
		}

		/**
		 * Set {@link #filters(Map)} to a singleton map.
		 */
		public Builder filters(String key, Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.filters(Collections.singletonMap(key, fn.apply(new QueryContainer.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #filters(Map)}, creating the map if needed.
		 */
		public Builder putFilters(String key, Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.putFilters(key, fn.apply(new QueryContainer.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AdjacencyMatrixAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AdjacencyMatrixAggregation build() {

			return new AdjacencyMatrixAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AdjacencyMatrixAggregation
	 */
	public static final JsonpDeserializer<AdjacencyMatrixAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AdjacencyMatrixAggregation::setupAdjacencyMatrixAggregationDeserializer);

	protected static void setupAdjacencyMatrixAggregationDeserializer(
			DelegatingDeserializer<AdjacencyMatrixAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::filters, JsonpDeserializer.stringMapDeserializer(QueryContainer.DESERIALIZER), "filters");

	}

}
