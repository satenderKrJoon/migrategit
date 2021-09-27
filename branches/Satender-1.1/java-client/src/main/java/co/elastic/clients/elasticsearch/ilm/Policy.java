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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm._types.Policy
public final class Policy implements ToJsonp {
	private final Phases phases;

	@Nullable
	private final String name;

	// ---------------------------------------------------------------------------------------------

	protected Policy(Builder builder) {

		this.phases = Objects.requireNonNull(builder.phases, "phases");
		this.name = builder.name;

	}

	/**
	 * API name: {@code phases}
	 */
	public Phases phases() {
		return this.phases;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
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

		generator.writeKey("phases");
		this.phases.toJsonp(generator, mapper);

		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Policy}.
	 */
	public static class Builder implements ObjectBuilder<Policy> {
		private Phases phases;

		@Nullable
		private String name;

		/**
		 * API name: {@code phases}
		 */
		public Builder phases(Phases value) {
			this.phases = value;
			return this;
		}

		/**
		 * API name: {@code phases}
		 */
		public Builder phases(Function<Phases.Builder, ObjectBuilder<Phases>> fn) {
			return this.phases(fn.apply(new Phases.Builder()).build());
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link Policy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Policy build() {

			return new Policy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Policy
	 */
	public static final JsonpDeserializer<Policy> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Policy::setupPolicyDeserializer);

	protected static void setupPolicyDeserializer(DelegatingDeserializer<Policy.Builder> op) {

		op.add(Builder::phases, Phases.DESERIALIZER, "phases");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
