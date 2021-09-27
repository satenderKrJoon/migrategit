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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.clear_scroll.Request
public final class ClearScrollRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final List<String> scrollId;

	// ---------------------------------------------------------------------------------------------

	protected ClearScrollRequest(Builder builder) {

		this.scrollId = builder.scrollId;

	}

	/**
	 * API name: {@code scroll_id}
	 */
	@Nullable
	public List<String> scrollId() {
		return this.scrollId;
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearScrollRequest}.
	 */
	public static class Builder implements ObjectBuilder<ClearScrollRequest> {
		@Nullable
		private List<String> scrollId;

		/**
		 * API name: {@code scroll_id}
		 */
		public Builder scrollId(@Nullable List<String> value) {
			this.scrollId = value;
			return this;
		}

		/**
		 * API name: {@code scroll_id}
		 */
		public Builder scrollId(String... value) {
			this.scrollId = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #scrollId(List)}, creating the list if needed.
		 */
		public Builder addScrollId(String value) {
			if (this.scrollId == null) {
				this.scrollId = new ArrayList<>();
			}
			this.scrollId.add(value);
			return this;
		}

		/**
		 * Builds a {@link ClearScrollRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearScrollRequest build() {

			return new ClearScrollRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClearScrollRequest
	 */
	public static final JsonpDeserializer<ClearScrollRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClearScrollRequest::setupClearScrollRequestDeserializer);

	protected static void setupClearScrollRequestDeserializer(DelegatingDeserializer<ClearScrollRequest.Builder> op) {

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code clear_scroll}".
	 */
	public static final Endpoint<ClearScrollRequest, ClearScrollResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _scrollId = 1 << 0;

				int propsSet = 0;

				if (request.scrollId() != null)
					propsSet |= _scrollId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_search");
					buf.append("/scroll");
					return buf.toString();
				}
				if (propsSet == (_scrollId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_search");
					buf.append("/scroll");
					buf.append("/");
					buf.append(request.scrollId.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, ClearScrollResponse.DESERIALIZER);
}
