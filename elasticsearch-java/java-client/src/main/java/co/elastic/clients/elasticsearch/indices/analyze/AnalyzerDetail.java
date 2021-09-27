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

package co.elastic.clients.elasticsearch.indices.analyze;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.AnalyzerDetail
public final class AnalyzerDetail implements ToJsonp {
	private final String name;

	private final List<ExplainAnalyzeToken> tokens;

	// ---------------------------------------------------------------------------------------------

	protected AnalyzerDetail(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.tokens = Objects.requireNonNull(builder.tokens, "tokens");

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code tokens}
	 */
	public List<ExplainAnalyzeToken> tokens() {
		return this.tokens;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("tokens");
		generator.writeStartArray();
		for (ExplainAnalyzeToken item0 : this.tokens) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalyzerDetail}.
	 */
	public static class Builder implements ObjectBuilder<AnalyzerDetail> {
		private String name;

		private List<ExplainAnalyzeToken> tokens;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		public Builder tokens(List<ExplainAnalyzeToken> value) {
			this.tokens = value;
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		public Builder tokens(ExplainAnalyzeToken... value) {
			this.tokens = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tokens(List)}, creating the list if needed.
		 */
		public Builder addTokens(ExplainAnalyzeToken value) {
			if (this.tokens == null) {
				this.tokens = new ArrayList<>();
			}
			this.tokens.add(value);
			return this;
		}

		/**
		 * Set {@link #tokens(List)} to a singleton list.
		 */
		public Builder tokens(Function<ExplainAnalyzeToken.Builder, ObjectBuilder<ExplainAnalyzeToken>> fn) {
			return this.tokens(fn.apply(new ExplainAnalyzeToken.Builder()).build());
		}

		/**
		 * Add a value to {@link #tokens(List)}, creating the list if needed.
		 */
		public Builder addTokens(Function<ExplainAnalyzeToken.Builder, ObjectBuilder<ExplainAnalyzeToken>> fn) {
			return this.addTokens(fn.apply(new ExplainAnalyzeToken.Builder()).build());
		}

		/**
		 * Builds a {@link AnalyzerDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyzerDetail build() {

			return new AnalyzerDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AnalyzerDetail
	 */
	public static final JsonpDeserializer<AnalyzerDetail> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AnalyzerDetail::setupAnalyzerDetailDeserializer);

	protected static void setupAnalyzerDetailDeserializer(DelegatingDeserializer<AnalyzerDetail.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::tokens, JsonpDeserializer.arrayDeserializer(ExplainAnalyzeToken.DESERIALIZER), "tokens");

	}

}
