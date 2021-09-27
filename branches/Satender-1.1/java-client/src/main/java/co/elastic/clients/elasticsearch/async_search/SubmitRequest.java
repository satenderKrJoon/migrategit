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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._global.search.FieldCollapse;
import co.elastic.clients.elasticsearch._global.search.Highlight;
import co.elastic.clients.elasticsearch._global.search.PointInTimeReference;
import co.elastic.clients.elasticsearch._global.search.Rescore;
import co.elastic.clients.elasticsearch._global.search.SuggestContainer;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.ScriptField;
import co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
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
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: async_search.submit.Request
public final class SubmitRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final List<String> index;

	@Nullable
	private final Map<String, AggregationContainer> aggs;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean allowPartialSearchResults;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final Number batchedReduceSize;

	@Nullable
	private final FieldCollapse collapse;

	@Nullable
	private final JsonValue defaultOperator;

	@Nullable
	private final String df;

	@Nullable
	private final List<String> docvalueFields;

	@Nullable
	private final JsonValue expandWildcards;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final Number from;

	@Nullable
	private final Highlight highlight;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final List<Map<String, Number>> indicesBoost;

	@Nullable
	private final JsonValue keepAlive;

	@Nullable
	private final Boolean keepOnCompletion;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final Number maxConcurrentShardRequests;

	@Nullable
	private final Number minScore;

	@Nullable
	private final QueryContainer postFilter;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean profile;

	@Nullable
	private final PointInTimeReference pit;

	@Nullable
	private final QueryContainer query;

	@Nullable
	private final String queryOnQueryString;

	@Nullable
	private final Boolean requestCache;

	@Nullable
	private final List<Rescore> rescore;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final List<JsonValue> searchAfter;

	@Nullable
	private final JsonValue searchType;

	@Nullable
	private final Boolean sequenceNumberPrimaryTerm;

	@Nullable
	private final Number size;

	@Nullable
	private final List<JsonValue> sort;

	@Nullable
	private final JsonValue source;

	@Nullable
	private final List<String> stats;

	@Nullable
	private final List<String> storedFields;

	@Nullable
	private final Map<String, SuggestContainer> suggest;

	@Nullable
	private final String suggestField;

	@Nullable
	private final JsonValue suggestMode;

	@Nullable
	private final Number suggestSize;

	@Nullable
	private final String suggestText;

	@Nullable
	private final Number terminateAfter;

	@Nullable
	private final String timeout;

	@Nullable
	private final Boolean trackScores;

	@Nullable
	private final Boolean trackTotalHits;

	@Nullable
	private final Boolean typedKeys;

	@Nullable
	private final Boolean version;

	@Nullable
	private final JsonValue waitForCompletionTimeout;

	@Nullable
	private final List<JsonValue> fields;

	// ---------------------------------------------------------------------------------------------

	protected SubmitRequest(Builder builder) {

		this.index = builder.index;
		this.aggs = builder.aggs;
		this.allowNoIndices = builder.allowNoIndices;
		this.allowPartialSearchResults = builder.allowPartialSearchResults;
		this.analyzer = builder.analyzer;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.batchedReduceSize = builder.batchedReduceSize;
		this.collapse = builder.collapse;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.docvalueFields = builder.docvalueFields;
		this.expandWildcards = builder.expandWildcards;
		this.explain = builder.explain;
		this.from = builder.from;
		this.highlight = builder.highlight;
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.indicesBoost = builder.indicesBoost;
		this.keepAlive = builder.keepAlive;
		this.keepOnCompletion = builder.keepOnCompletion;
		this.lenient = builder.lenient;
		this.maxConcurrentShardRequests = builder.maxConcurrentShardRequests;
		this.minScore = builder.minScore;
		this.postFilter = builder.postFilter;
		this.preference = builder.preference;
		this.profile = builder.profile;
		this.pit = builder.pit;
		this.query = builder.query;
		this.queryOnQueryString = builder.queryOnQueryString;
		this.requestCache = builder.requestCache;
		this.rescore = builder.rescore;
		this.routing = builder.routing;
		this.scriptFields = builder.scriptFields;
		this.searchAfter = builder.searchAfter;
		this.searchType = builder.searchType;
		this.sequenceNumberPrimaryTerm = builder.sequenceNumberPrimaryTerm;
		this.size = builder.size;
		this.sort = builder.sort;
		this.source = builder.source;
		this.stats = builder.stats;
		this.storedFields = builder.storedFields;
		this.suggest = builder.suggest;
		this.suggestField = builder.suggestField;
		this.suggestMode = builder.suggestMode;
		this.suggestSize = builder.suggestSize;
		this.suggestText = builder.suggestText;
		this.terminateAfter = builder.terminateAfter;
		this.timeout = builder.timeout;
		this.trackScores = builder.trackScores;
		this.trackTotalHits = builder.trackTotalHits;
		this.typedKeys = builder.typedKeys;
		this.version = builder.version;
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;
		this.fields = builder.fields;

	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code aggs}
	 */
	@Nullable
	public Map<String, AggregationContainer> aggs() {
		return this.aggs;
	}

	/**
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * API name: {@code allow_partial_search_results}
	 */
	@Nullable
	public Boolean allowPartialSearchResults() {
		return this.allowPartialSearchResults;
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * API name: {@code batched_reduce_size}
	 */
	@Nullable
	public Number batchedReduceSize() {
		return this.batchedReduceSize;
	}

	/**
	 * API name: {@code collapse}
	 */
	@Nullable
	public FieldCollapse collapse() {
		return this.collapse;
	}

	/**
	 * API name: {@code default_operator}
	 */
	@Nullable
	public JsonValue defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * API name: {@code df}
	 */
	@Nullable
	public String df() {
		return this.df;
	}

	/**
	 * API name: {@code docvalue_fields}
	 */
	@Nullable
	public List<String> docvalueFields() {
		return this.docvalueFields;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * API name: {@code explain}
	 */
	@Nullable
	public Boolean explain() {
		return this.explain;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * API name: {@code highlight}
	 */
	@Nullable
	public Highlight highlight() {
		return this.highlight;
	}

	/**
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code indices_boost}
	 */
	@Nullable
	public List<Map<String, Number>> indicesBoost() {
		return this.indicesBoost;
	}

	/**
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public JsonValue keepAlive() {
		return this.keepAlive;
	}

	/**
	 * API name: {@code keep_on_completion}
	 */
	@Nullable
	public Boolean keepOnCompletion() {
		return this.keepOnCompletion;
	}

	/**
	 * API name: {@code lenient}
	 */
	@Nullable
	public Boolean lenient() {
		return this.lenient;
	}

	/**
	 * API name: {@code max_concurrent_shard_requests}
	 */
	@Nullable
	public Number maxConcurrentShardRequests() {
		return this.maxConcurrentShardRequests;
	}

	/**
	 * API name: {@code min_score}
	 */
	@Nullable
	public Number minScore() {
		return this.minScore;
	}

	/**
	 * API name: {@code post_filter}
	 */
	@Nullable
	public QueryContainer postFilter() {
		return this.postFilter;
	}

	/**
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * API name: {@code profile}
	 */
	@Nullable
	public Boolean profile() {
		return this.profile;
	}

	/**
	 * API name: {@code pit}
	 */
	@Nullable
	public PointInTimeReference pit() {
		return this.pit;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public QueryContainer query() {
		return this.query;
	}

	/**
	 * API name: {@code query_on_query_string}
	 */
	@Nullable
	public String queryOnQueryString() {
		return this.queryOnQueryString;
	}

	/**
	 * API name: {@code request_cache}
	 */
	@Nullable
	public Boolean requestCache() {
		return this.requestCache;
	}

	/**
	 * API name: {@code rescore}
	 */
	@Nullable
	public List<Rescore> rescore() {
		return this.rescore;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code script_fields}
	 */
	@Nullable
	public Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * API name: {@code search_after}
	 */
	@Nullable
	public List<JsonValue> searchAfter() {
		return this.searchAfter;
	}

	/**
	 * API name: {@code search_type}
	 */
	@Nullable
	public JsonValue searchType() {
		return this.searchType;
	}

	/**
	 * API name: {@code sequence_number_primary_term}
	 */
	@Nullable
	public Boolean sequenceNumberPrimaryTerm() {
		return this.sequenceNumberPrimaryTerm;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public List<JsonValue> sort() {
		return this.sort;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue source() {
		return this.source;
	}

	/**
	 * API name: {@code stats}
	 */
	@Nullable
	public List<String> stats() {
		return this.stats;
	}

	/**
	 * API name: {@code stored_fields}
	 */
	@Nullable
	public List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * API name: {@code suggest}
	 */
	@Nullable
	public Map<String, SuggestContainer> suggest() {
		return this.suggest;
	}

	/**
	 * API name: {@code suggest_field}
	 */
	@Nullable
	public String suggestField() {
		return this.suggestField;
	}

	/**
	 * API name: {@code suggest_mode}
	 */
	@Nullable
	public JsonValue suggestMode() {
		return this.suggestMode;
	}

	/**
	 * API name: {@code suggest_size}
	 */
	@Nullable
	public Number suggestSize() {
		return this.suggestSize;
	}

	/**
	 * API name: {@code suggest_text}
	 */
	@Nullable
	public String suggestText() {
		return this.suggestText;
	}

	/**
	 * API name: {@code terminate_after}
	 */
	@Nullable
	public Number terminateAfter() {
		return this.terminateAfter;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code track_scores}
	 */
	@Nullable
	public Boolean trackScores() {
		return this.trackScores;
	}

	/**
	 * API name: {@code track_total_hits}
	 */
	@Nullable
	public Boolean trackTotalHits() {
		return this.trackTotalHits;
	}

	/**
	 * API name: {@code typed_keys}
	 */
	@Nullable
	public Boolean typedKeys() {
		return this.typedKeys;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Boolean version() {
		return this.version;
	}

	/**
	 * API name: {@code wait_for_completion_timeout}
	 */
	@Nullable
	public JsonValue waitForCompletionTimeout() {
		return this.waitForCompletionTimeout;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<JsonValue> fields() {
		return this.fields;
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

		if (this.aggs != null) {

			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, AggregationContainer> item0 : this.aggs.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.allowNoIndices != null) {

			generator.writeKey("allow_no_indices");
			generator.write(this.allowNoIndices);

		}
		if (this.allowPartialSearchResults != null) {

			generator.writeKey("allow_partial_search_results");
			generator.write(this.allowPartialSearchResults);

		}
		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.analyzeWildcard != null) {

			generator.writeKey("analyze_wildcard");
			generator.write(this.analyzeWildcard);

		}
		if (this.batchedReduceSize != null) {

			generator.writeKey("batched_reduce_size");
			generator.write(this.batchedReduceSize.doubleValue());

		}
		if (this.collapse != null) {

			generator.writeKey("collapse");
			this.collapse.toJsonp(generator, mapper);

		}
		if (this.defaultOperator != null) {

			generator.writeKey("default_operator");
			generator.write(this.defaultOperator);

		}
		if (this.df != null) {

			generator.writeKey("df");
			generator.write(this.df);

		}
		if (this.docvalueFields != null) {

			generator.writeKey("docvalue_fields");
			generator.writeStartArray();
			for (String item0 : this.docvalueFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.expandWildcards != null) {

			generator.writeKey("expand_wildcards");
			generator.write(this.expandWildcards);

		}
		if (this.explain != null) {

			generator.writeKey("explain");
			generator.write(this.explain);

		}
		if (this.from != null) {

			generator.writeKey("from");
			generator.write(this.from.doubleValue());

		}
		if (this.highlight != null) {

			generator.writeKey("highlight");
			this.highlight.toJsonp(generator, mapper);

		}
		if (this.ignoreThrottled != null) {

			generator.writeKey("ignore_throttled");
			generator.write(this.ignoreThrottled);

		}
		if (this.ignoreUnavailable != null) {

			generator.writeKey("ignore_unavailable");
			generator.write(this.ignoreUnavailable);

		}
		if (this.indicesBoost != null) {

			generator.writeKey("indices_boost");
			generator.writeStartArray();
			for (Map<String, Number> item0 : this.indicesBoost) {
				generator.writeStartObject();
				for (Map.Entry<String, Number> item1 : item0.entrySet()) {
					generator.writeKey(item1.getKey());
					generator.write(item1.getValue().doubleValue());

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.keepAlive != null) {

			generator.writeKey("keep_alive");
			generator.write(this.keepAlive);

		}
		if (this.keepOnCompletion != null) {

			generator.writeKey("keep_on_completion");
			generator.write(this.keepOnCompletion);

		}
		if (this.lenient != null) {

			generator.writeKey("lenient");
			generator.write(this.lenient);

		}
		if (this.maxConcurrentShardRequests != null) {

			generator.writeKey("max_concurrent_shard_requests");
			generator.write(this.maxConcurrentShardRequests.doubleValue());

		}
		if (this.minScore != null) {

			generator.writeKey("min_score");
			generator.write(this.minScore.doubleValue());

		}
		if (this.postFilter != null) {

			generator.writeKey("post_filter");
			this.postFilter.toJsonp(generator, mapper);

		}
		if (this.preference != null) {

			generator.writeKey("preference");
			generator.write(this.preference);

		}
		if (this.profile != null) {

			generator.writeKey("profile");
			generator.write(this.profile);

		}
		if (this.pit != null) {

			generator.writeKey("pit");
			this.pit.toJsonp(generator, mapper);

		}
		if (this.query != null) {

			generator.writeKey("query");
			this.query.toJsonp(generator, mapper);

		}
		if (this.queryOnQueryString != null) {

			generator.writeKey("query_on_query_string");
			generator.write(this.queryOnQueryString);

		}
		if (this.requestCache != null) {

			generator.writeKey("request_cache");
			generator.write(this.requestCache);

		}
		if (this.rescore != null) {

			generator.writeKey("rescore");
			generator.writeStartArray();
			for (Rescore item0 : this.rescore) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.scriptFields != null) {

			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.searchAfter != null) {

			generator.writeKey("search_after");
			generator.writeStartArray();
			for (JsonValue item0 : this.searchAfter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.searchType != null) {

			generator.writeKey("search_type");
			generator.write(this.searchType);

		}
		if (this.sequenceNumberPrimaryTerm != null) {

			generator.writeKey("sequence_number_primary_term");
			generator.write(this.sequenceNumberPrimaryTerm);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.source != null) {

			generator.writeKey("_source");
			generator.write(this.source);

		}
		if (this.stats != null) {

			generator.writeKey("stats");
			generator.writeStartArray();
			for (String item0 : this.stats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.storedFields != null) {

			generator.writeKey("stored_fields");
			generator.writeStartArray();
			for (String item0 : this.storedFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.suggest != null) {

			generator.writeKey("suggest");
			generator.writeStartObject();
			for (Map.Entry<String, SuggestContainer> item0 : this.suggest.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.suggestField != null) {

			generator.writeKey("suggest_field");
			generator.write(this.suggestField);

		}
		if (this.suggestMode != null) {

			generator.writeKey("suggest_mode");
			generator.write(this.suggestMode);

		}
		if (this.suggestSize != null) {

			generator.writeKey("suggest_size");
			generator.write(this.suggestSize.doubleValue());

		}
		if (this.suggestText != null) {

			generator.writeKey("suggest_text");
			generator.write(this.suggestText);

		}
		if (this.terminateAfter != null) {

			generator.writeKey("terminate_after");
			generator.write(this.terminateAfter.doubleValue());

		}
		if (this.timeout != null) {

			generator.writeKey("timeout");
			generator.write(this.timeout);

		}
		if (this.trackScores != null) {

			generator.writeKey("track_scores");
			generator.write(this.trackScores);

		}
		if (this.trackTotalHits != null) {

			generator.writeKey("track_total_hits");
			generator.write(this.trackTotalHits);

		}
		if (this.typedKeys != null) {

			generator.writeKey("typed_keys");
			generator.write(this.typedKeys);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.waitForCompletionTimeout != null) {

			generator.writeKey("wait_for_completion_timeout");
			generator.write(this.waitForCompletionTimeout);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (JsonValue item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SubmitRequest}.
	 */
	public static class Builder implements ObjectBuilder<SubmitRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private Map<String, AggregationContainer> aggs;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean allowPartialSearchResults;

		@Nullable
		private String analyzer;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private Number batchedReduceSize;

		@Nullable
		private FieldCollapse collapse;

		@Nullable
		private JsonValue defaultOperator;

		@Nullable
		private String df;

		@Nullable
		private List<String> docvalueFields;

		@Nullable
		private JsonValue expandWildcards;

		@Nullable
		private Boolean explain;

		@Nullable
		private Number from;

		@Nullable
		private Highlight highlight;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<Map<String, Number>> indicesBoost;

		@Nullable
		private JsonValue keepAlive;

		@Nullable
		private Boolean keepOnCompletion;

		@Nullable
		private Boolean lenient;

		@Nullable
		private Number maxConcurrentShardRequests;

		@Nullable
		private Number minScore;

		@Nullable
		private QueryContainer postFilter;

		@Nullable
		private String preference;

		@Nullable
		private Boolean profile;

		@Nullable
		private PointInTimeReference pit;

		@Nullable
		private QueryContainer query;

		@Nullable
		private String queryOnQueryString;

		@Nullable
		private Boolean requestCache;

		@Nullable
		private List<Rescore> rescore;

		@Nullable
		private JsonValue routing;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private List<JsonValue> searchAfter;

		@Nullable
		private JsonValue searchType;

		@Nullable
		private Boolean sequenceNumberPrimaryTerm;

		@Nullable
		private Number size;

		@Nullable
		private List<JsonValue> sort;

		@Nullable
		private JsonValue source;

		@Nullable
		private List<String> stats;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private Map<String, SuggestContainer> suggest;

		@Nullable
		private String suggestField;

		@Nullable
		private JsonValue suggestMode;

		@Nullable
		private Number suggestSize;

		@Nullable
		private String suggestText;

		@Nullable
		private Number terminateAfter;

		@Nullable
		private String timeout;

		@Nullable
		private Boolean trackScores;

		@Nullable
		private Boolean trackTotalHits;

		@Nullable
		private Boolean typedKeys;

		@Nullable
		private Boolean version;

		@Nullable
		private JsonValue waitForCompletionTimeout;

		@Nullable
		private List<JsonValue> fields;

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * API name: {@code aggs}
		 */
		public Builder aggs(@Nullable Map<String, AggregationContainer> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, AggregationContainer value) {
			if (this.aggs == null) {
				this.aggs = new HashMap<>();
			}
			this.aggs.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggs(Map)} to a singleton map.
		 */
		public Builder aggs(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this.aggs(Collections.singletonMap(key, fn.apply(new AggregationContainer.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this.putAggs(key, fn.apply(new AggregationContainer.Builder()).build());
		}

		/**
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * API name: {@code allow_partial_search_results}
		 */
		public Builder allowPartialSearchResults(@Nullable Boolean value) {
			this.allowPartialSearchResults = value;
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code analyze_wildcard}
		 */
		public Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * API name: {@code batched_reduce_size}
		 */
		public Builder batchedReduceSize(@Nullable Number value) {
			this.batchedReduceSize = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public Builder collapse(@Nullable FieldCollapse value) {
			this.collapse = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public Builder collapse(Function<FieldCollapse.Builder, ObjectBuilder<FieldCollapse>> fn) {
			return this.collapse(fn.apply(new FieldCollapse.Builder()).build());
		}

		/**
		 * API name: {@code default_operator}
		 */
		public Builder defaultOperator(@Nullable JsonValue value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * API name: {@code df}
		 */
		public Builder df(@Nullable String value) {
			this.df = value;
			return this;
		}

		/**
		 * API name: {@code docvalue_fields}
		 */
		public Builder docvalueFields(@Nullable List<String> value) {
			this.docvalueFields = value;
			return this;
		}

		/**
		 * API name: {@code docvalue_fields}
		 */
		public Builder docvalueFields(String... value) {
			this.docvalueFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #docvalueFields(List)}, creating the list if needed.
		 */
		public Builder addDocvalueFields(String value) {
			if (this.docvalueFields == null) {
				this.docvalueFields = new ArrayList<>();
			}
			this.docvalueFields.add(value);
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * API name: {@code explain}
		 */
		public Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(@Nullable Highlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(Function<Highlight.Builder, ObjectBuilder<Highlight>> fn) {
			return this.highlight(fn.apply(new Highlight.Builder()).build());
		}

		/**
		 * API name: {@code ignore_throttled}
		 */
		public Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code indices_boost}
		 */
		public Builder indicesBoost(@Nullable List<Map<String, Number>> value) {
			this.indicesBoost = value;
			return this;
		}

		/**
		 * API name: {@code indices_boost}
		 */
		public Builder indicesBoost(Map<String, Number>... value) {
			this.indicesBoost = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indicesBoost(List)}, creating the list if needed.
		 */
		public Builder addIndicesBoost(Map<String, Number> value) {
			if (this.indicesBoost == null) {
				this.indicesBoost = new ArrayList<>();
			}
			this.indicesBoost.add(value);
			return this;
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public Builder keepAlive(@Nullable JsonValue value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * API name: {@code keep_on_completion}
		 */
		public Builder keepOnCompletion(@Nullable Boolean value) {
			this.keepOnCompletion = value;
			return this;
		}

		/**
		 * API name: {@code lenient}
		 */
		public Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * API name: {@code max_concurrent_shard_requests}
		 */
		public Builder maxConcurrentShardRequests(@Nullable Number value) {
			this.maxConcurrentShardRequests = value;
			return this;
		}

		/**
		 * API name: {@code min_score}
		 */
		public Builder minScore(@Nullable Number value) {
			this.minScore = value;
			return this;
		}

		/**
		 * API name: {@code post_filter}
		 */
		public Builder postFilter(@Nullable QueryContainer value) {
			this.postFilter = value;
			return this;
		}

		/**
		 * API name: {@code post_filter}
		 */
		public Builder postFilter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.postFilter(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * API name: {@code profile}
		 */
		public Builder profile(@Nullable Boolean value) {
			this.profile = value;
			return this;
		}

		/**
		 * API name: {@code pit}
		 */
		public Builder pit(@Nullable PointInTimeReference value) {
			this.pit = value;
			return this;
		}

		/**
		 * API name: {@code pit}
		 */
		public Builder pit(Function<PointInTimeReference.Builder, ObjectBuilder<PointInTimeReference>> fn) {
			return this.pit(fn.apply(new PointInTimeReference.Builder()).build());
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable QueryContainer value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code query_on_query_string}
		 */
		public Builder queryOnQueryString(@Nullable String value) {
			this.queryOnQueryString = value;
			return this;
		}

		/**
		 * API name: {@code request_cache}
		 */
		public Builder requestCache(@Nullable Boolean value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * API name: {@code rescore}
		 */
		public Builder rescore(@Nullable List<Rescore> value) {
			this.rescore = value;
			return this;
		}

		/**
		 * API name: {@code rescore}
		 */
		public Builder rescore(Rescore... value) {
			this.rescore = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #rescore(List)}, creating the list if needed.
		 */
		public Builder addRescore(Rescore value) {
			if (this.rescore == null) {
				this.rescore = new ArrayList<>();
			}
			this.rescore.add(value);
			return this;
		}

		/**
		 * Set {@link #rescore(List)} to a singleton list.
		 */
		public Builder rescore(Function<Rescore.Builder, ObjectBuilder<Rescore>> fn) {
			return this.rescore(fn.apply(new Rescore.Builder()).build());
		}

		/**
		 * Add a value to {@link #rescore(List)}, creating the list if needed.
		 */
		public Builder addRescore(Function<Rescore.Builder, ObjectBuilder<Rescore>> fn) {
			return this.addRescore(fn.apply(new Rescore.Builder()).build());
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code script_fields}
		 */
		public Builder scriptFields(@Nullable Map<String, ScriptField> value) {
			this.scriptFields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, ScriptField value) {
			if (this.scriptFields == null) {
				this.scriptFields = new HashMap<>();
			}
			this.scriptFields.put(key, value);
			return this;
		}

		/**
		 * Set {@link #scriptFields(Map)} to a singleton map.
		 */
		public Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.scriptFields(Collections.singletonMap(key, fn.apply(new ScriptField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.putScriptFields(key, fn.apply(new ScriptField.Builder()).build());
		}

		/**
		 * API name: {@code search_after}
		 */
		public Builder searchAfter(@Nullable List<JsonValue> value) {
			this.searchAfter = value;
			return this;
		}

		/**
		 * API name: {@code search_after}
		 */
		public Builder searchAfter(JsonValue... value) {
			this.searchAfter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #searchAfter(List)}, creating the list if needed.
		 */
		public Builder addSearchAfter(JsonValue value) {
			if (this.searchAfter == null) {
				this.searchAfter = new ArrayList<>();
			}
			this.searchAfter.add(value);
			return this;
		}

		/**
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable JsonValue value) {
			this.searchType = value;
			return this;
		}

		/**
		 * API name: {@code sequence_number_primary_term}
		 */
		public Builder sequenceNumberPrimaryTerm(@Nullable Boolean value) {
			this.sequenceNumberPrimaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable List<JsonValue> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(JsonValue... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder addSort(JsonValue value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder source(@Nullable JsonValue value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(@Nullable List<String> value) {
			this.stats = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(String... value) {
			this.stats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #stats(List)}, creating the list if needed.
		 */
		public Builder addStats(String value) {
			if (this.stats == null) {
				this.stats = new ArrayList<>();
			}
			this.stats.add(value);
			return this;
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #storedFields(List)}, creating the list if needed.
		 */
		public Builder addStoredFields(String value) {
			if (this.storedFields == null) {
				this.storedFields = new ArrayList<>();
			}
			this.storedFields.add(value);
			return this;
		}

		/**
		 * API name: {@code suggest}
		 */
		public Builder suggest(@Nullable Map<String, SuggestContainer> value) {
			this.suggest = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #suggest(Map)}, creating the map if needed.
		 */
		public Builder putSuggest(String key, SuggestContainer value) {
			if (this.suggest == null) {
				this.suggest = new HashMap<>();
			}
			this.suggest.put(key, value);
			return this;
		}

		/**
		 * Set {@link #suggest(Map)} to a singleton map.
		 */
		public Builder suggest(String key, Function<SuggestContainer.Builder, ObjectBuilder<SuggestContainer>> fn) {
			return this.suggest(Collections.singletonMap(key, fn.apply(new SuggestContainer.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #suggest(Map)}, creating the map if needed.
		 */
		public Builder putSuggest(String key, Function<SuggestContainer.Builder, ObjectBuilder<SuggestContainer>> fn) {
			return this.putSuggest(key, fn.apply(new SuggestContainer.Builder()).build());
		}

		/**
		 * API name: {@code suggest_field}
		 */
		public Builder suggestField(@Nullable String value) {
			this.suggestField = value;
			return this;
		}

		/**
		 * API name: {@code suggest_mode}
		 */
		public Builder suggestMode(@Nullable JsonValue value) {
			this.suggestMode = value;
			return this;
		}

		/**
		 * API name: {@code suggest_size}
		 */
		public Builder suggestSize(@Nullable Number value) {
			this.suggestSize = value;
			return this;
		}

		/**
		 * API name: {@code suggest_text}
		 */
		public Builder suggestText(@Nullable String value) {
			this.suggestText = value;
			return this;
		}

		/**
		 * API name: {@code terminate_after}
		 */
		public Builder terminateAfter(@Nullable Number value) {
			this.terminateAfter = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code track_scores}
		 */
		public Builder trackScores(@Nullable Boolean value) {
			this.trackScores = value;
			return this;
		}

		/**
		 * API name: {@code track_total_hits}
		 */
		public Builder trackTotalHits(@Nullable Boolean value) {
			this.trackTotalHits = value;
			return this;
		}

		/**
		 * API name: {@code typed_keys}
		 */
		public Builder typedKeys(@Nullable Boolean value) {
			this.typedKeys = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code wait_for_completion_timeout}
		 */
		public Builder waitForCompletionTimeout(@Nullable JsonValue value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<JsonValue> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(JsonValue... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(JsonValue value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * Builds a {@link SubmitRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SubmitRequest build() {

			return new SubmitRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SubmitRequest
	 */
	public static final JsonpDeserializer<SubmitRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SubmitRequest::setupSubmitRequestDeserializer);

	protected static void setupSubmitRequestDeserializer(DelegatingDeserializer<SubmitRequest.Builder> op) {

		op.add(Builder::aggs, JsonpDeserializer.stringMapDeserializer(AggregationContainer.DESERIALIZER), "aggs");
		op.add(Builder::allowNoIndices, JsonpDeserializer.booleanDeserializer(), "allow_no_indices");
		op.add(Builder::allowPartialSearchResults, JsonpDeserializer.booleanDeserializer(),
				"allow_partial_search_results");
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::analyzeWildcard, JsonpDeserializer.booleanDeserializer(), "analyze_wildcard");
		op.add(Builder::batchedReduceSize, JsonpDeserializer.numberDeserializer(), "batched_reduce_size");
		op.add(Builder::collapse, FieldCollapse.DESERIALIZER, "collapse");
		op.add(Builder::defaultOperator, JsonpDeserializer.jsonValueDeserializer(), "default_operator");
		op.add(Builder::df, JsonpDeserializer.stringDeserializer(), "df");
		op.add(Builder::docvalueFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"docvalue_fields");
		op.add(Builder::expandWildcards, JsonpDeserializer.jsonValueDeserializer(), "expand_wildcards");
		op.add(Builder::explain, JsonpDeserializer.booleanDeserializer(), "explain");
		op.add(Builder::from, JsonpDeserializer.numberDeserializer(), "from");
		op.add(Builder::highlight, Highlight.DESERIALIZER, "highlight");
		op.add(Builder::ignoreThrottled, JsonpDeserializer.booleanDeserializer(), "ignore_throttled");
		op.add(Builder::ignoreUnavailable, JsonpDeserializer.booleanDeserializer(), "ignore_unavailable");
		op.add(Builder::indicesBoost,
				JsonpDeserializer.arrayDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.numberDeserializer())),
				"indices_boost");
		op.add(Builder::keepAlive, JsonpDeserializer.jsonValueDeserializer(), "keep_alive");
		op.add(Builder::keepOnCompletion, JsonpDeserializer.booleanDeserializer(), "keep_on_completion");
		op.add(Builder::lenient, JsonpDeserializer.booleanDeserializer(), "lenient");
		op.add(Builder::maxConcurrentShardRequests, JsonpDeserializer.numberDeserializer(),
				"max_concurrent_shard_requests");
		op.add(Builder::minScore, JsonpDeserializer.numberDeserializer(), "min_score");
		op.add(Builder::postFilter, QueryContainer.DESERIALIZER, "post_filter");
		op.add(Builder::preference, JsonpDeserializer.stringDeserializer(), "preference");
		op.add(Builder::profile, JsonpDeserializer.booleanDeserializer(), "profile");
		op.add(Builder::pit, PointInTimeReference.DESERIALIZER, "pit");
		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");
		op.add(Builder::queryOnQueryString, JsonpDeserializer.stringDeserializer(), "query_on_query_string");
		op.add(Builder::requestCache, JsonpDeserializer.booleanDeserializer(), "request_cache");
		op.add(Builder::rescore, JsonpDeserializer.arrayDeserializer(Rescore.DESERIALIZER), "rescore");
		op.add(Builder::routing, JsonpDeserializer.jsonValueDeserializer(), "routing");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField.DESERIALIZER),
				"script_fields");
		op.add(Builder::searchAfter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"search_after");
		op.add(Builder::searchType, JsonpDeserializer.jsonValueDeserializer(), "search_type");
		op.add(Builder::sequenceNumberPrimaryTerm, JsonpDeserializer.booleanDeserializer(),
				"sequence_number_primary_term");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");
		op.add(Builder::source, JsonpDeserializer.jsonValueDeserializer(), "_source");
		op.add(Builder::stats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "stats");
		op.add(Builder::storedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_fields");
		op.add(Builder::suggest, JsonpDeserializer.stringMapDeserializer(SuggestContainer.DESERIALIZER), "suggest");
		op.add(Builder::suggestField, JsonpDeserializer.stringDeserializer(), "suggest_field");
		op.add(Builder::suggestMode, JsonpDeserializer.jsonValueDeserializer(), "suggest_mode");
		op.add(Builder::suggestSize, JsonpDeserializer.numberDeserializer(), "suggest_size");
		op.add(Builder::suggestText, JsonpDeserializer.stringDeserializer(), "suggest_text");
		op.add(Builder::terminateAfter, JsonpDeserializer.numberDeserializer(), "terminate_after");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");
		op.add(Builder::trackScores, JsonpDeserializer.booleanDeserializer(), "track_scores");
		op.add(Builder::trackTotalHits, JsonpDeserializer.booleanDeserializer(), "track_total_hits");
		op.add(Builder::typedKeys, JsonpDeserializer.booleanDeserializer(), "typed_keys");
		op.add(Builder::version, JsonpDeserializer.booleanDeserializer(), "version");
		op.add(Builder::waitForCompletionTimeout, JsonpDeserializer.jsonValueDeserializer(),
				"wait_for_completion_timeout");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"fields");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code async_search.submit}".
	 */
	private static final Endpoint.Simple<SubmitRequest, Void> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_async_search");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_async_search");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				return params;

			}, Endpoint.Simple.emptyMap(), true, null);

	/**
	 * Create an "{@code async_search.submit}" endpoint.
	 */
	public static <TDocument> Endpoint<SubmitRequest, SubmitResponse<TDocument>, ElasticsearchError> createSubmitEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(SubmitResponse.createSubmitResponseDeserializer(tDocumentDeserializer));
	}
}
