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

package co.elastic.clients.elasticsearch.rollup.get_rollup_index_capabilities;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: rollup.get_rollup_index_capabilities.RollupJobSummaryField
public final class RollupJobSummaryField implements ToJsonp {
	private final String agg;

	@Nullable
	private final String timeZone;

	@Nullable
	private final JsonValue calendarInterval;

	// ---------------------------------------------------------------------------------------------

	protected RollupJobSummaryField(Builder builder) {

		this.agg = Objects.requireNonNull(builder.agg, "agg");
		this.timeZone = builder.timeZone;
		this.calendarInterval = builder.calendarInterval;

	}

	/**
	 * API name: {@code agg}
	 */
	public String agg() {
		return this.agg;
	}

	/**
	 * API name: {@code time_zone}
	 */
	@Nullable
	public String timeZone() {
		return this.timeZone;
	}

	/**
	 * API name: {@code calendar_interval}
	 */
	@Nullable
	public JsonValue calendarInterval() {
		return this.calendarInterval;
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

		generator.writeKey("agg");
		generator.write(this.agg);

		if (this.timeZone != null) {

			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}
		if (this.calendarInterval != null) {

			generator.writeKey("calendar_interval");
			generator.write(this.calendarInterval);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupJobSummaryField}.
	 */
	public static class Builder implements ObjectBuilder<RollupJobSummaryField> {
		private String agg;

		@Nullable
		private String timeZone;

		@Nullable
		private JsonValue calendarInterval;

		/**
		 * API name: {@code agg}
		 */
		public Builder agg(String value) {
			this.agg = value;
			return this;
		}

		/**
		 * API name: {@code time_zone}
		 */
		public Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * API name: {@code calendar_interval}
		 */
		public Builder calendarInterval(@Nullable JsonValue value) {
			this.calendarInterval = value;
			return this;
		}

		/**
		 * Builds a {@link RollupJobSummaryField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupJobSummaryField build() {

			return new RollupJobSummaryField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RollupJobSummaryField
	 */
	public static final JsonpDeserializer<RollupJobSummaryField> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RollupJobSummaryField::setupRollupJobSummaryFieldDeserializer);

	protected static void setupRollupJobSummaryFieldDeserializer(
			DelegatingDeserializer<RollupJobSummaryField.Builder> op) {

		op.add(Builder::agg, JsonpDeserializer.stringDeserializer(), "agg");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");
		op.add(Builder::calendarInterval, JsonpDeserializer.jsonValueDeserializer(), "calendar_interval");

	}

}
