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

package co.elastic.clients.elasticsearch.graph;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: graph.explore.Request
public final class ExploreRequest extends RequestBase implements ToJsonp {
	private final List<String> index;

	@Nullable
	private final List<String> type;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final Hop connections;

	@Nullable
	private final ExploreControls controls;

	@Nullable
	private final QueryContainer query;

	@Nullable
	private final List<VertexDefinition> vertices;

	// ---------------------------------------------------------------------------------------------

	protected ExploreRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.type = builder.type;
		this.routing = builder.routing;
		this.timeout = builder.timeout;
		this.connections = builder.connections;
		this.controls = builder.controls;
		this.query = builder.query;
		this.vertices = builder.vertices;

	}

	/**
	 * API name: {@code index}
	 */
	public List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public List<String> type() {
		return this.type;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code connections}
	 */
	@Nullable
	public Hop connections() {
		return this.connections;
	}

	/**
	 * API name: {@code controls}
	 */
	@Nullable
	public ExploreControls controls() {
		return this.controls;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public QueryContainer query() {
		return this.query;
	}

	/**
	 * API name: {@code vertices}
	 */
	@Nullable
	public List<VertexDefinition> vertices() {
		return this.vertices;
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

		if (this.connections != null) {

			generator.writeKey("connections");
			this.connections.toJsonp(generator, mapper);

		}
		if (this.controls != null) {

			generator.writeKey("controls");
			this.controls.toJsonp(generator, mapper);

		}
		if (this.query != null) {

			generator.writeKey("query");
			this.query.toJsonp(generator, mapper);

		}
		if (this.vertices != null) {

			generator.writeKey("vertices");
			generator.writeStartArray();
			for (VertexDefinition item0 : this.vertices) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExploreRequest}.
	 */
	public static class Builder implements ObjectBuilder<ExploreRequest> {
		private List<String> index;

		@Nullable
		private List<String> type;

		@Nullable
		private JsonValue routing;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private Hop connections;

		@Nullable
		private ExploreControls controls;

		@Nullable
		private QueryContainer query;

		@Nullable
		private List<VertexDefinition> vertices;

		/**
		 * API name: {@code index}
		 */
		public Builder index(List<String> value) {
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
		 * API name: {@code type}
		 */
		public Builder type(@Nullable List<String> value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String... value) {
			this.type = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #type(List)}, creating the list if needed.
		 */
		public Builder addType(String value) {
			if (this.type == null) {
				this.type = new ArrayList<>();
			}
			this.type.add(value);
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code connections}
		 */
		public Builder connections(@Nullable Hop value) {
			this.connections = value;
			return this;
		}

		/**
		 * API name: {@code connections}
		 */
		public Builder connections(Function<Hop.Builder, ObjectBuilder<Hop>> fn) {
			return this.connections(fn.apply(new Hop.Builder()).build());
		}

		/**
		 * API name: {@code controls}
		 */
		public Builder controls(@Nullable ExploreControls value) {
			this.controls = value;
			return this;
		}

		/**
		 * API name: {@code controls}
		 */
		public Builder controls(Function<ExploreControls.Builder, ObjectBuilder<ExploreControls>> fn) {
			return this.controls(fn.apply(new ExploreControls.Builder()).build());
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable QueryContainer value) {
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
		 * API name: {@code vertices}
		 */
		public Builder vertices(@Nullable List<VertexDefinition> value) {
			this.vertices = value;
			return this;
		}

		/**
		 * API name: {@code vertices}
		 */
		public Builder vertices(VertexDefinition... value) {
			this.vertices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #vertices(List)}, creating the list if needed.
		 */
		public Builder addVertices(VertexDefinition value) {
			if (this.vertices == null) {
				this.vertices = new ArrayList<>();
			}
			this.vertices.add(value);
			return this;
		}

		/**
		 * Set {@link #vertices(List)} to a singleton list.
		 */
		public Builder vertices(Function<VertexDefinition.Builder, ObjectBuilder<VertexDefinition>> fn) {
			return this.vertices(fn.apply(new VertexDefinition.Builder()).build());
		}

		/**
		 * Add a value to {@link #vertices(List)}, creating the list if needed.
		 */
		public Builder addVertices(Function<VertexDefinition.Builder, ObjectBuilder<VertexDefinition>> fn) {
			return this.addVertices(fn.apply(new VertexDefinition.Builder()).build());
		}

		/**
		 * Builds a {@link ExploreRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExploreRequest build() {

			return new ExploreRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ExploreRequest
	 */
	public static final JsonpDeserializer<ExploreRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ExploreRequest::setupExploreRequestDeserializer);

	protected static void setupExploreRequestDeserializer(DelegatingDeserializer<ExploreRequest.Builder> op) {

		op.add(Builder::connections, Hop.DESERIALIZER, "connections");
		op.add(Builder::controls, ExploreControls.DESERIALIZER, "controls");
		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");
		op.add(Builder::vertices, JsonpDeserializer.arrayDeserializer(VertexDefinition.DESERIALIZER), "vertices");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code graph.explore}".
	 */
	public static final Endpoint<ExploreRequest, ExploreResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _type = 1 << 1;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;
				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_graph");
					buf.append("/explore");
					return buf.toString();
				}
				if (propsSet == (_index | _type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/");
					buf.append(request.type.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_graph");
					buf.append("/explore");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.routing != null) {
					params.put("routing", request.routing.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, ExploreResponse.DESERIALIZER);
}
