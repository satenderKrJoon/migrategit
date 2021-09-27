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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.QueryProfile
public final class QueryProfile implements ToJsonp {
	private final QueryBreakdown breakdown;

	private final String description;

	private final Number timeInNanos;

	private final String type;

	@Nullable
	private final List<co.elastic.clients.elasticsearch._global.search.QueryProfile> children;

	// ---------------------------------------------------------------------------------------------

	protected QueryProfile(Builder builder) {

		this.breakdown = Objects.requireNonNull(builder.breakdown, "breakdown");
		this.description = Objects.requireNonNull(builder.description, "description");
		this.timeInNanos = Objects.requireNonNull(builder.timeInNanos, "time_in_nanos");
		this.type = Objects.requireNonNull(builder.type, "type");
		this.children = builder.children;

	}

	/**
	 * API name: {@code breakdown}
	 */
	public QueryBreakdown breakdown() {
		return this.breakdown;
	}

	/**
	 * API name: {@code description}
	 */
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code time_in_nanos}
	 */
	public Number timeInNanos() {
		return this.timeInNanos;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code children}
	 */
	@Nullable
	public List<co.elastic.clients.elasticsearch._global.search.QueryProfile> children() {
		return this.children;
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

		generator.writeKey("breakdown");
		this.breakdown.toJsonp(generator, mapper);

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("time_in_nanos");
		generator.write(this.timeInNanos.doubleValue());

		generator.writeKey("type");
		generator.write(this.type);

		if (this.children != null) {

			generator.writeKey("children");
			generator.writeStartArray();
			for (co.elastic.clients.elasticsearch._global.search.QueryProfile item0 : this.children) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryProfile}.
	 */
	public static class Builder implements ObjectBuilder<QueryProfile> {
		private QueryBreakdown breakdown;

		private String description;

		private Number timeInNanos;

		private String type;

		@Nullable
		private List<co.elastic.clients.elasticsearch._global.search.QueryProfile> children;

		/**
		 * API name: {@code breakdown}
		 */
		public Builder breakdown(QueryBreakdown value) {
			this.breakdown = value;
			return this;
		}

		/**
		 * API name: {@code breakdown}
		 */
		public Builder breakdown(Function<QueryBreakdown.Builder, ObjectBuilder<QueryBreakdown>> fn) {
			return this.breakdown(fn.apply(new QueryBreakdown.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code time_in_nanos}
		 */
		public Builder timeInNanos(Number value) {
			this.timeInNanos = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		public Builder children(@Nullable List<co.elastic.clients.elasticsearch._global.search.QueryProfile> value) {
			this.children = value;
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		public Builder children(co.elastic.clients.elasticsearch._global.search.QueryProfile... value) {
			this.children = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #children(List)}, creating the list if needed.
		 */
		public Builder addChildren(co.elastic.clients.elasticsearch._global.search.QueryProfile value) {
			if (this.children == null) {
				this.children = new ArrayList<>();
			}
			this.children.add(value);
			return this;
		}

		/**
		 * Set {@link #children(List)} to a singleton list.
		 */
		public Builder children(
				Function<co.elastic.clients.elasticsearch._global.search.QueryProfile.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._global.search.QueryProfile>> fn) {
			return this.children(
					fn.apply(new co.elastic.clients.elasticsearch._global.search.QueryProfile.Builder()).build());
		}

		/**
		 * Add a value to {@link #children(List)}, creating the list if needed.
		 */
		public Builder addChildren(
				Function<co.elastic.clients.elasticsearch._global.search.QueryProfile.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._global.search.QueryProfile>> fn) {
			return this.addChildren(
					fn.apply(new co.elastic.clients.elasticsearch._global.search.QueryProfile.Builder()).build());
		}

		/**
		 * Builds a {@link QueryProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryProfile build() {

			return new QueryProfile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for QueryProfile
	 */
	public static final JsonpDeserializer<QueryProfile> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, QueryProfile::setupQueryProfileDeserializer);

	protected static void setupQueryProfileDeserializer(DelegatingDeserializer<QueryProfile.Builder> op) {

		op.add(Builder::breakdown, QueryBreakdown.DESERIALIZER, "breakdown");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::timeInNanos, JsonpDeserializer.numberDeserializer(), "time_in_nanos");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::children, JsonpDeserializer.arrayDeserializer(
				co.elastic.clients.elasticsearch._global.search.QueryProfile.DESERIALIZER), "children");

	}

}
