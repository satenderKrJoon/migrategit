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

package co.elastic.clients.elasticsearch.api.text_structure;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.text_structure.FindStructureRequest;
import co.elastic.clients.elasticsearch.text_structure.FindStructureResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the text_structure namespace.
 */
public class TextStructureClient extends ApiClient<TextStructureClient> {

	public TextStructureClient(Transport transport) {
		super(transport, null);
	}

	public TextStructureClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: text_structure.find_structure

	/**
	 * Finds the structure of a text file. The text file must contain data that is
	 * suitable to be ingested into Elasticsearch.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/find-structure.html"
	 */

	public <TJsonDocument> FindStructureResponse findStructure(FindStructureRequest<TJsonDocument> request)
			throws IOException {
		return this.transport.performRequest(request, FindStructureRequest.ENDPOINT, this.requestOptions);
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

	public final <TJsonDocument> FindStructureResponse findStructure(
			Function<FindStructureRequest.Builder<TJsonDocument>, ObjectBuilder<FindStructureRequest<TJsonDocument>>> fn)
			throws IOException {
		return findStructure(fn.apply(new FindStructureRequest.Builder<TJsonDocument>()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #TextStructureClient} with specific request options.
	 */
	@Override
	public TextStructureClient withRequestOptions(@Nullable RequestOptions options) {
		return new TextStructureClient(transport, options);
	}

	/**
	 * Creates a new {@link #TextStructureClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public TextStructureClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
