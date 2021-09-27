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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.Tombstone
public final class Tombstone implements ToJsonp {
	private final TombstoneIndex index;

	@Nullable
	private final String deleteDate;

	private final Number deleteDateInMillis;

	// ---------------------------------------------------------------------------------------------

	protected Tombstone(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.deleteDate = builder.deleteDate;
		this.deleteDateInMillis = Objects.requireNonNull(builder.deleteDateInMillis, "delete_date_in_millis");

	}

	/**
	 * API name: {@code index}
	 */
	public TombstoneIndex index() {
		return this.index;
	}

	/**
	 * API name: {@code delete_date}
	 */
	@Nullable
	public String deleteDate() {
		return this.deleteDate;
	}

	/**
	 * API name: {@code delete_date_in_millis}
	 */
	public Number deleteDateInMillis() {
		return this.deleteDateInMillis;
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

		generator.writeKey("index");
		this.index.toJsonp(generator, mapper);

		if (this.deleteDate != null) {

			generator.writeKey("delete_date");
			generator.write(this.deleteDate);

		}

		generator.writeKey("delete_date_in_millis");
		generator.write(this.deleteDateInMillis.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Tombstone}.
	 */
	public static class Builder implements ObjectBuilder<Tombstone> {
		private TombstoneIndex index;

		@Nullable
		private String deleteDate;

		private Number deleteDateInMillis;

		/**
		 * API name: {@code index}
		 */
		public Builder index(TombstoneIndex value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(Function<TombstoneIndex.Builder, ObjectBuilder<TombstoneIndex>> fn) {
			return this.index(fn.apply(new TombstoneIndex.Builder()).build());
		}

		/**
		 * API name: {@code delete_date}
		 */
		public Builder deleteDate(@Nullable String value) {
			this.deleteDate = value;
			return this;
		}

		/**
		 * API name: {@code delete_date_in_millis}
		 */
		public Builder deleteDateInMillis(Number value) {
			this.deleteDateInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link Tombstone}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Tombstone build() {

			return new Tombstone(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Tombstone
	 */
	public static final JsonpDeserializer<Tombstone> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Tombstone::setupTombstoneDeserializer);

	protected static void setupTombstoneDeserializer(DelegatingDeserializer<Tombstone.Builder> op) {

		op.add(Builder::index, TombstoneIndex.DESERIALIZER, "index");
		op.add(Builder::deleteDate, JsonpDeserializer.stringDeserializer(), "delete_date");
		op.add(Builder::deleteDateInMillis, JsonpDeserializer.numberDeserializer(), "delete_date_in_millis");

	}

}
