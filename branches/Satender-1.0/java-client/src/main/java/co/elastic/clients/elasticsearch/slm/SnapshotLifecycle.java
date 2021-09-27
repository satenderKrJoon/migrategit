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

package co.elastic.clients.elasticsearch.slm;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: slm._types.SnapshotLifecycle
public final class SnapshotLifecycle implements ToJsonp {
	@Nullable
	private final InProgress inProgress;

	@Nullable
	private final Invocation lastFailure;

	@Nullable
	private final Invocation lastSuccess;

	@Nullable
	private final String modifiedDate;

	private final JsonValue modifiedDateMillis;

	@Nullable
	private final String nextExecution;

	private final JsonValue nextExecutionMillis;

	private final Policy policy;

	private final Number version;

	private final Statistics stats;

	// ---------------------------------------------------------------------------------------------

	protected SnapshotLifecycle(Builder builder) {

		this.inProgress = builder.inProgress;
		this.lastFailure = builder.lastFailure;
		this.lastSuccess = builder.lastSuccess;
		this.modifiedDate = builder.modifiedDate;
		this.modifiedDateMillis = Objects.requireNonNull(builder.modifiedDateMillis, "modified_date_millis");
		this.nextExecution = builder.nextExecution;
		this.nextExecutionMillis = Objects.requireNonNull(builder.nextExecutionMillis, "next_execution_millis");
		this.policy = Objects.requireNonNull(builder.policy, "policy");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.stats = Objects.requireNonNull(builder.stats, "stats");

	}

	/**
	 * API name: {@code in_progress}
	 */
	@Nullable
	public InProgress inProgress() {
		return this.inProgress;
	}

	/**
	 * API name: {@code last_failure}
	 */
	@Nullable
	public Invocation lastFailure() {
		return this.lastFailure;
	}

	/**
	 * API name: {@code last_success}
	 */
	@Nullable
	public Invocation lastSuccess() {
		return this.lastSuccess;
	}

	/**
	 * API name: {@code modified_date}
	 */
	@Nullable
	public String modifiedDate() {
		return this.modifiedDate;
	}

	/**
	 * API name: {@code modified_date_millis}
	 */
	public JsonValue modifiedDateMillis() {
		return this.modifiedDateMillis;
	}

	/**
	 * API name: {@code next_execution}
	 */
	@Nullable
	public String nextExecution() {
		return this.nextExecution;
	}

	/**
	 * API name: {@code next_execution_millis}
	 */
	public JsonValue nextExecutionMillis() {
		return this.nextExecutionMillis;
	}

	/**
	 * API name: {@code policy}
	 */
	public Policy policy() {
		return this.policy;
	}

	/**
	 * API name: {@code version}
	 */
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code stats}
	 */
	public Statistics stats() {
		return this.stats;
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

		if (this.inProgress != null) {

			generator.writeKey("in_progress");
			this.inProgress.toJsonp(generator, mapper);

		}
		if (this.lastFailure != null) {

			generator.writeKey("last_failure");
			this.lastFailure.toJsonp(generator, mapper);

		}
		if (this.lastSuccess != null) {

			generator.writeKey("last_success");
			this.lastSuccess.toJsonp(generator, mapper);

		}
		if (this.modifiedDate != null) {

			generator.writeKey("modified_date");
			generator.write(this.modifiedDate);

		}

		generator.writeKey("modified_date_millis");
		generator.write(this.modifiedDateMillis);

		if (this.nextExecution != null) {

			generator.writeKey("next_execution");
			generator.write(this.nextExecution);

		}

		generator.writeKey("next_execution_millis");
		generator.write(this.nextExecutionMillis);

		generator.writeKey("policy");
		this.policy.toJsonp(generator, mapper);

		generator.writeKey("version");
		generator.write(this.version.doubleValue());

		generator.writeKey("stats");
		this.stats.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotLifecycle}.
	 */
	public static class Builder implements ObjectBuilder<SnapshotLifecycle> {
		@Nullable
		private InProgress inProgress;

		@Nullable
		private Invocation lastFailure;

		@Nullable
		private Invocation lastSuccess;

		@Nullable
		private String modifiedDate;

		private JsonValue modifiedDateMillis;

		@Nullable
		private String nextExecution;

		private JsonValue nextExecutionMillis;

		private Policy policy;

		private Number version;

		private Statistics stats;

		/**
		 * API name: {@code in_progress}
		 */
		public Builder inProgress(@Nullable InProgress value) {
			this.inProgress = value;
			return this;
		}

		/**
		 * API name: {@code in_progress}
		 */
		public Builder inProgress(Function<InProgress.Builder, ObjectBuilder<InProgress>> fn) {
			return this.inProgress(fn.apply(new InProgress.Builder()).build());
		}

		/**
		 * API name: {@code last_failure}
		 */
		public Builder lastFailure(@Nullable Invocation value) {
			this.lastFailure = value;
			return this;
		}

		/**
		 * API name: {@code last_failure}
		 */
		public Builder lastFailure(Function<Invocation.Builder, ObjectBuilder<Invocation>> fn) {
			return this.lastFailure(fn.apply(new Invocation.Builder()).build());
		}

		/**
		 * API name: {@code last_success}
		 */
		public Builder lastSuccess(@Nullable Invocation value) {
			this.lastSuccess = value;
			return this;
		}

		/**
		 * API name: {@code last_success}
		 */
		public Builder lastSuccess(Function<Invocation.Builder, ObjectBuilder<Invocation>> fn) {
			return this.lastSuccess(fn.apply(new Invocation.Builder()).build());
		}

		/**
		 * API name: {@code modified_date}
		 */
		public Builder modifiedDate(@Nullable String value) {
			this.modifiedDate = value;
			return this;
		}

		/**
		 * API name: {@code modified_date_millis}
		 */
		public Builder modifiedDateMillis(JsonValue value) {
			this.modifiedDateMillis = value;
			return this;
		}

		/**
		 * API name: {@code next_execution}
		 */
		public Builder nextExecution(@Nullable String value) {
			this.nextExecution = value;
			return this;
		}

		/**
		 * API name: {@code next_execution_millis}
		 */
		public Builder nextExecutionMillis(JsonValue value) {
			this.nextExecutionMillis = value;
			return this;
		}

		/**
		 * API name: {@code policy}
		 */
		public Builder policy(Policy value) {
			this.policy = value;
			return this;
		}

		/**
		 * API name: {@code policy}
		 */
		public Builder policy(Function<Policy.Builder, ObjectBuilder<Policy>> fn) {
			return this.policy(fn.apply(new Policy.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(Statistics value) {
			this.stats = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(Function<Statistics.Builder, ObjectBuilder<Statistics>> fn) {
			return this.stats(fn.apply(new Statistics.Builder()).build());
		}

		/**
		 * Builds a {@link SnapshotLifecycle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotLifecycle build() {

			return new SnapshotLifecycle(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SnapshotLifecycle
	 */
	public static final JsonpDeserializer<SnapshotLifecycle> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SnapshotLifecycle::setupSnapshotLifecycleDeserializer);

	protected static void setupSnapshotLifecycleDeserializer(DelegatingDeserializer<SnapshotLifecycle.Builder> op) {

		op.add(Builder::inProgress, InProgress.DESERIALIZER, "in_progress");
		op.add(Builder::lastFailure, Invocation.DESERIALIZER, "last_failure");
		op.add(Builder::lastSuccess, Invocation.DESERIALIZER, "last_success");
		op.add(Builder::modifiedDate, JsonpDeserializer.stringDeserializer(), "modified_date");
		op.add(Builder::modifiedDateMillis, JsonpDeserializer.jsonValueDeserializer(), "modified_date_millis");
		op.add(Builder::nextExecution, JsonpDeserializer.stringDeserializer(), "next_execution");
		op.add(Builder::nextExecutionMillis, JsonpDeserializer.jsonValueDeserializer(), "next_execution_millis");
		op.add(Builder::policy, Policy.DESERIALIZER, "policy");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");
		op.add(Builder::stats, Statistics.DESERIALIZER, "stats");

	}

}
