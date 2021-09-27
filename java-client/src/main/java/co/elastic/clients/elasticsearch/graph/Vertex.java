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

// typedef: graph._types.Vertex
public final class Vertex implements ToJsonp {
	private final Number depth;

	private final String field;

	private final String term;

	private final Number weight;

	// ---------------------------------------------------------------------------------------------

	protected Vertex(Builder builder) {

		this.depth = Objects.requireNonNull(builder.depth, "depth");
		this.field = Objects.requireNonNull(builder.field, "field");
		this.term = Objects.requireNonNull(builder.term, "term");
		this.weight = Objects.requireNonNull(builder.weight, "weight");

	}

	/**
	 * API name: {@code depth}
	 */
	public Number depth() {
		return this.depth;
	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code term}
	 */
	public String term() {
		return this.term;
	}

	/**
	 * API name: {@code weight}
	 */
	public Number weight() {
		return this.weight;
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

		generator.writeKey("depth");
		generator.write(this.depth.doubleValue());

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("term");
		generator.write(this.term);

		generator.writeKey("weight");
		generator.write(this.weight.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Vertex}.
	 */
	public static class Builder implements ObjectBuilder<Vertex> {
		private Number depth;

		private String field;

		private String term;

		private Number weight;

		/**
		 * API name: {@code depth}
		 */
		public Builder depth(Number value) {
			this.depth = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
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
		 * API name: {@code weight}
		 */
		public Builder weight(Number value) {
			this.weight = value;
			return this;
		}

		/**
		 * Builds a {@link Vertex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Vertex build() {

			return new Vertex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Vertex
	 */
	public static final JsonpDeserializer<Vertex> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Vertex::setupVertexDeserializer);

	protected static void setupVertexDeserializer(DelegatingDeserializer<Vertex.Builder> op) {

		op.add(Builder::depth, JsonpDeserializer.numberDeserializer(), "depth");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::term, JsonpDeserializer.stringDeserializer(), "term");
		op.add(Builder::weight, JsonpDeserializer.numberDeserializer(), "weight");

	}

}
