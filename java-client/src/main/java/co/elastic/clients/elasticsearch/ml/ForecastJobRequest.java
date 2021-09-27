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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.forecast_job.Request
public final class ForecastJobRequest extends RequestBase implements ToJsonp {
	private final String jobId;

	@Nullable
	private final JsonValue duration;

	@Nullable
	private final JsonValue expiresIn;

	// ---------------------------------------------------------------------------------------------

	protected ForecastJobRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.duration = builder.duration;
		this.expiresIn = builder.expiresIn;

	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code duration}
	 */
	@Nullable
	public JsonValue duration() {
		return this.duration;
	}

	/**
	 * API name: {@code expires_in}
	 */
	@Nullable
	public JsonValue expiresIn() {
		return this.expiresIn;
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

		if (this.duration != null) {

			generator.writeKey("duration");
			generator.write(this.duration);

		}
		if (this.expiresIn != null) {

			generator.writeKey("expires_in");
			generator.write(this.expiresIn);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ForecastJobRequest}.
	 */
	public static class Builder implements ObjectBuilder<ForecastJobRequest> {
		private String jobId;

		@Nullable
		private JsonValue duration;

		@Nullable
		private JsonValue expiresIn;

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code duration}
		 */
		public Builder duration(@Nullable JsonValue value) {
			this.duration = value;
			return this;
		}

		/**
		 * API name: {@code expires_in}
		 */
		public Builder expiresIn(@Nullable JsonValue value) {
			this.expiresIn = value;
			return this;
		}

		/**
		 * Builds a {@link ForecastJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForecastJobRequest build() {

			return new ForecastJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ForecastJobRequest
	 */
	public static final JsonpDeserializer<ForecastJobRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ForecastJobRequest::setupForecastJobRequestDeserializer);

	protected static void setupForecastJobRequestDeserializer(DelegatingDeserializer<ForecastJobRequest.Builder> op) {

		op.add(Builder::duration, JsonpDeserializer.jsonValueDeserializer(), "duration");
		op.add(Builder::expiresIn, JsonpDeserializer.jsonValueDeserializer(), "expires_in");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.forecast}".
	 */
	public static final Endpoint<ForecastJobRequest, ForecastJobResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/_forecast");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, ForecastJobResponse.DESERIALIZER);
}
