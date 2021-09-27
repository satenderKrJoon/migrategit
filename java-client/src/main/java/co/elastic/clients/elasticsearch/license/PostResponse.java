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

import co.elastic.clients.elasticsearch.license.post.Acknowledgement;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.post.Response
public final class PostResponse implements ToJsonp {
	@Nullable
	private final Acknowledgement acknowledge;

	private final Boolean acknowledged;

	private final JsonValue licenseStatus;

	// ---------------------------------------------------------------------------------------------

	protected PostResponse(Builder builder) {

		this.acknowledge = builder.acknowledge;
		this.acknowledged = Objects.requireNonNull(builder.acknowledged, "acknowledged");
		this.licenseStatus = Objects.requireNonNull(builder.licenseStatus, "license_status");

	}

	/**
	 * API name: {@code acknowledge}
	 */
	@Nullable
	public Acknowledgement acknowledge() {
		return this.acknowledge;
	}

	/**
	 * API name: {@code acknowledged}
	 */
	public Boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * API name: {@code license_status}
	 */
	public JsonValue licenseStatus() {
		return this.licenseStatus;
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

		if (this.acknowledge != null) {

			generator.writeKey("acknowledge");
			this.acknowledge.toJsonp(generator, mapper);

		}

		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		generator.writeKey("license_status");
		generator.write(this.licenseStatus);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostResponse}.
	 */
	public static class Builder implements ObjectBuilder<PostResponse> {
		@Nullable
		private Acknowledgement acknowledge;

		private Boolean acknowledged;

		private JsonValue licenseStatus;

		/**
		 * API name: {@code acknowledge}
		 */
		public Builder acknowledge(@Nullable Acknowledgement value) {
			this.acknowledge = value;
			return this;
		}

		/**
		 * API name: {@code acknowledge}
		 */
		public Builder acknowledge(Function<Acknowledgement.Builder, ObjectBuilder<Acknowledgement>> fn) {
			return this.acknowledge(fn.apply(new Acknowledgement.Builder()).build());
		}

		/**
		 * API name: {@code acknowledged}
		 */
		public Builder acknowledged(Boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * API name: {@code license_status}
		 */
		public Builder licenseStatus(JsonValue value) {
			this.licenseStatus = value;
			return this;
		}

		/**
		 * Builds a {@link PostResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostResponse build() {

			return new PostResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PostResponse
	 */
	public static final JsonpDeserializer<PostResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PostResponse::setupPostResponseDeserializer);

	protected static void setupPostResponseDeserializer(DelegatingDeserializer<PostResponse.Builder> op) {

		op.add(Builder::acknowledge, Acknowledgement.DESERIALIZER, "acknowledge");
		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::licenseStatus, JsonpDeserializer.jsonValueDeserializer(), "license_status");

	}

}
