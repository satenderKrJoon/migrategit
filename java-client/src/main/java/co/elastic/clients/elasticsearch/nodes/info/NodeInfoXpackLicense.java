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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpackLicense
public final class NodeInfoXpackLicense implements ToJsonp {
	private final NodeInfoXpackLicenseType selfGenerated;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoXpackLicense(Builder builder) {

		this.selfGenerated = Objects.requireNonNull(builder.selfGenerated, "self_generated");

	}

	/**
	 * API name: {@code self_generated}
	 */
	public NodeInfoXpackLicenseType selfGenerated() {
		return this.selfGenerated;
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

		generator.writeKey("self_generated");
		this.selfGenerated.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackLicense}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoXpackLicense> {
		private NodeInfoXpackLicenseType selfGenerated;

		/**
		 * API name: {@code self_generated}
		 */
		public Builder selfGenerated(NodeInfoXpackLicenseType value) {
			this.selfGenerated = value;
			return this;
		}

		/**
		 * API name: {@code self_generated}
		 */
		public Builder selfGenerated(
				Function<NodeInfoXpackLicenseType.Builder, ObjectBuilder<NodeInfoXpackLicenseType>> fn) {
			return this.selfGenerated(fn.apply(new NodeInfoXpackLicenseType.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoXpackLicense}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackLicense build() {

			return new NodeInfoXpackLicense(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoXpackLicense
	 */
	public static final JsonpDeserializer<NodeInfoXpackLicense> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoXpackLicense::setupNodeInfoXpackLicenseDeserializer);

	protected static void setupNodeInfoXpackLicenseDeserializer(
			DelegatingDeserializer<NodeInfoXpackLicense.Builder> op) {

		op.add(Builder::selfGenerated, NodeInfoXpackLicenseType.DESERIALIZER, "self_generated");

	}

}
