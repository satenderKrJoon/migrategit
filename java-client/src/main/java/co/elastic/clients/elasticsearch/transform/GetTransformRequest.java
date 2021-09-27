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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: transform.get_transform.Request
public final class GetTransformRequest extends RequestBase {
	@Nullable
	private final String transformId;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Number from;

	@Nullable
	private final Number size;

	@Nullable
	private final Boolean excludeGenerated;

	// ---------------------------------------------------------------------------------------------

	protected GetTransformRequest(Builder builder) {

		this.transformId = builder.transformId;
		this.allowNoMatch = builder.allowNoMatch;
		this.from = builder.from;
		this.size = builder.size;
		this.excludeGenerated = builder.excludeGenerated;

	}

	/**
	 * API name: {@code transform_id}
	 */
	@Nullable
	public String transformId() {
		return this.transformId;
	}

	/**
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code exclude_generated}
	 */
	@Nullable
	public Boolean excludeGenerated() {
		return this.excludeGenerated;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTransformRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetTransformRequest> {
		@Nullable
		private String transformId;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Number from;

		@Nullable
		private Number size;

		@Nullable
		private Boolean excludeGenerated;

		/**
		 * API name: {@code transform_id}
		 */
		public Builder transformId(@Nullable String value) {
			this.transformId = value;
			return this;
		}

		/**
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code exclude_generated}
		 */
		public Builder excludeGenerated(@Nullable Boolean value) {
			this.excludeGenerated = value;
			return this;
		}

		/**
		 * Builds a {@link GetTransformRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTransformRequest build() {

			return new GetTransformRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.get_transform}".
	 */
	public static final Endpoint<GetTransformRequest, GetTransformResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _transformId = 1 << 0;

				int propsSet = 0;

				if (request.transformId() != null)
					propsSet |= _transformId;

				if (propsSet == (_transformId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_transform");
					buf.append("/");
					buf.append(request.transformId);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_transform");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.from != null) {
					params.put("from", request.from.toString());
				}
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				if (request.excludeGenerated != null) {
					params.put("exclude_generated", String.valueOf(request.excludeGenerated));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, GetTransformResponse.DESERIALIZER);
}
