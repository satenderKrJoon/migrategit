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

package co.elastic.clients.elasticsearch.rollup.get_rollup_job;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.get_rollup_job.RollupJob
public final class RollupJob implements ToJsonp {
	private final RollupJobConfiguration config;

	private final RollupJobStats stats;

	private final RollupJobStatus status;

	// ---------------------------------------------------------------------------------------------

	protected RollupJob(Builder builder) {

		this.config = Objects.requireNonNull(builder.config, "config");
		this.stats = Objects.requireNonNull(builder.stats, "stats");
		this.status = Objects.requireNonNull(builder.status, "status");

	}

	/**
	 * API name: {@code config}
	 */
	public RollupJobConfiguration config() {
		return this.config;
	}

	/**
	 * API name: {@code stats}
	 */
	public RollupJobStats stats() {
		return this.stats;
	}

	/**
	 * API name: {@code status}
	 */
	public RollupJobStatus status() {
		return this.status;
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

		generator.writeKey("config");
		this.config.toJsonp(generator, mapper);

		generator.writeKey("stats");
		this.stats.toJsonp(generator, mapper);

		generator.writeKey("status");
		this.status.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupJob}.
	 */
	public static class Builder implements ObjectBuilder<RollupJob> {
		private RollupJobConfiguration config;

		private RollupJobStats stats;

		private RollupJobStatus status;

		/**
		 * API name: {@code config}
		 */
		public Builder config(RollupJobConfiguration value) {
			this.config = value;
			return this;
		}

		/**
		 * API name: {@code config}
		 */
		public Builder config(Function<RollupJobConfiguration.Builder, ObjectBuilder<RollupJobConfiguration>> fn) {
			return this.config(fn.apply(new RollupJobConfiguration.Builder()).build());
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(RollupJobStats value) {
			this.stats = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(Function<RollupJobStats.Builder, ObjectBuilder<RollupJobStats>> fn) {
			return this.stats(fn.apply(new RollupJobStats.Builder()).build());
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(RollupJobStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(Function<RollupJobStatus.Builder, ObjectBuilder<RollupJobStatus>> fn) {
			return this.status(fn.apply(new RollupJobStatus.Builder()).build());
		}

		/**
		 * Builds a {@link RollupJob}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupJob build() {

			return new RollupJob(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RollupJob
	 */
	public static final JsonpDeserializer<RollupJob> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RollupJob::setupRollupJobDeserializer);

	protected static void setupRollupJobDeserializer(DelegatingDeserializer<RollupJob.Builder> op) {

		op.add(Builder::config, RollupJobConfiguration.DESERIALIZER, "config");
		op.add(Builder::stats, RollupJobStats.DESERIALIZER, "stats");
		op.add(Builder::status, RollupJobStatus.DESERIALIZER, "status");

	}

}
