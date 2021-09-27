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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher.put_watch.Response
public final class PutWatchResponse implements ToJsonp {
	private final Boolean created;

	private final String id;

	private final Number primaryTerm;

	private final Number seqNo;

	private final Number version;

	// ---------------------------------------------------------------------------------------------

	protected PutWatchResponse(Builder builder) {

		this.created = Objects.requireNonNull(builder.created, "created");
		this.id = Objects.requireNonNull(builder.id, "_id");
		this.primaryTerm = Objects.requireNonNull(builder.primaryTerm, "_primary_term");
		this.seqNo = Objects.requireNonNull(builder.seqNo, "_seq_no");
		this.version = Objects.requireNonNull(builder.version, "_version");

	}

	/**
	 * API name: {@code created}
	 */
	public Boolean created() {
		return this.created;
	}

	/**
	 * API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	public Number primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	public Number seqNo() {
		return this.seqNo;
	}

	/**
	 * API name: {@code _version}
	 */
	public Number version() {
		return this.version;
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

		generator.writeKey("created");
		generator.write(this.created);

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_primary_term");
		generator.write(this.primaryTerm.doubleValue());

		generator.writeKey("_seq_no");
		generator.write(this.seqNo.doubleValue());

		generator.writeKey("_version");
		generator.write(this.version.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutWatchResponse}.
	 */
	public static class Builder implements ObjectBuilder<PutWatchResponse> {
		private Boolean created;

		private String id;

		private Number primaryTerm;

		private Number seqNo;

		private Number version;

		/**
		 * API name: {@code created}
		 */
		public Builder created(Boolean value) {
			this.created = value;
			return this;
		}

		/**
		 * API name: {@code _id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public Builder primaryTerm(Number value) {
			this.primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public Builder seqNo(Number value) {
			this.seqNo = value;
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public Builder version(Number value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link PutWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutWatchResponse build() {

			return new PutWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutWatchResponse
	 */
	public static final JsonpDeserializer<PutWatchResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutWatchResponse::setupPutWatchResponseDeserializer);

	protected static void setupPutWatchResponseDeserializer(DelegatingDeserializer<PutWatchResponse.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.booleanDeserializer(), "created");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::primaryTerm, JsonpDeserializer.numberDeserializer(), "_primary_term");
		op.add(Builder::seqNo, JsonpDeserializer.numberDeserializer(), "_seq_no");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "_version");

	}

}
