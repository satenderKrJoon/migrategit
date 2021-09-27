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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.ArrayCompareCondition
public final class ArrayCompareCondition implements ToJsonp {
	private final String arrayPath;

	private final String comparison;

	private final String path;

	private final JsonValue quantifier;

	private final JsonValue value;

	// ---------------------------------------------------------------------------------------------

	protected ArrayCompareCondition(Builder builder) {

		this.arrayPath = Objects.requireNonNull(builder.arrayPath, "array_path");
		this.comparison = Objects.requireNonNull(builder.comparison, "comparison");
		this.path = Objects.requireNonNull(builder.path, "path");
		this.quantifier = Objects.requireNonNull(builder.quantifier, "quantifier");
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * API name: {@code array_path}
	 */
	public String arrayPath() {
		return this.arrayPath;
	}

	/**
	 * API name: {@code comparison}
	 */
	public String comparison() {
		return this.comparison;
	}

	/**
	 * API name: {@code path}
	 */
	public String path() {
		return this.path;
	}

	/**
	 * API name: {@code quantifier}
	 */
	public JsonValue quantifier() {
		return this.quantifier;
	}

	/**
	 * API name: {@code value}
	 */
	public JsonValue value() {
		return this.value;
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

		generator.writeKey("array_path");
		generator.write(this.arrayPath);

		generator.writeKey("comparison");
		generator.write(this.comparison);

		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("quantifier");
		generator.write(this.quantifier);

		generator.writeKey("value");
		generator.write(this.value);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ArrayCompareCondition}.
	 */
	public static class Builder implements ObjectBuilder<ArrayCompareCondition> {
		private String arrayPath;

		private String comparison;

		private String path;

		private JsonValue quantifier;

		private JsonValue value;

		/**
		 * API name: {@code array_path}
		 */
		public Builder arrayPath(String value) {
			this.arrayPath = value;
			return this;
		}

		/**
		 * API name: {@code comparison}
		 */
		public Builder comparison(String value) {
			this.comparison = value;
			return this;
		}

		/**
		 * API name: {@code path}
		 */
		public Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * API name: {@code quantifier}
		 */
		public Builder quantifier(JsonValue value) {
			this.quantifier = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(JsonValue value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link ArrayCompareCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ArrayCompareCondition build() {

			return new ArrayCompareCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ArrayCompareCondition
	 */
	public static final JsonpDeserializer<ArrayCompareCondition> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ArrayCompareCondition::setupArrayCompareConditionDeserializer);

	protected static void setupArrayCompareConditionDeserializer(
			DelegatingDeserializer<ArrayCompareCondition.Builder> op) {

		op.add(Builder::arrayPath, JsonpDeserializer.stringDeserializer(), "array_path");
		op.add(Builder::comparison, JsonpDeserializer.stringDeserializer(), "comparison");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::quantifier, JsonpDeserializer.jsonValueDeserializer(), "quantifier");
		op.add(Builder::value, JsonpDeserializer.jsonValueDeserializer(), "value");

	}

}
