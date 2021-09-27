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
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.WatchStatus
public final class WatchStatus implements ToJsonp {
	private final Map<String, ActionStatus> actions;

	@Nullable
	private final String lastChecked;

	@Nullable
	private final String lastMetCondition;

	private final ActivationState state;

	private final Number version;

	@Nullable
	private final String executionState;

	// ---------------------------------------------------------------------------------------------

	protected WatchStatus(Builder builder) {

		this.actions = Objects.requireNonNull(builder.actions, "actions");
		this.lastChecked = builder.lastChecked;
		this.lastMetCondition = builder.lastMetCondition;
		this.state = Objects.requireNonNull(builder.state, "state");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.executionState = builder.executionState;

	}

	/**
	 * API name: {@code actions}
	 */
	public Map<String, ActionStatus> actions() {
		return this.actions;
	}

	/**
	 * API name: {@code last_checked}
	 */
	@Nullable
	public String lastChecked() {
		return this.lastChecked;
	}

	/**
	 * API name: {@code last_met_condition}
	 */
	@Nullable
	public String lastMetCondition() {
		return this.lastMetCondition;
	}

	/**
	 * API name: {@code state}
	 */
	public ActivationState state() {
		return this.state;
	}

	/**
	 * API name: {@code version}
	 */
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code execution_state}
	 */
	@Nullable
	public String executionState() {
		return this.executionState;
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
		for (Map.Entry<String, ActionStatus> item0 : this.actions.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

		if (this.lastChecked != null) {

			generator.writeKey("last_checked");
			generator.write(this.lastChecked);

		}
		if (this.lastMetCondition != null) {

			generator.writeKey("last_met_condition");
			generator.write(this.lastMetCondition);

		}

		generator.writeKey("state");
		this.state.toJsonp(generator, mapper);

		generator.writeKey("version");
		generator.write(this.version.doubleValue());

		if (this.executionState != null) {

			generator.writeKey("execution_state");
			generator.write(this.executionState);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatchStatus}.
	 */
	public static class Builder implements ObjectBuilder<WatchStatus> {
		private Map<String, ActionStatus> actions;

		@Nullable
		private String lastChecked;

		@Nullable
		private String lastMetCondition;

		private ActivationState state;

		private Number version;

		@Nullable
		private String executionState;

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(Map<String, ActionStatus> value) {
			this.actions = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #actions(Map)}, creating the map if needed.
		 */
		public Builder putActions(String key, ActionStatus value) {
			if (this.actions == null) {
				this.actions = new HashMap<>();
			}
			this.actions.put(key, value);
			return this;
		}

		/**
		 * Set {@link #actions(Map)} to a singleton map.
		 */
		public Builder actions(String key, Function<ActionStatus.Builder, ObjectBuilder<ActionStatus>> fn) {
			return this.actions(Collections.singletonMap(key, fn.apply(new ActionStatus.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #actions(Map)}, creating the map if needed.
		 */
		public Builder putActions(String key, Function<ActionStatus.Builder, ObjectBuilder<ActionStatus>> fn) {
			return this.putActions(key, fn.apply(new ActionStatus.Builder()).build());
		}

		/**
		 * API name: {@code last_checked}
		 */
		public Builder lastChecked(@Nullable String value) {
			this.lastChecked = value;
			return this;
		}

		/**
		 * API name: {@code last_met_condition}
		 */
		public Builder lastMetCondition(@Nullable String value) {
			this.lastMetCondition = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(ActivationState value) {
			this.state = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(Function<ActivationState.Builder, ObjectBuilder<ActivationState>> fn) {
			return this.state(fn.apply(new ActivationState.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code execution_state}
		 */
		public Builder executionState(@Nullable String value) {
			this.executionState = value;
			return this;
		}

		/**
		 * Builds a {@link WatchStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatchStatus build() {

			return new WatchStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for WatchStatus
	 */
	public static final JsonpDeserializer<WatchStatus> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, WatchStatus::setupWatchStatusDeserializer);

	protected static void setupWatchStatusDeserializer(DelegatingDeserializer<WatchStatus.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(ActionStatus.DESERIALIZER), "actions");
		op.add(Builder::lastChecked, JsonpDeserializer.stringDeserializer(), "last_checked");
		op.add(Builder::lastMetCondition, JsonpDeserializer.stringDeserializer(), "last_met_condition");
		op.add(Builder::state, ActivationState.DESERIALIZER, "state");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");
		op.add(Builder::executionState, JsonpDeserializer.stringDeserializer(), "execution_state");

	}

}
