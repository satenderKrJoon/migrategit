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
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.validate_job.Request
public final class ValidateJobRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String jobId;

	@Nullable
	private final AnalysisConfig analysisConfig;

	@Nullable
	private final AnalysisLimits analysisLimits;

	@Nullable
	private final DataDescription dataDescription;

	@Nullable
	private final String description;

	@Nullable
	private final ModelPlotConfig modelPlot;

	@Nullable
	private final Number modelSnapshotRetentionDays;

	@Nullable
	private final String resultsIndexName;

	// ---------------------------------------------------------------------------------------------

	protected ValidateJobRequest(Builder builder) {

		this.jobId = builder.jobId;
		this.analysisConfig = builder.analysisConfig;
		this.analysisLimits = builder.analysisLimits;
		this.dataDescription = builder.dataDescription;
		this.description = builder.description;
		this.modelPlot = builder.modelPlot;
		this.modelSnapshotRetentionDays = builder.modelSnapshotRetentionDays;
		this.resultsIndexName = builder.resultsIndexName;

	}

	/**
	 * API name: {@code job_id}
	 */
	@Nullable
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code analysis_config}
	 */
	@Nullable
	public AnalysisConfig analysisConfig() {
		return this.analysisConfig;
	}

	/**
	 * API name: {@code analysis_limits}
	 */
	@Nullable
	public AnalysisLimits analysisLimits() {
		return this.analysisLimits;
	}

	/**
	 * API name: {@code data_description}
	 */
	@Nullable
	public DataDescription dataDescription() {
		return this.dataDescription;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code model_plot}
	 */
	@Nullable
	public ModelPlotConfig modelPlot() {
		return this.modelPlot;
	}

	/**
	 * API name: {@code model_snapshot_retention_days}
	 */
	@Nullable
	public Number modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * API name: {@code results_index_name}
	 */
	@Nullable
	public String resultsIndexName() {
		return this.resultsIndexName;
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

		if (this.jobId != null) {

			generator.writeKey("job_id");
			generator.write(this.jobId);

		}
		if (this.analysisConfig != null) {

			generator.writeKey("analysis_config");
			this.analysisConfig.toJsonp(generator, mapper);

		}
		if (this.analysisLimits != null) {

			generator.writeKey("analysis_limits");
			this.analysisLimits.toJsonp(generator, mapper);

		}
		if (this.dataDescription != null) {

			generator.writeKey("data_description");
			this.dataDescription.toJsonp(generator, mapper);

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.modelPlot != null) {

			generator.writeKey("model_plot");
			this.modelPlot.toJsonp(generator, mapper);

		}
		if (this.modelSnapshotRetentionDays != null) {

			generator.writeKey("model_snapshot_retention_days");
			generator.write(this.modelSnapshotRetentionDays.doubleValue());

		}
		if (this.resultsIndexName != null) {

			generator.writeKey("results_index_name");
			generator.write(this.resultsIndexName);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ValidateJobRequest}.
	 */
	public static class Builder implements ObjectBuilder<ValidateJobRequest> {
		@Nullable
		private String jobId;

		@Nullable
		private AnalysisConfig analysisConfig;

		@Nullable
		private AnalysisLimits analysisLimits;

		@Nullable
		private DataDescription dataDescription;

		@Nullable
		private String description;

		@Nullable
		private ModelPlotConfig modelPlot;

		@Nullable
		private Number modelSnapshotRetentionDays;

		@Nullable
		private String resultsIndexName;

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(@Nullable String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code analysis_config}
		 */
		public Builder analysisConfig(@Nullable AnalysisConfig value) {
			this.analysisConfig = value;
			return this;
		}

		/**
		 * API name: {@code analysis_config}
		 */
		public Builder analysisConfig(Function<AnalysisConfig.Builder, ObjectBuilder<AnalysisConfig>> fn) {
			return this.analysisConfig(fn.apply(new AnalysisConfig.Builder()).build());
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public Builder analysisLimits(@Nullable AnalysisLimits value) {
			this.analysisLimits = value;
			return this;
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public Builder analysisLimits(Function<AnalysisLimits.Builder, ObjectBuilder<AnalysisLimits>> fn) {
			return this.analysisLimits(fn.apply(new AnalysisLimits.Builder()).build());
		}

		/**
		 * API name: {@code data_description}
		 */
		public Builder dataDescription(@Nullable DataDescription value) {
			this.dataDescription = value;
			return this;
		}

		/**
		 * API name: {@code data_description}
		 */
		public Builder dataDescription(Function<DataDescription.Builder, ObjectBuilder<DataDescription>> fn) {
			return this.dataDescription(fn.apply(new DataDescription.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code model_plot}
		 */
		public Builder modelPlot(@Nullable ModelPlotConfig value) {
			this.modelPlot = value;
			return this;
		}

		/**
		 * API name: {@code model_plot}
		 */
		public Builder modelPlot(Function<ModelPlotConfig.Builder, ObjectBuilder<ModelPlotConfig>> fn) {
			return this.modelPlot(fn.apply(new ModelPlotConfig.Builder()).build());
		}

		/**
		 * API name: {@code model_snapshot_retention_days}
		 */
		public Builder modelSnapshotRetentionDays(@Nullable Number value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * API name: {@code results_index_name}
		 */
		public Builder resultsIndexName(@Nullable String value) {
			this.resultsIndexName = value;
			return this;
		}

		/**
		 * Builds a {@link ValidateJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ValidateJobRequest build() {

			return new ValidateJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ValidateJobRequest
	 */
	public static final JsonpDeserializer<ValidateJobRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ValidateJobRequest::setupValidateJobRequestDeserializer);

	protected static void setupValidateJobRequestDeserializer(DelegatingDeserializer<ValidateJobRequest.Builder> op) {

		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::analysisConfig, AnalysisConfig.DESERIALIZER, "analysis_config");
		op.add(Builder::analysisLimits, AnalysisLimits.DESERIALIZER, "analysis_limits");
		op.add(Builder::dataDescription, DataDescription.DESERIALIZER, "data_description");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::modelPlot, ModelPlotConfig.DESERIALIZER, "model_plot");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.numberDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::resultsIndexName, JsonpDeserializer.stringDeserializer(), "results_index_name");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.validate}".
	 */
	public static final Endpoint<ValidateJobRequest, ValidateJobResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_ml/anomaly_detectors/_validate";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, ValidateJobResponse.DESERIALIZER);
}
