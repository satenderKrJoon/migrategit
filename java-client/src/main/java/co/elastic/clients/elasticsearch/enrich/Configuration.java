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

// typedef: enrich._types.Configuration
public final class Configuration implements ToJsonp {
	@Nullable
	private final Policy geoMatch;

	private final Policy match;

	// ---------------------------------------------------------------------------------------------

	protected Configuration(Builder builder) {

		this.geoMatch = builder.geoMatch;
		this.match = Objects.requireNonNull(builder.match, "match");

	}

	/**
	 * API name: {@code geo_match}
	 */
	@Nullable
	public Policy geoMatch() {
		return this.geoMatch;
	}

	/**
	 * API name: {@code match}
	 */
	public Policy match() {
		return this.match;
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

		if (this.geoMatch != null) {

			generator.writeKey("geo_match");
			this.geoMatch.toJsonp(generator, mapper);

		}

		generator.writeKey("match");
		this.match.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Configuration}.
	 */
	public static class Builder implements ObjectBuilder<Configuration> {
		@Nullable
		private Policy geoMatch;

		private Policy match;

		/**
		 * API name: {@code geo_match}
		 */
		public Builder geoMatch(@Nullable Policy value) {
			this.geoMatch = value;
			return this;
		}

		/**
		 * API name: {@code geo_match}
		 */
		public Builder geoMatch(Function<Policy.Builder, ObjectBuilder<Policy>> fn) {
			return this.geoMatch(fn.apply(new Policy.Builder()).build());
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(Policy value) {
			this.match = value;
			return this;
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(Function<Policy.Builder, ObjectBuilder<Policy>> fn) {
			return this.match(fn.apply(new Policy.Builder()).build());
		}

		/**
		 * Builds a {@link Configuration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Configuration build() {

			return new Configuration(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Configuration
	 */
	public static final JsonpDeserializer<Configuration> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Configuration::setupConfigurationDeserializer);

	protected static void setupConfigurationDeserializer(DelegatingDeserializer<Configuration.Builder> op) {

		op.add(Builder::geoMatch, Policy.DESERIALIZER, "geo_match");
		op.add(Builder::match, Policy.DESERIALIZER, "match");

	}

}
