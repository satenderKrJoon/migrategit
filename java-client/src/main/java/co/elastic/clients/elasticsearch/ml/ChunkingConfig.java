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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.ChunkingConfig
public final class ChunkingConfig implements ToJsonp {
	private final JsonValue mode;

	@Nullable
	private final JsonValue timeSpan;

	// ---------------------------------------------------------------------------------------------

	protected ChunkingConfig(Builder builder) {

		this.mode = Objects.requireNonNull(builder.mode, "mode");
		this.timeSpan = builder.timeSpan;

	}

	/**
	 * API name: {@code mode}
	 */
	public JsonValue mode() {
		return this.mode;
	}

	/**
	 * API name: {@code time_span}
	 */
	@Nullable
	public JsonValue timeSpan() {
		return this.timeSpan;
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

		generator.writeKey("mode");
		generator.write(this.mode);

		if (this.timeSpan != null) {

			generator.writeKey("time_span");
			generator.write(this.timeSpan);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChunkingConfig}.
	 */
	public static class Builder implements ObjectBuilder<ChunkingConfig> {
		private JsonValue mode;

		@Nullable
		private JsonValue timeSpan;

		/**
		 * API name: {@code mode}
		 */
		public Builder mode(JsonValue value) {
			this.mode = value;
			return this;
		}

		/**
		 * API name: {@code time_span}
		 */
		public Builder timeSpan(@Nullable JsonValue value) {
			this.timeSpan = value;
			return this;
		}

		/**
		 * Builds a {@link ChunkingConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChunkingConfig build() {

			return new ChunkingConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ChunkingConfig
	 */
	public static final JsonpDeserializer<ChunkingConfig> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ChunkingConfig::setupChunkingConfigDeserializer);

	protected static void setupChunkingConfigDeserializer(DelegatingDeserializer<ChunkingConfig.Builder> op) {

		op.add(Builder::mode, JsonpDeserializer.jsonValueDeserializer(), "mode");
		op.add(Builder::timeSpan, JsonpDeserializer.jsonValueDeserializer(), "time_span");

	}

}
