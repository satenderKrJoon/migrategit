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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: snapshot._types.RepositorySettings
public final class RepositorySettings implements ToJsonp {
	@Nullable
	private final String chunkSize;

	@Nullable
	private final JsonValue compress;

	@Nullable
	private final JsonValue concurrentStreams;

	private final String location;

	@Nullable
	private final JsonValue readOnly;

	// ---------------------------------------------------------------------------------------------

	protected RepositorySettings(Builder builder) {

		this.chunkSize = builder.chunkSize;
		this.compress = builder.compress;
		this.concurrentStreams = builder.concurrentStreams;
		this.location = Objects.requireNonNull(builder.location, "location");
		this.readOnly = builder.readOnly;

	}

	/**
	 * API name: {@code chunk_size}
	 */
	@Nullable
	public String chunkSize() {
		return this.chunkSize;
	}

	/**
	 * API name: {@code compress}
	 */
	@Nullable
	public JsonValue compress() {
		return this.compress;
	}

	/**
	 * API name: {@code concurrent_streams}
	 */
	@Nullable
	public JsonValue concurrentStreams() {
		return this.concurrentStreams;
	}

	/**
	 * API name: {@code location}
	 */
	public String location() {
		return this.location;
	}

	/**
	 * API name: {@code read_only}
	 */
	@Nullable
	public JsonValue readOnly() {
		return this.readOnly;
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

		if (this.chunkSize != null) {

			generator.writeKey("chunk_size");
			generator.write(this.chunkSize);

		}
		if (this.compress != null) {

			generator.writeKey("compress");
			generator.write(this.compress);

		}
		if (this.concurrentStreams != null) {

			generator.writeKey("concurrent_streams");
			generator.write(this.concurrentStreams);

		}

		generator.writeKey("location");
		generator.write(this.location);

		if (this.readOnly != null) {

			generator.writeKey("read_only");
			generator.write(this.readOnly);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositorySettings}.
	 */
	public static class Builder implements ObjectBuilder<RepositorySettings> {
		@Nullable
		private String chunkSize;

		@Nullable
		private JsonValue compress;

		@Nullable
		private JsonValue concurrentStreams;

		private String location;

		@Nullable
		private JsonValue readOnly;

		/**
		 * API name: {@code chunk_size}
		 */
		public Builder chunkSize(@Nullable String value) {
			this.chunkSize = value;
			return this;
		}

		/**
		 * API name: {@code compress}
		 */
		public Builder compress(@Nullable JsonValue value) {
			this.compress = value;
			return this;
		}

		/**
		 * API name: {@code concurrent_streams}
		 */
		public Builder concurrentStreams(@Nullable JsonValue value) {
			this.concurrentStreams = value;
			return this;
		}

		/**
		 * API name: {@code location}
		 */
		public Builder location(String value) {
			this.location = value;
			return this;
		}

		/**
		 * API name: {@code read_only}
		 */
		public Builder readOnly(@Nullable JsonValue value) {
			this.readOnly = value;
			return this;
		}

		/**
		 * Builds a {@link RepositorySettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositorySettings build() {

			return new RepositorySettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RepositorySettings
	 */
	public static final JsonpDeserializer<RepositorySettings> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RepositorySettings::setupRepositorySettingsDeserializer);

	protected static void setupRepositorySettingsDeserializer(DelegatingDeserializer<RepositorySettings.Builder> op) {

		op.add(Builder::chunkSize, JsonpDeserializer.stringDeserializer(), "chunk_size");
		op.add(Builder::compress, JsonpDeserializer.jsonValueDeserializer(), "compress");
		op.add(Builder::concurrentStreams, JsonpDeserializer.jsonValueDeserializer(), "concurrent_streams");
		op.add(Builder::location, JsonpDeserializer.stringDeserializer(), "location");
		op.add(Builder::readOnly, JsonpDeserializer.jsonValueDeserializer(), "read_only", "readonly");

	}

}
