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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.post_calendar_events.Response
public final class PostCalendarEventsResponse implements ToJsonp {
	private final List<CalendarEvent> events;

	// ---------------------------------------------------------------------------------------------

	protected PostCalendarEventsResponse(Builder builder) {

		this.events = Objects.requireNonNull(builder.events, "events");

	}

	/**
	 * API name: {@code events}
	 */
	public List<CalendarEvent> events() {
		return this.events;
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

		generator.writeKey("events");
		generator.writeStartArray();
		for (CalendarEvent item0 : this.events) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostCalendarEventsResponse}.
	 */
	public static class Builder implements ObjectBuilder<PostCalendarEventsResponse> {
		private List<CalendarEvent> events;

		/**
		 * API name: {@code events}
		 */
		public Builder events(List<CalendarEvent> value) {
			this.events = value;
			return this;
		}

		/**
		 * API name: {@code events}
		 */
		public Builder events(CalendarEvent... value) {
			this.events = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #events(List)}, creating the list if needed.
		 */
		public Builder addEvents(CalendarEvent value) {
			if (this.events == null) {
				this.events = new ArrayList<>();
			}
			this.events.add(value);
			return this;
		}

		/**
		 * Set {@link #events(List)} to a singleton list.
		 */
		public Builder events(Function<CalendarEvent.Builder, ObjectBuilder<CalendarEvent>> fn) {
			return this.events(fn.apply(new CalendarEvent.Builder()).build());
		}

		/**
		 * Add a value to {@link #events(List)}, creating the list if needed.
		 */
		public Builder addEvents(Function<CalendarEvent.Builder, ObjectBuilder<CalendarEvent>> fn) {
			return this.addEvents(fn.apply(new CalendarEvent.Builder()).build());
		}

		/**
		 * Builds a {@link PostCalendarEventsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostCalendarEventsResponse build() {

			return new PostCalendarEventsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PostCalendarEventsResponse
	 */
	public static final JsonpDeserializer<PostCalendarEventsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PostCalendarEventsResponse::setupPostCalendarEventsResponseDeserializer);

	protected static void setupPostCalendarEventsResponseDeserializer(
			DelegatingDeserializer<PostCalendarEventsResponse.Builder> op) {

		op.add(Builder::events, JsonpDeserializer.arrayDeserializer(CalendarEvent.DESERIALIZER), "events");

	}

}
