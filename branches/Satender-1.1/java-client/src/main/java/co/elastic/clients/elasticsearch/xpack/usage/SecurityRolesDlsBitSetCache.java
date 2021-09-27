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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.SecurityRolesDlsBitSetCache
public final class SecurityRolesDlsBitSetCache implements ToJsonp {
	private final Number count;

	@Nullable
	private final JsonValue memory;

	private final Number memoryInBytes;

	// ---------------------------------------------------------------------------------------------

	protected SecurityRolesDlsBitSetCache(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.memory = builder.memory;
		this.memoryInBytes = Objects.requireNonNull(builder.memoryInBytes, "memory_in_bytes");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code memory}
	 */
	@Nullable
	public JsonValue memory() {
		return this.memory;
	}

	/**
	 * API name: {@code memory_in_bytes}
	 */
	public Number memoryInBytes() {
		return this.memoryInBytes;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		if (this.memory != null) {

			generator.writeKey("memory");
			generator.write(this.memory);

		}

		generator.writeKey("memory_in_bytes");
		generator.write(this.memoryInBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRolesDlsBitSetCache}.
	 */
	public static class Builder implements ObjectBuilder<SecurityRolesDlsBitSetCache> {
		private Number count;

		@Nullable
		private JsonValue memory;

		private Number memoryInBytes;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code memory}
		 */
		public Builder memory(@Nullable JsonValue value) {
			this.memory = value;
			return this;
		}

		/**
		 * API name: {@code memory_in_bytes}
		 */
		public Builder memoryInBytes(Number value) {
			this.memoryInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link SecurityRolesDlsBitSetCache}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRolesDlsBitSetCache build() {

			return new SecurityRolesDlsBitSetCache(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SecurityRolesDlsBitSetCache
	 */
	public static final JsonpDeserializer<SecurityRolesDlsBitSetCache> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SecurityRolesDlsBitSetCache::setupSecurityRolesDlsBitSetCacheDeserializer);

	protected static void setupSecurityRolesDlsBitSetCacheDeserializer(
			DelegatingDeserializer<SecurityRolesDlsBitSetCache.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::memory, JsonpDeserializer.jsonValueDeserializer(), "memory");
		op.add(Builder::memoryInBytes, JsonpDeserializer.numberDeserializer(), "memory_in_bytes");

	}

}
