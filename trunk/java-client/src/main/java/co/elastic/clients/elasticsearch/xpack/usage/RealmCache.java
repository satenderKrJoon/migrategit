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

// typedef: xpack.usage.RealmCache
public final class RealmCache implements ToJsonp {
	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected RealmCache(Builder builder) {

		this.size = Objects.requireNonNull(builder.size, "size");

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

		generator.writeKey("size");
		generator.write(this.size.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RealmCache}.
	 */
	public static class Builder implements ObjectBuilder<RealmCache> {
		private Number size;

		/**
		 * API name: {@code size}
		 */
		public Builder size(Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link RealmCache}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RealmCache build() {

			return new RealmCache(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RealmCache
	 */
	public static final JsonpDeserializer<RealmCache> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RealmCache::setupRealmCacheDeserializer);

	protected static void setupRealmCacheDeserializer(DelegatingDeserializer<RealmCache.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");

	}

}
