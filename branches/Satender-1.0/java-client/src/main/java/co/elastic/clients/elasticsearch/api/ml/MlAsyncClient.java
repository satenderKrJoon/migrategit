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

package co.elastic.clients.elasticsearch.api.ml;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ml.CloseJobRequest;
import co.elastic.clients.elasticsearch.ml.CloseJobResponse;
import co.elastic.clients.elasticsearch.ml.DeleteCalendarEventRequest;
import co.elastic.clients.elasticsearch.ml.DeleteCalendarEventResponse;
import co.elastic.clients.elasticsearch.ml.DeleteCalendarJobRequest;
import co.elastic.clients.elasticsearch.ml.DeleteCalendarJobResponse;
import co.elastic.clients.elasticsearch.ml.DeleteCalendarRequest;
import co.elastic.clients.elasticsearch.ml.DeleteCalendarResponse;
import co.elastic.clients.elasticsearch.ml.DeleteDataFrameAnalyticsRequest;
import co.elastic.clients.elasticsearch.ml.DeleteDataFrameAnalyticsResponse;
import co.elastic.clients.elasticsearch.ml.DeleteDatafeedRequest;
import co.elastic.clients.elasticsearch.ml.DeleteDatafeedResponse;
import co.elastic.clients.elasticsearch.ml.DeleteFilterRequest;
import co.elastic.clients.elasticsearch.ml.DeleteFilterResponse;
import co.elastic.clients.elasticsearch.ml.DeleteForecastRequest;
import co.elastic.clients.elasticsearch.ml.DeleteForecastResponse;
import co.elastic.clients.elasticsearch.ml.DeleteJobRequest;
import co.elastic.clients.elasticsearch.ml.DeleteJobResponse;
import co.elastic.clients.elasticsearch.ml.DeleteModelSnapshotRequest;
import co.elastic.clients.elasticsearch.ml.DeleteModelSnapshotResponse;
import co.elastic.clients.elasticsearch.ml.DeleteTrainedModelAliasRequest;
import co.elastic.clients.elasticsearch.ml.DeleteTrainedModelAliasResponse;
import co.elastic.clients.elasticsearch.ml.DeleteTrainedModelRequest;
import co.elastic.clients.elasticsearch.ml.DeleteTrainedModelResponse;
import co.elastic.clients.elasticsearch.ml.EstimateModelMemoryRequest;
import co.elastic.clients.elasticsearch.ml.EstimateModelMemoryResponse;
import co.elastic.clients.elasticsearch.ml.EvaluateDataFrameRequest;
import co.elastic.clients.elasticsearch.ml.EvaluateDataFrameResponse;
import co.elastic.clients.elasticsearch.ml.ExplainDataFrameAnalyticsRequest;
import co.elastic.clients.elasticsearch.ml.ExplainDataFrameAnalyticsResponse;
import co.elastic.clients.elasticsearch.ml.FindFileStructureRequest;
import co.elastic.clients.elasticsearch.ml.FindFileStructureResponse;
import co.elastic.clients.elasticsearch.ml.FlushJobRequest;
import co.elastic.clients.elasticsearch.ml.FlushJobResponse;
import co.elastic.clients.elasticsearch.ml.ForecastJobRequest;
import co.elastic.clients.elasticsearch.ml.ForecastJobResponse;
import co.elastic.clients.elasticsearch.ml.GetAnomalyRecordsRequest;
import co.elastic.clients.elasticsearch.ml.GetAnomalyRecordsResponse;
import co.elastic.clients.elasticsearch.ml.GetBucketsRequest;
import co.elastic.clients.elasticsearch.ml.GetBucketsResponse;
import co.elastic.clients.elasticsearch.ml.GetCalendarEventsRequest;
import co.elastic.clients.elasticsearch.ml.GetCalendarEventsResponse;
import co.elastic.clients.elasticsearch.ml.GetCalendarsRequest;
import co.elastic.clients.elasticsearch.ml.GetCalendarsResponse;
import co.elastic.clients.elasticsearch.ml.GetCategoriesRequest;
import co.elastic.clients.elasticsearch.ml.GetCategoriesResponse;
import co.elastic.clients.elasticsearch.ml.GetDataFrameAnalyticsRequest;
import co.elastic.clients.elasticsearch.ml.GetDataFrameAnalyticsResponse;
import co.elastic.clients.elasticsearch.ml.GetDataFrameAnalyticsStatsRequest;
import co.elastic.clients.elasticsearch.ml.GetDataFrameAnalyticsStatsResponse;
import co.elastic.clients.elasticsearch.ml.GetDatafeedStatsRequest;
import co.elastic.clients.elasticsearch.ml.GetDatafeedStatsResponse;
import co.elastic.clients.elasticsearch.ml.GetDatafeedsRequest;
import co.elastic.clients.elasticsearch.ml.GetDatafeedsResponse;
import co.elastic.clients.elasticsearch.ml.GetFiltersRequest;
import co.elastic.clients.elasticsearch.ml.GetFiltersResponse;
import co.elastic.clients.elasticsearch.ml.GetInfluencersRequest;
import co.elastic.clients.elasticsearch.ml.GetInfluencersResponse;
import co.elastic.clients.elasticsearch.ml.GetJobStatsRequest;
import co.elastic.clients.elasticsearch.ml.GetJobStatsResponse;
import co.elastic.clients.elasticsearch.ml.GetJobsRequest;
import co.elastic.clients.elasticsearch.ml.GetJobsResponse;
import co.elastic.clients.elasticsearch.ml.GetModelSnapshotsRequest;
import co.elastic.clients.elasticsearch.ml.GetModelSnapshotsResponse;
import co.elastic.clients.elasticsearch.ml.GetOverallBucketsRequest;
import co.elastic.clients.elasticsearch.ml.GetOverallBucketsResponse;
import co.elastic.clients.elasticsearch.ml.GetTrainedModelsRequest;
import co.elastic.clients.elasticsearch.ml.GetTrainedModelsResponse;
import co.elastic.clients.elasticsearch.ml.GetTrainedModelsStatsRequest;
import co.elastic.clients.elasticsearch.ml.GetTrainedModelsStatsResponse;
import co.elastic.clients.elasticsearch.ml.InfoRequest;
import co.elastic.clients.elasticsearch.ml.InfoResponse;
import co.elastic.clients.elasticsearch.ml.OpenJobRequest;
import co.elastic.clients.elasticsearch.ml.OpenJobResponse;
import co.elastic.clients.elasticsearch.ml.PostCalendarEventsRequest;
import co.elastic.clients.elasticsearch.ml.PostCalendarEventsResponse;
import co.elastic.clients.elasticsearch.ml.PostJobDataRequest;
import co.elastic.clients.elasticsearch.ml.PostJobDataResponse;
import co.elastic.clients.elasticsearch.ml.PreviewDataFrameAnalyticsRequest;
import co.elastic.clients.elasticsearch.ml.PreviewDataFrameAnalyticsResponse;
import co.elastic.clients.elasticsearch.ml.PreviewDatafeedRequest;
import co.elastic.clients.elasticsearch.ml.PreviewDatafeedResponse;
import co.elastic.clients.elasticsearch.ml.PutCalendarJobRequest;
import co.elastic.clients.elasticsearch.ml.PutCalendarJobResponse;
import co.elastic.clients.elasticsearch.ml.PutCalendarRequest;
import co.elastic.clients.elasticsearch.ml.PutCalendarResponse;
import co.elastic.clients.elasticsearch.ml.PutDataFrameAnalyticsRequest;
import co.elastic.clients.elasticsearch.ml.PutDataFrameAnalyticsResponse;
import co.elastic.clients.elasticsearch.ml.PutDatafeedRequest;
import co.elastic.clients.elasticsearch.ml.PutDatafeedResponse;
import co.elastic.clients.elasticsearch.ml.PutFilterRequest;
import co.elastic.clients.elasticsearch.ml.PutFilterResponse;
import co.elastic.clients.elasticsearch.ml.PutJobRequest;
import co.elastic.clients.elasticsearch.ml.PutJobResponse;
import co.elastic.clients.elasticsearch.ml.PutTrainedModelAliasRequest;
import co.elastic.clients.elasticsearch.ml.PutTrainedModelAliasResponse;
import co.elastic.clients.elasticsearch.ml.PutTrainedModelRequest;
import co.elastic.clients.elasticsearch.ml.PutTrainedModelResponse;
import co.elastic.clients.elasticsearch.ml.RevertModelSnapshotRequest;
import co.elastic.clients.elasticsearch.ml.RevertModelSnapshotResponse;
import co.elastic.clients.elasticsearch.ml.SetUpgradeModeRequest;
import co.elastic.clients.elasticsearch.ml.SetUpgradeModeResponse;
import co.elastic.clients.elasticsearch.ml.StartDataFrameAnalyticsRequest;
import co.elastic.clients.elasticsearch.ml.StartDataFrameAnalyticsResponse;
import co.elastic.clients.elasticsearch.ml.StartDatafeedRequest;
import co.elastic.clients.elasticsearch.ml.StartDatafeedResponse;
import co.elastic.clients.elasticsearch.ml.StopDataFrameAnalyticsRequest;
import co.elastic.clients.elasticsearch.ml.StopDataFrameAnalyticsResponse;
import co.elastic.clients.elasticsearch.ml.StopDatafeedRequest;
import co.elastic.clients.elasticsearch.ml.StopDatafeedResponse;
import co.elastic.clients.elasticsearch.ml.UpdateDataFrameAnalyticsRequest;
import co.elastic.clients.elasticsearch.ml.UpdateDataFrameAnalyticsResponse;
import co.elastic.clients.elasticsearch.ml.UpdateFilterRequest;
import co.elastic.clients.elasticsearch.ml.UpdateFilterResponse;
import co.elastic.clients.elasticsearch.ml.UpdateJobRequest;
import co.elastic.clients.elasticsearch.ml.UpdateJobResponse;
import co.elastic.clients.elasticsearch.ml.UpdateModelSnapshotRequest;
import co.elastic.clients.elasticsearch.ml.UpdateModelSnapshotResponse;
import co.elastic.clients.elasticsearch.ml.UpgradeJobSnapshotRequest;
import co.elastic.clients.elasticsearch.ml.UpgradeJobSnapshotResponse;
import co.elastic.clients.elasticsearch.ml.ValidateDetectorRequest;
import co.elastic.clients.elasticsearch.ml.ValidateDetectorResponse;
import co.elastic.clients.elasticsearch.ml.ValidateJobRequest;
import co.elastic.clients.elasticsearch.ml.ValidateJobResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the ml namespace.
 */
public class MlAsyncClient extends ApiClient<MlAsyncClient> {

	public MlAsyncClient(Transport transport) {
		super(transport, null);
	}

	public MlAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: ml.close_job

	/**
	 * Closes one or more anomaly detection jobs. A job can be opened and closed
	 * multiple times throughout its lifecycle.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-close-job.html"
	 */

	public CompletableFuture<CloseJobResponse> closeJob(CloseJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, CloseJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Closes one or more anomaly detection jobs. A job can be opened and closed
	 * multiple times throughout its lifecycle.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-close-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<CloseJobResponse> closeJob(
			Function<CloseJobRequest.Builder, ObjectBuilder<CloseJobRequest>> fn) throws IOException {
		return closeJob(fn.apply(new CloseJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_calendar

	/**
	 * Deletes a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar.html"
	 */

	public CompletableFuture<DeleteCalendarResponse> deleteCalendar(DeleteCalendarRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteCalendarRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteCalendarResponse> deleteCalendar(
			Function<DeleteCalendarRequest.Builder, ObjectBuilder<DeleteCalendarRequest>> fn) throws IOException {
		return deleteCalendar(fn.apply(new DeleteCalendarRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_calendar_event

	/**
	 * Deletes scheduled events from a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar-event.html"
	 */

	public CompletableFuture<DeleteCalendarEventResponse> deleteCalendarEvent(DeleteCalendarEventRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteCalendarEventRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes scheduled events from a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar-event.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteCalendarEventResponse> deleteCalendarEvent(
			Function<DeleteCalendarEventRequest.Builder, ObjectBuilder<DeleteCalendarEventRequest>> fn)
			throws IOException {
		return deleteCalendarEvent(fn.apply(new DeleteCalendarEventRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_calendar_job

	/**
	 * Deletes anomaly detection jobs from a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar-job.html"
	 */

	public CompletableFuture<DeleteCalendarJobResponse> deleteCalendarJob(DeleteCalendarJobRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteCalendarJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes anomaly detection jobs from a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteCalendarJobResponse> deleteCalendarJob(
			Function<DeleteCalendarJobRequest.Builder, ObjectBuilder<DeleteCalendarJobRequest>> fn) throws IOException {
		return deleteCalendarJob(fn.apply(new DeleteCalendarJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_data_frame_analytics

	/**
	 * Deletes an existing data frame analytics job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-dfanalytics.html"
	 */

	public CompletableFuture<DeleteDataFrameAnalyticsResponse> deleteDataFrameAnalytics(
			DeleteDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteDataFrameAnalyticsRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Deletes an existing data frame analytics job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-dfanalytics.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteDataFrameAnalyticsResponse> deleteDataFrameAnalytics(
			Function<DeleteDataFrameAnalyticsRequest.Builder, ObjectBuilder<DeleteDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return deleteDataFrameAnalytics(fn.apply(new DeleteDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_datafeed

	/**
	 * Deletes an existing datafeed.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-datafeed.html"
	 */

	public CompletableFuture<DeleteDatafeedResponse> deleteDatafeed(DeleteDatafeedRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteDatafeedRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an existing datafeed.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-datafeed.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteDatafeedResponse> deleteDatafeed(
			Function<DeleteDatafeedRequest.Builder, ObjectBuilder<DeleteDatafeedRequest>> fn) throws IOException {
		return deleteDatafeed(fn.apply(new DeleteDatafeedRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_filter

	/**
	 * Deletes a filter.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-filter.html"
	 */

	public CompletableFuture<DeleteFilterResponse> deleteFilter(DeleteFilterRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteFilterRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes a filter.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-filter.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteFilterResponse> deleteFilter(
			Function<DeleteFilterRequest.Builder, ObjectBuilder<DeleteFilterRequest>> fn) throws IOException {
		return deleteFilter(fn.apply(new DeleteFilterRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_forecast

	/**
	 * Deletes forecasts from a machine learning job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-forecast.html"
	 */

	public CompletableFuture<DeleteForecastResponse> deleteForecast(DeleteForecastRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteForecastRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes forecasts from a machine learning job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-forecast.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteForecastResponse> deleteForecast(
			Function<DeleteForecastRequest.Builder, ObjectBuilder<DeleteForecastRequest>> fn) throws IOException {
		return deleteForecast(fn.apply(new DeleteForecastRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_job

	/**
	 * Deletes an existing anomaly detection job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-job.html"
	 */

	public CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an existing anomaly detection job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteJobResponse> deleteJob(
			Function<DeleteJobRequest.Builder, ObjectBuilder<DeleteJobRequest>> fn) throws IOException {
		return deleteJob(fn.apply(new DeleteJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_model_snapshot

	/**
	 * Deletes an existing model snapshot.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-snapshot.html"
	 */

	public CompletableFuture<DeleteModelSnapshotResponse> deleteModelSnapshot(DeleteModelSnapshotRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteModelSnapshotRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an existing model snapshot.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-snapshot.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteModelSnapshotResponse> deleteModelSnapshot(
			Function<DeleteModelSnapshotRequest.Builder, ObjectBuilder<DeleteModelSnapshotRequest>> fn)
			throws IOException {
		return deleteModelSnapshot(fn.apply(new DeleteModelSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_trained_model

	/**
	 * Deletes an existing trained inference model that is currently not referenced
	 * by an ingest pipeline.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models.html"
	 */

	public CompletableFuture<DeleteTrainedModelResponse> deleteTrainedModel(DeleteTrainedModelRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteTrainedModelRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an existing trained inference model that is currently not referenced
	 * by an ingest pipeline.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteTrainedModelResponse> deleteTrainedModel(
			Function<DeleteTrainedModelRequest.Builder, ObjectBuilder<DeleteTrainedModelRequest>> fn)
			throws IOException {
		return deleteTrainedModel(fn.apply(new DeleteTrainedModelRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_trained_model_alias

	/**
	 * Deletes a model alias that refers to the trained model
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models-aliases.html"
	 */

	public CompletableFuture<DeleteTrainedModelAliasResponse> deleteTrainedModelAlias(
			DeleteTrainedModelAliasRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteTrainedModelAliasRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Deletes a model alias that refers to the trained model
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models-aliases.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteTrainedModelAliasResponse> deleteTrainedModelAlias(
			Function<DeleteTrainedModelAliasRequest.Builder, ObjectBuilder<DeleteTrainedModelAliasRequest>> fn)
			throws IOException {
		return deleteTrainedModelAlias(fn.apply(new DeleteTrainedModelAliasRequest.Builder()).build());
	}

	// ----- Endpoint: ml.estimate_model_memory

	/**
	 * Estimates the model memory
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-apis.html"
	 */

	public CompletableFuture<EstimateModelMemoryResponse> estimateModelMemory(EstimateModelMemoryRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, EstimateModelMemoryRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Estimates the model memory
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-apis.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<EstimateModelMemoryResponse> estimateModelMemory(
			Function<EstimateModelMemoryRequest.Builder, ObjectBuilder<EstimateModelMemoryRequest>> fn)
			throws IOException {
		return estimateModelMemory(fn.apply(new EstimateModelMemoryRequest.Builder()).build());
	}

	// ----- Endpoint: ml.evaluate_data_frame

	/**
	 * Evaluates the data frame analytics for an annotated index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/evaluate-dfanalytics.html"
	 */

	public CompletableFuture<EvaluateDataFrameResponse> evaluateDataFrame(EvaluateDataFrameRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, EvaluateDataFrameRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Evaluates the data frame analytics for an annotated index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/evaluate-dfanalytics.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<EvaluateDataFrameResponse> evaluateDataFrame(
			Function<EvaluateDataFrameRequest.Builder, ObjectBuilder<EvaluateDataFrameRequest>> fn) throws IOException {
		return evaluateDataFrame(fn.apply(new EvaluateDataFrameRequest.Builder()).build());
	}

	// ----- Endpoint: ml.explain_data_frame_analytics

	/**
	 * Explains a data frame analytics config.
	 *
	 * @see "http://www.elastic.co/guide/en/elasticsearch/reference/current/explain-dfanalytics.html"
	 */

	public CompletableFuture<ExplainDataFrameAnalyticsResponse> explainDataFrameAnalytics(
			ExplainDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ExplainDataFrameAnalyticsRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Explains a data frame analytics config.
	 *
	 * @see "http://www.elastic.co/guide/en/elasticsearch/reference/current/explain-dfanalytics.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ExplainDataFrameAnalyticsResponse> explainDataFrameAnalytics(
			Function<ExplainDataFrameAnalyticsRequest.Builder, ObjectBuilder<ExplainDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return explainDataFrameAnalytics(fn.apply(new ExplainDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.find_file_structure

	/**
	 * Finds the structure of a text file. The text file must contain data that is
	 * suitable to be ingested into Elasticsearch.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/find-structure.html"
	 */

	public CompletableFuture<FindFileStructureResponse> findFileStructure(FindFileStructureRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, FindFileStructureRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Finds the structure of a text file. The text file must contain data that is
	 * suitable to be ingested into Elasticsearch.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/find-structure.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<FindFileStructureResponse> findFileStructure(
			Function<FindFileStructureRequest.Builder, ObjectBuilder<FindFileStructureRequest>> fn) throws IOException {
		return findFileStructure(fn.apply(new FindFileStructureRequest.Builder()).build());
	}

	// ----- Endpoint: ml.flush_job

	/**
	 * Forces any buffered data to be processed by the job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-flush-job.html"
	 */

	public CompletableFuture<FlushJobResponse> flushJob(FlushJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, FlushJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Forces any buffered data to be processed by the job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-flush-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<FlushJobResponse> flushJob(
			Function<FlushJobRequest.Builder, ObjectBuilder<FlushJobRequest>> fn) throws IOException {
		return flushJob(fn.apply(new FlushJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.forecast

	/**
	 * Predicts the future behavior of a time series by using its historical
	 * behavior.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-forecast.html"
	 */

	public CompletableFuture<ForecastJobResponse> forecast(ForecastJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ForecastJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Predicts the future behavior of a time series by using its historical
	 * behavior.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-forecast.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ForecastJobResponse> forecast(
			Function<ForecastJobRequest.Builder, ObjectBuilder<ForecastJobRequest>> fn) throws IOException {
		return forecast(fn.apply(new ForecastJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_buckets

	/**
	 * Retrieves anomaly detection job results for one or more buckets.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-bucket.html"
	 */

	public CompletableFuture<GetBucketsResponse> getBuckets(GetBucketsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetBucketsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves anomaly detection job results for one or more buckets.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-bucket.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetBucketsResponse> getBuckets(
			Function<GetBucketsRequest.Builder, ObjectBuilder<GetBucketsRequest>> fn) throws IOException {
		return getBuckets(fn.apply(new GetBucketsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_calendar_events

	/**
	 * Retrieves information about the scheduled events in calendars.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar-event.html"
	 */

	public CompletableFuture<GetCalendarEventsResponse> getCalendarEvents(GetCalendarEventsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetCalendarEventsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves information about the scheduled events in calendars.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar-event.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetCalendarEventsResponse> getCalendarEvents(
			Function<GetCalendarEventsRequest.Builder, ObjectBuilder<GetCalendarEventsRequest>> fn) throws IOException {
		return getCalendarEvents(fn.apply(new GetCalendarEventsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_calendars

	/**
	 * Retrieves configuration information for calendars.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar.html"
	 */

	public CompletableFuture<GetCalendarsResponse> getCalendars(GetCalendarsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetCalendarsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves configuration information for calendars.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetCalendarsResponse> getCalendars(
			Function<GetCalendarsRequest.Builder, ObjectBuilder<GetCalendarsRequest>> fn) throws IOException {
		return getCalendars(fn.apply(new GetCalendarsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_categories

	/**
	 * Retrieves anomaly detection job results for one or more categories.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-category.html"
	 */

	public CompletableFuture<GetCategoriesResponse> getCategories(GetCategoriesRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetCategoriesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves anomaly detection job results for one or more categories.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-category.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetCategoriesResponse> getCategories(
			Function<GetCategoriesRequest.Builder, ObjectBuilder<GetCategoriesRequest>> fn) throws IOException {
		return getCategories(fn.apply(new GetCategoriesRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_data_frame_analytics

	/**
	 * Retrieves configuration information for data frame analytics jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics.html"
	 */

	public CompletableFuture<GetDataFrameAnalyticsResponse> getDataFrameAnalytics(GetDataFrameAnalyticsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetDataFrameAnalyticsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves configuration information for data frame analytics jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetDataFrameAnalyticsResponse> getDataFrameAnalytics(
			Function<GetDataFrameAnalyticsRequest.Builder, ObjectBuilder<GetDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return getDataFrameAnalytics(fn.apply(new GetDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_data_frame_analytics_stats

	/**
	 * Retrieves usage information for data frame analytics jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics-stats.html"
	 */

	public CompletableFuture<GetDataFrameAnalyticsStatsResponse> getDataFrameAnalyticsStats(
			GetDataFrameAnalyticsStatsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetDataFrameAnalyticsStatsRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Retrieves usage information for data frame analytics jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics-stats.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetDataFrameAnalyticsStatsResponse> getDataFrameAnalyticsStats(
			Function<GetDataFrameAnalyticsStatsRequest.Builder, ObjectBuilder<GetDataFrameAnalyticsStatsRequest>> fn)
			throws IOException {
		return getDataFrameAnalyticsStats(fn.apply(new GetDataFrameAnalyticsStatsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_datafeed_stats

	/**
	 * Retrieves usage information for datafeeds.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed-stats.html"
	 */

	public CompletableFuture<GetDatafeedStatsResponse> getDatafeedStats(GetDatafeedStatsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetDatafeedStatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves usage information for datafeeds.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed-stats.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetDatafeedStatsResponse> getDatafeedStats(
			Function<GetDatafeedStatsRequest.Builder, ObjectBuilder<GetDatafeedStatsRequest>> fn) throws IOException {
		return getDatafeedStats(fn.apply(new GetDatafeedStatsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_datafeeds

	/**
	 * Retrieves configuration information for datafeeds.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed.html"
	 */

	public CompletableFuture<GetDatafeedsResponse> getDatafeeds(GetDatafeedsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetDatafeedsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves configuration information for datafeeds.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetDatafeedsResponse> getDatafeeds(
			Function<GetDatafeedsRequest.Builder, ObjectBuilder<GetDatafeedsRequest>> fn) throws IOException {
		return getDatafeeds(fn.apply(new GetDatafeedsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_filters

	/**
	 * Retrieves filters.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-filter.html"
	 */

	public CompletableFuture<GetFiltersResponse> getFilters(GetFiltersRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetFiltersRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves filters.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-filter.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetFiltersResponse> getFilters(
			Function<GetFiltersRequest.Builder, ObjectBuilder<GetFiltersRequest>> fn) throws IOException {
		return getFilters(fn.apply(new GetFiltersRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_influencers

	/**
	 * Retrieves anomaly detection job results for one or more influencers.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-influencer.html"
	 */

	public CompletableFuture<GetInfluencersResponse> getInfluencers(GetInfluencersRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetInfluencersRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves anomaly detection job results for one or more influencers.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-influencer.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetInfluencersResponse> getInfluencers(
			Function<GetInfluencersRequest.Builder, ObjectBuilder<GetInfluencersRequest>> fn) throws IOException {
		return getInfluencers(fn.apply(new GetInfluencersRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_job_stats

	/**
	 * Retrieves usage information for anomaly detection jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job-stats.html"
	 */

	public CompletableFuture<GetJobStatsResponse> getJobStats(GetJobStatsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetJobStatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves usage information for anomaly detection jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job-stats.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetJobStatsResponse> getJobStats(
			Function<GetJobStatsRequest.Builder, ObjectBuilder<GetJobStatsRequest>> fn) throws IOException {
		return getJobStats(fn.apply(new GetJobStatsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_jobs

	/**
	 * Retrieves configuration information for anomaly detection jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job.html"
	 */

	public CompletableFuture<GetJobsResponse> getJobs(GetJobsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetJobsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves configuration information for anomaly detection jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetJobsResponse> getJobs(
			Function<GetJobsRequest.Builder, ObjectBuilder<GetJobsRequest>> fn) throws IOException {
		return getJobs(fn.apply(new GetJobsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_model_snapshots

	/**
	 * Retrieves information about model snapshots.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-snapshot.html"
	 */

	public CompletableFuture<GetModelSnapshotsResponse> getModelSnapshots(GetModelSnapshotsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetModelSnapshotsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves information about model snapshots.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-snapshot.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetModelSnapshotsResponse> getModelSnapshots(
			Function<GetModelSnapshotsRequest.Builder, ObjectBuilder<GetModelSnapshotsRequest>> fn) throws IOException {
		return getModelSnapshots(fn.apply(new GetModelSnapshotsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_overall_buckets

	/**
	 * Retrieves overall bucket results that summarize the bucket results of
	 * multiple anomaly detection jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-overall-buckets.html"
	 */

	public CompletableFuture<GetOverallBucketsResponse> getOverallBuckets(GetOverallBucketsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetOverallBucketsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves overall bucket results that summarize the bucket results of
	 * multiple anomaly detection jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-overall-buckets.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetOverallBucketsResponse> getOverallBuckets(
			Function<GetOverallBucketsRequest.Builder, ObjectBuilder<GetOverallBucketsRequest>> fn) throws IOException {
		return getOverallBuckets(fn.apply(new GetOverallBucketsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_records

	/**
	 * Retrieves anomaly records for an anomaly detection job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-record.html"
	 */

	public CompletableFuture<GetAnomalyRecordsResponse> getRecords(GetAnomalyRecordsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetAnomalyRecordsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves anomaly records for an anomaly detection job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-record.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetAnomalyRecordsResponse> getRecords(
			Function<GetAnomalyRecordsRequest.Builder, ObjectBuilder<GetAnomalyRecordsRequest>> fn) throws IOException {
		return getRecords(fn.apply(new GetAnomalyRecordsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_trained_models

	/**
	 * Retrieves configuration information for a trained inference model.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models.html"
	 */

	public CompletableFuture<GetTrainedModelsResponse> getTrainedModels(GetTrainedModelsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetTrainedModelsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves configuration information for a trained inference model.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetTrainedModelsResponse> getTrainedModels(
			Function<GetTrainedModelsRequest.Builder, ObjectBuilder<GetTrainedModelsRequest>> fn) throws IOException {
		return getTrainedModels(fn.apply(new GetTrainedModelsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_trained_models_stats

	/**
	 * Retrieves usage information for trained inference models.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models-stats.html"
	 */

	public CompletableFuture<GetTrainedModelsStatsResponse> getTrainedModelsStats(GetTrainedModelsStatsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetTrainedModelsStatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves usage information for trained inference models.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models-stats.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetTrainedModelsStatsResponse> getTrainedModelsStats(
			Function<GetTrainedModelsStatsRequest.Builder, ObjectBuilder<GetTrainedModelsStatsRequest>> fn)
			throws IOException {
		return getTrainedModelsStats(fn.apply(new GetTrainedModelsStatsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.info

	/**
	 * Returns defaults and limits used by machine learning.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-ml-info.html"
	 */
	public CompletableFuture<InfoResponse> info() throws IOException {
		return this.transport.performRequestAsync(InfoRequest.INSTANCE, InfoRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: ml.open_job

	/**
	 * Opens one or more anomaly detection jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-open-job.html"
	 */

	public CompletableFuture<OpenJobResponse> openJob(OpenJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, OpenJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Opens one or more anomaly detection jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-open-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<OpenJobResponse> openJob(
			Function<OpenJobRequest.Builder, ObjectBuilder<OpenJobRequest>> fn) throws IOException {
		return openJob(fn.apply(new OpenJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.post_calendar_events

	/**
	 * Posts scheduled events in a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-post-calendar-event.html"
	 */

	public CompletableFuture<PostCalendarEventsResponse> postCalendarEvents(PostCalendarEventsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, PostCalendarEventsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Posts scheduled events in a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-post-calendar-event.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PostCalendarEventsResponse> postCalendarEvents(
			Function<PostCalendarEventsRequest.Builder, ObjectBuilder<PostCalendarEventsRequest>> fn)
			throws IOException {
		return postCalendarEvents(fn.apply(new PostCalendarEventsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.post_data

	/**
	 * Sends data to an anomaly detection job for analysis.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-post-data.html"
	 */

	public CompletableFuture<PostJobDataResponse> postData(PostJobDataRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PostJobDataRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Sends data to an anomaly detection job for analysis.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-post-data.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PostJobDataResponse> postData(
			Function<PostJobDataRequest.Builder, ObjectBuilder<PostJobDataRequest>> fn) throws IOException {
		return postData(fn.apply(new PostJobDataRequest.Builder()).build());
	}

	// ----- Endpoint: ml.preview_data_frame_analytics

	/**
	 * Previews that will be analyzed given a data frame analytics config.
	 *
	 * @see "http://www.elastic.co/guide/en/elasticsearch/reference/current/preview-dfanalytics.html"
	 */

	public CompletableFuture<PreviewDataFrameAnalyticsResponse> previewDataFrameAnalytics(
			PreviewDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PreviewDataFrameAnalyticsRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Previews that will be analyzed given a data frame analytics config.
	 *
	 * @see "http://www.elastic.co/guide/en/elasticsearch/reference/current/preview-dfanalytics.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PreviewDataFrameAnalyticsResponse> previewDataFrameAnalytics(
			Function<PreviewDataFrameAnalyticsRequest.Builder, ObjectBuilder<PreviewDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return previewDataFrameAnalytics(fn.apply(new PreviewDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.preview_datafeed

	/**
	 * Previews a datafeed.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-preview-datafeed.html"
	 */

	public <TDocument> CompletableFuture<PreviewDatafeedResponse<TDocument>> previewDatafeed(
			PreviewDatafeedRequest request, Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				PreviewDatafeedRequest.createPreviewDatafeedEndpoint(getDeserializer(tDocumentClass)),
				this.requestOptions);
	}

	/**
	 * Previews a datafeed.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-preview-datafeed.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final <TDocument> CompletableFuture<PreviewDatafeedResponse<TDocument>> previewDatafeed(
			Function<PreviewDatafeedRequest.Builder, ObjectBuilder<PreviewDatafeedRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException {
		return previewDatafeed(fn.apply(new PreviewDatafeedRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: ml.put_calendar

	/**
	 * Instantiates a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar.html"
	 */

	public CompletableFuture<PutCalendarResponse> putCalendar(PutCalendarRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutCalendarRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Instantiates a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutCalendarResponse> putCalendar(
			Function<PutCalendarRequest.Builder, ObjectBuilder<PutCalendarRequest>> fn) throws IOException {
		return putCalendar(fn.apply(new PutCalendarRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_calendar_job

	/**
	 * Adds an anomaly detection job to a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar-job.html"
	 */

	public CompletableFuture<PutCalendarJobResponse> putCalendarJob(PutCalendarJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutCalendarJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Adds an anomaly detection job to a calendar.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutCalendarJobResponse> putCalendarJob(
			Function<PutCalendarJobRequest.Builder, ObjectBuilder<PutCalendarJobRequest>> fn) throws IOException {
		return putCalendarJob(fn.apply(new PutCalendarJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_data_frame_analytics

	/**
	 * Instantiates a data frame analytics job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-dfanalytics.html"
	 */

	public CompletableFuture<PutDataFrameAnalyticsResponse> putDataFrameAnalytics(PutDataFrameAnalyticsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, PutDataFrameAnalyticsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Instantiates a data frame analytics job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-dfanalytics.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutDataFrameAnalyticsResponse> putDataFrameAnalytics(
			Function<PutDataFrameAnalyticsRequest.Builder, ObjectBuilder<PutDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return putDataFrameAnalytics(fn.apply(new PutDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_datafeed

	/**
	 * Instantiates a datafeed.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-datafeed.html"
	 */

	public CompletableFuture<PutDatafeedResponse> putDatafeed(PutDatafeedRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutDatafeedRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Instantiates a datafeed.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-datafeed.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutDatafeedResponse> putDatafeed(
			Function<PutDatafeedRequest.Builder, ObjectBuilder<PutDatafeedRequest>> fn) throws IOException {
		return putDatafeed(fn.apply(new PutDatafeedRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_filter

	/**
	 * Instantiates a filter.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-filter.html"
	 */

	public CompletableFuture<PutFilterResponse> putFilter(PutFilterRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutFilterRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Instantiates a filter.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-filter.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutFilterResponse> putFilter(
			Function<PutFilterRequest.Builder, ObjectBuilder<PutFilterRequest>> fn) throws IOException {
		return putFilter(fn.apply(new PutFilterRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_job

	/**
	 * Instantiates an anomaly detection job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-job.html"
	 */

	public CompletableFuture<PutJobResponse> putJob(PutJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Instantiates an anomaly detection job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutJobResponse> putJob(
			Function<PutJobRequest.Builder, ObjectBuilder<PutJobRequest>> fn) throws IOException {
		return putJob(fn.apply(new PutJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_trained_model

	/**
	 * Creates an inference trained model.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models.html"
	 */

	public CompletableFuture<PutTrainedModelResponse> putTrainedModel(PutTrainedModelRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, PutTrainedModelRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates an inference trained model.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutTrainedModelResponse> putTrainedModel(
			Function<PutTrainedModelRequest.Builder, ObjectBuilder<PutTrainedModelRequest>> fn) throws IOException {
		return putTrainedModel(fn.apply(new PutTrainedModelRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_trained_model_alias

	/**
	 * Creates a new model alias (or reassigns an existing one) to refer to the
	 * trained model
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models-aliases.html"
	 */

	public CompletableFuture<PutTrainedModelAliasResponse> putTrainedModelAlias(PutTrainedModelAliasRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, PutTrainedModelAliasRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates a new model alias (or reassigns an existing one) to refer to the
	 * trained model
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models-aliases.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutTrainedModelAliasResponse> putTrainedModelAlias(
			Function<PutTrainedModelAliasRequest.Builder, ObjectBuilder<PutTrainedModelAliasRequest>> fn)
			throws IOException {
		return putTrainedModelAlias(fn.apply(new PutTrainedModelAliasRequest.Builder()).build());
	}

	// ----- Endpoint: ml.revert_model_snapshot

	/**
	 * Reverts to a specific snapshot.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-revert-snapshot.html"
	 */

	public CompletableFuture<RevertModelSnapshotResponse> revertModelSnapshot(RevertModelSnapshotRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, RevertModelSnapshotRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Reverts to a specific snapshot.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-revert-snapshot.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<RevertModelSnapshotResponse> revertModelSnapshot(
			Function<RevertModelSnapshotRequest.Builder, ObjectBuilder<RevertModelSnapshotRequest>> fn)
			throws IOException {
		return revertModelSnapshot(fn.apply(new RevertModelSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: ml.set_upgrade_mode

	/**
	 * Sets a cluster wide upgrade_mode setting that prepares machine learning
	 * indices for an upgrade.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-set-upgrade-mode.html"
	 */

	public CompletableFuture<SetUpgradeModeResponse> setUpgradeMode(SetUpgradeModeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, SetUpgradeModeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Sets a cluster wide upgrade_mode setting that prepares machine learning
	 * indices for an upgrade.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-set-upgrade-mode.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<SetUpgradeModeResponse> setUpgradeMode(
			Function<SetUpgradeModeRequest.Builder, ObjectBuilder<SetUpgradeModeRequest>> fn) throws IOException {
		return setUpgradeMode(fn.apply(new SetUpgradeModeRequest.Builder()).build());
	}

	// ----- Endpoint: ml.start_data_frame_analytics

	/**
	 * Starts a data frame analytics job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-dfanalytics.html"
	 */

	public CompletableFuture<StartDataFrameAnalyticsResponse> startDataFrameAnalytics(
			StartDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StartDataFrameAnalyticsRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Starts a data frame analytics job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-dfanalytics.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<StartDataFrameAnalyticsResponse> startDataFrameAnalytics(
			Function<StartDataFrameAnalyticsRequest.Builder, ObjectBuilder<StartDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return startDataFrameAnalytics(fn.apply(new StartDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.start_datafeed

	/**
	 * Starts one or more datafeeds.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-start-datafeed.html"
	 */

	public CompletableFuture<StartDatafeedResponse> startDatafeed(StartDatafeedRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StartDatafeedRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Starts one or more datafeeds.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-start-datafeed.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<StartDatafeedResponse> startDatafeed(
			Function<StartDatafeedRequest.Builder, ObjectBuilder<StartDatafeedRequest>> fn) throws IOException {
		return startDatafeed(fn.apply(new StartDatafeedRequest.Builder()).build());
	}

	// ----- Endpoint: ml.stop_data_frame_analytics

	/**
	 * Stops one or more data frame analytics jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-dfanalytics.html"
	 */

	public CompletableFuture<StopDataFrameAnalyticsResponse> stopDataFrameAnalytics(
			StopDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StopDataFrameAnalyticsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Stops one or more data frame analytics jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-dfanalytics.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<StopDataFrameAnalyticsResponse> stopDataFrameAnalytics(
			Function<StopDataFrameAnalyticsRequest.Builder, ObjectBuilder<StopDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return stopDataFrameAnalytics(fn.apply(new StopDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.stop_datafeed

	/**
	 * Stops one or more datafeeds.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-stop-datafeed.html"
	 */

	public CompletableFuture<StopDatafeedResponse> stopDatafeed(StopDatafeedRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StopDatafeedRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Stops one or more datafeeds.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-stop-datafeed.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<StopDatafeedResponse> stopDatafeed(
			Function<StopDatafeedRequest.Builder, ObjectBuilder<StopDatafeedRequest>> fn) throws IOException {
		return stopDatafeed(fn.apply(new StopDatafeedRequest.Builder()).build());
	}

	// ----- Endpoint: ml.update_data_frame_analytics

	/**
	 * Updates certain properties of a data frame analytics job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-dfanalytics.html"
	 */

	public CompletableFuture<UpdateDataFrameAnalyticsResponse> updateDataFrameAnalytics(
			UpdateDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UpdateDataFrameAnalyticsRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Updates certain properties of a data frame analytics job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-dfanalytics.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<UpdateDataFrameAnalyticsResponse> updateDataFrameAnalytics(
			Function<UpdateDataFrameAnalyticsRequest.Builder, ObjectBuilder<UpdateDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return updateDataFrameAnalytics(fn.apply(new UpdateDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.update_filter

	/**
	 * Updates the description of a filter, adds items, or removes items.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-filter.html"
	 */

	public CompletableFuture<UpdateFilterResponse> updateFilter(UpdateFilterRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UpdateFilterRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates the description of a filter, adds items, or removes items.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-filter.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<UpdateFilterResponse> updateFilter(
			Function<UpdateFilterRequest.Builder, ObjectBuilder<UpdateFilterRequest>> fn) throws IOException {
		return updateFilter(fn.apply(new UpdateFilterRequest.Builder()).build());
	}

	// ----- Endpoint: ml.update_job

	/**
	 * Updates certain properties of an anomaly detection job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-job.html"
	 */

	public CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UpdateJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates certain properties of an anomaly detection job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<UpdateJobResponse> updateJob(
			Function<UpdateJobRequest.Builder, ObjectBuilder<UpdateJobRequest>> fn) throws IOException {
		return updateJob(fn.apply(new UpdateJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.update_model_snapshot

	/**
	 * Updates certain properties of a snapshot.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-snapshot.html"
	 */

	public CompletableFuture<UpdateModelSnapshotResponse> updateModelSnapshot(UpdateModelSnapshotRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, UpdateModelSnapshotRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates certain properties of a snapshot.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-snapshot.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<UpdateModelSnapshotResponse> updateModelSnapshot(
			Function<UpdateModelSnapshotRequest.Builder, ObjectBuilder<UpdateModelSnapshotRequest>> fn)
			throws IOException {
		return updateModelSnapshot(fn.apply(new UpdateModelSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: ml.upgrade_job_snapshot

	/**
	 * Upgrades a given job snapshot to the current major version.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-upgrade-job-model-snapshot.html"
	 */

	public CompletableFuture<UpgradeJobSnapshotResponse> upgradeJobSnapshot(UpgradeJobSnapshotRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, UpgradeJobSnapshotRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Upgrades a given job snapshot to the current major version.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-upgrade-job-model-snapshot.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<UpgradeJobSnapshotResponse> upgradeJobSnapshot(
			Function<UpgradeJobSnapshotRequest.Builder, ObjectBuilder<UpgradeJobSnapshotRequest>> fn)
			throws IOException {
		return upgradeJobSnapshot(fn.apply(new UpgradeJobSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: ml.validate

	/**
	 * Validates an anomaly detection job.
	 *
	 * @see "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html"
	 */

	public CompletableFuture<ValidateJobResponse> validate(ValidateJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ValidateJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Validates an anomaly detection job.
	 *
	 * @see "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ValidateJobResponse> validate(
			Function<ValidateJobRequest.Builder, ObjectBuilder<ValidateJobRequest>> fn) throws IOException {
		return validate(fn.apply(new ValidateJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.validate_detector

	/**
	 * Validates an anomaly detection detector.
	 *
	 * @see "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html"
	 */

	public CompletableFuture<ValidateDetectorResponse> validateDetector(ValidateDetectorRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, ValidateDetectorRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Validates an anomaly detection detector.
	 *
	 * @see "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ValidateDetectorResponse> validateDetector(
			Function<ValidateDetectorRequest.Builder, ObjectBuilder<ValidateDetectorRequest>> fn) throws IOException {
		return validateDetector(fn.apply(new ValidateDetectorRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #MlAsyncClient} with specific request options.
	 */
	@Override
	public MlAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new MlAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #MlAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public MlAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
