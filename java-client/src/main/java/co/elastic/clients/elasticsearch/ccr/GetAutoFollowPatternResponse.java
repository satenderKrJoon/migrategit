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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.elasticsearch.ccr.get_auto_follow_pattern.AutoFollowPattern;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.get_auto_follow_pattern.Response
public final class GetAutoFollowPatternResponse implements ToJsonp {
	private final List<AutoFollowPattern> patterns;

	// ---------------------------------------------------------------------------------------------

	protected GetAutoFollowPatternResponse(Builder builder) {

		this.patterns = Objects.requireNonNull(builder.patterns, "patterns");

	}

	/**
	 * API name: {@code patterns}
	 */
	public List<AutoFollowPattern> patterns() {
		return this.patterns;
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

		generator.writeKey("patterns");
		generator.writeStartArray();
		for (AutoFollowPattern item0 : this.patterns) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetAutoFollowPatternResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetAutoFollowPatternResponse> {
		private List<AutoFollowPattern> patterns;

		/**
		 * API name: {@code patterns}
		 */
		public Builder patterns(List<AutoFollowPattern> value) {
			this.patterns = value;
			return this;
		}

		/**
		 * API name: {@code patterns}
		 */
		public Builder patterns(AutoFollowPattern... value) {
			this.patterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #patterns(List)}, creating the list if needed.
		 */
		public Builder addPatterns(AutoFollowPattern value) {
			if (this.patterns == null) {
				this.patterns = new ArrayList<>();
			}
			this.patterns.add(value);
			return this;
		}

		/**
		 * Set {@link #patterns(List)} to a singleton list.
		 */
		public Builder patterns(Function<AutoFollowPattern.Builder, ObjectBuilder<AutoFollowPattern>> fn) {
			return this.patterns(fn.apply(new AutoFollowPattern.Builder()).build());
		}

		/**
		 * Add a value to {@link #patterns(List)}, creating the list if needed.
		 */
		public Builder addPatterns(Function<AutoFollowPattern.Builder, ObjectBuilder<AutoFollowPattern>> fn) {
			return this.addPatterns(fn.apply(new AutoFollowPattern.Builder()).build());
		}

		/**
		 * Builds a {@link GetAutoFollowPatternResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetAutoFollowPatternResponse build() {

			return new GetAutoFollowPatternResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetAutoFollowPatternResponse
	 */
	public static final JsonpDeserializer<GetAutoFollowPatternResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetAutoFollowPatternResponse::setupGetAutoFollowPatternResponseDeserializer);

	protected static void setupGetAutoFollowPatternResponseDeserializer(
			DelegatingDeserializer<GetAutoFollowPatternResponse.Builder> op) {

		op.add(Builder::patterns, JsonpDeserializer.arrayDeserializer(AutoFollowPattern.DESERIALIZER), "patterns");

	}

}
