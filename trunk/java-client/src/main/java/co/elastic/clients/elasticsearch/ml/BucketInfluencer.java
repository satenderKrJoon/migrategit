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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.BucketInfluencer
public final class BucketInfluencer implements ToJsonp {
	private final Number bucketSpan;

	private final Number influencerScore;

	private final String influencerFieldName;

	private final String influencerFieldValue;

	private final Number initialInfluencerScore;

	private final Boolean isInterim;

	private final String jobId;

	private final Number probability;

	private final String resultType;

	private final JsonValue timestamp;

	@Nullable
	private final String foo;

	// ---------------------------------------------------------------------------------------------

	protected BucketInfluencer(Builder builder) {

		this.bucketSpan = Objects.requireNonNull(builder.bucketSpan, "bucket_span");
		this.influencerScore = Objects.requireNonNull(builder.influencerScore, "influencer_score");
		this.influencerFieldName = Objects.requireNonNull(builder.influencerFieldName, "influencer_field_name");
		this.influencerFieldValue = Objects.requireNonNull(builder.influencerFieldValue, "influencer_field_value");
		this.initialInfluencerScore = Objects.requireNonNull(builder.initialInfluencerScore,
				"initial_influencer_score");
		this.isInterim = Objects.requireNonNull(builder.isInterim, "is_interim");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.probability = Objects.requireNonNull(builder.probability, "probability");
		this.resultType = Objects.requireNonNull(builder.resultType, "result_type");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");
		this.foo = builder.foo;

	}

	/**
	 * The length of the bucket in seconds. This value matches the bucket_span that
	 * is specified in the job.
	 *
	 * API name: {@code bucket_span}
	 */
	public Number bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * A normalized score between 0-100, which is based on the probability of the
	 * influencer in this bucket aggregated across detectors. Unlike
	 * initial_influencer_score, this value will be updated by a re-normalization
	 * process as new data is analyzed.
	 *
	 * API name: {@code influencer_score}
	 */
	public Number influencerScore() {
		return this.influencerScore;
	}

	/**
	 * The field name of the influencer.
	 *
	 * API name: {@code influencer_field_name}
	 */
	public String influencerFieldName() {
		return this.influencerFieldName;
	}

	/**
	 * The entity that influenced, contributed to, or was to blame for the anomaly.
	 *
	 * API name: {@code influencer_field_value}
	 */
	public String influencerFieldValue() {
		return this.influencerFieldValue;
	}

	/**
	 * A normalized score between 0-100, which is based on the probability of the
	 * influencer aggregated across detectors. This is the initial value that was
	 * calculated at the time the bucket was processed.
	 *
	 * API name: {@code initial_influencer_score}
	 */
	public Number initialInfluencerScore() {
		return this.initialInfluencerScore;
	}

	/**
	 * If true, this is an interim result. In other words, the results are
	 * calculated based on partial input data.
	 *
	 * API name: {@code is_interim}
	 */
	public Boolean isInterim() {
		return this.isInterim;
	}

	/**
	 * Identifier for the anomaly detection job.
	 *
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * The probability that the influencer has this behavior, in the range 0 to 1.
	 * This value can be held to a high precision of over 300 decimal places, so the
	 * influencer_score is provided as a human-readable and friendly interpretation
	 * of this.
	 *
	 * API name: {@code probability}
	 */
	public Number probability() {
		return this.probability;
	}

	/**
	 * Internal. This value is always set to influencer.
	 *
	 * API name: {@code result_type}
	 */
	public String resultType() {
		return this.resultType;
	}

	/**
	 * The start time of the bucket for which these results were calculated.
	 *
	 * API name: {@code timestamp}
	 */
	public JsonValue timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code foo}
	 */
	@Nullable
	public String foo() {
		return this.foo;
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

		generator.writeKey("bucket_span");
		generator.write(this.bucketSpan.doubleValue());

		generator.writeKey("influencer_score");
		generator.write(this.influencerScore.doubleValue());

		generator.writeKey("influencer_field_name");
		generator.write(this.influencerFieldName);

		generator.writeKey("influencer_field_value");
		generator.write(this.influencerFieldValue);

		generator.writeKey("initial_influencer_score");
		generator.write(this.initialInfluencerScore.doubleValue());

		generator.writeKey("is_interim");
		generator.write(this.isInterim);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("probability");
		generator.write(this.probability.doubleValue());

		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		if (this.foo != null) {

			generator.writeKey("foo");
			generator.write(this.foo);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketInfluencer}.
	 */
	public static class Builder implements ObjectBuilder<BucketInfluencer> {
		private Number bucketSpan;

		private Number influencerScore;

		private String influencerFieldName;

		private String influencerFieldValue;

		private Number initialInfluencerScore;

		private Boolean isInterim;

		private String jobId;

		private Number probability;

		private String resultType;

		private JsonValue timestamp;

		@Nullable
		private String foo;

		/**
		 * The length of the bucket in seconds. This value matches the bucket_span that
		 * is specified in the job.
		 *
		 * API name: {@code bucket_span}
		 */
		public Builder bucketSpan(Number value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * A normalized score between 0-100, which is based on the probability of the
		 * influencer in this bucket aggregated across detectors. Unlike
		 * initial_influencer_score, this value will be updated by a re-normalization
		 * process as new data is analyzed.
		 *
		 * API name: {@code influencer_score}
		 */
		public Builder influencerScore(Number value) {
			this.influencerScore = value;
			return this;
		}

		/**
		 * The field name of the influencer.
		 *
		 * API name: {@code influencer_field_name}
		 */
		public Builder influencerFieldName(String value) {
			this.influencerFieldName = value;
			return this;
		}

		/**
		 * The entity that influenced, contributed to, or was to blame for the anomaly.
		 *
		 * API name: {@code influencer_field_value}
		 */
		public Builder influencerFieldValue(String value) {
			this.influencerFieldValue = value;
			return this;
		}

		/**
		 * A normalized score between 0-100, which is based on the probability of the
		 * influencer aggregated across detectors. This is the initial value that was
		 * calculated at the time the bucket was processed.
		 *
		 * API name: {@code initial_influencer_score}
		 */
		public Builder initialInfluencerScore(Number value) {
			this.initialInfluencerScore = value;
			return this;
		}

		/**
		 * If true, this is an interim result. In other words, the results are
		 * calculated based on partial input data.
		 *
		 * API name: {@code is_interim}
		 */
		public Builder isInterim(Boolean value) {
			this.isInterim = value;
			return this;
		}

		/**
		 * Identifier for the anomaly detection job.
		 *
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * The probability that the influencer has this behavior, in the range 0 to 1.
		 * This value can be held to a high precision of over 300 decimal places, so the
		 * influencer_score is provided as a human-readable and friendly interpretation
		 * of this.
		 *
		 * API name: {@code probability}
		 */
		public Builder probability(Number value) {
			this.probability = value;
			return this;
		}

		/**
		 * Internal. This value is always set to influencer.
		 *
		 * API name: {@code result_type}
		 */
		public Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * The start time of the bucket for which these results were calculated.
		 *
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(JsonValue value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code foo}
		 */
		public Builder foo(@Nullable String value) {
			this.foo = value;
			return this;
		}

		/**
		 * Builds a {@link BucketInfluencer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketInfluencer build() {

			return new BucketInfluencer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for BucketInfluencer
	 */
	public static final JsonpDeserializer<BucketInfluencer> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, BucketInfluencer::setupBucketInfluencerDeserializer);

	protected static void setupBucketInfluencerDeserializer(DelegatingDeserializer<BucketInfluencer.Builder> op) {

		op.add(Builder::bucketSpan, JsonpDeserializer.numberDeserializer(), "bucket_span");
		op.add(Builder::influencerScore, JsonpDeserializer.numberDeserializer(), "influencer_score");
		op.add(Builder::influencerFieldName, JsonpDeserializer.stringDeserializer(), "influencer_field_name");
		op.add(Builder::influencerFieldValue, JsonpDeserializer.stringDeserializer(), "influencer_field_value");
		op.add(Builder::initialInfluencerScore, JsonpDeserializer.numberDeserializer(), "initial_influencer_score");
		op.add(Builder::isInterim, JsonpDeserializer.booleanDeserializer(), "is_interim");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::probability, JsonpDeserializer.numberDeserializer(), "probability");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::timestamp, JsonpDeserializer.jsonValueDeserializer(), "timestamp");
		op.add(Builder::foo, JsonpDeserializer.stringDeserializer(), "foo");

	}

}
