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

package co.elastic.clients.elasticsearch.ccr;

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

// typedef: ccr.create_follow_index.Response
public final class CreateFollowIndexResponse implements ToJsonp {
	private final Boolean followIndexCreated;

	private final Boolean followIndexShardsAcked;

	private final Boolean indexFollowingStarted;

	// ---------------------------------------------------------------------------------------------

	protected CreateFollowIndexResponse(Builder builder) {

		this.followIndexCreated = Objects.requireNonNull(builder.followIndexCreated, "follow_index_created");
		this.followIndexShardsAcked = Objects.requireNonNull(builder.followIndexShardsAcked,
				"follow_index_shards_acked");
		this.indexFollowingStarted = Objects.requireNonNull(builder.indexFollowingStarted, "index_following_started");

	}

	/**
	 * API name: {@code follow_index_created}
	 */
	public Boolean followIndexCreated() {
		return this.followIndexCreated;
	}

	/**
	 * API name: {@code follow_index_shards_acked}
	 */
	public Boolean followIndexShardsAcked() {
		return this.followIndexShardsAcked;
	}

	/**
	 * API name: {@code index_following_started}
	 */
	public Boolean indexFollowingStarted() {
		return this.indexFollowingStarted;
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

		generator.writeKey("follow_index_created");
		generator.write(this.followIndexCreated);

		generator.writeKey("follow_index_shards_acked");
		generator.write(this.followIndexShardsAcked);

		generator.writeKey("index_following_started");
		generator.write(this.indexFollowingStarted);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateFollowIndexResponse}.
	 */
	public static class Builder implements ObjectBuilder<CreateFollowIndexResponse> {
		private Boolean followIndexCreated;

		private Boolean followIndexShardsAcked;

		private Boolean indexFollowingStarted;

		/**
		 * API name: {@code follow_index_created}
		 */
		public Builder followIndexCreated(Boolean value) {
			this.followIndexCreated = value;
			return this;
		}

		/**
		 * API name: {@code follow_index_shards_acked}
		 */
		public Builder followIndexShardsAcked(Boolean value) {
			this.followIndexShardsAcked = value;
			return this;
		}

		/**
		 * API name: {@code index_following_started}
		 */
		public Builder indexFollowingStarted(Boolean value) {
			this.indexFollowingStarted = value;
			return this;
		}

		/**
		 * Builds a {@link CreateFollowIndexResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateFollowIndexResponse build() {

			return new CreateFollowIndexResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CreateFollowIndexResponse
	 */
	public static final JsonpDeserializer<CreateFollowIndexResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CreateFollowIndexResponse::setupCreateFollowIndexResponseDeserializer);

	protected static void setupCreateFollowIndexResponseDeserializer(
			DelegatingDeserializer<CreateFollowIndexResponse.Builder> op) {

		op.add(Builder::followIndexCreated, JsonpDeserializer.booleanDeserializer(), "follow_index_created");
		op.add(Builder::followIndexShardsAcked, JsonpDeserializer.booleanDeserializer(), "follow_index_shards_acked");
		op.add(Builder::indexFollowingStarted, JsonpDeserializer.booleanDeserializer(), "index_following_started");

	}

}
