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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.StoredScript;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.put_script.Request
public final class PutScriptRequest extends RequestBase implements ToJsonp {
	private final String id;

	@Nullable
	private final String context;

	@Nullable
	private final JsonValue masterTimeout;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final StoredScript script;

	// ---------------------------------------------------------------------------------------------

	protected PutScriptRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.context = builder.context;
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.script = builder.script;

	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code context}
	 */
	@Nullable
	public String context() {
		return this.context;
	}

	/**
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public StoredScript script() {
		return this.script;
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

		if (this.script != null) {

			generator.writeKey("script");
			this.script.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutScriptRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutScriptRequest> {
		private String id;

		@Nullable
		private String context;

		@Nullable
		private JsonValue masterTimeout;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private StoredScript script;

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code context}
		 */
		public Builder context(@Nullable String value) {
			this.context = value;
			return this;
		}

		/**
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
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
		 * API name: {@code script}
		 */
		public Builder script(@Nullable StoredScript value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(Function<StoredScript.Builder, ObjectBuilder<StoredScript>> fn) {
			return this.script(fn.apply(new StoredScript.Builder()).build());
		}

		/**
		 * Builds a {@link PutScriptRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutScriptRequest build() {

			return new PutScriptRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutScriptRequest
	 */
	public static final JsonpDeserializer<PutScriptRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutScriptRequest::setupPutScriptRequestDeserializer);

	protected static void setupPutScriptRequestDeserializer(DelegatingDeserializer<PutScriptRequest.Builder> op) {

		op.add(Builder::script, StoredScript.DESERIALIZER, "script");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code put_script}".
	 */
	public static final Endpoint<PutScriptRequest, PutScriptResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;
				final int _context = 1 << 1;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;
				if (request.context() != null)
					propsSet |= _context;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_scripts");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				if (propsSet == (_id | _context)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_scripts");
					buf.append("/");
					buf.append(request.id);
					buf.append("/");
					buf.append(request.context);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutScriptResponse.DESERIALIZER);
}
