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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._global.field_caps.FieldCapabilitiesBodyIndexFilter;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.field_caps.Request
public final class FieldCapsRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final List<String> index;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final JsonValue expandWildcards;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeUnmapped;

	@Nullable
	private final FieldCapabilitiesBodyIndexFilter indexFilter;

	// ---------------------------------------------------------------------------------------------

	protected FieldCapsRequest(Builder builder) {

		this.index = builder.index;
		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = builder.expandWildcards;
		this.fields = builder.fields;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeUnmapped = builder.includeUnmapped;
		this.indexFilter = builder.indexFilter;

	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code include_unmapped}
	 */
	@Nullable
	public Boolean includeUnmapped() {
		return this.includeUnmapped;
	}

	/**
	 * API name: {@code index_filter}
	 */
	@Nullable
	public FieldCapabilitiesBodyIndexFilter indexFilter() {
		return this.indexFilter;
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

		if (this.indexFilter != null) {

			generator.writeKey("index_filter");
			this.indexFilter.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapsRequest}.
	 */
	public static class Builder implements ObjectBuilder<FieldCapsRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private JsonValue expandWildcards;

		@Nullable
		private List<String> fields;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeUnmapped;

		@Nullable
		private FieldCapabilitiesBodyIndexFilter indexFilter;

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code include_unmapped}
		 */
		public Builder includeUnmapped(@Nullable Boolean value) {
			this.includeUnmapped = value;
			return this;
		}

		/**
		 * API name: {@code index_filter}
		 */
		public Builder indexFilter(@Nullable FieldCapabilitiesBodyIndexFilter value) {
			this.indexFilter = value;
			return this;
		}

		/**
		 * API name: {@code index_filter}
		 */
		public Builder indexFilter(
				Function<FieldCapabilitiesBodyIndexFilter.Builder, ObjectBuilder<FieldCapabilitiesBodyIndexFilter>> fn) {
			return this.indexFilter(fn.apply(new FieldCapabilitiesBodyIndexFilter.Builder()).build());
		}

		/**
		 * Builds a {@link FieldCapsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldCapsRequest build() {

			return new FieldCapsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldCapsRequest
	 */
	public static final JsonpDeserializer<FieldCapsRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FieldCapsRequest::setupFieldCapsRequestDeserializer);

	protected static void setupFieldCapsRequestDeserializer(DelegatingDeserializer<FieldCapsRequest.Builder> op) {

		op.add(Builder::indexFilter, FieldCapabilitiesBodyIndexFilter.DESERIALIZER, "index_filter");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code field_caps}".
	 */
	public static final Endpoint<FieldCapsRequest, FieldCapsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_field_caps");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_field_caps");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards", request.expandWildcards.toString());
				}
				if (request.fields != null) {
					params.put("fields", request.fields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.includeUnmapped != null) {
					params.put("include_unmapped", String.valueOf(request.includeUnmapped));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, FieldCapsResponse.DESERIALIZER);
}
