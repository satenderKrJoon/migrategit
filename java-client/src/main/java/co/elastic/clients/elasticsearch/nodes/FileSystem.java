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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.FileSystem
public final class FileSystem implements ToJsonp {
	private final List<DataPathStats> data;

	private final Number timestamp;

	private final FileSystemTotal total;

	// ---------------------------------------------------------------------------------------------

	protected FileSystem(Builder builder) {

		this.data = Objects.requireNonNull(builder.data, "data");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");
		this.total = Objects.requireNonNull(builder.total, "total");

	}

	/**
	 * API name: {@code data}
	 */
	public List<DataPathStats> data() {
		return this.data;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public Number timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code total}
	 */
	public FileSystemTotal total() {
		return this.total;
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

		generator.writeKey("data");
		generator.writeStartArray();
		for (DataPathStats item0 : this.data) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("timestamp");
		generator.write(this.timestamp.doubleValue());

		generator.writeKey("total");
		this.total.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileSystem}.
	 */
	public static class Builder implements ObjectBuilder<FileSystem> {
		private List<DataPathStats> data;

		private Number timestamp;

		private FileSystemTotal total;

		/**
		 * API name: {@code data}
		 */
		public Builder data(List<DataPathStats> value) {
			this.data = value;
			return this;
		}

		/**
		 * API name: {@code data}
		 */
		public Builder data(DataPathStats... value) {
			this.data = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #data(List)}, creating the list if needed.
		 */
		public Builder addData(DataPathStats value) {
			if (this.data == null) {
				this.data = new ArrayList<>();
			}
			this.data.add(value);
			return this;
		}

		/**
		 * Set {@link #data(List)} to a singleton list.
		 */
		public Builder data(Function<DataPathStats.Builder, ObjectBuilder<DataPathStats>> fn) {
			return this.data(fn.apply(new DataPathStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #data(List)}, creating the list if needed.
		 */
		public Builder addData(Function<DataPathStats.Builder, ObjectBuilder<DataPathStats>> fn) {
			return this.addData(fn.apply(new DataPathStats.Builder()).build());
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(Number value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(FileSystemTotal value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Function<FileSystemTotal.Builder, ObjectBuilder<FileSystemTotal>> fn) {
			return this.total(fn.apply(new FileSystemTotal.Builder()).build());
		}

		/**
		 * Builds a {@link FileSystem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FileSystem build() {

			return new FileSystem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FileSystem
	 */
	public static final JsonpDeserializer<FileSystem> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FileSystem::setupFileSystemDeserializer);

	protected static void setupFileSystemDeserializer(DelegatingDeserializer<FileSystem.Builder> op) {

		op.add(Builder::data, JsonpDeserializer.arrayDeserializer(DataPathStats.DESERIALIZER), "data");
		op.add(Builder::timestamp, JsonpDeserializer.numberDeserializer(), "timestamp");
		op.add(Builder::total, FileSystemTotal.DESERIALIZER, "total");

	}

}
