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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ExecutionResult
public final class ExecutionResult implements ToJsonp {
	private final List<ExecutionResultAction> actions;

	private final ExecutionResultCondition condition;

	private final Number executionDuration;

	private final String executionTime;

	private final ExecutionResultInput input;

	// ---------------------------------------------------------------------------------------------

	protected ExecutionResult(Builder builder) {

		this.actions = Objects.requireNonNull(builder.actions, "actions");
		this.condition = Objects.requireNonNull(builder.condition, "condition");
		this.executionDuration = Objects.requireNonNull(builder.executionDuration, "execution_duration");
		this.executionTime = Objects.requireNonNull(builder.executionTime, "execution_time");
		this.input = Objects.requireNonNull(builder.input, "input");

	}

	/**
	 * API name: {@code actions}
	 */
	public List<ExecutionResultAction> actions() {
		return this.actions;
	}

	/**
	 * API name: {@code condition}
	 */
	public ExecutionResultCondition condition() {
		return this.condition;
	}

	/**
	 * API name: {@code execution_duration}
	 */
	public Number executionDuration() {
		return this.executionDuration;
	}

	/**
	 * API name: {@code execution_time}
	 */
	public String executionTime() {
		return this.executionTime;
	}

	/**
	 * API name: {@code input}
	 */
	public ExecutionResultInput input() {
		return this.input;
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
		generator.writeStartArray();
		for (ExecutionResultAction item0 : this.actions) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("condition");
		this.condition.toJsonp(generator, mapper);

		generator.writeKey("execution_duration");
		generator.write(this.executionDuration.doubleValue());

		generator.writeKey("execution_time");
		generator.write(this.executionTime);

		generator.writeKey("input");
		this.input.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResult}.
	 */
	public static class Builder implements ObjectBuilder<ExecutionResult> {
		private List<ExecutionResultAction> actions;

		private ExecutionResultCondition condition;

		private Number executionDuration;

		private String executionTime;

		private ExecutionResultInput input;

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(List<ExecutionResultAction> value) {
			this.actions = value;
			return this;
		}

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(ExecutionResultAction... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #actions(List)}, creating the list if needed.
		 */
		public Builder addActions(ExecutionResultAction value) {
			if (this.actions == null) {
				this.actions = new ArrayList<>();
			}
			this.actions.add(value);
			return this;
		}

		/**
		 * Set {@link #actions(List)} to a singleton list.
		 */
		public Builder actions(Function<ExecutionResultAction.Builder, ObjectBuilder<ExecutionResultAction>> fn) {
			return this.actions(fn.apply(new ExecutionResultAction.Builder()).build());
		}

		/**
		 * Add a value to {@link #actions(List)}, creating the list if needed.
		 */
		public Builder addActions(Function<ExecutionResultAction.Builder, ObjectBuilder<ExecutionResultAction>> fn) {
			return this.addActions(fn.apply(new ExecutionResultAction.Builder()).build());
		}

		/**
		 * API name: {@code condition}
		 */
		public Builder condition(ExecutionResultCondition value) {
			this.condition = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public Builder condition(
				Function<ExecutionResultCondition.Builder, ObjectBuilder<ExecutionResultCondition>> fn) {
			return this.condition(fn.apply(new ExecutionResultCondition.Builder()).build());
		}

		/**
		 * API name: {@code execution_duration}
		 */
		public Builder executionDuration(Number value) {
			this.executionDuration = value;
			return this;
		}

		/**
		 * API name: {@code execution_time}
		 */
		public Builder executionTime(String value) {
			this.executionTime = value;
			return this;
		}

		/**
		 * API name: {@code input}
		 */
		public Builder input(ExecutionResultInput value) {
			this.input = value;
			return this;
		}

		/**
		 * API name: {@code input}
		 */
		public Builder input(Function<ExecutionResultInput.Builder, ObjectBuilder<ExecutionResultInput>> fn) {
			return this.input(fn.apply(new ExecutionResultInput.Builder()).build());
		}

		/**
		 * Builds a {@link ExecutionResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResult build() {

			return new ExecutionResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ExecutionResult
	 */
	public static final JsonpDeserializer<ExecutionResult> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ExecutionResult::setupExecutionResultDeserializer);

	protected static void setupExecutionResultDeserializer(DelegatingDeserializer<ExecutionResult.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(ExecutionResultAction.DESERIALIZER), "actions");
		op.add(Builder::condition, ExecutionResultCondition.DESERIALIZER, "condition");
		op.add(Builder::executionDuration, JsonpDeserializer.numberDeserializer(), "execution_duration");
		op.add(Builder::executionTime, JsonpDeserializer.stringDeserializer(), "execution_time");
		op.add(Builder::input, ExecutionResultInput.DESERIALIZER, "input");

	}

}
