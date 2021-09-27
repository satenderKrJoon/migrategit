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

// typedef: watcher._types.DailySchedule
public final class DailySchedule implements ToJsonp {
	private final JsonValue at;

	// ---------------------------------------------------------------------------------------------

	protected DailySchedule(Builder builder) {

		this.at = Objects.requireNonNull(builder.at, "at");

	}

	/**
	 * API name: {@code at}
	 */
	public JsonValue at() {
		return this.at;
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

		generator.writeKey("at");
		generator.write(this.at);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DailySchedule}.
	 */
	public static class Builder implements ObjectBuilder<DailySchedule> {
		private JsonValue at;

		/**
		 * API name: {@code at}
		 */
		public Builder at(JsonValue value) {
			this.at = value;
			return this;
		}

		/**
		 * Builds a {@link DailySchedule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DailySchedule build() {

			return new DailySchedule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DailySchedule
	 */
	public static final JsonpDeserializer<DailySchedule> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DailySchedule::setupDailyScheduleDeserializer);

	protected static void setupDailyScheduleDeserializer(DelegatingDeserializer<DailySchedule.Builder> op) {

		op.add(Builder::at, JsonpDeserializer.jsonValueDeserializer(), "at");

	}

}
