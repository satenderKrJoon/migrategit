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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.IndicesOptions
public final class IndicesOptions implements ToJsonp {
	private final Boolean allowNoIndices;

	private final JsonValue expandWildcards;

	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean ignoreThrottled;

	// ---------------------------------------------------------------------------------------------

	protected IndicesOptions(Builder builder) {

		this.allowNoIndices = Objects.requireNonNull(builder.allowNoIndices, "allow_no_indices");
		this.expandWildcards = Objects.requireNonNull(builder.expandWildcards, "expand_wildcards");
		this.ignoreUnavailable = Objects.requireNonNull(builder.ignoreUnavailable, "ignore_unavailable");
		this.ignoreThrottled = builder.ignoreThrottled;

	}

	/**
	 * API name: {@code allow_no_indices}
	 */
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public Boolean ignoreThrottled() {
		return this.ignoreThrottled;
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

		generator.writeKey("allow_no_indices");
		generator.write(this.allowNoIndices);

		generator.writeKey("expand_wildcards");
		generator.write(this.expandWildcards);

		generator.writeKey("ignore_unavailable");
		generator.write(this.ignoreUnavailable);

		if (this.ignoreThrottled != null) {

			generator.writeKey("ignore_throttled");
			generator.write(this.ignoreThrottled);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesOptions}.
	 */
	public static class Builder implements ObjectBuilder<IndicesOptions> {
		private Boolean allowNoIndices;

		private JsonValue expandWildcards;

		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean ignoreThrottled;

		/**
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code ignore_throttled}
		 */
		public Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesOptions build() {

			return new IndicesOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndicesOptions
	 */
	public static final JsonpDeserializer<IndicesOptions> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndicesOptions::setupIndicesOptionsDeserializer);

	protected static void setupIndicesOptionsDeserializer(DelegatingDeserializer<IndicesOptions.Builder> op) {

		op.add(Builder::allowNoIndices, JsonpDeserializer.booleanDeserializer(), "allow_no_indices");
		op.add(Builder::expandWildcards, JsonpDeserializer.jsonValueDeserializer(), "expand_wildcards");
		op.add(Builder::ignoreUnavailable, JsonpDeserializer.booleanDeserializer(), "ignore_unavailable");
		op.add(Builder::ignoreThrottled, JsonpDeserializer.booleanDeserializer(), "ignore_throttled");

	}

}
