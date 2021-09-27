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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_filters.Response
public final class GetFiltersResponse implements ToJsonp {
	private final Number count;

	private final List<Filter> filters;

	// ---------------------------------------------------------------------------------------------

	protected GetFiltersResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.filters = Objects.requireNonNull(builder.filters, "filters");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code filters}
	 */
	public List<Filter> filters() {
		return this.filters;
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

		generator.writeKey("filters");
		generator.writeStartArray();
		for (Filter item0 : this.filters) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetFiltersResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetFiltersResponse> {
		private Number count;

		private List<Filter> filters;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code filters}
		 */
		public Builder filters(List<Filter> value) {
			this.filters = value;
			return this;
		}

		/**
		 * API name: {@code filters}
		 */
		public Builder filters(Filter... value) {
			this.filters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filters(List)}, creating the list if needed.
		 */
		public Builder addFilters(Filter value) {
			if (this.filters == null) {
				this.filters = new ArrayList<>();
			}
			this.filters.add(value);
			return this;
		}

		/**
		 * Set {@link #filters(List)} to a singleton list.
		 */
		public Builder filters(Function<Filter.Builder, ObjectBuilder<Filter>> fn) {
			return this.filters(fn.apply(new Filter.Builder()).build());
		}

		/**
		 * Add a value to {@link #filters(List)}, creating the list if needed.
		 */
		public Builder addFilters(Function<Filter.Builder, ObjectBuilder<Filter>> fn) {
			return this.addFilters(fn.apply(new Filter.Builder()).build());
		}

		/**
		 * Builds a {@link GetFiltersResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetFiltersResponse build() {

			return new GetFiltersResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetFiltersResponse
	 */
	public static final JsonpDeserializer<GetFiltersResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetFiltersResponse::setupGetFiltersResponseDeserializer);

	protected static void setupGetFiltersResponseDeserializer(DelegatingDeserializer<GetFiltersResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::filters, JsonpDeserializer.arrayDeserializer(Filter.DESERIALIZER), "filters");

	}

}
