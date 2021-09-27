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

import co.elastic.clients.base.AdditionalProperties;
import co.elastic.clients.elasticsearch.security.delete_privileges.FoundStatus;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;

// typedef: security.delete_privileges.Response
public final class DeletePrivilegesResponse extends AdditionalProperties<String, Map<String, FoundStatus>> {
	// ---------------------------------------------------------------------------------------------

	protected DeletePrivilegesResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeletePrivilegesResponse}.
	 */
	public static class Builder extends AdditionalProperties.AbstractBuilder<String, Map<String, FoundStatus>, Builder>
			implements
				ObjectBuilder<DeletePrivilegesResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeletePrivilegesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeletePrivilegesResponse build() {
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new DeletePrivilegesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DeletePrivilegesResponse
	 */
	public static final JsonpDeserializer<DeletePrivilegesResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DeletePrivilegesResponse::setupDeletePrivilegesResponseDeserializer);

	protected static void setupDeletePrivilegesResponseDeserializer(
			DelegatingDeserializer<DeletePrivilegesResponse.Builder> op) {
		AdditionalProperties.setupAdditionalPropertiesDeserializer(op, JsonpDeserializer.stringDeserializer(),
				JsonpDeserializer.stringMapDeserializer(FoundStatus.DESERIALIZER));

	}

}
