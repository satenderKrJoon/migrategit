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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterNetworkTypes
public final class ClusterNetworkTypes implements ToJsonp {
	private final Map<String, Number> httpTypes;

	private final Map<String, Number> transportTypes;

	// ---------------------------------------------------------------------------------------------

	protected ClusterNetworkTypes(Builder builder) {

		this.httpTypes = Objects.requireNonNull(builder.httpTypes, "http_types");
		this.transportTypes = Objects.requireNonNull(builder.transportTypes, "transport_types");

	}

	/**
	 * API name: {@code http_types}
	 */
	public Map<String, Number> httpTypes() {
		return this.httpTypes;
	}

	/**
	 * API name: {@code transport_types}
	 */
	public Map<String, Number> transportTypes() {
		return this.transportTypes;
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

		generator.writeKey("http_types");
		generator.writeStartObject();
		for (Map.Entry<String, Number> item0 : this.httpTypes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue().doubleValue());

		}
		generator.writeEnd();

		generator.writeKey("transport_types");
		generator.writeStartObject();
		for (Map.Entry<String, Number> item0 : this.transportTypes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue().doubleValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterNetworkTypes}.
	 */
	public static class Builder implements ObjectBuilder<ClusterNetworkTypes> {
		private Map<String, Number> httpTypes;

		private Map<String, Number> transportTypes;

		/**
		 * API name: {@code http_types}
		 */
		public Builder httpTypes(Map<String, Number> value) {
			this.httpTypes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #httpTypes(Map)}, creating the map if needed.
		 */
		public Builder putHttpTypes(String key, Number value) {
			if (this.httpTypes == null) {
				this.httpTypes = new HashMap<>();
			}
			this.httpTypes.put(key, value);
			return this;
		}

		/**
		 * API name: {@code transport_types}
		 */
		public Builder transportTypes(Map<String, Number> value) {
			this.transportTypes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #transportTypes(Map)}, creating the map if needed.
		 */
		public Builder putTransportTypes(String key, Number value) {
			if (this.transportTypes == null) {
				this.transportTypes = new HashMap<>();
			}
			this.transportTypes.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link ClusterNetworkTypes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterNetworkTypes build() {

			return new ClusterNetworkTypes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterNetworkTypes
	 */
	public static final JsonpDeserializer<ClusterNetworkTypes> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterNetworkTypes::setupClusterNetworkTypesDeserializer);

	protected static void setupClusterNetworkTypesDeserializer(DelegatingDeserializer<ClusterNetworkTypes.Builder> op) {

		op.add(Builder::httpTypes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.numberDeserializer()),
				"http_types");
		op.add(Builder::transportTypes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.numberDeserializer()),
				"transport_types");

	}

}
