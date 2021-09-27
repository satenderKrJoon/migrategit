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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ActionStatus
public final class ActionStatus implements ToJsonp {
	private final AcknowledgeState ack;

	@Nullable
	private final ExecutionState lastExecution;

	@Nullable
	private final ExecutionState lastSuccessfulExecution;

	@Nullable
	private final ThrottleState lastThrottle;

	// ---------------------------------------------------------------------------------------------

	protected ActionStatus(Builder builder) {

		this.ack = Objects.requireNonNull(builder.ack, "ack");
		this.lastExecution = builder.lastExecution;
		this.lastSuccessfulExecution = builder.lastSuccessfulExecution;
		this.lastThrottle = builder.lastThrottle;

	}

	/**
	 * API name: {@code ack}
	 */
	public AcknowledgeState ack() {
		return this.ack;
	}

	/**
	 * API name: {@code last_execution}
	 */
	@Nullable
	public ExecutionState lastExecution() {
		return this.lastExecution;
	}

	/**
	 * API name: {@code last_successful_execution}
	 */
	@Nullable
	public ExecutionState lastSuccessfulExecution() {
		return this.lastSuccessfulExecution;
	}

	/**
	 * API name: {@code last_throttle}
	 */
	@Nullable
	public ThrottleState lastThrottle() {
		return this.lastThrottle;
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

		generator.writeKey("ack");
		this.ack.toJsonp(generator, mapper);

		if (this.lastExecution != null) {

			generator.writeKey("last_execution");
			this.lastExecution.toJsonp(generator, mapper);

		}
		if (this.lastSuccessfulExecution != null) {

			generator.writeKey("last_successful_execution");
			this.lastSuccessfulExecution.toJsonp(generator, mapper);

		}
		if (this.lastThrottle != null) {

			generator.writeKey("last_throttle");
			this.lastThrottle.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ActionStatus}.
	 */
	public static class Builder implements ObjectBuilder<ActionStatus> {
		private AcknowledgeState ack;

		@Nullable
		private ExecutionState lastExecution;

		@Nullable
		private ExecutionState lastSuccessfulExecution;

		@Nullable
		private ThrottleState lastThrottle;

		/**
		 * API name: {@code ack}
		 */
		public Builder ack(AcknowledgeState value) {
			this.ack = value;
			return this;
		}

		/**
		 * API name: {@code ack}
		 */
		public Builder ack(Function<AcknowledgeState.Builder, ObjectBuilder<AcknowledgeState>> fn) {
			return this.ack(fn.apply(new AcknowledgeState.Builder()).build());
		}

		/**
		 * API name: {@code last_execution}
		 */
		public Builder lastExecution(@Nullable ExecutionState value) {
			this.lastExecution = value;
			return this;
		}

		/**
		 * API name: {@code last_execution}
		 */
		public Builder lastExecution(Function<ExecutionState.Builder, ObjectBuilder<ExecutionState>> fn) {
			return this.lastExecution(fn.apply(new ExecutionState.Builder()).build());
		}

		/**
		 * API name: {@code last_successful_execution}
		 */
		public Builder lastSuccessfulExecution(@Nullable ExecutionState value) {
			this.lastSuccessfulExecution = value;
			return this;
		}

		/**
		 * API name: {@code last_successful_execution}
		 */
		public Builder lastSuccessfulExecution(Function<ExecutionState.Builder, ObjectBuilder<ExecutionState>> fn) {
			return this.lastSuccessfulExecution(fn.apply(new ExecutionState.Builder()).build());
		}

		/**
		 * API name: {@code last_throttle}
		 */
		public Builder lastThrottle(@Nullable ThrottleState value) {
			this.lastThrottle = value;
			return this;
		}

		/**
		 * API name: {@code last_throttle}
		 */
		public Builder lastThrottle(Function<ThrottleState.Builder, ObjectBuilder<ThrottleState>> fn) {
			return this.lastThrottle(fn.apply(new ThrottleState.Builder()).build());
		}

		/**
		 * Builds a {@link ActionStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ActionStatus build() {

			return new ActionStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ActionStatus
	 */
	public static final JsonpDeserializer<ActionStatus> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ActionStatus::setupActionStatusDeserializer);

	protected static void setupActionStatusDeserializer(DelegatingDeserializer<ActionStatus.Builder> op) {

		op.add(Builder::ack, AcknowledgeState.DESERIALIZER, "ack");
		op.add(Builder::lastExecution, ExecutionState.DESERIALIZER, "last_execution");
		op.add(Builder::lastSuccessfulExecution, ExecutionState.DESERIALIZER, "last_successful_execution");
		op.add(Builder::lastThrottle, ThrottleState.DESERIALIZER, "last_throttle");

	}

}
