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

package co.elastic.clients.elasticsearch.indices.resolve_index;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.resolve_index.ResolveIndexDataStreamsItem
public final class ResolveIndexDataStreamsItem implements ToJsonp {
	private final String name;

	private final String timestampField;

	private final List<String> backingIndices;

	// ---------------------------------------------------------------------------------------------

	protected ResolveIndexDataStreamsItem(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.timestampField = Objects.requireNonNull(builder.timestampField, "timestamp_field");
		this.backingIndices = Objects.requireNonNull(builder.backingIndices, "backing_indices");

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code timestamp_field}
	 */
	public String timestampField() {
		return this.timestampField;
	}

	/**
	 * API name: {@code backing_indices}
	 */
	public List<String> backingIndices() {
		return this.backingIndices;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("timestamp_field");
		generator.write(this.timestampField);

		generator.writeKey("backing_indices");
		generator.writeStartArray();
		for (String item0 : this.backingIndices) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResolveIndexDataStreamsItem}.
	 */
	public static class Builder implements ObjectBuilder<ResolveIndexDataStreamsItem> {
		private String name;

		private String timestampField;

		private List<String> backingIndices;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code timestamp_field}
		 */
		public Builder timestampField(String value) {
			this.timestampField = value;
			return this;
		}

		/**
		 * API name: {@code backing_indices}
		 */
		public Builder backingIndices(List<String> value) {
			this.backingIndices = value;
			return this;
		}

		/**
		 * API name: {@code backing_indices}
		 */
		public Builder backingIndices(String... value) {
			this.backingIndices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #backingIndices(List)}, creating the list if needed.
		 */
		public Builder addBackingIndices(String value) {
			if (this.backingIndices == null) {
				this.backingIndices = new ArrayList<>();
			}
			this.backingIndices.add(value);
			return this;
		}

		/**
		 * Builds a {@link ResolveIndexDataStreamsItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResolveIndexDataStreamsItem build() {

			return new ResolveIndexDataStreamsItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ResolveIndexDataStreamsItem
	 */
	public static final JsonpDeserializer<ResolveIndexDataStreamsItem> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ResolveIndexDataStreamsItem::setupResolveIndexDataStreamsItemDeserializer);

	protected static void setupResolveIndexDataStreamsItemDeserializer(
			DelegatingDeserializer<ResolveIndexDataStreamsItem.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::timestampField, JsonpDeserializer.stringDeserializer(), "timestamp_field");
		op.add(Builder::backingIndices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"backing_indices");

	}

}
