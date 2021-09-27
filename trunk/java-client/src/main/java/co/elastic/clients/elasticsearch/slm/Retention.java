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

package co.elastic.clients.elasticsearch.slm;

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

// typedef: slm._types.Retention
public final class Retention implements ToJsonp {
	private final JsonValue expireAfter;

	private final Number maxCount;

	private final Number minCount;

	// ---------------------------------------------------------------------------------------------

	protected Retention(Builder builder) {

		this.expireAfter = Objects.requireNonNull(builder.expireAfter, "expire_after");
		this.maxCount = Objects.requireNonNull(builder.maxCount, "max_count");
		this.minCount = Objects.requireNonNull(builder.minCount, "min_count");

	}

	/**
	 * API name: {@code expire_after}
	 */
	public JsonValue expireAfter() {
		return this.expireAfter;
	}

	/**
	 * API name: {@code max_count}
	 */
	public Number maxCount() {
		return this.maxCount;
	}

	/**
	 * API name: {@code min_count}
	 */
	public Number minCount() {
		return this.minCount;
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

		generator.writeKey("expire_after");
		generator.write(this.expireAfter);

		generator.writeKey("max_count");
		generator.write(this.maxCount.doubleValue());

		generator.writeKey("min_count");
		generator.write(this.minCount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Retention}.
	 */
	public static class Builder implements ObjectBuilder<Retention> {
		private JsonValue expireAfter;

		private Number maxCount;

		private Number minCount;

		/**
		 * API name: {@code expire_after}
		 */
		public Builder expireAfter(JsonValue value) {
			this.expireAfter = value;
			return this;
		}

		/**
		 * API name: {@code max_count}
		 */
		public Builder maxCount(Number value) {
			this.maxCount = value;
			return this;
		}

		/**
		 * API name: {@code min_count}
		 */
		public Builder minCount(Number value) {
			this.minCount = value;
			return this;
		}

		/**
		 * Builds a {@link Retention}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Retention build() {

			return new Retention(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Retention
	 */
	public static final JsonpDeserializer<Retention> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Retention::setupRetentionDeserializer);

	protected static void setupRetentionDeserializer(DelegatingDeserializer<Retention.Builder> op) {

		op.add(Builder::expireAfter, JsonpDeserializer.jsonValueDeserializer(), "expire_after");
		op.add(Builder::maxCount, JsonpDeserializer.numberDeserializer(), "max_count");
		op.add(Builder::minCount, JsonpDeserializer.numberDeserializer(), "min_count");

	}

}
