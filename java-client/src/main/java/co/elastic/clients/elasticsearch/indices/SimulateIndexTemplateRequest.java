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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.simulate_index_template.Request
public final class SimulateIndexTemplateRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String name;

	@Nullable
	private final List<String> indexPatterns;

	@Nullable
	private final List<String> composedOf;

	@Nullable
	private final List<OverlappingIndexTemplate> overlapping;

	@Nullable
	private final TemplateMapping template;

	// ---------------------------------------------------------------------------------------------

	protected SimulateIndexTemplateRequest(Builder builder) {

		this.name = builder.name;
		this.indexPatterns = builder.indexPatterns;
		this.composedOf = builder.composedOf;
		this.overlapping = builder.overlapping;
		this.template = builder.template;

	}

	/**
	 * Index or template name to simulate
	 *
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code index_patterns}
	 */
	@Nullable
	public List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * API name: {@code composed_of}
	 */
	@Nullable
	public List<String> composedOf() {
		return this.composedOf;
	}

	/**
	 * Any overlapping templates that would have matched, but have lower priority
	 *
	 * API name: {@code overlapping}
	 */
	@Nullable
	public List<OverlappingIndexTemplate> overlapping() {
		return this.overlapping;
	}

	/**
	 * API name: {@code template}
	 */
	@Nullable
	public TemplateMapping template() {
		return this.template;
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

		if (this.indexPatterns != null) {

			generator.writeKey("index_patterns");
			generator.writeStartArray();
			for (String item0 : this.indexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.composedOf != null) {

			generator.writeKey("composed_of");
			generator.writeStartArray();
			for (String item0 : this.composedOf) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.overlapping != null) {

			generator.writeKey("overlapping");
			generator.writeStartArray();
			for (OverlappingIndexTemplate item0 : this.overlapping) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.template != null) {

			generator.writeKey("template");
			this.template.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateIndexTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<SimulateIndexTemplateRequest> {
		@Nullable
		private String name;

		@Nullable
		private List<String> indexPatterns;

		@Nullable
		private List<String> composedOf;

		@Nullable
		private List<OverlappingIndexTemplate> overlapping;

		@Nullable
		private TemplateMapping template;

		/**
		 * Index or template name to simulate
		 *
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code index_patterns}
		 */
		public Builder indexPatterns(@Nullable List<String> value) {
			this.indexPatterns = value;
			return this;
		}

		/**
		 * API name: {@code index_patterns}
		 */
		public Builder indexPatterns(String... value) {
			this.indexPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indexPatterns(List)}, creating the list if needed.
		 */
		public Builder addIndexPatterns(String value) {
			if (this.indexPatterns == null) {
				this.indexPatterns = new ArrayList<>();
			}
			this.indexPatterns.add(value);
			return this;
		}

		/**
		 * API name: {@code composed_of}
		 */
		public Builder composedOf(@Nullable List<String> value) {
			this.composedOf = value;
			return this;
		}

		/**
		 * API name: {@code composed_of}
		 */
		public Builder composedOf(String... value) {
			this.composedOf = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #composedOf(List)}, creating the list if needed.
		 */
		public Builder addComposedOf(String value) {
			if (this.composedOf == null) {
				this.composedOf = new ArrayList<>();
			}
			this.composedOf.add(value);
			return this;
		}

		/**
		 * Any overlapping templates that would have matched, but have lower priority
		 *
		 * API name: {@code overlapping}
		 */
		public Builder overlapping(@Nullable List<OverlappingIndexTemplate> value) {
			this.overlapping = value;
			return this;
		}

		/**
		 * Any overlapping templates that would have matched, but have lower priority
		 *
		 * API name: {@code overlapping}
		 */
		public Builder overlapping(OverlappingIndexTemplate... value) {
			this.overlapping = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #overlapping(List)}, creating the list if needed.
		 */
		public Builder addOverlapping(OverlappingIndexTemplate value) {
			if (this.overlapping == null) {
				this.overlapping = new ArrayList<>();
			}
			this.overlapping.add(value);
			return this;
		}

		/**
		 * Set {@link #overlapping(List)} to a singleton list.
		 */
		public Builder overlapping(
				Function<OverlappingIndexTemplate.Builder, ObjectBuilder<OverlappingIndexTemplate>> fn) {
			return this.overlapping(fn.apply(new OverlappingIndexTemplate.Builder()).build());
		}

		/**
		 * Add a value to {@link #overlapping(List)}, creating the list if needed.
		 */
		public Builder addOverlapping(
				Function<OverlappingIndexTemplate.Builder, ObjectBuilder<OverlappingIndexTemplate>> fn) {
			return this.addOverlapping(fn.apply(new OverlappingIndexTemplate.Builder()).build());
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(@Nullable TemplateMapping value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(Function<TemplateMapping.Builder, ObjectBuilder<TemplateMapping>> fn) {
			return this.template(fn.apply(new TemplateMapping.Builder()).build());
		}

		/**
		 * Builds a {@link SimulateIndexTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateIndexTemplateRequest build() {

			return new SimulateIndexTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SimulateIndexTemplateRequest
	 */
	public static final JsonpDeserializer<SimulateIndexTemplateRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SimulateIndexTemplateRequest::setupSimulateIndexTemplateRequestDeserializer);

	protected static void setupSimulateIndexTemplateRequestDeserializer(
			DelegatingDeserializer<SimulateIndexTemplateRequest.Builder> op) {

		op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_patterns");
		op.add(Builder::composedOf, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"composed_of");
		op.add(Builder::overlapping, JsonpDeserializer.arrayDeserializer(OverlappingIndexTemplate.DESERIALIZER),
				"overlapping");
		op.add(Builder::template, TemplateMapping.DESERIALIZER, "template");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.simulate_index_template}".
	 */
	public static final Endpoint<SimulateIndexTemplateRequest, SimulateIndexTemplateResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/_simulate_index");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, SimulateIndexTemplateResponse.DESERIALIZER);
}
