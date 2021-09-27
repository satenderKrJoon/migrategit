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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.OverallBucket
public final class OverallBucket implements ToJsonp {
	private final Number bucketSpan;

	private final Boolean isInterim;

	private final List<OverallBucketJob> jobs;

	private final Number overallScore;

	private final String resultType;

	private final JsonValue timestamp;

	// ---------------------------------------------------------------------------------------------

	protected OverallBucket(Builder builder) {

		this.bucketSpan = Objects.requireNonNull(builder.bucketSpan, "bucket_span");
		this.isInterim = Objects.requireNonNull(builder.isInterim, "is_interim");
		this.jobs = Objects.requireNonNull(builder.jobs, "jobs");
		this.overallScore = Objects.requireNonNull(builder.overallScore, "overall_score");
		this.resultType = Objects.requireNonNull(builder.resultType, "result_type");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	/**
	 * The length of the bucket in seconds. Matches the job with the longest
	 * bucket_span value.
	 *
	 * API name: {@code bucket_span}
	 */
	public Number bucketSpan() {
		return this.bucketSpan;
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
	 * An array of objects that contain the max_anomaly_score per job_id.
	 *
	 * API name: {@code jobs}
	 */
	public List<OverallBucketJob> jobs() {
		return this.jobs;
	}

	/**
	 * The top_n average of the maximum bucket anomaly_score per job.
	 *
	 * API name: {@code overall_score}
	 */
	public Number overallScore() {
		return this.overallScore;
	}

	/**
	 * Internal. This is always set to overall_bucket.
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

		generator.writeKey("is_interim");
		generator.write(this.isInterim);

		generator.writeKey("jobs");
		generator.writeStartArray();
		for (OverallBucketJob item0 : this.jobs) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("overall_score");
		generator.write(this.overallScore.doubleValue());

		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OverallBucket}.
	 */
	public static class Builder implements ObjectBuilder<OverallBucket> {
		private Number bucketSpan;

		private Boolean isInterim;

		private List<OverallBucketJob> jobs;

		private Number overallScore;

		private String resultType;

		private JsonValue timestamp;

		/**
		 * The length of the bucket in seconds. Matches the job with the longest
		 * bucket_span value.
		 *
		 * API name: {@code bucket_span}
		 */
		public Builder bucketSpan(Number value) {
			this.bucketSpan = value;
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
		 * An array of objects that contain the max_anomaly_score per job_id.
		 *
		 * API name: {@code jobs}
		 */
		public Builder jobs(List<OverallBucketJob> value) {
			this.jobs = value;
			return this;
		}

		/**
		 * An array of objects that contain the max_anomaly_score per job_id.
		 *
		 * API name: {@code jobs}
		 */
		public Builder jobs(OverallBucketJob... value) {
			this.jobs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #jobs(List)}, creating the list if needed.
		 */
		public Builder addJobs(OverallBucketJob value) {
			if (this.jobs == null) {
				this.jobs = new ArrayList<>();
			}
			this.jobs.add(value);
			return this;
		}

		/**
		 * Set {@link #jobs(List)} to a singleton list.
		 */
		public Builder jobs(Function<OverallBucketJob.Builder, ObjectBuilder<OverallBucketJob>> fn) {
			return this.jobs(fn.apply(new OverallBucketJob.Builder()).build());
		}

		/**
		 * Add a value to {@link #jobs(List)}, creating the list if needed.
		 */
		public Builder addJobs(Function<OverallBucketJob.Builder, ObjectBuilder<OverallBucketJob>> fn) {
			return this.addJobs(fn.apply(new OverallBucketJob.Builder()).build());
		}

		/**
		 * The top_n average of the maximum bucket anomaly_score per job.
		 *
		 * API name: {@code overall_score}
		 */
		public Builder overallScore(Number value) {
			this.overallScore = value;
			return this;
		}

		/**
		 * Internal. This is always set to overall_bucket.
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
		 * Builds a {@link OverallBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OverallBucket build() {

			return new OverallBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for OverallBucket
	 */
	public static final JsonpDeserializer<OverallBucket> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, OverallBucket::setupOverallBucketDeserializer);

	protected static void setupOverallBucketDeserializer(DelegatingDeserializer<OverallBucket.Builder> op) {

		op.add(Builder::bucketSpan, JsonpDeserializer.numberDeserializer(), "bucket_span");
		op.add(Builder::isInterim, JsonpDeserializer.booleanDeserializer(), "is_interim");
		op.add(Builder::jobs, JsonpDeserializer.arrayDeserializer(OverallBucketJob.DESERIALIZER), "jobs");
		op.add(Builder::overallScore, JsonpDeserializer.numberDeserializer(), "overall_score");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::timestamp, JsonpDeserializer.jsonValueDeserializer(), "timestamp");

	}

}
