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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.NodeAttributes;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalytics
public final class DataframeAnalytics implements ToJsonp {
	@Nullable
	private final DataframeAnalyticsStatsContainer analysisStats;

	@Nullable
	private final String assignmentExplanation;

	private final DataframeAnalyticsStatsDataCounts dataCounts;

	private final String id;

	private final DataframeAnalyticsStatsMemoryUsage memoryUsage;

	@Nullable
	private final NodeAttributes node;

	private final List<DataframeAnalyticsStatsProgress> progress;

	private final JsonValue state;

	// ---------------------------------------------------------------------------------------------

	protected DataframeAnalytics(Builder builder) {

		this.analysisStats = builder.analysisStats;
		this.assignmentExplanation = builder.assignmentExplanation;
		this.dataCounts = Objects.requireNonNull(builder.dataCounts, "data_counts");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.memoryUsage = Objects.requireNonNull(builder.memoryUsage, "memory_usage");
		this.node = builder.node;
		this.progress = Objects.requireNonNull(builder.progress, "progress");
		this.state = Objects.requireNonNull(builder.state, "state");

	}

	/**
	 * An object containing information about the analysis job.
	 *
	 * API name: {@code analysis_stats}
	 */
	@Nullable
	public DataframeAnalyticsStatsContainer analysisStats() {
		return this.analysisStats;
	}

	/**
	 * For running jobs only, contains messages relating to the selection of a node
	 * to run the job.
	 *
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * An object that provides counts for the quantity of documents skipped, used in
	 * training, or available for testing.
	 *
	 * API name: {@code data_counts}
	 */
	public DataframeAnalyticsStatsDataCounts dataCounts() {
		return this.dataCounts;
	}

	/**
	 * The unique identifier of the data frame analytics job.
	 *
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * An object describing memory usage of the analytics. It is present only after
	 * the job is started and memory usage is reported.
	 *
	 * API name: {@code memory_usage}
	 */
	public DataframeAnalyticsStatsMemoryUsage memoryUsage() {
		return this.memoryUsage;
	}

	/**
	 * Contains properties for the node that runs the job. This information is
	 * available only for running jobs.
	 *
	 * API name: {@code node}
	 */
	@Nullable
	public NodeAttributes node() {
		return this.node;
	}

	/**
	 * The progress report of the data frame analytics job by phase.
	 *
	 * API name: {@code progress}
	 */
	public List<DataframeAnalyticsStatsProgress> progress() {
		return this.progress;
	}

	/**
	 * The status of the data frame analytics job, which can be one of the following
	 * values: failed, started, starting, stopping, stopped.
	 *
	 * API name: {@code state}
	 */
	public JsonValue state() {
		return this.state;
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

		if (this.analysisStats != null) {

			generator.writeKey("analysis_stats");
			this.analysisStats.toJsonp(generator, mapper);

		}
		if (this.assignmentExplanation != null) {

			generator.writeKey("assignment_explanation");
			generator.write(this.assignmentExplanation);

		}

		generator.writeKey("data_counts");
		this.dataCounts.toJsonp(generator, mapper);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("memory_usage");
		this.memoryUsage.toJsonp(generator, mapper);

		if (this.node != null) {

			generator.writeKey("node");
			this.node.toJsonp(generator, mapper);

		}

		generator.writeKey("progress");
		generator.writeStartArray();
		for (DataframeAnalyticsStatsProgress item0 : this.progress) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("state");
		generator.write(this.state);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalytics}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalytics> {
		@Nullable
		private DataframeAnalyticsStatsContainer analysisStats;

		@Nullable
		private String assignmentExplanation;

		private DataframeAnalyticsStatsDataCounts dataCounts;

		private String id;

		private DataframeAnalyticsStatsMemoryUsage memoryUsage;

		@Nullable
		private NodeAttributes node;

		private List<DataframeAnalyticsStatsProgress> progress;

		private JsonValue state;

		/**
		 * An object containing information about the analysis job.
		 *
		 * API name: {@code analysis_stats}
		 */
		public Builder analysisStats(@Nullable DataframeAnalyticsStatsContainer value) {
			this.analysisStats = value;
			return this;
		}

		/**
		 * An object containing information about the analysis job.
		 *
		 * API name: {@code analysis_stats}
		 */
		public Builder analysisStats(
				Function<DataframeAnalyticsStatsContainer.Builder, ObjectBuilder<DataframeAnalyticsStatsContainer>> fn) {
			return this.analysisStats(fn.apply(new DataframeAnalyticsStatsContainer.Builder()).build());
		}

		/**
		 * For running jobs only, contains messages relating to the selection of a node
		 * to run the job.
		 *
		 * API name: {@code assignment_explanation}
		 */
		public Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * An object that provides counts for the quantity of documents skipped, used in
		 * training, or available for testing.
		 *
		 * API name: {@code data_counts}
		 */
		public Builder dataCounts(DataframeAnalyticsStatsDataCounts value) {
			this.dataCounts = value;
			return this;
		}

		/**
		 * An object that provides counts for the quantity of documents skipped, used in
		 * training, or available for testing.
		 *
		 * API name: {@code data_counts}
		 */
		public Builder dataCounts(
				Function<DataframeAnalyticsStatsDataCounts.Builder, ObjectBuilder<DataframeAnalyticsStatsDataCounts>> fn) {
			return this.dataCounts(fn.apply(new DataframeAnalyticsStatsDataCounts.Builder()).build());
		}

		/**
		 * The unique identifier of the data frame analytics job.
		 *
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * An object describing memory usage of the analytics. It is present only after
		 * the job is started and memory usage is reported.
		 *
		 * API name: {@code memory_usage}
		 */
		public Builder memoryUsage(DataframeAnalyticsStatsMemoryUsage value) {
			this.memoryUsage = value;
			return this;
		}

		/**
		 * An object describing memory usage of the analytics. It is present only after
		 * the job is started and memory usage is reported.
		 *
		 * API name: {@code memory_usage}
		 */
		public Builder memoryUsage(
				Function<DataframeAnalyticsStatsMemoryUsage.Builder, ObjectBuilder<DataframeAnalyticsStatsMemoryUsage>> fn) {
			return this.memoryUsage(fn.apply(new DataframeAnalyticsStatsMemoryUsage.Builder()).build());
		}

		/**
		 * Contains properties for the node that runs the job. This information is
		 * available only for running jobs.
		 *
		 * API name: {@code node}
		 */
		public Builder node(@Nullable NodeAttributes value) {
			this.node = value;
			return this;
		}

		/**
		 * Contains properties for the node that runs the job. This information is
		 * available only for running jobs.
		 *
		 * API name: {@code node}
		 */
		public Builder node(Function<NodeAttributes.Builder, ObjectBuilder<NodeAttributes>> fn) {
			return this.node(fn.apply(new NodeAttributes.Builder()).build());
		}

		/**
		 * The progress report of the data frame analytics job by phase.
		 *
		 * API name: {@code progress}
		 */
		public Builder progress(List<DataframeAnalyticsStatsProgress> value) {
			this.progress = value;
			return this;
		}

		/**
		 * The progress report of the data frame analytics job by phase.
		 *
		 * API name: {@code progress}
		 */
		public Builder progress(DataframeAnalyticsStatsProgress... value) {
			this.progress = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #progress(List)}, creating the list if needed.
		 */
		public Builder addProgress(DataframeAnalyticsStatsProgress value) {
			if (this.progress == null) {
				this.progress = new ArrayList<>();
			}
			this.progress.add(value);
			return this;
		}

		/**
		 * Set {@link #progress(List)} to a singleton list.
		 */
		public Builder progress(
				Function<DataframeAnalyticsStatsProgress.Builder, ObjectBuilder<DataframeAnalyticsStatsProgress>> fn) {
			return this.progress(fn.apply(new DataframeAnalyticsStatsProgress.Builder()).build());
		}

		/**
		 * Add a value to {@link #progress(List)}, creating the list if needed.
		 */
		public Builder addProgress(
				Function<DataframeAnalyticsStatsProgress.Builder, ObjectBuilder<DataframeAnalyticsStatsProgress>> fn) {
			return this.addProgress(fn.apply(new DataframeAnalyticsStatsProgress.Builder()).build());
		}

		/**
		 * The status of the data frame analytics job, which can be one of the following
		 * values: failed, started, starting, stopping, stopped.
		 *
		 * API name: {@code state}
		 */
		public Builder state(JsonValue value) {
			this.state = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalytics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalytics build() {

			return new DataframeAnalytics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataframeAnalytics
	 */
	public static final JsonpDeserializer<DataframeAnalytics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DataframeAnalytics::setupDataframeAnalyticsDeserializer);

	protected static void setupDataframeAnalyticsDeserializer(DelegatingDeserializer<DataframeAnalytics.Builder> op) {

		op.add(Builder::analysisStats, DataframeAnalyticsStatsContainer.DESERIALIZER, "analysis_stats");
		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation");
		op.add(Builder::dataCounts, DataframeAnalyticsStatsDataCounts.DESERIALIZER, "data_counts");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::memoryUsage, DataframeAnalyticsStatsMemoryUsage.DESERIALIZER, "memory_usage");
		op.add(Builder::node, NodeAttributes.DESERIALIZER, "node");
		op.add(Builder::progress, JsonpDeserializer.arrayDeserializer(DataframeAnalyticsStatsProgress.DESERIALIZER),
				"progress");
		op.add(Builder::state, JsonpDeserializer.jsonValueDeserializer(), "state");

	}

}
