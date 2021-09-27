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

package co.elastic.clients.elasticsearch.api.ssl;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ssl.GetCertificatesRequest;
import co.elastic.clients.elasticsearch.ssl.GetCertificatesResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the ssl namespace.
 */
public class SslAsyncClient extends ApiClient<SslAsyncClient> {

	public SslAsyncClient(Transport transport) {
		super(transport, null);
	}

	public SslAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: ssl.certificates

	/**
	 * Retrieves information about the X.509 certificates used to encrypt
	 * communications in the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-ssl.html"
	 */
	public CompletableFuture<GetCertificatesResponse> certificates() throws IOException {
		return this.transport.performRequestAsync(GetCertificatesRequest.INSTANCE, GetCertificatesRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Misc

	/**
	 * Creates a new {@link #SslAsyncClient} with specific request options.
	 */
	@Override
	public SslAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new SslAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #SslAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public SslAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
