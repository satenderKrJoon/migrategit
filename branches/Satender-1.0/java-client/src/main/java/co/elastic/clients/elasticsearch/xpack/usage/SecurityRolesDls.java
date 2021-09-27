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

// typedef: xpack.usage.SecurityRolesDls
public final class SecurityRolesDls implements ToJsonp {
	private final SecurityRolesDlsBitSetCache bitSetCache;

	// ---------------------------------------------------------------------------------------------

	protected SecurityRolesDls(Builder builder) {

		this.bitSetCache = Objects.requireNonNull(builder.bitSetCache, "bit_set_cache");

	}

	/**
	 * API name: {@code bit_set_cache}
	 */
	public SecurityRolesDlsBitSetCache bitSetCache() {
		return this.bitSetCache;
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

		generator.writeKey("bit_set_cache");
		this.bitSetCache.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRolesDls}.
	 */
	public static class Builder implements ObjectBuilder<SecurityRolesDls> {
		private SecurityRolesDlsBitSetCache bitSetCache;

		/**
		 * API name: {@code bit_set_cache}
		 */
		public Builder bitSetCache(SecurityRolesDlsBitSetCache value) {
			this.bitSetCache = value;
			return this;
		}

		/**
		 * API name: {@code bit_set_cache}
		 */
		public Builder bitSetCache(
				Function<SecurityRolesDlsBitSetCache.Builder, ObjectBuilder<SecurityRolesDlsBitSetCache>> fn) {
			return this.bitSetCache(fn.apply(new SecurityRolesDlsBitSetCache.Builder()).build());
		}

		/**
		 * Builds a {@link SecurityRolesDls}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRolesDls build() {

			return new SecurityRolesDls(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SecurityRolesDls
	 */
	public static final JsonpDeserializer<SecurityRolesDls> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SecurityRolesDls::setupSecurityRolesDlsDeserializer);

	protected static void setupSecurityRolesDlsDeserializer(DelegatingDeserializer<SecurityRolesDls.Builder> op) {

		op.add(Builder::bitSetCache, SecurityRolesDlsBitSetCache.DESERIALIZER, "bit_set_cache");

	}

}
