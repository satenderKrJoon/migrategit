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

package co.elastic.clients.elasticsearch._types.mapping;

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

// typedef: _types.mapping.RoutingField
public final class RoutingField implements ToJsonp {
	private final Boolean required;

	// ---------------------------------------------------------------------------------------------

	protected RoutingField(Builder builder) {

		this.required = Objects.requireNonNull(builder.required, "required");

	}

	/**
	 * API name: {@code required}
	 */
	public Boolean required() {
		return this.required;
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

		generator.writeKey("required");
		generator.write(this.required);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoutingField}.
	 */
	public static class Builder implements ObjectBuilder<RoutingField> {
		private Boolean required;

		/**
		 * API name: {@code required}
		 */
		public Builder required(Boolean value) {
			this.required = value;
			return this;
		}

		/**
		 * Builds a {@link RoutingField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoutingField build() {

			return new RoutingField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RoutingField
	 */
	public static final JsonpDeserializer<RoutingField> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RoutingField::setupRoutingFieldDeserializer);

	protected static void setupRoutingFieldDeserializer(DelegatingDeserializer<RoutingField.Builder> op) {

		op.add(Builder::required, JsonpDeserializer.booleanDeserializer(), "required");

	}

}
