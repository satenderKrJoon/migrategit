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

package co.elastic.clients.elasticsearch.xpack.usage;

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

// typedef: xpack.usage.SecurityRoles
public final class SecurityRoles implements ToJsonp {
	private final SecurityRolesNative native_;

	private final SecurityRolesDls dls;

	private final SecurityRolesFile file;

	// ---------------------------------------------------------------------------------------------

	protected SecurityRoles(Builder builder) {

		this.native_ = Objects.requireNonNull(builder.native_, "native");
		this.dls = Objects.requireNonNull(builder.dls, "dls");
		this.file = Objects.requireNonNull(builder.file, "file");

	}

	/**
	 * API name: {@code native}
	 */
	public SecurityRolesNative native_() {
		return this.native_;
	}

	/**
	 * API name: {@code dls}
	 */
	public SecurityRolesDls dls() {
		return this.dls;
	}

	/**
	 * API name: {@code file}
	 */
	public SecurityRolesFile file() {
		return this.file;
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

		generator.writeKey("native");
		this.native_.toJsonp(generator, mapper);

		generator.writeKey("dls");
		this.dls.toJsonp(generator, mapper);

		generator.writeKey("file");
		this.file.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRoles}.
	 */
	public static class Builder implements ObjectBuilder<SecurityRoles> {
		private SecurityRolesNative native_;

		private SecurityRolesDls dls;

		private SecurityRolesFile file;

		/**
		 * API name: {@code native}
		 */
		public Builder native_(SecurityRolesNative value) {
			this.native_ = value;
			return this;
		}

		/**
		 * API name: {@code native}
		 */
		public Builder native_(Function<SecurityRolesNative.Builder, ObjectBuilder<SecurityRolesNative>> fn) {
			return this.native_(fn.apply(new SecurityRolesNative.Builder()).build());
		}

		/**
		 * API name: {@code dls}
		 */
		public Builder dls(SecurityRolesDls value) {
			this.dls = value;
			return this;
		}

		/**
		 * API name: {@code dls}
		 */
		public Builder dls(Function<SecurityRolesDls.Builder, ObjectBuilder<SecurityRolesDls>> fn) {
			return this.dls(fn.apply(new SecurityRolesDls.Builder()).build());
		}

		/**
		 * API name: {@code file}
		 */
		public Builder file(SecurityRolesFile value) {
			this.file = value;
			return this;
		}

		/**
		 * API name: {@code file}
		 */
		public Builder file(Function<SecurityRolesFile.Builder, ObjectBuilder<SecurityRolesFile>> fn) {
			return this.file(fn.apply(new SecurityRolesFile.Builder()).build());
		}

		/**
		 * Builds a {@link SecurityRoles}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRoles build() {

			return new SecurityRoles(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SecurityRoles
	 */
	public static final JsonpDeserializer<SecurityRoles> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SecurityRoles::setupSecurityRolesDeserializer);

	protected static void setupSecurityRolesDeserializer(DelegatingDeserializer<SecurityRoles.Builder> op) {

		op.add(Builder::native_, SecurityRolesNative.DESERIALIZER, "native");
		op.add(Builder::dls, SecurityRolesDls.DESERIALIZER, "dls");
		op.add(Builder::file, SecurityRolesFile.DESERIALIZER, "file");

	}

}
