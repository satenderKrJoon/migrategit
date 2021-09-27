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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ChainInput
public final class ChainInput implements ToJsonp {
	private final List<InputContainer> inputs;

	// ---------------------------------------------------------------------------------------------

	protected ChainInput(Builder builder) {

		this.inputs = Objects.requireNonNull(builder.inputs, "inputs");

	}

	/**
	 * API name: {@code inputs}
	 */
	public List<InputContainer> inputs() {
		return this.inputs;
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

		generator.writeKey("inputs");
		generator.writeStartArray();
		for (InputContainer item0 : this.inputs) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChainInput}.
	 */
	public static class Builder implements ObjectBuilder<ChainInput> {
		private List<InputContainer> inputs;

		/**
		 * API name: {@code inputs}
		 */
		public Builder inputs(List<InputContainer> value) {
			this.inputs = value;
			return this;
		}

		/**
		 * API name: {@code inputs}
		 */
		public Builder inputs(InputContainer... value) {
			this.inputs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #inputs(List)}, creating the list if needed.
		 */
		public Builder addInputs(InputContainer value) {
			if (this.inputs == null) {
				this.inputs = new ArrayList<>();
			}
			this.inputs.add(value);
			return this;
		}

		/**
		 * Set {@link #inputs(List)} to a singleton list.
		 */
		public Builder inputs(Function<InputContainer.Builder, ObjectBuilder<InputContainer>> fn) {
			return this.inputs(fn.apply(new InputContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #inputs(List)}, creating the list if needed.
		 */
		public Builder addInputs(Function<InputContainer.Builder, ObjectBuilder<InputContainer>> fn) {
			return this.addInputs(fn.apply(new InputContainer.Builder()).build());
		}

		/**
		 * Builds a {@link ChainInput}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChainInput build() {

			return new ChainInput(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ChainInput
	 */
	public static final JsonpDeserializer<ChainInput> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ChainInput::setupChainInputDeserializer);

	protected static void setupChainInputDeserializer(DelegatingDeserializer<ChainInput.Builder> op) {

		op.add(Builder::inputs, JsonpDeserializer.arrayDeserializer(InputContainer.DESERIALIZER), "inputs");

	}

}
