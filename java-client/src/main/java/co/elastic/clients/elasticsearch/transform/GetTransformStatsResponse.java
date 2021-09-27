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

import co.elastic.clients.elasticsearch.transform.get_transform_stats.TransformStats;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.Response
public final class GetTransformStatsResponse implements ToJsonp {
	private final Number count;

	private final List<TransformStats> transforms;

	// ---------------------------------------------------------------------------------------------

	protected GetTransformStatsResponse(Builder builder) {

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
	public List<TransformStats> transforms() {
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
		for (TransformStats item0 : this.transforms) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTransformStatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetTransformStatsResponse> {
		private Number count;

		private List<TransformStats> transforms;

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
		public Builder transforms(List<TransformStats> value) {
			this.transforms = value;
			return this;
		}

		/**
		 * API name: {@code transforms}
		 */
		public Builder transforms(TransformStats... value) {
			this.transforms = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #transforms(List)}, creating the list if needed.
		 */
		public Builder addTransforms(TransformStats value) {
			if (this.transforms == null) {
				this.transforms = new ArrayList<>();
			}
			this.transforms.add(value);
			return this;
		}

		/**
		 * Set {@link #transforms(List)} to a singleton list.
		 */
		public Builder transforms(Function<TransformStats.Builder, ObjectBuilder<TransformStats>> fn) {
			return this.transforms(fn.apply(new TransformStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #transforms(List)}, creating the list if needed.
		 */
		public Builder addTransforms(Function<TransformStats.Builder, ObjectBuilder<TransformStats>> fn) {
			return this.addTransforms(fn.apply(new TransformStats.Builder()).build());
		}

		/**
		 * Builds a {@link GetTransformStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTransformStatsResponse build() {

			return new GetTransformStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetTransformStatsResponse
	 */
	public static final JsonpDeserializer<GetTransformStatsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetTransformStatsResponse::setupGetTransformStatsResponseDeserializer);

	protected static void setupGetTransformStatsResponseDeserializer(
			DelegatingDeserializer<GetTransformStatsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::transforms, JsonpDeserializer.arrayDeserializer(TransformStats.DESERIALIZER), "transforms");

	}

}
