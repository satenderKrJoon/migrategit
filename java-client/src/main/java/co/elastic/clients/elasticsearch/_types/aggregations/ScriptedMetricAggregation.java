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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ScriptedMetricAggregation
public final class ScriptedMetricAggregation extends MetricAggregationBase {
	@Nullable
	private final JsonValue combineScript;

	@Nullable
	private final JsonValue initScript;

	@Nullable
	private final JsonValue mapScript;

	@Nullable
	private final Map<String, JsonValue> params;

	@Nullable
	private final JsonValue reduceScript;

	// ---------------------------------------------------------------------------------------------

	protected ScriptedMetricAggregation(Builder builder) {
		super(builder);
		this.combineScript = builder.combineScript;
		this.initScript = builder.initScript;
		this.mapScript = builder.mapScript;
		this.params = builder.params;
		this.reduceScript = builder.reduceScript;

	}

	/**
	 * API name: {@code combine_script}
	 */
	@Nullable
	public JsonValue combineScript() {
		return this.combineScript;
	}

	/**
	 * API name: {@code init_script}
	 */
	@Nullable
	public JsonValue initScript() {
		return this.initScript;
	}

	/**
	 * API name: {@code map_script}
	 */
	@Nullable
	public JsonValue mapScript() {
		return this.mapScript;
	}

	/**
	 * API name: {@code params}
	 */
	@Nullable
	public Map<String, JsonValue> params() {
		return this.params;
	}

	/**
	 * API name: {@code reduce_script}
	 */
	@Nullable
	public JsonValue reduceScript() {
		return this.reduceScript;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.combineScript != null) {

			generator.writeKey("combine_script");
			generator.write(this.combineScript);

		}
		if (this.initScript != null) {

			generator.writeKey("init_script");
			generator.write(this.initScript);

		}
		if (this.mapScript != null) {

			generator.writeKey("map_script");
			generator.write(this.mapScript);

		}
		if (this.params != null) {

			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.reduceScript != null) {

			generator.writeKey("reduce_script");
			generator.write(this.reduceScript);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptedMetricAggregation}.
	 */
	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ScriptedMetricAggregation> {
		@Nullable
		private JsonValue combineScript;

		@Nullable
		private JsonValue initScript;

		@Nullable
		private JsonValue mapScript;

		@Nullable
		private Map<String, JsonValue> params;

		@Nullable
		private JsonValue reduceScript;

		/**
		 * API name: {@code combine_script}
		 */
		public Builder combineScript(@Nullable JsonValue value) {
			this.combineScript = value;
			return this;
		}

		/**
		 * API name: {@code init_script}
		 */
		public Builder initScript(@Nullable JsonValue value) {
			this.initScript = value;
			return this;
		}

		/**
		 * API name: {@code map_script}
		 */
		public Builder mapScript(@Nullable JsonValue value) {
			this.mapScript = value;
			return this;
		}

		/**
		 * API name: {@code params}
		 */
		public Builder params(@Nullable Map<String, JsonValue> value) {
			this.params = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #params(Map)}, creating the map if needed.
		 */
		public Builder putParams(String key, JsonValue value) {
			if (this.params == null) {
				this.params = new HashMap<>();
			}
			this.params.put(key, value);
			return this;
		}

		/**
		 * API name: {@code reduce_script}
		 */
		public Builder reduceScript(@Nullable JsonValue value) {
			this.reduceScript = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScriptedMetricAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptedMetricAggregation build() {

			return new ScriptedMetricAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ScriptedMetricAggregation
	 */
	public static final JsonpDeserializer<ScriptedMetricAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ScriptedMetricAggregation::setupScriptedMetricAggregationDeserializer);

	protected static void setupScriptedMetricAggregationDeserializer(
			DelegatingDeserializer<ScriptedMetricAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::combineScript, JsonpDeserializer.jsonValueDeserializer(), "combine_script");
		op.add(Builder::initScript, JsonpDeserializer.jsonValueDeserializer(), "init_script");
		op.add(Builder::mapScript, JsonpDeserializer.jsonValueDeserializer(), "map_script");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"params");
		op.add(Builder::reduceScript, JsonpDeserializer.jsonValueDeserializer(), "reduce_script");

	}

}
