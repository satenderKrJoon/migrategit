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

package co.elastic.clients.elasticsearch.license;

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
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.post.Request
public final class PostRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final Boolean acknowledge;

	@Nullable
	private final License license;

	@Nullable
	private final List<License> licenses;

	// ---------------------------------------------------------------------------------------------

	protected PostRequest(Builder builder) {

		this.acknowledge = builder.acknowledge;
		this.license = builder.license;
		this.licenses = builder.licenses;

	}

	/**
	 * API name: {@code acknowledge}
	 */
	@Nullable
	public Boolean acknowledge() {
		return this.acknowledge;
	}

	/**
	 * API name: {@code license}
	 */
	@Nullable
	public License license() {
		return this.license;
	}

	/**
	 * API name: {@code licenses}
	 */
	@Nullable
	public List<License> licenses() {
		return this.licenses;
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

		if (this.license != null) {

			generator.writeKey("license");
			this.license.toJsonp(generator, mapper);

		}
		if (this.licenses != null) {

			generator.writeKey("licenses");
			generator.writeStartArray();
			for (License item0 : this.licenses) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostRequest}.
	 */
	public static class Builder implements ObjectBuilder<PostRequest> {
		@Nullable
		private Boolean acknowledge;

		@Nullable
		private License license;

		@Nullable
		private List<License> licenses;

		/**
		 * API name: {@code acknowledge}
		 */
		public Builder acknowledge(@Nullable Boolean value) {
			this.acknowledge = value;
			return this;
		}

		/**
		 * API name: {@code license}
		 */
		public Builder license(@Nullable License value) {
			this.license = value;
			return this;
		}

		/**
		 * API name: {@code license}
		 */
		public Builder license(Function<License.Builder, ObjectBuilder<License>> fn) {
			return this.license(fn.apply(new License.Builder()).build());
		}

		/**
		 * API name: {@code licenses}
		 */
		public Builder licenses(@Nullable List<License> value) {
			this.licenses = value;
			return this;
		}

		/**
		 * API name: {@code licenses}
		 */
		public Builder licenses(License... value) {
			this.licenses = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #licenses(List)}, creating the list if needed.
		 */
		public Builder addLicenses(License value) {
			if (this.licenses == null) {
				this.licenses = new ArrayList<>();
			}
			this.licenses.add(value);
			return this;
		}

		/**
		 * Set {@link #licenses(List)} to a singleton list.
		 */
		public Builder licenses(Function<License.Builder, ObjectBuilder<License>> fn) {
			return this.licenses(fn.apply(new License.Builder()).build());
		}

		/**
		 * Add a value to {@link #licenses(List)}, creating the list if needed.
		 */
		public Builder addLicenses(Function<License.Builder, ObjectBuilder<License>> fn) {
			return this.addLicenses(fn.apply(new License.Builder()).build());
		}

		/**
		 * Builds a {@link PostRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostRequest build() {

			return new PostRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PostRequest
	 */
	public static final JsonpDeserializer<PostRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PostRequest::setupPostRequestDeserializer);

	protected static void setupPostRequestDeserializer(DelegatingDeserializer<PostRequest.Builder> op) {

		op.add(Builder::license, License.DESERIALIZER, "license");
		op.add(Builder::licenses, JsonpDeserializer.arrayDeserializer(License.DESERIALIZER), "licenses");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code license.post}".
	 */
	public static final Endpoint<PostRequest, PostResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_license";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.acknowledge != null) {
					params.put("acknowledge", String.valueOf(request.acknowledge));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PostResponse.DESERIALIZER);
}
