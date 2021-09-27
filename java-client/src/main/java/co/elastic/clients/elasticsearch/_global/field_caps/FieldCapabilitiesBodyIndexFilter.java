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

package co.elastic.clients.elasticsearch._global.field_caps;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.field_caps.FieldCapabilitiesBodyIndexFilter
public final class FieldCapabilitiesBodyIndexFilter implements ToJsonp {
	@Nullable
	private final FieldCapabilitiesBodyIndexFilterRange range;

	@Nullable
	private final JsonValue matchNone;

	@Nullable
	private final FieldCapabilitiesBodyIndexFilterTerm term;

	// ---------------------------------------------------------------------------------------------

	protected FieldCapabilitiesBodyIndexFilter(Builder builder) {

		this.range = builder.range;
		this.matchNone = builder.matchNone;
		this.term = builder.term;

	}

	/**
	 * API name: {@code range}
	 */
	@Nullable
	public FieldCapabilitiesBodyIndexFilterRange range() {
		return this.range;
	}

	/**
	 * API name: {@code match_none}
	 */
	@Nullable
	public JsonValue matchNone() {
		return this.matchNone;
	}

	/**
	 * API name: {@code term}
	 */
	@Nullable
	public FieldCapabilitiesBodyIndexFilterTerm term() {
		return this.term;
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

		if (this.range != null) {

			generator.writeKey("range");
			this.range.toJsonp(generator, mapper);

		}
		if (this.matchNone != null) {

			generator.writeKey("match_none");
			generator.write(this.matchNone);

		}
		if (this.term != null) {

			generator.writeKey("term");
			this.term.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapabilitiesBodyIndexFilter}.
	 */
	public static class Builder implements ObjectBuilder<FieldCapabilitiesBodyIndexFilter> {
		@Nullable
		private FieldCapabilitiesBodyIndexFilterRange range;

		@Nullable
		private JsonValue matchNone;

		@Nullable
		private FieldCapabilitiesBodyIndexFilterTerm term;

		/**
		 * API name: {@code range}
		 */
		public Builder range(@Nullable FieldCapabilitiesBodyIndexFilterRange value) {
			this.range = value;
			return this;
		}

		/**
		 * API name: {@code range}
		 */
		public Builder range(
				Function<FieldCapabilitiesBodyIndexFilterRange.Builder, ObjectBuilder<FieldCapabilitiesBodyIndexFilterRange>> fn) {
			return this.range(fn.apply(new FieldCapabilitiesBodyIndexFilterRange.Builder()).build());
		}

		/**
		 * API name: {@code match_none}
		 */
		public Builder matchNone(@Nullable JsonValue value) {
			this.matchNone = value;
			return this;
		}

		/**
		 * API name: {@code term}
		 */
		public Builder term(@Nullable FieldCapabilitiesBodyIndexFilterTerm value) {
			this.term = value;
			return this;
		}

		/**
		 * API name: {@code term}
		 */
		public Builder term(
				Function<FieldCapabilitiesBodyIndexFilterTerm.Builder, ObjectBuilder<FieldCapabilitiesBodyIndexFilterTerm>> fn) {
			return this.term(fn.apply(new FieldCapabilitiesBodyIndexFilterTerm.Builder()).build());
		}

		/**
		 * Builds a {@link FieldCapabilitiesBodyIndexFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldCapabilitiesBodyIndexFilter build() {

			return new FieldCapabilitiesBodyIndexFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldCapabilitiesBodyIndexFilter
	 */
	public static final JsonpDeserializer<FieldCapabilitiesBodyIndexFilter> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					FieldCapabilitiesBodyIndexFilter::setupFieldCapabilitiesBodyIndexFilterDeserializer);

	protected static void setupFieldCapabilitiesBodyIndexFilterDeserializer(
			DelegatingDeserializer<FieldCapabilitiesBodyIndexFilter.Builder> op) {

		op.add(Builder::range, FieldCapabilitiesBodyIndexFilterRange.DESERIALIZER, "range");
		op.add(Builder::matchNone, JsonpDeserializer.jsonValueDeserializer(), "match_none");
		op.add(Builder::term, FieldCapabilitiesBodyIndexFilterTerm.DESERIALIZER, "term");

	}

}
