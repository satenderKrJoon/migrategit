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

package co.elastic.clients.elasticsearch.watcher;

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

// typedef: watcher.ack_watch.Response
public final class AckWatchResponse implements ToJsonp {
	private final WatchStatus status;

	// ---------------------------------------------------------------------------------------------

	protected AckWatchResponse(Builder builder) {

		this.status = Objects.requireNonNull(builder.status, "status");

	}

	/**
	 * API name: {@code status}
	 */
	public WatchStatus status() {
		return this.status;
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

		generator.writeKey("status");
		this.status.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AckWatchResponse}.
	 */
	public static class Builder implements ObjectBuilder<AckWatchResponse> {
		private WatchStatus status;

		/**
		 * API name: {@code status}
		 */
		public Builder status(WatchStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(Function<WatchStatus.Builder, ObjectBuilder<WatchStatus>> fn) {
			return this.status(fn.apply(new WatchStatus.Builder()).build());
		}

		/**
		 * Builds a {@link AckWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AckWatchResponse build() {

			return new AckWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AckWatchResponse
	 */
	public static final JsonpDeserializer<AckWatchResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AckWatchResponse::setupAckWatchResponseDeserializer);

	protected static void setupAckWatchResponseDeserializer(DelegatingDeserializer<AckWatchResponse.Builder> op) {

		op.add(Builder::status, WatchStatus.DESERIALIZER, "status");

	}

}
