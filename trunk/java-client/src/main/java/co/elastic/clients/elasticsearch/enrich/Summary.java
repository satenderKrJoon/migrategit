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

package co.elastic.clients.elasticsearch.enrich;

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

// typedef: enrich._types.Summary
public final class Summary implements ToJsonp {
	private final Configuration config;

	// ---------------------------------------------------------------------------------------------

	protected Summary(Builder builder) {

		this.config = Objects.requireNonNull(builder.config, "config");

	}

	/**
	 * API name: {@code config}
	 */
	public Configuration config() {
		return this.config;
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

		generator.writeKey("config");
		this.config.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Summary}.
	 */
	public static class Builder implements ObjectBuilder<Summary> {
		private Configuration config;

		/**
		 * API name: {@code config}
		 */
		public Builder config(Configuration value) {
			this.config = value;
			return this;
		}

		/**
		 * API name: {@code config}
		 */
		public Builder config(Function<Configuration.Builder, ObjectBuilder<Configuration>> fn) {
			return this.config(fn.apply(new Configuration.Builder()).build());
		}

		/**
		 * Builds a {@link Summary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Summary build() {

			return new Summary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Summary
	 */
	public static final JsonpDeserializer<Summary> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Summary::setupSummaryDeserializer);

	protected static void setupSummaryDeserializer(DelegatingDeserializer<Summary.Builder> op) {

		op.add(Builder::config, Configuration.DESERIALIZER, "config");

	}

}
