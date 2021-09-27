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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: _types.aggregations.FiltersAggregation
public final class FiltersAggregation extends BucketAggregationBase {
	@Nullable
	private final JsonValue filters;

	@Nullable
	private final Boolean otherBucket;

	@Nullable
	private final String otherBucketKey;

	// ---------------------------------------------------------------------------------------------

	protected FiltersAggregation(Builder builder) {
		super(builder);
		this.filters = builder.filters;
		this.otherBucket = builder.otherBucket;
		this.otherBucketKey = builder.otherBucketKey;

	}

	/**
	 * API name: {@code filters}
	 */
	@Nullable
	public JsonValue filters() {
		return this.filters;
	}

	/**
	 * API name: {@code other_bucket}
	 */
	@Nullable
	public Boolean otherBucket() {
		return this.otherBucket;
	}

	/**
	 * API name: {@code other_bucket_key}
	 */
	@Nullable
	public String otherBucketKey() {
		return this.otherBucketKey;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.filters != null) {

			generator.writeKey("filters");
			generator.write(this.filters);

		}
		if (this.otherBucket != null) {

			generator.writeKey("other_bucket");
			generator.write(this.otherBucket);

		}
		if (this.otherBucketKey != null) {

			generator.writeKey("other_bucket_key");
			generator.write(this.otherBucketKey);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FiltersAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FiltersAggregation> {
		@Nullable
		private JsonValue filters;

		@Nullable
		private Boolean otherBucket;

		@Nullable
		private String otherBucketKey;

		/**
		 * API name: {@code filters}
		 */
		public Builder filters(@Nullable JsonValue value) {
			this.filters = value;
			return this;
		}

		/**
		 * API name: {@code other_bucket}
		 */
		public Builder otherBucket(@Nullable Boolean value) {
			this.otherBucket = value;
			return this;
		}

		/**
		 * API name: {@code other_bucket_key}
		 */
		public Builder otherBucketKey(@Nullable String value) {
			this.otherBucketKey = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FiltersAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FiltersAggregation build() {

			return new FiltersAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FiltersAggregation
	 */
	public static final JsonpDeserializer<FiltersAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FiltersAggregation::setupFiltersAggregationDeserializer);

	protected static void setupFiltersAggregationDeserializer(DelegatingDeserializer<FiltersAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::filters, JsonpDeserializer.jsonValueDeserializer(), "filters");
		op.add(Builder::otherBucket, JsonpDeserializer.booleanDeserializer(), "other_bucket");
		op.add(Builder::otherBucketKey, JsonpDeserializer.stringDeserializer(), "other_bucket_key");

	}

}
