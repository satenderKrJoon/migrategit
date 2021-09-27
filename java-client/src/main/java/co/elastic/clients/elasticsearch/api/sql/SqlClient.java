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

package co.elastic.clients.elasticsearch.api.sql;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.sql.ClearCursorRequest;
import co.elastic.clients.elasticsearch.sql.ClearCursorResponse;
import co.elastic.clients.elasticsearch.sql.QueryRequest;
import co.elastic.clients.elasticsearch.sql.QueryResponse;
import co.elastic.clients.elasticsearch.sql.TranslateRequest;
import co.elastic.clients.elasticsearch.sql.TranslateResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the sql namespace.
 */
public class SqlClient extends ApiClient<SqlClient> {

	public SqlClient(Transport transport) {
		super(transport, null);
	}

	public SqlClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: sql.clear_cursor

	/**
	 * Clears the SQL cursor
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-pagination.html"
	 */

	public ClearCursorResponse clearCursor(ClearCursorRequest request) throws IOException {
		return this.transport.performRequest(request, ClearCursorRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Clears the SQL cursor
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-pagination.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ClearCursorResponse clearCursor(
			Function<ClearCursorRequest.Builder, ObjectBuilder<ClearCursorRequest>> fn) throws IOException {
		return clearCursor(fn.apply(new ClearCursorRequest.Builder()).build());
	}

	// ----- Endpoint: sql.query

	/**
	 * Executes a SQL request
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-rest-overview.html"
	 */

	public QueryResponse query(QueryRequest request) throws IOException {
		return this.transport.performRequest(request, QueryRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Executes a SQL request
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-rest-overview.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final QueryResponse query(Function<QueryRequest.Builder, ObjectBuilder<QueryRequest>> fn)
			throws IOException {
		return query(fn.apply(new QueryRequest.Builder()).build());
	}

	// ----- Endpoint: sql.translate

	/**
	 * Translates SQL into Elasticsearch queries
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-translate.html"
	 */

	public TranslateResponse translate(TranslateRequest request) throws IOException {
		return this.transport.performRequest(request, TranslateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Translates SQL into Elasticsearch queries
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-translate.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final TranslateResponse translate(Function<TranslateRequest.Builder, ObjectBuilder<TranslateRequest>> fn)
			throws IOException {
		return translate(fn.apply(new TranslateRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #SqlClient} with specific request options.
	 */
	@Override
	public SqlClient withRequestOptions(@Nullable RequestOptions options) {
		return new SqlClient(transport, options);
	}

	/**
	 * Creates a new {@link #SqlClient} with specific request options, inheriting
	 * existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public SqlClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
