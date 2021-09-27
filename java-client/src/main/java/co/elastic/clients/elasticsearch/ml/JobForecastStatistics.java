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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.JobForecastStatistics
public final class JobForecastStatistics implements ToJsonp {
	@Nullable
	private final JobStatistics memoryBytes;

	@Nullable
	private final JobStatistics processingTimeMs;

	@Nullable
	private final JobStatistics records;

	@Nullable
	private final Map<String, Number> status;

	private final Number total;

	private final Number forecastedJobs;

	// ---------------------------------------------------------------------------------------------

	protected JobForecastStatistics(Builder builder) {

		this.memoryBytes = builder.memoryBytes;
		this.processingTimeMs = builder.processingTimeMs;
		this.records = builder.records;
		this.status = builder.status;
		this.total = Objects.requireNonNull(builder.total, "total");
		this.forecastedJobs = Objects.requireNonNull(builder.forecastedJobs, "forecasted_jobs");

	}

	/**
	 * API name: {@code memory_bytes}
	 */
	@Nullable
	public JobStatistics memoryBytes() {
		return this.memoryBytes;
	}

	/**
	 * API name: {@code processing_time_ms}
	 */
	@Nullable
	public JobStatistics processingTimeMs() {
		return this.processingTimeMs;
	}

	/**
	 * API name: {@code records}
	 */
	@Nullable
	public JobStatistics records() {
		return this.records;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public Map<String, Number> status() {
		return this.status;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code forecasted_jobs}
	 */
	public Number forecastedJobs() {
		return this.forecastedJobs;
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

		if (this.memoryBytes != null) {

			generator.writeKey("memory_bytes");
			this.memoryBytes.toJsonp(generator, mapper);

		}
		if (this.processingTimeMs != null) {

			generator.writeKey("processing_time_ms");
			this.processingTimeMs.toJsonp(generator, mapper);

		}
		if (this.records != null) {

			generator.writeKey("records");
			this.records.toJsonp(generator, mapper);

		}
		if (this.status != null) {

			generator.writeKey("status");
			generator.writeStartObject();
			for (Map.Entry<String, Number> item0 : this.status.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue().doubleValue());

			}
			generator.writeEnd();

		}

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		generator.writeKey("forecasted_jobs");
		generator.write(this.forecastedJobs.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobForecastStatistics}.
	 */
	public static class Builder implements ObjectBuilder<JobForecastStatistics> {
		@Nullable
		private JobStatistics memoryBytes;

		@Nullable
		private JobStatistics processingTimeMs;

		@Nullable
		private JobStatistics records;

		@Nullable
		private Map<String, Number> status;

		private Number total;

		private Number forecastedJobs;

		/**
		 * API name: {@code memory_bytes}
		 */
		public Builder memoryBytes(@Nullable JobStatistics value) {
			this.memoryBytes = value;
			return this;
		}

		/**
		 * API name: {@code memory_bytes}
		 */
		public Builder memoryBytes(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.memoryBytes(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code processing_time_ms}
		 */
		public Builder processingTimeMs(@Nullable JobStatistics value) {
			this.processingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code processing_time_ms}
		 */
		public Builder processingTimeMs(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.processingTimeMs(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code records}
		 */
		public Builder records(@Nullable JobStatistics value) {
			this.records = value;
			return this;
		}

		/**
		 * API name: {@code records}
		 */
		public Builder records(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.records(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(@Nullable Map<String, Number> value) {
			this.status = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #status(Map)}, creating the map if needed.
		 */
		public Builder putStatus(String key, Number value) {
			if (this.status == null) {
				this.status = new HashMap<>();
			}
			this.status.put(key, value);
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code forecasted_jobs}
		 */
		public Builder forecastedJobs(Number value) {
			this.forecastedJobs = value;
			return this;
		}

		/**
		 * Builds a {@link JobForecastStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JobForecastStatistics build() {

			return new JobForecastStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for JobForecastStatistics
	 */
	public static final JsonpDeserializer<JobForecastStatistics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, JobForecastStatistics::setupJobForecastStatisticsDeserializer);

	protected static void setupJobForecastStatisticsDeserializer(
			DelegatingDeserializer<JobForecastStatistics.Builder> op) {

		op.add(Builder::memoryBytes, JobStatistics.DESERIALIZER, "memory_bytes");
		op.add(Builder::processingTimeMs, JobStatistics.DESERIALIZER, "processing_time_ms");
		op.add(Builder::records, JobStatistics.DESERIALIZER, "records");
		op.add(Builder::status, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.numberDeserializer()),
				"status");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::forecastedJobs, JsonpDeserializer.numberDeserializer(), "forecasted_jobs");

	}

}
