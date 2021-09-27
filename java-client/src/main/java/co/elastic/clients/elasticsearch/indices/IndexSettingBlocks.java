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

package co.elastic.clients.elasticsearch.indices;

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
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettingBlocks
public final class IndexSettingBlocks implements ToJsonp {
	@Nullable
	private final Boolean readOnly;

	@Nullable
	private final Boolean readOnlyAllowDelete;

	@Nullable
	private final Boolean read;

	@Nullable
	private final JsonValue write;

	@Nullable
	private final Boolean metadata;

	// ---------------------------------------------------------------------------------------------

	protected IndexSettingBlocks(Builder builder) {

		this.readOnly = builder.readOnly;
		this.readOnlyAllowDelete = builder.readOnlyAllowDelete;
		this.read = builder.read;
		this.write = builder.write;
		this.metadata = builder.metadata;

	}

	/**
	 * API name: {@code read_only}
	 */
	@Nullable
	public Boolean readOnly() {
		return this.readOnly;
	}

	/**
	 * API name: {@code read_only_allow_delete}
	 */
	@Nullable
	public Boolean readOnlyAllowDelete() {
		return this.readOnlyAllowDelete;
	}

	/**
	 * API name: {@code read}
	 */
	@Nullable
	public Boolean read() {
		return this.read;
	}

	/**
	 * API name: {@code write}
	 */
	@Nullable
	public JsonValue write() {
		return this.write;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public Boolean metadata() {
		return this.metadata;
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

		if (this.readOnly != null) {

			generator.writeKey("read_only");
			generator.write(this.readOnly);

		}
		if (this.readOnlyAllowDelete != null) {

			generator.writeKey("read_only_allow_delete");
			generator.write(this.readOnlyAllowDelete);

		}
		if (this.read != null) {

			generator.writeKey("read");
			generator.write(this.read);

		}
		if (this.write != null) {

			generator.writeKey("write");
			generator.write(this.write);

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.write(this.metadata);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingBlocks}.
	 */
	public static class Builder implements ObjectBuilder<IndexSettingBlocks> {
		@Nullable
		private Boolean readOnly;

		@Nullable
		private Boolean readOnlyAllowDelete;

		@Nullable
		private Boolean read;

		@Nullable
		private JsonValue write;

		@Nullable
		private Boolean metadata;

		/**
		 * API name: {@code read_only}
		 */
		public Builder readOnly(@Nullable Boolean value) {
			this.readOnly = value;
			return this;
		}

		/**
		 * API name: {@code read_only_allow_delete}
		 */
		public Builder readOnlyAllowDelete(@Nullable Boolean value) {
			this.readOnlyAllowDelete = value;
			return this;
		}

		/**
		 * API name: {@code read}
		 */
		public Builder read(@Nullable Boolean value) {
			this.read = value;
			return this;
		}

		/**
		 * API name: {@code write}
		 */
		public Builder write(@Nullable JsonValue value) {
			this.write = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Boolean value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Builds a {@link IndexSettingBlocks}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingBlocks build() {

			return new IndexSettingBlocks(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndexSettingBlocks
	 */
	public static final JsonpDeserializer<IndexSettingBlocks> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexSettingBlocks::setupIndexSettingBlocksDeserializer);

	protected static void setupIndexSettingBlocksDeserializer(DelegatingDeserializer<IndexSettingBlocks.Builder> op) {

		op.add(Builder::readOnly, JsonpDeserializer.booleanDeserializer(), "read_only", "index.blocks.read_only");
		op.add(Builder::readOnlyAllowDelete, JsonpDeserializer.booleanDeserializer(), "read_only_allow_delete",
				"index.blocks.read_only_allow_delete");
		op.add(Builder::read, JsonpDeserializer.booleanDeserializer(), "read", "index.blocks.read");
		op.add(Builder::write, JsonpDeserializer.jsonValueDeserializer(), "write", "index.blocks.write");
		op.add(Builder::metadata, JsonpDeserializer.booleanDeserializer(), "metadata", "index.blocks.metadata");

	}

}
