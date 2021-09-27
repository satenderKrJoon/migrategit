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

package co.elastic.clients.elasticsearch.rollup;

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

// typedef: rollup.start_rollup_job.Response
public final class StartRollupJobResponse implements ToJsonp {
	private final Boolean started;

	// ---------------------------------------------------------------------------------------------

	protected StartRollupJobResponse(Builder builder) {

		this.started = Objects.requireNonNull(builder.started, "started");

	}

	/**
	 * API name: {@code started}
	 */
	public Boolean started() {
		return this.started;
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

		generator.writeKey("started");
		generator.write(this.started);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartRollupJobResponse}.
	 */
	public static class Builder implements ObjectBuilder<StartRollupJobResponse> {
		private Boolean started;

		/**
		 * API name: {@code started}
		 */
		public Builder started(Boolean value) {
			this.started = value;
			return this;
		}

		/**
		 * Builds a {@link StartRollupJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartRollupJobResponse build() {

			return new StartRollupJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for StartRollupJobResponse
	 */
	public static final JsonpDeserializer<StartRollupJobResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StartRollupJobResponse::setupStartRollupJobResponseDeserializer);

	protected static void setupStartRollupJobResponseDeserializer(
			DelegatingDeserializer<StartRollupJobResponse.Builder> op) {

		op.add(Builder::started, JsonpDeserializer.booleanDeserializer(), "started");

	}

}
