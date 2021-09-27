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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.ForeachProcessor
public final class ForeachProcessor extends ProcessorBase {
	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	private final ProcessorContainer processor;

	// ---------------------------------------------------------------------------------------------

	protected ForeachProcessor(Builder builder) {
		super(builder);
		this.field = Objects.requireNonNull(builder.field, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.processor = Objects.requireNonNull(builder.processor, "processor");

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * API name: {@code processor}
	 */
	public ProcessorContainer processor() {
		return this.processor;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("field");
		generator.write(this.field);

		if (this.ignoreMissing != null) {

			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}

		generator.writeKey("processor");
		this.processor.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ForeachProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ForeachProcessor> {
		private String field;

		@Nullable
		private Boolean ignoreMissing;

		private ProcessorContainer processor;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing}
		 */
		public Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * API name: {@code processor}
		 */
		public Builder processor(ProcessorContainer value) {
			this.processor = value;
			return this;
		}

		/**
		 * API name: {@code processor}
		 */
		public Builder processor(Function<ProcessorContainer.Builder, ObjectBuilder<ProcessorContainer>> fn) {
			return this.processor(fn.apply(new ProcessorContainer.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ForeachProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForeachProcessor build() {

			return new ForeachProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ForeachProcessor
	 */
	public static final JsonpDeserializer<ForeachProcessor> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ForeachProcessor::setupForeachProcessorDeserializer);

	protected static void setupForeachProcessorDeserializer(DelegatingDeserializer<ForeachProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::processor, ProcessorContainer.DESERIALIZER, "processor");

	}

}
