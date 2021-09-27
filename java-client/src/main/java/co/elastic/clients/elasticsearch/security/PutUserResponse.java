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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.put_user.Response
public final class PutUserResponse implements ToJsonp {
	private final Boolean created;

	// ---------------------------------------------------------------------------------------------

	protected PutUserResponse(Builder builder) {

		this.created = Objects.requireNonNull(builder.created, "created");

	}

	/**
	 * API name: {@code created}
	 */
	public Boolean created() {
		return this.created;
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

		generator.writeKey("created");
		generator.write(this.created);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutUserResponse}.
	 */
	public static class Builder implements ObjectBuilder<PutUserResponse> {
		private Boolean created;

		/**
		 * API name: {@code created}
		 */
		public Builder created(Boolean value) {
			this.created = value;
			return this;
		}

		/**
		 * Builds a {@link PutUserResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutUserResponse build() {

			return new PutUserResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutUserResponse
	 */
	public static final JsonpDeserializer<PutUserResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutUserResponse::setupPutUserResponseDeserializer);

	protected static void setupPutUserResponseDeserializer(DelegatingDeserializer<PutUserResponse.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.booleanDeserializer(), "created");

	}

}
