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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.ScheduleTriggerEvent
public final class ScheduleTriggerEvent implements ToJsonp {
	private final JsonValue scheduledTime;

	@Nullable
	private final JsonValue triggeredTime;

	// ---------------------------------------------------------------------------------------------

	protected ScheduleTriggerEvent(Builder builder) {

		this.scheduledTime = Objects.requireNonNull(builder.scheduledTime, "scheduled_time");
		this.triggeredTime = builder.triggeredTime;

	}

	/**
	 * API name: {@code scheduled_time}
	 */
	public JsonValue scheduledTime() {
		return this.scheduledTime;
	}

	/**
	 * API name: {@code triggered_time}
	 */
	@Nullable
	public JsonValue triggeredTime() {
		return this.triggeredTime;
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

		generator.writeKey("scheduled_time");
		generator.write(this.scheduledTime);

		if (this.triggeredTime != null) {

			generator.writeKey("triggered_time");
			generator.write(this.triggeredTime);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScheduleTriggerEvent}.
	 */
	public static class Builder implements ObjectBuilder<ScheduleTriggerEvent> {
		private JsonValue scheduledTime;

		@Nullable
		private JsonValue triggeredTime;

		/**
		 * API name: {@code scheduled_time}
		 */
		public Builder scheduledTime(JsonValue value) {
			this.scheduledTime = value;
			return this;
		}

		/**
		 * API name: {@code triggered_time}
		 */
		public Builder triggeredTime(@Nullable JsonValue value) {
			this.triggeredTime = value;
			return this;
		}

		/**
		 * Builds a {@link ScheduleTriggerEvent}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScheduleTriggerEvent build() {

			return new ScheduleTriggerEvent(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ScheduleTriggerEvent
	 */
	public static final JsonpDeserializer<ScheduleTriggerEvent> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ScheduleTriggerEvent::setupScheduleTriggerEventDeserializer);

	protected static void setupScheduleTriggerEventDeserializer(
			DelegatingDeserializer<ScheduleTriggerEvent.Builder> op) {

		op.add(Builder::scheduledTime, JsonpDeserializer.jsonValueDeserializer(), "scheduled_time");
		op.add(Builder::triggeredTime, JsonpDeserializer.jsonValueDeserializer(), "triggered_time");

	}

}
