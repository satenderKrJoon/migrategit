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

package co.elastic.clients.elasticsearch.ml.info;

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

// typedef: ml.info.Defaults
public final class Defaults implements ToJsonp {
	private final AnomalyDetectors anomalyDetectors;

	private final Datafeeds datafeeds;

	// ---------------------------------------------------------------------------------------------

	protected Defaults(Builder builder) {

		this.anomalyDetectors = Objects.requireNonNull(builder.anomalyDetectors, "anomaly_detectors");
		this.datafeeds = Objects.requireNonNull(builder.datafeeds, "datafeeds");

	}

	/**
	 * API name: {@code anomaly_detectors}
	 */
	public AnomalyDetectors anomalyDetectors() {
		return this.anomalyDetectors;
	}

	/**
	 * API name: {@code datafeeds}
	 */
	public Datafeeds datafeeds() {
		return this.datafeeds;
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

		generator.writeKey("anomaly_detectors");
		this.anomalyDetectors.toJsonp(generator, mapper);

		generator.writeKey("datafeeds");
		this.datafeeds.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Defaults}.
	 */
	public static class Builder implements ObjectBuilder<Defaults> {
		private AnomalyDetectors anomalyDetectors;

		private Datafeeds datafeeds;

		/**
		 * API name: {@code anomaly_detectors}
		 */
		public Builder anomalyDetectors(AnomalyDetectors value) {
			this.anomalyDetectors = value;
			return this;
		}

		/**
		 * API name: {@code anomaly_detectors}
		 */
		public Builder anomalyDetectors(Function<AnomalyDetectors.Builder, ObjectBuilder<AnomalyDetectors>> fn) {
			return this.anomalyDetectors(fn.apply(new AnomalyDetectors.Builder()).build());
		}

		/**
		 * API name: {@code datafeeds}
		 */
		public Builder datafeeds(Datafeeds value) {
			this.datafeeds = value;
			return this;
		}

		/**
		 * API name: {@code datafeeds}
		 */
		public Builder datafeeds(Function<Datafeeds.Builder, ObjectBuilder<Datafeeds>> fn) {
			return this.datafeeds(fn.apply(new Datafeeds.Builder()).build());
		}

		/**
		 * Builds a {@link Defaults}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Defaults build() {

			return new Defaults(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Defaults
	 */
	public static final JsonpDeserializer<Defaults> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Defaults::setupDefaultsDeserializer);

	protected static void setupDefaultsDeserializer(DelegatingDeserializer<Defaults.Builder> op) {

		op.add(Builder::anomalyDetectors, AnomalyDetectors.DESERIALIZER, "anomaly_detectors");
		op.add(Builder::datafeeds, Datafeeds.DESERIALIZER, "datafeeds");

	}

}
