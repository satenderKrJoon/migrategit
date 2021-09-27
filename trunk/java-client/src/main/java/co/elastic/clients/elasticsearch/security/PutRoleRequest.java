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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.security.get_role.TransientMetadata;
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
import javax.annotation.Nullable;

// typedef: security.put_role.Request
public final class PutRoleRequest extends RequestBase implements ToJsonp {
	private final String name;

	@Nullable
	private final JsonValue refresh;

	@Nullable
	private final List<ApplicationPrivileges> applications;

	@Nullable
	private final List<String> cluster;

	@Nullable
	private final Map<String, JsonValue> global;

	@Nullable
	private final List<IndicesPrivileges> indices;

	@Nullable
	private final Map<String, JsonValue> metadata;

	@Nullable
	private final List<String> runAs;

	@Nullable
	private final TransientMetadata transientMetadata;

	// ---------------------------------------------------------------------------------------------

	protected PutRoleRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.refresh = builder.refresh;
		this.applications = builder.applications;
		this.cluster = builder.cluster;
		this.global = builder.global;
		this.indices = builder.indices;
		this.metadata = builder.metadata;
		this.runAs = builder.runAs;
		this.transientMetadata = builder.transientMetadata;

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code applications}
	 */
	@Nullable
	public List<ApplicationPrivileges> applications() {
		return this.applications;
	}

	/**
	 * API name: {@code cluster}
	 */
	@Nullable
	public List<String> cluster() {
		return this.cluster;
	}

	/**
	 * API name: {@code global}
	 */
	@Nullable
	public Map<String, JsonValue> global() {
		return this.global;
	}

	/**
	 * API name: {@code indices}
	 */
	@Nullable
	public List<IndicesPrivileges> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonValue> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code run_as}
	 */
	@Nullable
	public List<String> runAs() {
		return this.runAs;
	}

	/**
	 * API name: {@code transient_metadata}
	 */
	@Nullable
	public TransientMetadata transientMetadata() {
		return this.transientMetadata;
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

		if (this.applications != null) {

			generator.writeKey("applications");
			generator.writeStartArray();
			for (ApplicationPrivileges item0 : this.applications) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.cluster != null) {

			generator.writeKey("cluster");
			generator.writeStartArray();
			for (String item0 : this.cluster) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.global != null) {

			generator.writeKey("global");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.global.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.indices != null) {

			generator.writeKey("indices");
			generator.writeStartArray();
			for (IndicesPrivileges item0 : this.indices) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.runAs != null) {

			generator.writeKey("run_as");
			generator.writeStartArray();
			for (String item0 : this.runAs) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.transientMetadata != null) {

			generator.writeKey("transient_metadata");
			this.transientMetadata.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRoleRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutRoleRequest> {
		private String name;

		@Nullable
		private JsonValue refresh;

		@Nullable
		private List<ApplicationPrivileges> applications;

		@Nullable
		private List<String> cluster;

		@Nullable
		private Map<String, JsonValue> global;

		@Nullable
		private List<IndicesPrivileges> indices;

		@Nullable
		private Map<String, JsonValue> metadata;

		@Nullable
		private List<String> runAs;

		@Nullable
		private TransientMetadata transientMetadata;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code applications}
		 */
		public Builder applications(@Nullable List<ApplicationPrivileges> value) {
			this.applications = value;
			return this;
		}

		/**
		 * API name: {@code applications}
		 */
		public Builder applications(ApplicationPrivileges... value) {
			this.applications = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #applications(List)}, creating the list if needed.
		 */
		public Builder addApplications(ApplicationPrivileges value) {
			if (this.applications == null) {
				this.applications = new ArrayList<>();
			}
			this.applications.add(value);
			return this;
		}

		/**
		 * Set {@link #applications(List)} to a singleton list.
		 */
		public Builder applications(Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>> fn) {
			return this.applications(fn.apply(new ApplicationPrivileges.Builder()).build());
		}

		/**
		 * Add a value to {@link #applications(List)}, creating the list if needed.
		 */
		public Builder addApplications(
				Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>> fn) {
			return this.addApplications(fn.apply(new ApplicationPrivileges.Builder()).build());
		}

		/**
		 * API name: {@code cluster}
		 */
		public Builder cluster(@Nullable List<String> value) {
			this.cluster = value;
			return this;
		}

		/**
		 * API name: {@code cluster}
		 */
		public Builder cluster(String... value) {
			this.cluster = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #cluster(List)}, creating the list if needed.
		 */
		public Builder addCluster(String value) {
			if (this.cluster == null) {
				this.cluster = new ArrayList<>();
			}
			this.cluster.add(value);
			return this;
		}

		/**
		 * API name: {@code global}
		 */
		public Builder global(@Nullable Map<String, JsonValue> value) {
			this.global = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #global(Map)}, creating the map if needed.
		 */
		public Builder putGlobal(String key, JsonValue value) {
			if (this.global == null) {
				this.global = new HashMap<>();
			}
			this.global.put(key, value);
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(@Nullable List<IndicesPrivileges> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(IndicesPrivileges... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(IndicesPrivileges value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * Set {@link #indices(List)} to a singleton list.
		 */
		public Builder indices(Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>> fn) {
			return this.indices(fn.apply(new IndicesPrivileges.Builder()).build());
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>> fn) {
			return this.addIndices(fn.apply(new IndicesPrivileges.Builder()).build());
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonValue> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonValue value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		/**
		 * API name: {@code run_as}
		 */
		public Builder runAs(@Nullable List<String> value) {
			this.runAs = value;
			return this;
		}

		/**
		 * API name: {@code run_as}
		 */
		public Builder runAs(String... value) {
			this.runAs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #runAs(List)}, creating the list if needed.
		 */
		public Builder addRunAs(String value) {
			if (this.runAs == null) {
				this.runAs = new ArrayList<>();
			}
			this.runAs.add(value);
			return this;
		}

		/**
		 * API name: {@code transient_metadata}
		 */
		public Builder transientMetadata(@Nullable TransientMetadata value) {
			this.transientMetadata = value;
			return this;
		}

		/**
		 * API name: {@code transient_metadata}
		 */
		public Builder transientMetadata(Function<TransientMetadata.Builder, ObjectBuilder<TransientMetadata>> fn) {
			return this.transientMetadata(fn.apply(new TransientMetadata.Builder()).build());
		}

		/**
		 * Builds a {@link PutRoleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRoleRequest build() {

			return new PutRoleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutRoleRequest
	 */
	public static final JsonpDeserializer<PutRoleRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutRoleRequest::setupPutRoleRequestDeserializer);

	protected static void setupPutRoleRequestDeserializer(DelegatingDeserializer<PutRoleRequest.Builder> op) {

		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges.DESERIALIZER),
				"applications");
		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::global, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"global");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesPrivileges.DESERIALIZER), "indices");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"metadata");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");
		op.add(Builder::transientMetadata, TransientMetadata.DESERIALIZER, "transient_metadata");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_role}".
	 */
	public static final Endpoint<PutRoleRequest, PutRoleResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutRoleResponse.DESERIALIZER);
}
