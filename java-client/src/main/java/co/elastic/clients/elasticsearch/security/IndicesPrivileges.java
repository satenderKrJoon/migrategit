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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.IndicesPrivileges
public final class IndicesPrivileges implements ToJsonp {
	@Nullable
	private final FieldSecurity fieldSecurity;

	private final List<String> names;

	private final List<String> privileges;

	@Nullable
	private final JsonValue query;

	@Nullable
	private final Boolean allowRestrictedIndices;

	// ---------------------------------------------------------------------------------------------

	protected IndicesPrivileges(Builder builder) {

		this.fieldSecurity = builder.fieldSecurity;
		this.names = Objects.requireNonNull(builder.names, "names");
		this.privileges = Objects.requireNonNull(builder.privileges, "privileges");
		this.query = builder.query;
		this.allowRestrictedIndices = builder.allowRestrictedIndices;

	}

	/**
	 * API name: {@code field_security}
	 */
	@Nullable
	public FieldSecurity fieldSecurity() {
		return this.fieldSecurity;
	}

	/**
	 * API name: {@code names}
	 */
	public List<String> names() {
		return this.names;
	}

	/**
	 * API name: {@code privileges}
	 */
	public List<String> privileges() {
		return this.privileges;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public JsonValue query() {
		return this.query;
	}

	/**
	 * API name: {@code allow_restricted_indices}
	 */
	@Nullable
	public Boolean allowRestrictedIndices() {
		return this.allowRestrictedIndices;
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

		if (this.fieldSecurity != null) {

			generator.writeKey("field_security");
			this.fieldSecurity.toJsonp(generator, mapper);

		}

		generator.writeKey("names");
		generator.writeStartArray();
		for (String item0 : this.names) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("privileges");
		generator.writeStartArray();
		for (String item0 : this.privileges) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.query != null) {

			generator.writeKey("query");
			generator.write(this.query);

		}
		if (this.allowRestrictedIndices != null) {

			generator.writeKey("allow_restricted_indices");
			generator.write(this.allowRestrictedIndices);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesPrivileges}.
	 */
	public static class Builder implements ObjectBuilder<IndicesPrivileges> {
		@Nullable
		private FieldSecurity fieldSecurity;

		private List<String> names;

		private List<String> privileges;

		@Nullable
		private JsonValue query;

		@Nullable
		private Boolean allowRestrictedIndices;

		/**
		 * API name: {@code field_security}
		 */
		public Builder fieldSecurity(@Nullable FieldSecurity value) {
			this.fieldSecurity = value;
			return this;
		}

		/**
		 * API name: {@code field_security}
		 */
		public Builder fieldSecurity(Function<FieldSecurity.Builder, ObjectBuilder<FieldSecurity>> fn) {
			return this.fieldSecurity(fn.apply(new FieldSecurity.Builder()).build());
		}

		/**
		 * API name: {@code names}
		 */
		public Builder names(List<String> value) {
			this.names = value;
			return this;
		}

		/**
		 * API name: {@code names}
		 */
		public Builder names(String... value) {
			this.names = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #names(List)}, creating the list if needed.
		 */
		public Builder addNames(String value) {
			if (this.names == null) {
				this.names = new ArrayList<>();
			}
			this.names.add(value);
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
		 * API name: {@code query}
		 */
		public Builder query(@Nullable JsonValue value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code allow_restricted_indices}
		 */
		public Builder allowRestrictedIndices(@Nullable Boolean value) {
			this.allowRestrictedIndices = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesPrivileges build() {

			return new IndicesPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndicesPrivileges
	 */
	public static final JsonpDeserializer<IndicesPrivileges> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndicesPrivileges::setupIndicesPrivilegesDeserializer);

	protected static void setupIndicesPrivilegesDeserializer(DelegatingDeserializer<IndicesPrivileges.Builder> op) {

		op.add(Builder::fieldSecurity, FieldSecurity.DESERIALIZER, "field_security");
		op.add(Builder::names, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "names");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"privileges");
		op.add(Builder::query, JsonpDeserializer.jsonValueDeserializer(), "query");
		op.add(Builder::allowRestrictedIndices, JsonpDeserializer.booleanDeserializer(), "allow_restricted_indices");

	}

}
