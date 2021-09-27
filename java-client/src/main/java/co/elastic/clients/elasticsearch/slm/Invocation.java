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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: slm._types.Invocation
public final class Invocation implements ToJsonp {
	private final String snapshotName;

	private final String time;

	// ---------------------------------------------------------------------------------------------

	protected Invocation(Builder builder) {

		this.snapshotName = Objects.requireNonNull(builder.snapshotName, "snapshot_name");
		this.time = Objects.requireNonNull(builder.time, "time");

	}

	/**
	 * API name: {@code snapshot_name}
	 */
	public String snapshotName() {
		return this.snapshotName;
	}

	/**
	 * API name: {@code time}
	 */
	public String time() {
		return this.time;
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

		generator.writeKey("snapshot_name");
		generator.write(this.snapshotName);

		generator.writeKey("time");
		generator.write(this.time);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Invocation}.
	 */
	public static class Builder implements ObjectBuilder<Invocation> {
		private String snapshotName;

		private String time;

		/**
		 * API name: {@code snapshot_name}
		 */
		public Builder snapshotName(String value) {
			this.snapshotName = value;
			return this;
		}

		/**
		 * API name: {@code time}
		 */
		public Builder time(String value) {
			this.time = value;
			return this;
		}

		/**
		 * Builds a {@link Invocation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Invocation build() {

			return new Invocation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Invocation
	 */
	public static final JsonpDeserializer<Invocation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Invocation::setupInvocationDeserializer);

	protected static void setupInvocationDeserializer(DelegatingDeserializer<Invocation.Builder> op) {

		op.add(Builder::snapshotName, JsonpDeserializer.stringDeserializer(), "snapshot_name");
		op.add(Builder::time, JsonpDeserializer.stringDeserializer(), "time");

	}

}
