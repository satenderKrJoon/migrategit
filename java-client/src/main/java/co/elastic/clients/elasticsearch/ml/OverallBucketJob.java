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
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.OverallBucketJob
public final class OverallBucketJob implements ToJsonp {
	private final String jobId;

	private final Number maxAnomalyScore;

	// ---------------------------------------------------------------------------------------------

	protected OverallBucketJob(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.maxAnomalyScore = Objects.requireNonNull(builder.maxAnomalyScore, "max_anomaly_score");

	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code max_anomaly_score}
	 */
	public Number maxAnomalyScore() {
		return this.maxAnomalyScore;
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

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("max_anomaly_score");
		generator.write(this.maxAnomalyScore.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OverallBucketJob}.
	 */
	public static class Builder implements ObjectBuilder<OverallBucketJob> {
		private String jobId;

		private Number maxAnomalyScore;

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code max_anomaly_score}
		 */
		public Builder maxAnomalyScore(Number value) {
			this.maxAnomalyScore = value;
			return this;
		}

		/**
		 * Builds a {@link OverallBucketJob}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OverallBucketJob build() {

			return new OverallBucketJob(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for OverallBucketJob
	 */
	public static final JsonpDeserializer<OverallBucketJob> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, OverallBucketJob::setupOverallBucketJobDeserializer);

	protected static void setupOverallBucketJobDeserializer(DelegatingDeserializer<OverallBucketJob.Builder> op) {

		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::maxAnomalyScore, JsonpDeserializer.numberDeserializer(), "max_anomaly_score");

	}

}
