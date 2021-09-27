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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.GlobalPrivileges
public final class GlobalPrivileges implements ToJsonp {
	private final ApplicationGlobalUserPrivileges application;

	// ---------------------------------------------------------------------------------------------

	protected GlobalPrivileges(Builder builder) {

		this.application = Objects.requireNonNull(builder.application, "application");

	}

	/**
	 * API name: {@code application}
	 */
	public ApplicationGlobalUserPrivileges application() {
		return this.application;
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
		this.application.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GlobalPrivileges}.
	 */
	public static class Builder implements ObjectBuilder<GlobalPrivileges> {
		private ApplicationGlobalUserPrivileges application;

		/**
		 * API name: {@code application}
		 */
		public Builder application(ApplicationGlobalUserPrivileges value) {
			this.application = value;
			return this;
		}

		/**
		 * API name: {@code application}
		 */
		public Builder application(
				Function<ApplicationGlobalUserPrivileges.Builder, ObjectBuilder<ApplicationGlobalUserPrivileges>> fn) {
			return this.application(fn.apply(new ApplicationGlobalUserPrivileges.Builder()).build());
		}

		/**
		 * Builds a {@link GlobalPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GlobalPrivileges build() {

			return new GlobalPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GlobalPrivileges
	 */
	public static final JsonpDeserializer<GlobalPrivileges> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GlobalPrivileges::setupGlobalPrivilegesDeserializer);

	protected static void setupGlobalPrivilegesDeserializer(DelegatingDeserializer<GlobalPrivileges.Builder> op) {

		op.add(Builder::application, ApplicationGlobalUserPrivileges.DESERIALIZER, "application");

	}

}
