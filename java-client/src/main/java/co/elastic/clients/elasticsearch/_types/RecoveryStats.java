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

package co.elastic.clients.elasticsearch._types;

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

// typedef: _types.RecoveryStats
public final class RecoveryStats implements ToJsonp {
	private final Number currentAsSource;

	private final Number currentAsTarget;

	@Nullable
	private final String throttleTime;

	private final Number throttleTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	protected RecoveryStats(Builder builder) {

		this.currentAsSource = Objects.requireNonNull(builder.currentAsSource, "current_as_source");
		this.currentAsTarget = Objects.requireNonNull(builder.currentAsTarget, "current_as_target");
		this.throttleTime = builder.throttleTime;
		this.throttleTimeInMillis = Objects.requireNonNull(builder.throttleTimeInMillis, "throttle_time_in_millis");

	}

	/**
	 * API name: {@code current_as_source}
	 */
	public Number currentAsSource() {
		return this.currentAsSource;
	}

	/**
	 * API name: {@code current_as_target}
	 */
	public Number currentAsTarget() {
		return this.currentAsTarget;
	}

	/**
	 * API name: {@code throttle_time}
	 */
	@Nullable
	public String throttleTime() {
		return this.throttleTime;
	}

	/**
	 * API name: {@code throttle_time_in_millis}
	 */
	public Number throttleTimeInMillis() {
		return this.throttleTimeInMillis;
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

		generator.writeKey("current_as_source");
		generator.write(this.currentAsSource.doubleValue());

		generator.writeKey("current_as_target");
		generator.write(this.currentAsTarget.doubleValue());

		if (this.throttleTime != null) {

			generator.writeKey("throttle_time");
			generator.write(this.throttleTime);

		}

		generator.writeKey("throttle_time_in_millis");
		generator.write(this.throttleTimeInMillis.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryStats}.
	 */
	public static class Builder implements ObjectBuilder<RecoveryStats> {
		private Number currentAsSource;

		private Number currentAsTarget;

		@Nullable
		private String throttleTime;

		private Number throttleTimeInMillis;

		/**
		 * API name: {@code current_as_source}
		 */
		public Builder currentAsSource(Number value) {
			this.currentAsSource = value;
			return this;
		}

		/**
		 * API name: {@code current_as_target}
		 */
		public Builder currentAsTarget(Number value) {
			this.currentAsTarget = value;
			return this;
		}

		/**
		 * API name: {@code throttle_time}
		 */
		public Builder throttleTime(@Nullable String value) {
			this.throttleTime = value;
			return this;
		}

		/**
		 * API name: {@code throttle_time_in_millis}
		 */
		public Builder throttleTimeInMillis(Number value) {
			this.throttleTimeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link RecoveryStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryStats build() {

			return new RecoveryStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RecoveryStats
	 */
	public static final JsonpDeserializer<RecoveryStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RecoveryStats::setupRecoveryStatsDeserializer);

	protected static void setupRecoveryStatsDeserializer(DelegatingDeserializer<RecoveryStats.Builder> op) {

		op.add(Builder::currentAsSource, JsonpDeserializer.numberDeserializer(), "current_as_source");
		op.add(Builder::currentAsTarget, JsonpDeserializer.numberDeserializer(), "current_as_target");
		op.add(Builder::throttleTime, JsonpDeserializer.stringDeserializer(), "throttle_time");
		op.add(Builder::throttleTimeInMillis, JsonpDeserializer.numberDeserializer(), "throttle_time_in_millis");

	}

}
