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
import javax.annotation.Nullable;

// typedef: security._types.FieldSecurity
public final class FieldSecurity implements ToJsonp {
	@Nullable
	private final List<String> except;

	private final List<String> grant;

	// ---------------------------------------------------------------------------------------------

	protected FieldSecurity(Builder builder) {

		this.except = builder.except;
		this.grant = Objects.requireNonNull(builder.grant, "grant");

	}

	/**
	 * API name: {@code except}
	 */
	@Nullable
	public List<String> except() {
		return this.except;
	}

	/**
	 * API name: {@code grant}
	 */
	public List<String> grant() {
		return this.grant;
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

		if (this.except != null) {

			generator.writeKey("except");
			generator.writeStartArray();
			for (String item0 : this.except) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("grant");
		generator.writeStartArray();
		for (String item0 : this.grant) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldSecurity}.
	 */
	public static class Builder implements ObjectBuilder<FieldSecurity> {
		@Nullable
		private List<String> except;

		private List<String> grant;

		/**
		 * API name: {@code except}
		 */
		public Builder except(@Nullable List<String> value) {
			this.except = value;
			return this;
		}

		/**
		 * API name: {@code except}
		 */
		public Builder except(String... value) {
			this.except = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #except(List)}, creating the list if needed.
		 */
		public Builder addExcept(String value) {
			if (this.except == null) {
				this.except = new ArrayList<>();
			}
			this.except.add(value);
			return this;
		}

		/**
		 * API name: {@code grant}
		 */
		public Builder grant(List<String> value) {
			this.grant = value;
			return this;
		}

		/**
		 * API name: {@code grant}
		 */
		public Builder grant(String... value) {
			this.grant = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #grant(List)}, creating the list if needed.
		 */
		public Builder addGrant(String value) {
			if (this.grant == null) {
				this.grant = new ArrayList<>();
			}
			this.grant.add(value);
			return this;
		}

		/**
		 * Builds a {@link FieldSecurity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldSecurity build() {

			return new FieldSecurity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldSecurity
	 */
	public static final JsonpDeserializer<FieldSecurity> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FieldSecurity::setupFieldSecurityDeserializer);

	protected static void setupFieldSecurityDeserializer(DelegatingDeserializer<FieldSecurity.Builder> op) {

		op.add(Builder::except, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "except");
		op.add(Builder::grant, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "grant");

	}

}
