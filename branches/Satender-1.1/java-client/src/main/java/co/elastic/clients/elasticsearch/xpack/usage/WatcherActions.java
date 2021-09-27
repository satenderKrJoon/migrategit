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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.WatcherActions
public final class WatcherActions implements ToJsonp {
	private final Map<String, WatcherActionTotals> actions;

	// ---------------------------------------------------------------------------------------------

	protected WatcherActions(Builder builder) {

		this.actions = Objects.requireNonNull(builder.actions, "actions");

	}

	/**
	 * API name: {@code actions}
	 */
	public Map<String, WatcherActionTotals> actions() {
		return this.actions;
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

		generator.writeKey("actions");
		generator.writeStartObject();
		for (Map.Entry<String, WatcherActionTotals> item0 : this.actions.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherActions}.
	 */
	public static class Builder implements ObjectBuilder<WatcherActions> {
		private Map<String, WatcherActionTotals> actions;

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(Map<String, WatcherActionTotals> value) {
			this.actions = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #actions(Map)}, creating the map if needed.
		 */
		public Builder putActions(String key, WatcherActionTotals value) {
			if (this.actions == null) {
				this.actions = new HashMap<>();
			}
			this.actions.put(key, value);
			return this;
		}

		/**
		 * Set {@link #actions(Map)} to a singleton map.
		 */
		public Builder actions(String key,
				Function<WatcherActionTotals.Builder, ObjectBuilder<WatcherActionTotals>> fn) {
			return this.actions(Collections.singletonMap(key, fn.apply(new WatcherActionTotals.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #actions(Map)}, creating the map if needed.
		 */
		public Builder putActions(String key,
				Function<WatcherActionTotals.Builder, ObjectBuilder<WatcherActionTotals>> fn) {
			return this.putActions(key, fn.apply(new WatcherActionTotals.Builder()).build());
		}

		/**
		 * Builds a {@link WatcherActions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherActions build() {

			return new WatcherActions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for WatcherActions
	 */
	public static final JsonpDeserializer<WatcherActions> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, WatcherActions::setupWatcherActionsDeserializer);

	protected static void setupWatcherActionsDeserializer(DelegatingDeserializer<WatcherActions.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(WatcherActionTotals.DESERIALIZER), "actions");

	}

}
