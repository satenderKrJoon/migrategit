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

package co.elastic.clients.elasticsearch.security.has_privileges;

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
import javax.annotation.Nullable;

// typedef: security.has_privileges.ApplicationPrivilegesCheck
public final class ApplicationPrivilegesCheck implements ToJsonp {
	private final String application;

	private final List<String> privileges;

	private final List<String> resources;

	// ---------------------------------------------------------------------------------------------

	protected ApplicationPrivilegesCheck(Builder builder) {

		this.application = Objects.requireNonNull(builder.application, "application");
		this.privileges = Objects.requireNonNull(builder.privileges, "privileges");
		this.resources = Objects.requireNonNull(builder.resources, "resources");

	}

	/**
	 * API name: {@code application}
	 */
	public String application() {
		return this.application;
	}

	/**
	 * API name: {@code privileges}
	 */
	public List<String> privileges() {
		return this.privileges;
	}

	/**
	 * API name: {@code resources}
	 */
	public List<String> resources() {
		return this.resources;
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

		generator.writeKey("application");
		generator.write(this.application);

		generator.writeKey("privileges");
		generator.writeStartArray();
		for (String item0 : this.privileges) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("resources");
		generator.writeStartArray();
		for (String item0 : this.resources) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ApplicationPrivilegesCheck}.
	 */
	public static class Builder implements ObjectBuilder<ApplicationPrivilegesCheck> {
		private String application;

		private List<String> privileges;

		private List<String> resources;

		/**
		 * API name: {@code application}
		 */
		public Builder application(String value) {
			this.application = value;
			return this;
		}

		/**
		 * API name: {@code privileges}
		 */
		public Builder privileges(List<String> value) {
			this.privileges = value;
			return this;
		}

		/**
		 * API name: {@code privileges}
		 */
		public Builder privileges(String... value) {
			this.privileges = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #privileges(List)}, creating the list if needed.
		 */
		public Builder addPrivileges(String value) {
			if (this.privileges == null) {
				this.privileges = new ArrayList<>();
			}
			this.privileges.add(value);
			return this;
		}

		/**
		 * API name: {@code resources}
		 */
		public Builder resources(List<String> value) {
			this.resources = value;
			return this;
		}

		/**
		 * API name: {@code resources}
		 */
		public Builder resources(String... value) {
			this.resources = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #resources(List)}, creating the list if needed.
		 */
		public Builder addResources(String value) {
			if (this.resources == null) {
				this.resources = new ArrayList<>();
			}
			this.resources.add(value);
			return this;
		}

		/**
		 * Builds a {@link ApplicationPrivilegesCheck}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ApplicationPrivilegesCheck build() {

			return new ApplicationPrivilegesCheck(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ApplicationPrivilegesCheck
	 */
	public static final JsonpDeserializer<ApplicationPrivilegesCheck> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ApplicationPrivilegesCheck::setupApplicationPrivilegesCheckDeserializer);

	protected static void setupApplicationPrivilegesCheckDeserializer(
			DelegatingDeserializer<ApplicationPrivilegesCheck.Builder> op) {

		op.add(Builder::application, JsonpDeserializer.stringDeserializer(), "application");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"privileges");
		op.add(Builder::resources, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"resources");

	}

}
