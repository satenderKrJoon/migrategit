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
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.RoleMapping
public final class RoleMapping implements ToJsonp {
	private final Number enabled;

	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected RoleMapping(Builder builder) {

		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");
		this.size = Objects.requireNonNull(builder.size, "size");

	}

	/**
	 * API name: {@code enabled}
	 */
	public Number enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code size}
	 */
	public Number size() {
		return this.size;
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

		generator.writeKey("enabled");
		generator.write(this.enabled.doubleValue());

		generator.writeKey("size");
		generator.write(this.size.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleMapping}.
	 */
	public static class Builder implements ObjectBuilder<RoleMapping> {
		private Number enabled;

		private Number size;

		/**
		 * API name: {@code enabled}
		 */
		public Builder enabled(Number value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link RoleMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleMapping build() {

			return new RoleMapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RoleMapping
	 */
	public static final JsonpDeserializer<RoleMapping> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RoleMapping::setupRoleMappingDeserializer);

	protected static void setupRoleMappingDeserializer(DelegatingDeserializer<RoleMapping.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.numberDeserializer(), "enabled");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");

	}

}
