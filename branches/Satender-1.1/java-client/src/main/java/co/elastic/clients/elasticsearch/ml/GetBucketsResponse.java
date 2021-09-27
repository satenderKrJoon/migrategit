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

// typedef: ml.get_buckets.Response
public final class GetBucketsResponse implements ToJsonp {
	private final List<BucketSummary> buckets;

	private final Number count;

	// ---------------------------------------------------------------------------------------------

	protected GetBucketsResponse(Builder builder) {

		this.buckets = Objects.requireNonNull(builder.buckets, "buckets");
		this.count = Objects.requireNonNull(builder.count, "count");

	}

	/**
	 * API name: {@code buckets}
	 */
	public List<BucketSummary> buckets() {
		return this.buckets;
	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
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

		generator.writeKey("buckets");
		generator.writeStartArray();
		for (BucketSummary item0 : this.buckets) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetBucketsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetBucketsResponse> {
		private List<BucketSummary> buckets;

		private Number count;

		/**
		 * API name: {@code buckets}
		 */
		public Builder buckets(List<BucketSummary> value) {
			this.buckets = value;
			return this;
		}

		/**
		 * API name: {@code buckets}
		 */
		public Builder buckets(BucketSummary... value) {
			this.buckets = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #buckets(List)}, creating the list if needed.
		 */
		public Builder addBuckets(BucketSummary value) {
			if (this.buckets == null) {
				this.buckets = new ArrayList<>();
			}
			this.buckets.add(value);
			return this;
		}

		/**
		 * Set {@link #buckets(List)} to a singleton list.
		 */
		public Builder buckets(Function<BucketSummary.Builder, ObjectBuilder<BucketSummary>> fn) {
			return this.buckets(fn.apply(new BucketSummary.Builder()).build());
		}

		/**
		 * Add a value to {@link #buckets(List)}, creating the list if needed.
		 */
		public Builder addBuckets(Function<BucketSummary.Builder, ObjectBuilder<BucketSummary>> fn) {
			return this.addBuckets(fn.apply(new BucketSummary.Builder()).build());
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * Builds a {@link GetBucketsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetBucketsResponse build() {

			return new GetBucketsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetBucketsResponse
	 */
	public static final JsonpDeserializer<GetBucketsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetBucketsResponse::setupGetBucketsResponseDeserializer);

	protected static void setupGetBucketsResponseDeserializer(DelegatingDeserializer<GetBucketsResponse.Builder> op) {

		op.add(Builder::buckets, JsonpDeserializer.arrayDeserializer(BucketSummary.DESERIALIZER), "buckets");
		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");

	}

}
