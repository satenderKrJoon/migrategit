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

package co.elastic.clients.elasticsearch.graph;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: graph._types.VertexInclude
public final class VertexInclude implements ToJsonp {
	private final Number boost;

	private final String term;

	// ---------------------------------------------------------------------------------------------

	protected VertexInclude(Builder builder) {

		this.boost = Objects.requireNonNull(builder.boost, "boost");
		this.term = Objects.requireNonNull(builder.term, "term");

	}

	/**
	 * API name: {@code boost}
	 */
	public Number boost() {
		return this.boost;
	}

	/**
	 * API name: {@code term}
	 */
	public String term() {
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

		generator.writeKey("boost");
		generator.write(this.boost.doubleValue());

		generator.writeKey("term");
		generator.write(this.term);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VertexInclude}.
	 */
	public static class Builder implements ObjectBuilder<VertexInclude> {
		private Number boost;

		private String term;

		/**
		 * API name: {@code boost}
		 */
		public Builder boost(Number value) {
			this.boost = value;
			return this;
		}

		/**
		 * API name: {@code term}
		 */
		public Builder term(String value) {
			this.term = value;
			return this;
		}

		/**
		 * Builds a {@link VertexInclude}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VertexInclude build() {

			return new VertexInclude(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for VertexInclude
	 */
	public static final JsonpDeserializer<VertexInclude> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, VertexInclude::setupVertexIncludeDeserializer);

	protected static void setupVertexIncludeDeserializer(DelegatingDeserializer<VertexInclude.Builder> op) {

		op.add(Builder::boost, JsonpDeserializer.numberDeserializer(), "boost");
		op.add(Builder::term, JsonpDeserializer.stringDeserializer(), "term");

	}

}
