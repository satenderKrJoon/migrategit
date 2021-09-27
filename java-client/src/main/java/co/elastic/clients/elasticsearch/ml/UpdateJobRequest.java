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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.update_job.Request
public final class UpdateJobRequest extends RequestBase implements ToJsonp {
	private final String jobId;

	@Nullable
	private final Boolean allowLazyOpen;

	@Nullable
	private final AnalysisMemoryLimit analysisLimits;

	@Nullable
	private final JsonValue backgroundPersistInterval;

	@Nullable
	private final Map<String, JsonValue> customSettings;

	@Nullable
	private final List<String> categorizationFilters;

	@Nullable
	private final String description;

	@Nullable
	private final ModelPlotConfig modelPlotConfig;

	@Nullable
	private final Number dailyModelSnapshotRetentionAfterDays;

	@Nullable
	private final Number modelSnapshotRetentionDays;

	@Nullable
	private final Number renormalizationWindowDays;

	@Nullable
	private final Number resultsRetentionDays;

	@Nullable
	private final List<String> groups;

	@Nullable
	private final List<Detector> detectors;

	@Nullable
	private final PerPartitionCategorization perPartitionCategorization;

	// ---------------------------------------------------------------------------------------------

	protected UpdateJobRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.allowLazyOpen = builder.allowLazyOpen;
		this.analysisLimits = builder.analysisLimits;
		this.backgroundPersistInterval = builder.backgroundPersistInterval;
		this.customSettings = builder.customSettings;
		this.categorizationFilters = builder.categorizationFilters;
		this.description = builder.description;
		this.modelPlotConfig = builder.modelPlotConfig;
		this.dailyModelSnapshotRetentionAfterDays = builder.dailyModelSnapshotRetentionAfterDays;
		this.modelSnapshotRetentionDays = builder.modelSnapshotRetentionDays;
		this.renormalizationWindowDays = builder.renormalizationWindowDays;
		this.resultsRetentionDays = builder.resultsRetentionDays;
		this.groups = builder.groups;
		this.detectors = builder.detectors;
		this.perPartitionCategorization = builder.perPartitionCategorization;

	}

	/**
	 * Identifier for the job
	 *
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code allow_lazy_open}
	 */
	@Nullable
	public Boolean allowLazyOpen() {
		return this.allowLazyOpen;
	}

	/**
	 * API name: {@code analysis_limits}
	 */
	@Nullable
	public AnalysisMemoryLimit analysisLimits() {
		return this.analysisLimits;
	}

	/**
	 * Advanced configuration option. The time between each periodic persistence of
	 * the model. See Job resources.
	 *
	 * API name: {@code background_persist_interval}
	 */
	@Nullable
	public JsonValue backgroundPersistInterval() {
		return this.backgroundPersistInterval;
	}

	/**
	 * Advanced configuration option. Contains custom meta data about the job. For
	 * example, it can contain custom URL information as shown in Adding custom URLs
	 * to machine learning results.
	 *
	 * API name: {@code custom_settings}
	 */
	@Nullable
	public Map<String, JsonValue> customSettings() {
		return this.customSettings;
	}

	/**
	 * API name: {@code categorization_filters}
	 */
	@Nullable
	public List<String> categorizationFilters() {
		return this.categorizationFilters;
	}

	/**
	 * A description of the job. See Job resources.
	 *
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code model_plot_config}
	 */
	@Nullable
	public ModelPlotConfig modelPlotConfig() {
		return this.modelPlotConfig;
	}

	/**
	 * API name: {@code daily_model_snapshot_retention_after_days}
	 */
	@Nullable
	public Number dailyModelSnapshotRetentionAfterDays() {
		return this.dailyModelSnapshotRetentionAfterDays;
	}

	/**
	 * Advanced configuration option, which affects the automatic removal of old
	 * model snapshots for this job. It specifies the maximum period of time (in
	 * days) that snapshots are retained. This period is relative to the timestamp
	 * of the most recent snapshot for this job.
	 *
	 * API name: {@code model_snapshot_retention_days}
	 */
	@Nullable
	public Number modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * Advanced configuration option. The period over which adjustments to the score
	 * are applied, as new data is seen.
	 *
	 * API name: {@code renormalization_window_days}
	 */
	@Nullable
	public Number renormalizationWindowDays() {
		return this.renormalizationWindowDays;
	}

	/**
	 * Advanced configuration option. The period of time (in days) that results are
	 * retained. Age is calculated relative to the timestamp of the latest bucket
	 * result. If this property has a non-null value, once per day at 00:30 (server
	 * time), results that are the specified number of days older than the latest
	 * bucket result are deleted from Elasticsearch. The default value is null,
	 * which means all results are retained.
	 *
	 * API name: {@code results_retention_days}
	 */
	@Nullable
	public Number resultsRetentionDays() {
		return this.resultsRetentionDays;
	}

	/**
	 * A list of job groups. A job can belong to no groups or many.
	 *
	 * API name: {@code groups}
	 */
	@Nullable
	public List<String> groups() {
		return this.groups;
	}

	/**
	 * An array of detector update objects.
	 *
	 * API name: {@code detectors}
	 */
	@Nullable
	public List<Detector> detectors() {
		return this.detectors;
	}

	/**
	 * Settings related to how categorization interacts with partition fields.
	 *
	 * API name: {@code per_partition_categorization}
	 */
	@Nullable
	public PerPartitionCategorization perPartitionCategorization() {
		return this.perPartitionCategorization;
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

		if (this.allowLazyOpen != null) {

			generator.writeKey("allow_lazy_open");
			generator.write(this.allowLazyOpen);

		}
		if (this.analysisLimits != null) {

			generator.writeKey("analysis_limits");
			this.analysisLimits.toJsonp(generator, mapper);

		}
		if (this.backgroundPersistInterval != null) {

			generator.writeKey("background_persist_interval");
			generator.write(this.backgroundPersistInterval);

		}
		if (this.customSettings != null) {

			generator.writeKey("custom_settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.customSettings.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.categorizationFilters != null) {

			generator.writeKey("categorization_filters");
			generator.writeStartArray();
			for (String item0 : this.categorizationFilters) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.modelPlotConfig != null) {

			generator.writeKey("model_plot_config");
			this.modelPlotConfig.toJsonp(generator, mapper);

		}
		if (this.dailyModelSnapshotRetentionAfterDays != null) {

			generator.writeKey("daily_model_snapshot_retention_after_days");
			generator.write(this.dailyModelSnapshotRetentionAfterDays.doubleValue());

		}
		if (this.modelSnapshotRetentionDays != null) {

			generator.writeKey("model_snapshot_retention_days");
			generator.write(this.modelSnapshotRetentionDays.doubleValue());

		}
		if (this.renormalizationWindowDays != null) {

			generator.writeKey("renormalization_window_days");
			generator.write(this.renormalizationWindowDays.doubleValue());

		}
		if (this.resultsRetentionDays != null) {

			generator.writeKey("results_retention_days");
			generator.write(this.resultsRetentionDays.doubleValue());

		}
		if (this.groups != null) {

			generator.writeKey("groups");
			generator.writeStartArray();
			for (String item0 : this.groups) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.detectors != null) {

			generator.writeKey("detectors");
			generator.writeStartArray();
			for (Detector item0 : this.detectors) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.perPartitionCategorization != null) {

			generator.writeKey("per_partition_categorization");
			this.perPartitionCategorization.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateJobRequest}.
	 */
	public static class Builder implements ObjectBuilder<UpdateJobRequest> {
		private String jobId;

		@Nullable
		private Boolean allowLazyOpen;

		@Nullable
		private AnalysisMemoryLimit analysisLimits;

		@Nullable
		private JsonValue backgroundPersistInterval;

		@Nullable
		private Map<String, JsonValue> customSettings;

		@Nullable
		private List<String> categorizationFilters;

		@Nullable
		private String description;

		@Nullable
		private ModelPlotConfig modelPlotConfig;

		@Nullable
		private Number dailyModelSnapshotRetentionAfterDays;

		@Nullable
		private Number modelSnapshotRetentionDays;

		@Nullable
		private Number renormalizationWindowDays;

		@Nullable
		private Number resultsRetentionDays;

		@Nullable
		private List<String> groups;

		@Nullable
		private List<Detector> detectors;

		@Nullable
		private PerPartitionCategorization perPartitionCategorization;

		/**
		 * Identifier for the job
		 *
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code allow_lazy_open}
		 */
		public Builder allowLazyOpen(@Nullable Boolean value) {
			this.allowLazyOpen = value;
			return this;
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public Builder analysisLimits(@Nullable AnalysisMemoryLimit value) {
			this.analysisLimits = value;
			return this;
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public Builder analysisLimits(Function<AnalysisMemoryLimit.Builder, ObjectBuilder<AnalysisMemoryLimit>> fn) {
			return this.analysisLimits(fn.apply(new AnalysisMemoryLimit.Builder()).build());
		}

		/**
		 * Advanced configuration option. The time between each periodic persistence of
		 * the model. See Job resources.
		 *
		 * API name: {@code background_persist_interval}
		 */
		public Builder backgroundPersistInterval(@Nullable JsonValue value) {
			this.backgroundPersistInterval = value;
			return this;
		}

		/**
		 * Advanced configuration option. Contains custom meta data about the job. For
		 * example, it can contain custom URL information as shown in Adding custom URLs
		 * to machine learning results.
		 *
		 * API name: {@code custom_settings}
		 */
		public Builder customSettings(@Nullable Map<String, JsonValue> value) {
			this.customSettings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #customSettings(Map)}, creating the map if needed.
		 */
		public Builder putCustomSettings(String key, JsonValue value) {
			if (this.customSettings == null) {
				this.customSettings = new HashMap<>();
			}
			this.customSettings.put(key, value);
			return this;
		}

		/**
		 * API name: {@code categorization_filters}
		 */
		public Builder categorizationFilters(@Nullable List<String> value) {
			this.categorizationFilters = value;
			return this;
		}

		/**
		 * API name: {@code categorization_filters}
		 */
		public Builder categorizationFilters(String... value) {
			this.categorizationFilters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #categorizationFilters(List)}, creating the list if
		 * needed.
		 */
		public Builder addCategorizationFilters(String value) {
			if (this.categorizationFilters == null) {
				this.categorizationFilters = new ArrayList<>();
			}
			this.categorizationFilters.add(value);
			return this;
		}

		/**
		 * A description of the job. See Job resources.
		 *
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code model_plot_config}
		 */
		public Builder modelPlotConfig(@Nullable ModelPlotConfig value) {
			this.modelPlotConfig = value;
			return this;
		}

		/**
		 * API name: {@code model_plot_config}
		 */
		public Builder modelPlotConfig(Function<ModelPlotConfig.Builder, ObjectBuilder<ModelPlotConfig>> fn) {
			return this.modelPlotConfig(fn.apply(new ModelPlotConfig.Builder()).build());
		}

		/**
		 * API name: {@code daily_model_snapshot_retention_after_days}
		 */
		public Builder dailyModelSnapshotRetentionAfterDays(@Nullable Number value) {
			this.dailyModelSnapshotRetentionAfterDays = value;
			return this;
		}

		/**
		 * Advanced configuration option, which affects the automatic removal of old
		 * model snapshots for this job. It specifies the maximum period of time (in
		 * days) that snapshots are retained. This period is relative to the timestamp
		 * of the most recent snapshot for this job.
		 *
		 * API name: {@code model_snapshot_retention_days}
		 */
		public Builder modelSnapshotRetentionDays(@Nullable Number value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * Advanced configuration option. The period over which adjustments to the score
		 * are applied, as new data is seen.
		 *
		 * API name: {@code renormalization_window_days}
		 */
		public Builder renormalizationWindowDays(@Nullable Number value) {
			this.renormalizationWindowDays = value;
			return this;
		}

		/**
		 * Advanced configuration option. The period of time (in days) that results are
		 * retained. Age is calculated relative to the timestamp of the latest bucket
		 * result. If this property has a non-null value, once per day at 00:30 (server
		 * time), results that are the specified number of days older than the latest
		 * bucket result are deleted from Elasticsearch. The default value is null,
		 * which means all results are retained.
		 *
		 * API name: {@code results_retention_days}
		 */
		public Builder resultsRetentionDays(@Nullable Number value) {
			this.resultsRetentionDays = value;
			return this;
		}

		/**
		 * A list of job groups. A job can belong to no groups or many.
		 *
		 * API name: {@code groups}
		 */
		public Builder groups(@Nullable List<String> value) {
			this.groups = value;
			return this;
		}

		/**
		 * A list of job groups. A job can belong to no groups or many.
		 *
		 * API name: {@code groups}
		 */
		public Builder groups(String... value) {
			this.groups = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #groups(List)}, creating the list if needed.
		 */
		public Builder addGroups(String value) {
			if (this.groups == null) {
				this.groups = new ArrayList<>();
			}
			this.groups.add(value);
			return this;
		}

		/**
		 * An array of detector update objects.
		 *
		 * API name: {@code detectors}
		 */
		public Builder detectors(@Nullable List<Detector> value) {
			this.detectors = value;
			return this;
		}

		/**
		 * An array of detector update objects.
		 *
		 * API name: {@code detectors}
		 */
		public Builder detectors(Detector... value) {
			this.detectors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #detectors(List)}, creating the list if needed.
		 */
		public Builder addDetectors(Detector value) {
			if (this.detectors == null) {
				this.detectors = new ArrayList<>();
			}
			this.detectors.add(value);
			return this;
		}

		/**
		 * Set {@link #detectors(List)} to a singleton list.
		 */
		public Builder detectors(Function<Detector.Builder, ObjectBuilder<Detector>> fn) {
			return this.detectors(fn.apply(new Detector.Builder()).build());
		}

		/**
		 * Add a value to {@link #detectors(List)}, creating the list if needed.
		 */
		public Builder addDetectors(Function<Detector.Builder, ObjectBuilder<Detector>> fn) {
			return this.addDetectors(fn.apply(new Detector.Builder()).build());
		}

		/**
		 * Settings related to how categorization interacts with partition fields.
		 *
		 * API name: {@code per_partition_categorization}
		 */
		public Builder perPartitionCategorization(@Nullable PerPartitionCategorization value) {
			this.perPartitionCategorization = value;
			return this;
		}

		/**
		 * Settings related to how categorization interacts with partition fields.
		 *
		 * API name: {@code per_partition_categorization}
		 */
		public Builder perPartitionCategorization(
				Function<PerPartitionCategorization.Builder, ObjectBuilder<PerPartitionCategorization>> fn) {
			return this.perPartitionCategorization(fn.apply(new PerPartitionCategorization.Builder()).build());
		}

		/**
		 * Builds a {@link UpdateJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateJobRequest build() {

			return new UpdateJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for UpdateJobRequest
	 */
	public static final JsonpDeserializer<UpdateJobRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, UpdateJobRequest::setupUpdateJobRequestDeserializer);

	protected static void setupUpdateJobRequestDeserializer(DelegatingDeserializer<UpdateJobRequest.Builder> op) {

		op.add(Builder::allowLazyOpen, JsonpDeserializer.booleanDeserializer(), "allow_lazy_open");
		op.add(Builder::analysisLimits, AnalysisMemoryLimit.DESERIALIZER, "analysis_limits");
		op.add(Builder::backgroundPersistInterval, JsonpDeserializer.jsonValueDeserializer(),
				"background_persist_interval");
		op.add(Builder::customSettings,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "custom_settings");
		op.add(Builder::categorizationFilters,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "categorization_filters");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::modelPlotConfig, ModelPlotConfig.DESERIALIZER, "model_plot_config");
		op.add(Builder::dailyModelSnapshotRetentionAfterDays, JsonpDeserializer.numberDeserializer(),
				"daily_model_snapshot_retention_after_days");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.numberDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::renormalizationWindowDays, JsonpDeserializer.numberDeserializer(),
				"renormalization_window_days");
		op.add(Builder::resultsRetentionDays, JsonpDeserializer.numberDeserializer(), "results_retention_days");
		op.add(Builder::groups, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "groups");
		op.add(Builder::detectors, JsonpDeserializer.arrayDeserializer(Detector.DESERIALIZER), "detectors");
		op.add(Builder::perPartitionCategorization, PerPartitionCategorization.DESERIALIZER,
				"per_partition_categorization");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.update_job}".
	 */
	public static final Endpoint<UpdateJobRequest, UpdateJobResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/_update");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, UpdateJobResponse.DESERIALIZER);
}
