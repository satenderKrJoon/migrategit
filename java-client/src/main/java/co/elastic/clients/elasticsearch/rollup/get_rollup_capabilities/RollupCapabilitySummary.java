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

package co.elastic.clients.elasticsearch.rollup.get_rollup_capabilities;

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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: rollup.get_rollup_capabilities.RollupCapabilitySummary
public final class RollupCapabilitySummary implements ToJsonp {
	private final Map<String, Map<String, JsonValue>> fields;

	private final String indexPattern;

	private final String jobId;

	private final String rollupIndex;

	// ---------------------------------------------------------------------------------------------

	protected RollupCapabilitySummary(Builder builder) {

		this.fields = Objects.requireNonNull(builder.fields, "fields");
		this.indexPattern = Objects.requireNonNull(builder.indexPattern, "index_pattern");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.rollupIndex = Objects.requireNonNull(builder.rollupIndex, "rollup_index");

	}

	/**
	 * API name: {@code fields}
	 */
	public Map<String, Map<String, JsonValue>> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code index_pattern}
	 */
	public String indexPattern() {
		return this.indexPattern;
	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code rollup_index}
	 */
	public String rollupIndex() {
		return this.rollupIndex;
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

		generator.writeKey("fields");
		generator.writeStartObject();
		for (Map.Entry<String, Map<String, JsonValue>> item0 : this.fields.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item1 : item0.getValue().entrySet()) {
				generator.writeKey(item1.getKey());
				generator.write(item1.getValue());

			}
			generator.writeEnd();

		}
		generator.writeEnd();

		generator.writeKey("index_pattern");
		generator.write(this.indexPattern);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("rollup_index");
		generator.write(this.rollupIndex);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupCapabilitySummary}.
	 */
	public static class Builder implements ObjectBuilder<RollupCapabilitySummary> {
		private Map<String, Map<String, JsonValue>> fields;

		private String indexPattern;

		private String jobId;

		private String rollupIndex;

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(Map<String, Map<String, JsonValue>> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder putFields(String key, Map<String, JsonValue> value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return this;
		}

		/**
		 * API name: {@code index_pattern}
		 */
		public Builder indexPattern(String value) {
			this.indexPattern = value;
			return this;
		}

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code rollup_index}
		 */
		public Builder rollupIndex(String value) {
			this.rollupIndex = value;
			return this;
		}

		/**
		 * Builds a {@link RollupCapabilitySummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupCapabilitySummary build() {

			return new RollupCapabilitySummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RollupCapabilitySummary
	 */
	public static final JsonpDeserializer<RollupCapabilitySummary> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RollupCapabilitySummary::setupRollupCapabilitySummaryDeserializer);

	protected static void setupRollupCapabilitySummaryDeserializer(
			DelegatingDeserializer<RollupCapabilitySummary.Builder> op) {

		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer())), "fields");
		op.add(Builder::indexPattern, JsonpDeserializer.stringDeserializer(), "index_pattern");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::rollupIndex, JsonpDeserializer.stringDeserializer(), "rollup_index");

	}

}
