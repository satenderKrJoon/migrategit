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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_user_privileges.Response
public final class GetUserPrivilegesResponse implements ToJsonp {
	private final List<ApplicationPrivileges> applications;

	private final List<String> cluster;

	private final List<GlobalPrivileges> global;

	private final List<IndicesPrivileges> indices;

	private final List<String> runAs;

	// ---------------------------------------------------------------------------------------------

	protected GetUserPrivilegesResponse(Builder builder) {

		this.applications = Objects.requireNonNull(builder.applications, "applications");
		this.cluster = Objects.requireNonNull(builder.cluster, "cluster");
		this.global = Objects.requireNonNull(builder.global, "global");
		this.indices = Objects.requireNonNull(builder.indices, "indices");
		this.runAs = Objects.requireNonNull(builder.runAs, "run_as");

	}

	/**
	 * API name: {@code applications}
	 */
	public List<ApplicationPrivileges> applications() {
		return this.applications;
	}

	/**
	 * API name: {@code cluster}
	 */
	public List<String> cluster() {
		return this.cluster;
	}

	/**
	 * API name: {@code global}
	 */
	public List<GlobalPrivileges> global() {
		return this.global;
	}

	/**
	 * API name: {@code indices}
	 */
	public List<IndicesPrivileges> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code run_as}
	 */
	public List<String> runAs() {
		return this.runAs;
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

		generator.writeKey("applications");
		generator.writeStartArray();
		for (ApplicationPrivileges item0 : this.applications) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("cluster");
		generator.writeStartArray();
		for (String item0 : this.cluster) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("global");
		generator.writeStartArray();
		for (GlobalPrivileges item0 : this.global) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("indices");
		generator.writeStartArray();
		for (IndicesPrivileges item0 : this.indices) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("run_as");
		generator.writeStartArray();
		for (String item0 : this.runAs) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetUserPrivilegesResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetUserPrivilegesResponse> {
		private List<ApplicationPrivileges> applications;

		private List<String> cluster;

		private List<GlobalPrivileges> global;

		private List<IndicesPrivileges> indices;

		private List<String> runAs;

		/**
		 * API name: {@code applications}
		 */
		public Builder applications(List<ApplicationPrivileges> value) {
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
		public Builder cluster(List<String> value) {
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
		public Builder global(List<GlobalPrivileges> value) {
			this.global = value;
			return this;
		}

		/**
		 * API name: {@code global}
		 */
		public Builder global(GlobalPrivileges... value) {
			this.global = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #global(List)}, creating the list if needed.
		 */
		public Builder addGlobal(GlobalPrivileges value) {
			if (this.global == null) {
				this.global = new ArrayList<>();
			}
			this.global.add(value);
			return this;
		}

		/**
		 * Set {@link #global(List)} to a singleton list.
		 */
		public Builder global(Function<GlobalPrivileges.Builder, ObjectBuilder<GlobalPrivileges>> fn) {
			return this.global(fn.apply(new GlobalPrivileges.Builder()).build());
		}

		/**
		 * Add a value to {@link #global(List)}, creating the list if needed.
		 */
		public Builder addGlobal(Function<GlobalPrivileges.Builder, ObjectBuilder<GlobalPrivileges>> fn) {
			return this.addGlobal(fn.apply(new GlobalPrivileges.Builder()).build());
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(List<IndicesPrivileges> value) {
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
		 * API name: {@code run_as}
		 */
		public Builder runAs(List<String> value) {
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
		 * Builds a {@link GetUserPrivilegesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetUserPrivilegesResponse build() {

			return new GetUserPrivilegesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetUserPrivilegesResponse
	 */
	public static final JsonpDeserializer<GetUserPrivilegesResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetUserPrivilegesResponse::setupGetUserPrivilegesResponseDeserializer);

	protected static void setupGetUserPrivilegesResponseDeserializer(
			DelegatingDeserializer<GetUserPrivilegesResponse.Builder> op) {

		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges.DESERIALIZER),
				"applications");
		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::global, JsonpDeserializer.arrayDeserializer(GlobalPrivileges.DESERIALIZER), "global");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesPrivileges.DESERIALIZER), "indices");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");

	}

}
