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

package co.elastic.clients.elasticsearch.transform;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: transform.get_transform.Response
public final class GetTransformResponse implements ToJsonp {
	private final Number count;

	private final List<JsonValue> transforms;

	// ---------------------------------------------------------------------------------------------

	protected GetTransformResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.transforms = Objects.requireNonNull(builder.transforms, "transforms");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code transforms}
	 */
	public List<JsonValue> transforms() {
		return this.transforms;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("transforms");
		generator.writeStartArray();
		for (JsonValue item0 : this.transforms) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTransformResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetTransformResponse> {
		private Number count;

		private List<JsonValue> transforms;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code transforms}
		 */
		public Builder transforms(List<JsonValue> value) {
			this.transforms = value;
			return this;
		}

		/**
		 * API name: {@code transforms}
		 */
		public Builder transforms(JsonValue... value) {
			this.transforms = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #transforms(List)}, creating the list if needed.
		 */
		public Builder addTransforms(JsonValue value) {
			if (this.transforms == null) {
				this.transforms = new ArrayList<>();
			}
			this.transforms.add(value);
			return this;
		}

		/**
		 * Builds a {@link GetTransformResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTransformResponse build() {

			return new GetTransformResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetTransformResponse
	 */
	public static final JsonpDeserializer<GetTransformResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetTransformResponse::setupGetTransformResponseDeserializer);

	protected static void setupGetTransformResponseDeserializer(
			DelegatingDeserializer<GetTransformResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::transforms, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"transforms");

	}

}
