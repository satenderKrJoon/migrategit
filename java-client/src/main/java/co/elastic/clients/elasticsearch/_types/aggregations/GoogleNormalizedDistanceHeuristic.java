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

package co.elastic.clients.elasticsearch._types.aggregations;

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

// typedef: _types.aggregations.GoogleNormalizedDistanceHeuristic
public final class GoogleNormalizedDistanceHeuristic implements ToJsonp {
	private final Boolean backgroundIsSuperset;

	// ---------------------------------------------------------------------------------------------

	protected GoogleNormalizedDistanceHeuristic(Builder builder) {

		this.backgroundIsSuperset = Objects.requireNonNull(builder.backgroundIsSuperset, "background_is_superset");

	}

	/**
	 * API name: {@code background_is_superset}
	 */
	public Boolean backgroundIsSuperset() {
		return this.backgroundIsSuperset;
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

		generator.writeKey("background_is_superset");
		generator.write(this.backgroundIsSuperset);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GoogleNormalizedDistanceHeuristic}.
	 */
	public static class Builder implements ObjectBuilder<GoogleNormalizedDistanceHeuristic> {
		private Boolean backgroundIsSuperset;

		/**
		 * API name: {@code background_is_superset}
		 */
		public Builder backgroundIsSuperset(Boolean value) {
			this.backgroundIsSuperset = value;
			return this;
		}

		/**
		 * Builds a {@link GoogleNormalizedDistanceHeuristic}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GoogleNormalizedDistanceHeuristic build() {

			return new GoogleNormalizedDistanceHeuristic(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GoogleNormalizedDistanceHeuristic
	 */
	public static final JsonpDeserializer<GoogleNormalizedDistanceHeuristic> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					GoogleNormalizedDistanceHeuristic::setupGoogleNormalizedDistanceHeuristicDeserializer);

	protected static void setupGoogleNormalizedDistanceHeuristicDeserializer(
			DelegatingDeserializer<GoogleNormalizedDistanceHeuristic.Builder> op) {

		op.add(Builder::backgroundIsSuperset, JsonpDeserializer.booleanDeserializer(), "background_is_superset");

	}

}
