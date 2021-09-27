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

package co.elastic.clients.elasticsearch.api.xpack;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.xpack.InfoRequest;
import co.elastic.clients.elasticsearch.xpack.InfoResponse;
import co.elastic.clients.elasticsearch.xpack.UsageRequest;
import co.elastic.clients.elasticsearch.xpack.UsageResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the xpack namespace.
 */
public class XpackAsyncClient extends ApiClient<XpackAsyncClient> {

	public XpackAsyncClient(Transport transport) {
		super(transport, null);
	}

	public XpackAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: xpack.info

	/**
	 * Retrieves information about the installed X-Pack features.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/info-api.html"
	 */

	public CompletableFuture<InfoResponse> info(InfoRequest request) throws IOException {
		return this.transport.performRequestAsync(request, InfoRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves information about the installed X-Pack features.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/info-api.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<InfoResponse> info(Function<InfoRequest.Builder, ObjectBuilder<InfoRequest>> fn)
			throws IOException {
		return info(fn.apply(new InfoRequest.Builder()).build());
	}

	// ----- Endpoint: xpack.usage

	/**
	 * Retrieves usage information about the installed X-Pack features.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/usage-api.html"
	 */

	public CompletableFuture<UsageResponse> usage(UsageRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UsageRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves usage information about the installed X-Pack features.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/usage-api.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<UsageResponse> usage(Function<UsageRequest.Builder, ObjectBuilder<UsageRequest>> fn)
			throws IOException {
		return usage(fn.apply(new UsageRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #XpackAsyncClient} with specific request options.
	 */
	@Override
	public XpackAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new XpackAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #XpackAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public XpackAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
