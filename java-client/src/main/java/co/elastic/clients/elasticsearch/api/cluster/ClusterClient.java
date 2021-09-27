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

package co.elastic.clients.elasticsearch.api.cluster;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.cluster.AllocationExplainRequest;
import co.elastic.clients.elasticsearch.cluster.AllocationExplainResponse;
import co.elastic.clients.elasticsearch.cluster.DeleteComponentTemplateRequest;
import co.elastic.clients.elasticsearch.cluster.DeleteComponentTemplateResponse;
import co.elastic.clients.elasticsearch.cluster.DeleteVotingConfigExclusionsRequest;
import co.elastic.clients.elasticsearch.cluster.DeleteVotingConfigExclusionsResponse;
import co.elastic.clients.elasticsearch.cluster.ExistsComponentTemplateRequest;
import co.elastic.clients.elasticsearch.cluster.ExistsComponentTemplateResponse;
import co.elastic.clients.elasticsearch.cluster.GetComponentTemplateRequest;
import co.elastic.clients.elasticsearch.cluster.GetComponentTemplateResponse;
import co.elastic.clients.elasticsearch.cluster.GetSettingsRequest;
import co.elastic.clients.elasticsearch.cluster.GetSettingsResponse;
import co.elastic.clients.elasticsearch.cluster.HealthRequest;
import co.elastic.clients.elasticsearch.cluster.HealthResponse;
import co.elastic.clients.elasticsearch.cluster.PendingTasksRequest;
import co.elastic.clients.elasticsearch.cluster.PendingTasksResponse;
import co.elastic.clients.elasticsearch.cluster.PutComponentTemplateRequest;
import co.elastic.clients.elasticsearch.cluster.PutComponentTemplateResponse;
import co.elastic.clients.elasticsearch.cluster.PutSettingsRequest;
import co.elastic.clients.elasticsearch.cluster.PutSettingsResponse;
import co.elastic.clients.elasticsearch.cluster.PutVotingConfigExclusionsRequest;
import co.elastic.clients.elasticsearch.cluster.PutVotingConfigExclusionsResponse;
import co.elastic.clients.elasticsearch.cluster.RemoteInfoRequest;
import co.elastic.clients.elasticsearch.cluster.RemoteInfoResponse;
import co.elastic.clients.elasticsearch.cluster.RerouteRequest;
import co.elastic.clients.elasticsearch.cluster.RerouteResponse;
import co.elastic.clients.elasticsearch.cluster.StateRequest;
import co.elastic.clients.elasticsearch.cluster.StateResponse;
import co.elastic.clients.elasticsearch.cluster.StatsRequest;
import co.elastic.clients.elasticsearch.cluster.StatsResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the cluster namespace.
 */
public class ClusterClient extends ApiClient<ClusterClient> {

	public ClusterClient(Transport transport) {
		super(transport, null);
	}

	public ClusterClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: cluster.allocation_explain

	/**
	 * Provides explanations for shard allocations in the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-allocation-explain.html"
	 */

	public AllocationExplainResponse allocationExplain(AllocationExplainRequest request) throws IOException {
		return this.transport.performRequest(request, AllocationExplainRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides explanations for shard allocations in the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-allocation-explain.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final AllocationExplainResponse allocationExplain(
			Function<AllocationExplainRequest.Builder, ObjectBuilder<AllocationExplainRequest>> fn) throws IOException {
		return allocationExplain(fn.apply(new AllocationExplainRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.delete_component_template

	/**
	 * Deletes a component template
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html"
	 */

	public DeleteComponentTemplateResponse deleteComponentTemplate(DeleteComponentTemplateRequest request)
			throws IOException {
		return this.transport.performRequest(request, DeleteComponentTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes a component template
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteComponentTemplateResponse deleteComponentTemplate(
			Function<DeleteComponentTemplateRequest.Builder, ObjectBuilder<DeleteComponentTemplateRequest>> fn)
			throws IOException {
		return deleteComponentTemplate(fn.apply(new DeleteComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.delete_voting_config_exclusions

	/**
	 * Clears cluster voting config exclusions.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html"
	 */

	public DeleteVotingConfigExclusionsResponse deleteVotingConfigExclusions(
			DeleteVotingConfigExclusionsRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteVotingConfigExclusionsRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Clears cluster voting config exclusions.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteVotingConfigExclusionsResponse deleteVotingConfigExclusions(
			Function<DeleteVotingConfigExclusionsRequest.Builder, ObjectBuilder<DeleteVotingConfigExclusionsRequest>> fn)
			throws IOException {
		return deleteVotingConfigExclusions(fn.apply(new DeleteVotingConfigExclusionsRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.exists_component_template

	/**
	 * Returns information about whether a particular component template exist
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html"
	 */

	public ExistsComponentTemplateResponse existsComponentTemplate(ExistsComponentTemplateRequest request)
			throws IOException {
		return this.transport.performRequest(request, ExistsComponentTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a particular component template exist
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ExistsComponentTemplateResponse existsComponentTemplate(
			Function<ExistsComponentTemplateRequest.Builder, ObjectBuilder<ExistsComponentTemplateRequest>> fn)
			throws IOException {
		return existsComponentTemplate(fn.apply(new ExistsComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.get_component_template

	/**
	 * Returns one or more component templates
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html"
	 */

	public GetComponentTemplateResponse getComponentTemplate(GetComponentTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, GetComponentTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns one or more component templates
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetComponentTemplateResponse getComponentTemplate(
			Function<GetComponentTemplateRequest.Builder, ObjectBuilder<GetComponentTemplateRequest>> fn)
			throws IOException {
		return getComponentTemplate(fn.apply(new GetComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.get_settings

	/**
	 * Returns cluster settings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-get-settings.html"
	 */

	public GetSettingsResponse getSettings(GetSettingsRequest request) throws IOException {
		return this.transport.performRequest(request, GetSettingsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns cluster settings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-get-settings.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetSettingsResponse getSettings(
			Function<GetSettingsRequest.Builder, ObjectBuilder<GetSettingsRequest>> fn) throws IOException {
		return getSettings(fn.apply(new GetSettingsRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.health

	/**
	 * Returns basic information about the health of the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-health.html"
	 */

	public HealthResponse health(HealthRequest request) throws IOException {
		return this.transport.performRequest(request, HealthRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns basic information about the health of the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-health.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final HealthResponse health(Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn)
			throws IOException {
		return health(fn.apply(new HealthRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.pending_tasks

	/**
	 * Returns a list of any cluster-level changes (e.g. create index, update
	 * mapping, allocate or fail shard) which have not yet been executed.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-pending.html"
	 */

	public PendingTasksResponse pendingTasks(PendingTasksRequest request) throws IOException {
		return this.transport.performRequest(request, PendingTasksRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns a list of any cluster-level changes (e.g. create index, update
	 * mapping, allocate or fail shard) which have not yet been executed.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-pending.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PendingTasksResponse pendingTasks(
			Function<PendingTasksRequest.Builder, ObjectBuilder<PendingTasksRequest>> fn) throws IOException {
		return pendingTasks(fn.apply(new PendingTasksRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.post_voting_config_exclusions

	/**
	 * Updates the cluster voting config exclusions by node ids or node names.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html"
	 */

	public PutVotingConfigExclusionsResponse postVotingConfigExclusions(PutVotingConfigExclusionsRequest request)
			throws IOException {
		return this.transport.performRequest(request, PutVotingConfigExclusionsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates the cluster voting config exclusions by node ids or node names.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutVotingConfigExclusionsResponse postVotingConfigExclusions(
			Function<PutVotingConfigExclusionsRequest.Builder, ObjectBuilder<PutVotingConfigExclusionsRequest>> fn)
			throws IOException {
		return postVotingConfigExclusions(fn.apply(new PutVotingConfigExclusionsRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.put_component_template

	/**
	 * Creates or updates a component template
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html"
	 */

	public PutComponentTemplateResponse putComponentTemplate(PutComponentTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, PutComponentTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates or updates a component template
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutComponentTemplateResponse putComponentTemplate(
			Function<PutComponentTemplateRequest.Builder, ObjectBuilder<PutComponentTemplateRequest>> fn)
			throws IOException {
		return putComponentTemplate(fn.apply(new PutComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.put_settings

	/**
	 * Updates the cluster settings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-update-settings.html"
	 */

	public PutSettingsResponse putSettings(PutSettingsRequest request) throws IOException {
		return this.transport.performRequest(request, PutSettingsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates the cluster settings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-update-settings.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutSettingsResponse putSettings(
			Function<PutSettingsRequest.Builder, ObjectBuilder<PutSettingsRequest>> fn) throws IOException {
		return putSettings(fn.apply(new PutSettingsRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.remote_info

	/**
	 * Returns the information about configured remote clusters.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-remote-info.html"
	 */

	public RemoteInfoResponse remoteInfo(RemoteInfoRequest request) throws IOException {
		return this.transport.performRequest(request, RemoteInfoRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns the information about configured remote clusters.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-remote-info.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final RemoteInfoResponse remoteInfo(Function<RemoteInfoRequest.Builder, ObjectBuilder<RemoteInfoRequest>> fn)
			throws IOException {
		return remoteInfo(fn.apply(new RemoteInfoRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.reroute

	/**
	 * Allows to manually change the allocation of individual shards in the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-reroute.html"
	 */

	public RerouteResponse reroute(RerouteRequest request) throws IOException {
		return this.transport.performRequest(request, RerouteRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Allows to manually change the allocation of individual shards in the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-reroute.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final RerouteResponse reroute(Function<RerouteRequest.Builder, ObjectBuilder<RerouteRequest>> fn)
			throws IOException {
		return reroute(fn.apply(new RerouteRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.state

	/**
	 * Returns a comprehensive information about the state of the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-state.html"
	 */

	public StateResponse state(StateRequest request) throws IOException {
		return this.transport.performRequest(request, StateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns a comprehensive information about the state of the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-state.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final StateResponse state(Function<StateRequest.Builder, ObjectBuilder<StateRequest>> fn)
			throws IOException {
		return state(fn.apply(new StateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.stats

	/**
	 * Returns high-level overview of cluster statistics.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-stats.html"
	 */

	public StatsResponse stats(StatsRequest request) throws IOException {
		return this.transport.performRequest(request, StatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns high-level overview of cluster statistics.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-stats.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final StatsResponse stats(Function<StatsRequest.Builder, ObjectBuilder<StatsRequest>> fn)
			throws IOException {
		return stats(fn.apply(new StatsRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #ClusterClient} with specific request options.
	 */
	@Override
	public ClusterClient withRequestOptions(@Nullable RequestOptions options) {
		return new ClusterClient(transport, options);
	}

	/**
	 * Creates a new {@link #ClusterClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public ClusterClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
