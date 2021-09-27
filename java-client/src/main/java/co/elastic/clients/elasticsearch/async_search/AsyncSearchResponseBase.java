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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: async_search._types.AsyncSearchResponseBase
public abstract class AsyncSearchResponseBase implements ToJsonp {
	@Nullable
	private final String id;

	private final Boolean isPartial;

	private final Boolean isRunning;

	private final JsonValue expirationTimeInMillis;

	private final JsonValue startTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	protected AsyncSearchResponseBase(AbstractBuilder<?> builder) {

		this.id = builder.id;
		this.isPartial = Objects.requireNonNull(builder.isPartial, "is_partial");
		this.isRunning = Objects.requireNonNull(builder.isRunning, "is_running");
		this.expirationTimeInMillis = Objects.requireNonNull(builder.expirationTimeInMillis,
				"expiration_time_in_millis");
		this.startTimeInMillis = Objects.requireNonNull(builder.startTimeInMillis, "start_time_in_millis");

	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code is_partial}
	 */
	public Boolean isPartial() {
		return this.isPartial;
	}

	/**
	 * API name: {@code is_running}
	 */
	public Boolean isRunning() {
		return this.isRunning;
	}

	/**
	 * API name: {@code expiration_time_in_millis}
	 */
	public JsonValue expirationTimeInMillis() {
		return this.expirationTimeInMillis;
	}

	/**
	 * API name: {@code start_time_in_millis}
	 */
	public JsonValue startTimeInMillis() {
		return this.startTimeInMillis;
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

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}

		generator.writeKey("is_partial");
		generator.write(this.isPartial);

		generator.writeKey("is_running");
		generator.write(this.isRunning);

		generator.writeKey("expiration_time_in_millis");
		generator.write(this.expirationTimeInMillis);

		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis);

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private String id;

		private Boolean isPartial;

		private Boolean isRunning;

		private JsonValue expirationTimeInMillis;

		private JsonValue startTimeInMillis;

		/**
		 * API name: {@code id}
		 */
		public BuilderT id(@Nullable String value) {
			this.id = value;
			return self();
		}

		/**
		 * API name: {@code is_partial}
		 */
		public BuilderT isPartial(Boolean value) {
			this.isPartial = value;
			return self();
		}

		/**
		 * API name: {@code is_running}
		 */
		public BuilderT isRunning(Boolean value) {
			this.isRunning = value;
			return self();
		}

		/**
		 * API name: {@code expiration_time_in_millis}
		 */
		public BuilderT expirationTimeInMillis(JsonValue value) {
			this.expirationTimeInMillis = value;
			return self();
		}

		/**
		 * API name: {@code start_time_in_millis}
		 */
		public BuilderT startTimeInMillis(JsonValue value) {
			this.startTimeInMillis = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupAsyncSearchResponseBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(AbstractBuilder::isPartial, JsonpDeserializer.booleanDeserializer(), "is_partial");
		op.add(AbstractBuilder::isRunning, JsonpDeserializer.booleanDeserializer(), "is_running");
		op.add(AbstractBuilder::expirationTimeInMillis, JsonpDeserializer.jsonValueDeserializer(),
				"expiration_time_in_millis");
		op.add(AbstractBuilder::startTimeInMillis, JsonpDeserializer.jsonValueDeserializer(), "start_time_in_millis");

	}

}
