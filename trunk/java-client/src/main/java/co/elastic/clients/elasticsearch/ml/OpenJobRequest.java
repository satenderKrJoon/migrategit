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

// typedef: ml.open_job.Request
public final class OpenJobRequest extends RequestBase implements ToJsonp {
	private final String jobId;

	@Nullable
	private final JsonValue timeout;

	// ---------------------------------------------------------------------------------------------

	protected OpenJobRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.timeout = builder.timeout;

	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
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

		if (this.timeout != null) {

			generator.writeKey("timeout");
			generator.write(this.timeout);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OpenJobRequest}.
	 */
	public static class Builder implements ObjectBuilder<OpenJobRequest> {
		private String jobId;

		@Nullable
		private JsonValue timeout;

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link OpenJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OpenJobRequest build() {

			return new OpenJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for OpenJobRequest
	 */
	public static final JsonpDeserializer<OpenJobRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, OpenJobRequest::setupOpenJobRequestDeserializer);

	protected static void setupOpenJobRequestDeserializer(DelegatingDeserializer<OpenJobRequest.Builder> op) {

		op.add(Builder::timeout, JsonpDeserializer.jsonValueDeserializer(), "timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.open_job}".
	 */
	public static final Endpoint<OpenJobRequest, OpenJobResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
					buf.append("/_open");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, OpenJobResponse.DESERIALIZER);
}
