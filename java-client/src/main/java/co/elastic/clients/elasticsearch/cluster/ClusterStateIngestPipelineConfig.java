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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch.ingest.ProcessorContainer;
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

// typedef: cluster._types.ClusterStateIngestPipelineConfig
public final class ClusterStateIngestPipelineConfig implements ToJsonp {
	@Nullable
	private final String description;

	@Nullable
	private final Number version;

	private final List<ProcessorContainer> processors;

	// ---------------------------------------------------------------------------------------------

	protected ClusterStateIngestPipelineConfig(Builder builder) {

		this.description = builder.description;
		this.version = builder.version;
		this.processors = Objects.requireNonNull(builder.processors, "processors");

	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code processors}
	 */
	public List<ProcessorContainer> processors() {
		return this.processors;
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

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}

		generator.writeKey("processors");
		generator.writeStartArray();
		for (ProcessorContainer item0 : this.processors) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateIngestPipelineConfig}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateIngestPipelineConfig> {
		@Nullable
		private String description;

		@Nullable
		private Number version;

		private List<ProcessorContainer> processors;

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public Builder processors(List<ProcessorContainer> value) {
			this.processors = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public Builder processors(ProcessorContainer... value) {
			this.processors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(ProcessorContainer value) {
			if (this.processors == null) {
				this.processors = new ArrayList<>();
			}
			this.processors.add(value);
			return this;
		}

		/**
		 * Set {@link #processors(List)} to a singleton list.
		 */
		public Builder processors(Function<ProcessorContainer.Builder, ObjectBuilder<ProcessorContainer>> fn) {
			return this.processors(fn.apply(new ProcessorContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(Function<ProcessorContainer.Builder, ObjectBuilder<ProcessorContainer>> fn) {
			return this.addProcessors(fn.apply(new ProcessorContainer.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterStateIngestPipelineConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateIngestPipelineConfig build() {

			return new ClusterStateIngestPipelineConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterStateIngestPipelineConfig
	 */
	public static final JsonpDeserializer<ClusterStateIngestPipelineConfig> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					ClusterStateIngestPipelineConfig::setupClusterStateIngestPipelineConfigDeserializer);

	protected static void setupClusterStateIngestPipelineConfigDeserializer(
			DelegatingDeserializer<ClusterStateIngestPipelineConfig.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");
		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(ProcessorContainer.DESERIALIZER), "processors");

	}

}
