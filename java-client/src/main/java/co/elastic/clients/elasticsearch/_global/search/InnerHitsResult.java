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

package co.elastic.clients.elasticsearch._global.search;

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

// typedef: _global.search._types.InnerHitsResult
public final class InnerHitsResult implements ToJsonp {
	private final InnerHitsMetadata hits;

	// ---------------------------------------------------------------------------------------------

	protected InnerHitsResult(Builder builder) {

		this.hits = Objects.requireNonNull(builder.hits, "hits");

	}

	/**
	 * API name: {@code hits}
	 */
	public InnerHitsMetadata hits() {
		return this.hits;
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

		generator.writeKey("hits");
		this.hits.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InnerHitsResult}.
	 */
	public static class Builder implements ObjectBuilder<InnerHitsResult> {
		private InnerHitsMetadata hits;

		/**
		 * API name: {@code hits}
		 */
		public Builder hits(InnerHitsMetadata value) {
			this.hits = value;
			return this;
		}

		/**
		 * API name: {@code hits}
		 */
		public Builder hits(Function<InnerHitsMetadata.Builder, ObjectBuilder<InnerHitsMetadata>> fn) {
			return this.hits(fn.apply(new InnerHitsMetadata.Builder()).build());
		}

		/**
		 * Builds a {@link InnerHitsResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InnerHitsResult build() {

			return new InnerHitsResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for InnerHitsResult
	 */
	public static final JsonpDeserializer<InnerHitsResult> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InnerHitsResult::setupInnerHitsResultDeserializer);

	protected static void setupInnerHitsResultDeserializer(DelegatingDeserializer<InnerHitsResult.Builder> op) {

		op.add(Builder::hits, InnerHitsMetadata.DESERIALIZER, "hits");

	}

}
