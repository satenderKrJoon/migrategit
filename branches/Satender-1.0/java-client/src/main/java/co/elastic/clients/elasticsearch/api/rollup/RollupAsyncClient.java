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

package co.elastic.clients.elasticsearch.api.rollup;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.rollup.CreateRollupJobRequest;
import co.elastic.clients.elasticsearch.rollup.CreateRollupJobResponse;
import co.elastic.clients.elasticsearch.rollup.DeleteRollupJobRequest;
import co.elastic.clients.elasticsearch.rollup.DeleteRollupJobResponse;
import co.elastic.clients.elasticsearch.rollup.GetRollupCapabilitiesRequest;
import co.elastic.clients.elasticsearch.rollup.GetRollupCapabilitiesResponse;
import co.elastic.clients.elasticsearch.rollup.GetRollupIndexCapabilitiesRequest;
import co.elastic.clients.elasticsearch.rollup.GetRollupIndexCapabilitiesResponse;
import co.elastic.clients.elasticsearch.rollup.GetRollupJobRequest;
import co.elastic.clients.elasticsearch.rollup.GetRollupJobResponse;
import co.elastic.clients.elasticsearch.rollup.RollupRequest;
import co.elastic.clients.elasticsearch.rollup.RollupResponse;
import co.elastic.clients.elasticsearch.rollup.RollupSearchRequest;
import co.elastic.clients.elasticsearch.rollup.RollupSearchResponse;
import co.elastic.clients.elasticsearch.rollup.StartRollupJobRequest;
import co.elastic.clients.elasticsearch.rollup.StartRollupJobResponse;
import co.elastic.clients.elasticsearch.rollup.StopRollupJobRequest;
import co.elastic.clients.elasticsearch.rollup.StopRollupJobResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the rollup namespace.
 */
public class RollupAsyncClient extends ApiClient<RollupAsyncClient> {

	public RollupAsyncClient(Transport transport) {
		super(transport, null);
	}

	public RollupAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: rollup.delete_job

	/**
	 * Deletes an existing rollup job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-delete-job.html"
	 */

	public CompletableFuture<DeleteRollupJobResponse> deleteJob(DeleteRollupJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteRollupJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an existing rollup job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-delete-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteRollupJobResponse> deleteJob(
			Function<DeleteRollupJobRequest.Builder, ObjectBuilder<DeleteRollupJobRequest>> fn) throws IOException {
		return deleteJob(fn.apply(new DeleteRollupJobRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.get_jobs

	/**
	 * Retrieves the configuration, stats, and status of rollup jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-job.html"
	 */

	public CompletableFuture<GetRollupJobResponse> getJobs(GetRollupJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetRollupJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves the configuration, stats, and status of rollup jobs.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetRollupJobResponse> getJobs(
			Function<GetRollupJobRequest.Builder, ObjectBuilder<GetRollupJobRequest>> fn) throws IOException {
		return getJobs(fn.apply(new GetRollupJobRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.get_rollup_caps

	/**
	 * Returns the capabilities of any rollup jobs that have been configured for a
	 * specific index or index pattern.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-caps.html"
	 */

	public CompletableFuture<GetRollupCapabilitiesResponse> getRollupCaps(GetRollupCapabilitiesRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetRollupCapabilitiesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns the capabilities of any rollup jobs that have been configured for a
	 * specific index or index pattern.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-caps.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetRollupCapabilitiesResponse> getRollupCaps(
			Function<GetRollupCapabilitiesRequest.Builder, ObjectBuilder<GetRollupCapabilitiesRequest>> fn)
			throws IOException {
		return getRollupCaps(fn.apply(new GetRollupCapabilitiesRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.get_rollup_index_caps

	/**
	 * Returns the rollup capabilities of all jobs inside of a rollup index (e.g.
	 * the index where rollup data is stored).
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-index-caps.html"
	 */

	public CompletableFuture<GetRollupIndexCapabilitiesResponse> getRollupIndexCaps(
			GetRollupIndexCapabilitiesRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetRollupIndexCapabilitiesRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Returns the rollup capabilities of all jobs inside of a rollup index (e.g.
	 * the index where rollup data is stored).
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-index-caps.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetRollupIndexCapabilitiesResponse> getRollupIndexCaps(
			Function<GetRollupIndexCapabilitiesRequest.Builder, ObjectBuilder<GetRollupIndexCapabilitiesRequest>> fn)
			throws IOException {
		return getRollupIndexCaps(fn.apply(new GetRollupIndexCapabilitiesRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.put_job

	/**
	 * Creates a rollup job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-put-job.html"
	 */

	public CompletableFuture<CreateRollupJobResponse> putJob(CreateRollupJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, CreateRollupJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates a rollup job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-put-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<CreateRollupJobResponse> putJob(
			Function<CreateRollupJobRequest.Builder, ObjectBuilder<CreateRollupJobRequest>> fn) throws IOException {
		return putJob(fn.apply(new CreateRollupJobRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.rollup

	/**
	 * Rollup an index
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/xpack-rollup.html"
	 */

	public CompletableFuture<RollupResponse> rollup(RollupRequest request) throws IOException {
		return this.transport.performRequestAsync(request, RollupRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Rollup an index
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/xpack-rollup.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<RollupResponse> rollup(
			Function<RollupRequest.Builder, ObjectBuilder<RollupRequest>> fn) throws IOException {
		return rollup(fn.apply(new RollupRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.rollup_search

	/**
	 * Enables searching rolled-up data using the standard query DSL.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-search.html"
	 */

	public <TDocument> CompletableFuture<RollupSearchResponse<TDocument>> rollupSearch(RollupSearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				RollupSearchRequest.createRollupSearchEndpoint(getDeserializer(tDocumentClass)), this.requestOptions);
	}

	/**
	 * Enables searching rolled-up data using the standard query DSL.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-search.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final <TDocument> CompletableFuture<RollupSearchResponse<TDocument>> rollupSearch(
			Function<RollupSearchRequest.Builder, ObjectBuilder<RollupSearchRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException {
		return rollupSearch(fn.apply(new RollupSearchRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: rollup.start_job

	/**
	 * Starts an existing, stopped rollup job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-start-job.html"
	 */

	public CompletableFuture<StartRollupJobResponse> startJob(StartRollupJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StartRollupJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Starts an existing, stopped rollup job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-start-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<StartRollupJobResponse> startJob(
			Function<StartRollupJobRequest.Builder, ObjectBuilder<StartRollupJobRequest>> fn) throws IOException {
		return startJob(fn.apply(new StartRollupJobRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.stop_job

	/**
	 * Stops an existing, started rollup job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-stop-job.html"
	 */

	public CompletableFuture<StopRollupJobResponse> stopJob(StopRollupJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StopRollupJobRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Stops an existing, started rollup job.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-stop-job.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<StopRollupJobResponse> stopJob(
			Function<StopRollupJobRequest.Builder, ObjectBuilder<StopRollupJobRequest>> fn) throws IOException {
		return stopJob(fn.apply(new StopRollupJobRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #RollupAsyncClient} with specific request options.
	 */
	@Override
	public RollupAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new RollupAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #RollupAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public RollupAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
