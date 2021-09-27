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

package co.elastic.clients.elasticsearch.watcher.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher.stats.WatchRecordStats
public final class WatchRecordStats extends WatchRecordQueuedStats {
	private final JsonValue executionPhase;

	private final String triggeredTime;

	@Nullable
	private final List<String> executedActions;

	private final String watchId;

	private final String watchRecordId;

	// ---------------------------------------------------------------------------------------------

	protected WatchRecordStats(Builder builder) {
		super(builder);
		this.executionPhase = Objects.requireNonNull(builder.executionPhase, "execution_phase");
		this.triggeredTime = Objects.requireNonNull(builder.triggeredTime, "triggered_time");
		this.executedActions = builder.executedActions;
		this.watchId = Objects.requireNonNull(builder.watchId, "watch_id");
		this.watchRecordId = Objects.requireNonNull(builder.watchRecordId, "watch_record_id");

	}

	/**
	 * API name: {@code execution_phase}
	 */
	public JsonValue executionPhase() {
		return this.executionPhase;
	}

	/**
	 * API name: {@code triggered_time}
	 */
	public String triggeredTime() {
		return this.triggeredTime;
	}

	/**
	 * API name: {@code executed_actions}
	 */
	@Nullable
	public List<String> executedActions() {
		return this.executedActions;
	}

	/**
	 * API name: {@code watch_id}
	 */
	public String watchId() {
		return this.watchId;
	}

	/**
	 * API name: {@code watch_record_id}
	 */
	public String watchRecordId() {
		return this.watchRecordId;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("execution_phase");
		generator.write(this.executionPhase);

		generator.writeKey("triggered_time");
		generator.write(this.triggeredTime);

		if (this.executedActions != null) {

			generator.writeKey("executed_actions");
			generator.writeStartArray();
			for (String item0 : this.executedActions) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("watch_id");
		generator.write(this.watchId);

		generator.writeKey("watch_record_id");
		generator.write(this.watchRecordId);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatchRecordStats}.
	 */
	public static class Builder extends WatchRecordQueuedStats.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WatchRecordStats> {
		private JsonValue executionPhase;

		private String triggeredTime;

		@Nullable
		private List<String> executedActions;

		private String watchId;

		private String watchRecordId;

		/**
		 * API name: {@code execution_phase}
		 */
		public Builder executionPhase(JsonValue value) {
			this.executionPhase = value;
			return this;
		}

		/**
		 * API name: {@code triggered_time}
		 */
		public Builder triggeredTime(String value) {
			this.triggeredTime = value;
			return this;
		}

		/**
		 * API name: {@code executed_actions}
		 */
		public Builder executedActions(@Nullable List<String> value) {
			this.executedActions = value;
			return this;
		}

		/**
		 * API name: {@code executed_actions}
		 */
		public Builder executedActions(String... value) {
			this.executedActions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #executedActions(List)}, creating the list if needed.
		 */
		public Builder addExecutedActions(String value) {
			if (this.executedActions == null) {
				this.executedActions = new ArrayList<>();
			}
			this.executedActions.add(value);
			return this;
		}

		/**
		 * API name: {@code watch_id}
		 */
		public Builder watchId(String value) {
			this.watchId = value;
			return this;
		}

		/**
		 * API name: {@code watch_record_id}
		 */
		public Builder watchRecordId(String value) {
			this.watchRecordId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WatchRecordStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatchRecordStats build() {

			return new WatchRecordStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for WatchRecordStats
	 */
	public static final JsonpDeserializer<WatchRecordStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, WatchRecordStats::setupWatchRecordStatsDeserializer);

	protected static void setupWatchRecordStatsDeserializer(DelegatingDeserializer<WatchRecordStats.Builder> op) {
		WatchRecordQueuedStats.setupWatchRecordQueuedStatsDeserializer(op);
		op.add(Builder::executionPhase, JsonpDeserializer.jsonValueDeserializer(), "execution_phase");
		op.add(Builder::triggeredTime, JsonpDeserializer.stringDeserializer(), "triggered_time");
		op.add(Builder::executedActions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"executed_actions");
		op.add(Builder::watchId, JsonpDeserializer.stringDeserializer(), "watch_id");
		op.add(Builder::watchRecordId, JsonpDeserializer.stringDeserializer(), "watch_record_id");

	}

}
