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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
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
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_calendars.Request
public final class GetCalendarsRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String calendarId;

	@Nullable
	private final Number from;

	@Nullable
	private final Number size;

	@Nullable
	private final Page page;

	// ---------------------------------------------------------------------------------------------

	protected GetCalendarsRequest(Builder builder) {

		this.calendarId = builder.calendarId;
		this.from = builder.from;
		this.size = builder.size;
		this.page = builder.page;

	}

	/**
	 * A string that uniquely identifies a calendar.
	 *
	 * API name: {@code calendar_id}
	 */
	@Nullable
	public String calendarId() {
		return this.calendarId;
	}

	/**
	 * Skips the specified number of calendars.
	 *
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * Specifies the maximum number of calendars to obtain.
	 *
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code page}
	 */
	@Nullable
	public Page page() {
		return this.page;
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

		if (this.page != null) {

			generator.writeKey("page");
			this.page.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCalendarsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetCalendarsRequest> {
		@Nullable
		private String calendarId;

		@Nullable
		private Number from;

		@Nullable
		private Number size;

		@Nullable
		private Page page;

		/**
		 * A string that uniquely identifies a calendar.
		 *
		 * API name: {@code calendar_id}
		 */
		public Builder calendarId(@Nullable String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * Skips the specified number of calendars.
		 *
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies the maximum number of calendars to obtain.
		 *
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public Builder page(@Nullable Page value) {
			this.page = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public Builder page(Function<Page.Builder, ObjectBuilder<Page>> fn) {
			return this.page(fn.apply(new Page.Builder()).build());
		}

		/**
		 * Builds a {@link GetCalendarsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCalendarsRequest build() {

			return new GetCalendarsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetCalendarsRequest
	 */
	public static final JsonpDeserializer<GetCalendarsRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetCalendarsRequest::setupGetCalendarsRequestDeserializer);

	protected static void setupGetCalendarsRequestDeserializer(DelegatingDeserializer<GetCalendarsRequest.Builder> op) {

		op.add(Builder::page, Page.DESERIALIZER, "page");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_calendars}".
	 */
	public static final Endpoint<GetCalendarsRequest, GetCalendarsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _calendarId = 1 << 0;

				int propsSet = 0;

				if (request.calendarId() != null)
					propsSet |= _calendarId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/calendars");
					return buf.toString();
				}
				if (propsSet == (_calendarId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/calendars");
					buf.append("/");
					buf.append(request.calendarId);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.from != null) {
					params.put("from", request.from.toString());
				}
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, GetCalendarsResponse.DESERIALIZER);
}
