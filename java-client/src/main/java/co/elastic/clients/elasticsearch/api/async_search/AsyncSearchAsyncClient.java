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

package co.elastic.clients.elasticsearch.api.async_search;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.async_search.DeleteRequest;
import co.elastic.clients.elasticsearch.async_search.DeleteResponse;
import co.elastic.clients.elasticsearch.async_search.GetRequest;
import co.elastic.clients.elasticsearch.async_search.GetResponse;
import co.elastic.clients.elasticsearch.async_search.StatusRequest;
import co.elastic.clients.elasticsearch.async_search.StatusResponse;
import co.elastic.clients.elasticsearch.async_search.SubmitRequest;
import co.elastic.clients.elasticsearch.async_search.SubmitResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the async_search namespace.
 */
public class AsyncSearchAsyncClient extends ApiClient<AsyncSearchAsyncClient> {

	public AsyncSearchAsyncClient(Transport transport) {
		super(transport, null);
	}

	public AsyncSearchAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: async_search.delete

	/**
	 * Deletes an async search by ID. If the search is still running, the search
	 * request will be cancelled. Otherwise, the saved search results are deleted.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html"
	 */

	public CompletableFuture<DeleteResponse> delete(DeleteRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an async search by ID. If the search is still running, the search
	 * request will be cancelled. Otherwise, the saved search results are deleted.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteResponse> delete(
			Function<DeleteRequest.Builder, ObjectBuilder<DeleteRequest>> fn) throws IOException {
		return delete(fn.apply(new DeleteRequest.Builder()).build());
	}

	// ----- Endpoint: async_search.get

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its ID.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html"
	 */

	public <TDocument> CompletableFuture<GetResponse<TDocument>> get(GetRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				GetRequest.createGetEndpoint(getDeserializer(tDocumentClass)), this.requestOptions);
	}

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its ID.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final <TDocument> CompletableFuture<GetResponse<TDocument>> get(
			Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException {
		return get(fn.apply(new GetRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: async_search.status

	/**
	 * Retrieves the status of a previously submitted async search request given its
	 * ID.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html"
	 */

	public <TDocument> CompletableFuture<StatusResponse<TDocument>> status(StatusRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				StatusRequest.createStatusEndpoint(getDeserializer(tDocumentClass)), this.requestOptions);
	}

	/**
	 * Retrieves the status of a previously submitted async search request given its
	 * ID.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final <TDocument> CompletableFuture<StatusResponse<TDocument>> status(
			Function<StatusRequest.Builder, ObjectBuilder<StatusRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException {
		return status(fn.apply(new StatusRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: async_search.submit

	/**
	 * Executes a search request asynchronously.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html"
	 */

	public <TDocument> CompletableFuture<SubmitResponse<TDocument>> submit(SubmitRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				SubmitRequest.createSubmitEndpoint(getDeserializer(tDocumentClass)), this.requestOptions);
	}

	/**
	 * Executes a search request asynchronously.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final <TDocument> CompletableFuture<SubmitResponse<TDocument>> submit(
			Function<SubmitRequest.Builder, ObjectBuilder<SubmitRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException {
		return submit(fn.apply(new SubmitRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Misc

	/**
	 * Creates a new {@link #AsyncSearchAsyncClient} with specific request options.
	 */
	@Override
	public AsyncSearchAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new AsyncSearchAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #AsyncSearchAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public AsyncSearchAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
