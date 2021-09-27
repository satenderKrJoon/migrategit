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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml.get_overall_buckets.Response
public final class GetOverallBucketsResponse implements ToJsonp {
	private final Number count;

	private final List<OverallBucket> overallBuckets;

	// ---------------------------------------------------------------------------------------------

	protected GetOverallBucketsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.overallBuckets = Objects.requireNonNull(builder.overallBuckets, "overall_buckets");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * Array of overall bucket objects
	 *
	 * API name: {@code overall_buckets}
	 */
	public List<OverallBucket> overallBuckets() {
		return this.overallBuckets;
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

		generator.writeKey("overall_buckets");
		generator.writeStartArray();
		for (OverallBucket item0 : this.overallBuckets) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetOverallBucketsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetOverallBucketsResponse> {
		private Number count;

		private List<OverallBucket> overallBuckets;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * Array of overall bucket objects
		 *
		 * API name: {@code overall_buckets}
		 */
		public Builder overallBuckets(List<OverallBucket> value) {
			this.overallBuckets = value;
			return this;
		}

		/**
		 * Array of overall bucket objects
		 *
		 * API name: {@code overall_buckets}
		 */
		public Builder overallBuckets(OverallBucket... value) {
			this.overallBuckets = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #overallBuckets(List)}, creating the list if needed.
		 */
		public Builder addOverallBuckets(OverallBucket value) {
			if (this.overallBuckets == null) {
				this.overallBuckets = new ArrayList<>();
			}
			this.overallBuckets.add(value);
			return this;
		}

		/**
		 * Set {@link #overallBuckets(List)} to a singleton list.
		 */
		public Builder overallBuckets(Function<OverallBucket.Builder, ObjectBuilder<OverallBucket>> fn) {
			return this.overallBuckets(fn.apply(new OverallBucket.Builder()).build());
		}

		/**
		 * Add a value to {@link #overallBuckets(List)}, creating the list if needed.
		 */
		public Builder addOverallBuckets(Function<OverallBucket.Builder, ObjectBuilder<OverallBucket>> fn) {
			return this.addOverallBuckets(fn.apply(new OverallBucket.Builder()).build());
		}

		/**
		 * Builds a {@link GetOverallBucketsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetOverallBucketsResponse build() {

			return new GetOverallBucketsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetOverallBucketsResponse
	 */
	public static final JsonpDeserializer<GetOverallBucketsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetOverallBucketsResponse::setupGetOverallBucketsResponseDeserializer);

	protected static void setupGetOverallBucketsResponseDeserializer(
			DelegatingDeserializer<GetOverallBucketsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::overallBuckets, JsonpDeserializer.arrayDeserializer(OverallBucket.DESERIALIZER),
				"overall_buckets");

	}

}
