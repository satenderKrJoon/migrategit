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

package co.elastic.clients.elasticsearch.ilm.get_lifecycle;

import co.elastic.clients.elasticsearch.ilm.Policy;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.get_lifecycle.Lifecycle
public final class Lifecycle implements ToJsonp {
	private final String modifiedDate;

	private final Policy policy;

	private final Number version;

	// ---------------------------------------------------------------------------------------------

	protected Lifecycle(Builder builder) {

		this.modifiedDate = Objects.requireNonNull(builder.modifiedDate, "modified_date");
		this.policy = Objects.requireNonNull(builder.policy, "policy");
		this.version = Objects.requireNonNull(builder.version, "version");

	}

	/**
	 * API name: {@code modified_date}
	 */
	public String modifiedDate() {
		return this.modifiedDate;
	}

	/**
	 * API name: {@code policy}
	 */
	public Policy policy() {
		return this.policy;
	}

	/**
	 * API name: {@code version}
	 */
	public Number version() {
		return this.version;
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

		generator.writeKey("modified_date");
		generator.write(this.modifiedDate);

		generator.writeKey("policy");
		this.policy.toJsonp(generator, mapper);

		generator.writeKey("version");
		generator.write(this.version.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Lifecycle}.
	 */
	public static class Builder implements ObjectBuilder<Lifecycle> {
		private String modifiedDate;

		private Policy policy;

		private Number version;

		/**
		 * API name: {@code modified_date}
		 */
		public Builder modifiedDate(String value) {
			this.modifiedDate = value;
			return this;
		}

		/**
		 * API name: {@code policy}
		 */
		public Builder policy(Policy value) {
			this.policy = value;
			return this;
		}

		/**
		 * API name: {@code policy}
		 */
		public Builder policy(Function<Policy.Builder, ObjectBuilder<Policy>> fn) {
			return this.policy(fn.apply(new Policy.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(Number value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link Lifecycle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Lifecycle build() {

			return new Lifecycle(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Lifecycle
	 */
	public static final JsonpDeserializer<Lifecycle> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Lifecycle::setupLifecycleDeserializer);

	protected static void setupLifecycleDeserializer(DelegatingDeserializer<Lifecycle.Builder> op) {

		op.add(Builder::modifiedDate, JsonpDeserializer.stringDeserializer(), "modified_date");
		op.add(Builder::policy, Policy.DESERIALIZER, "policy");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");

	}

}
