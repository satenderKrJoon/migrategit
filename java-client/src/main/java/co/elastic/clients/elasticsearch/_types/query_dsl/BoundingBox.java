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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.BoundingBox
public final class BoundingBox implements ToJsonp {
	@Nullable
	private final JsonValue bottomRight;

	@Nullable
	private final JsonValue topLeft;

	@Nullable
	private final String wkt;

	// ---------------------------------------------------------------------------------------------

	protected BoundingBox(Builder builder) {

		this.bottomRight = builder.bottomRight;
		this.topLeft = builder.topLeft;
		this.wkt = builder.wkt;

	}

	/**
	 * API name: {@code bottom_right}
	 */
	@Nullable
	public JsonValue bottomRight() {
		return this.bottomRight;
	}

	/**
	 * API name: {@code top_left}
	 */
	@Nullable
	public JsonValue topLeft() {
		return this.topLeft;
	}

	/**
	 * API name: {@code wkt}
	 */
	@Nullable
	public String wkt() {
		return this.wkt;
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

		if (this.bottomRight != null) {

			generator.writeKey("bottom_right");
			generator.write(this.bottomRight);

		}
		if (this.topLeft != null) {

			generator.writeKey("top_left");
			generator.write(this.topLeft);

		}
		if (this.wkt != null) {

			generator.writeKey("wkt");
			generator.write(this.wkt);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BoundingBox}.
	 */
	public static class Builder implements ObjectBuilder<BoundingBox> {
		@Nullable
		private JsonValue bottomRight;

		@Nullable
		private JsonValue topLeft;

		@Nullable
		private String wkt;

		/**
		 * API name: {@code bottom_right}
		 */
		public Builder bottomRight(@Nullable JsonValue value) {
			this.bottomRight = value;
			return this;
		}

		/**
		 * API name: {@code top_left}
		 */
		public Builder topLeft(@Nullable JsonValue value) {
			this.topLeft = value;
			return this;
		}

		/**
		 * API name: {@code wkt}
		 */
		public Builder wkt(@Nullable String value) {
			this.wkt = value;
			return this;
		}

		/**
		 * Builds a {@link BoundingBox}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BoundingBox build() {

			return new BoundingBox(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for BoundingBox
	 */
	public static final JsonpDeserializer<BoundingBox> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, BoundingBox::setupBoundingBoxDeserializer);

	protected static void setupBoundingBoxDeserializer(DelegatingDeserializer<BoundingBox.Builder> op) {

		op.add(Builder::bottomRight, JsonpDeserializer.jsonValueDeserializer(), "bottom_right");
		op.add(Builder::topLeft, JsonpDeserializer.jsonValueDeserializer(), "top_left");
		op.add(Builder::wkt, JsonpDeserializer.stringDeserializer(), "wkt");

	}

}
