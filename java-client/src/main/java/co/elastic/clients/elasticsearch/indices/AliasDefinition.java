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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.AliasDefinition
public final class AliasDefinition implements ToJsonp {
	@Nullable
	private final QueryContainer filter;

	@Nullable
	private final String indexRouting;

	@Nullable
	private final Boolean isWriteIndex;

	@Nullable
	private final String routing;

	@Nullable
	private final String searchRouting;

	// ---------------------------------------------------------------------------------------------

	protected AliasDefinition(Builder builder) {

		this.filter = builder.filter;
		this.indexRouting = builder.indexRouting;
		this.isWriteIndex = builder.isWriteIndex;
		this.routing = builder.routing;
		this.searchRouting = builder.searchRouting;

	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public QueryContainer filter() {
		return this.filter;
	}

	/**
	 * API name: {@code index_routing}
	 */
	@Nullable
	public String indexRouting() {
		return this.indexRouting;
	}

	/**
	 * API name: {@code is_write_index}
	 */
	@Nullable
	public Boolean isWriteIndex() {
		return this.isWriteIndex;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code search_routing}
	 */
	@Nullable
	public String searchRouting() {
		return this.searchRouting;
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

		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.toJsonp(generator, mapper);

		}
		if (this.indexRouting != null) {

			generator.writeKey("index_routing");
			generator.write(this.indexRouting);

		}
		if (this.isWriteIndex != null) {

			generator.writeKey("is_write_index");
			generator.write(this.isWriteIndex);

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.searchRouting != null) {

			generator.writeKey("search_routing");
			generator.write(this.searchRouting);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AliasDefinition}.
	 */
	public static class Builder implements ObjectBuilder<AliasDefinition> {
		@Nullable
		private QueryContainer filter;

		@Nullable
		private String indexRouting;

		@Nullable
		private Boolean isWriteIndex;

		@Nullable
		private String routing;

		@Nullable
		private String searchRouting;

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable QueryContainer value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.filter(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code index_routing}
		 */
		public Builder indexRouting(@Nullable String value) {
			this.indexRouting = value;
			return this;
		}

		/**
		 * API name: {@code is_write_index}
		 */
		public Builder isWriteIndex(@Nullable Boolean value) {
			this.isWriteIndex = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code search_routing}
		 */
		public Builder searchRouting(@Nullable String value) {
			this.searchRouting = value;
			return this;
		}

		/**
		 * Builds a {@link AliasDefinition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AliasDefinition build() {

			return new AliasDefinition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AliasDefinition
	 */
	public static final JsonpDeserializer<AliasDefinition> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AliasDefinition::setupAliasDefinitionDeserializer);

	protected static void setupAliasDefinitionDeserializer(DelegatingDeserializer<AliasDefinition.Builder> op) {

		op.add(Builder::filter, QueryContainer.DESERIALIZER, "filter");
		op.add(Builder::indexRouting, JsonpDeserializer.stringDeserializer(), "index_routing");
		op.add(Builder::isWriteIndex, JsonpDeserializer.booleanDeserializer(), "is_write_index");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::searchRouting, JsonpDeserializer.stringDeserializer(), "search_routing");

	}

}
