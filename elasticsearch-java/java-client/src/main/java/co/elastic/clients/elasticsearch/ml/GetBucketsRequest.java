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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_buckets.Request
public final class GetBucketsRequest extends RequestBase implements ToJsonp {
	private final String jobId;

	@Nullable
	private final String timestamp;

	@Nullable
	private final Number from;

	@Nullable
	private final Number size;

	@Nullable
	private final Number anomalyScore;

	@Nullable
	private final Boolean desc;

	@Nullable
	private final Boolean excludeInterim;

	@Nullable
	private final Boolean expand;

	@Nullable
	private final Page page;

	@Nullable
	private final String sort;

	@Nullable
	private final String start;

	@Nullable
	private final String end;

	// ---------------------------------------------------------------------------------------------

	protected GetBucketsRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.timestamp = builder.timestamp;
		this.from = builder.from;
		this.size = builder.size;
		this.anomalyScore = builder.anomalyScore;
		this.desc = builder.desc;
		this.excludeInterim = builder.excludeInterim;
		this.expand = builder.expand;
		this.page = builder.page;
		this.sort = builder.sort;
		this.start = builder.start;
		this.end = builder.end;

	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code timestamp}
	 */
	@Nullable
	public String timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code anomaly_score}
	 */
	@Nullable
	public Number anomalyScore() {
		return this.anomalyScore;
	}

	/**
	 * API name: {@code desc}
	 */
	@Nullable
	public Boolean desc() {
		return this.desc;
	}

	/**
	 * API name: {@code exclude_interim}
	 */
	@Nullable
	public Boolean excludeInterim() {
		return this.excludeInterim;
	}

	/**
	 * API name: {@code expand}
	 */
	@Nullable
	public Boolean expand() {
		return this.expand;
	}

	/**
	 * API name: {@code page}
	 */
	@Nullable
	public Page page() {
		return this.page;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public String sort() {
		return this.sort;
	}

	/**
	 * API name: {@code start}
	 */
	@Nullable
	public String start() {
		return this.start;
	}

	/**
	 * API name: {@code end}
	 */
	@Nullable
	public String end() {
		return this.end;
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

		if (this.anomalyScore != null) {

			generator.writeKey("anomaly_score");
			generator.write(this.anomalyScore.doubleValue());

		}
		if (this.desc != null) {

			generator.writeKey("desc");
			generator.write(this.desc);

		}
		if (this.excludeInterim != null) {

			generator.writeKey("exclude_interim");
			generator.write(this.excludeInterim);

		}
		if (this.expand != null) {

			generator.writeKey("expand");
			generator.write(this.expand);

		}
		if (this.page != null) {

			generator.writeKey("page");
			this.page.toJsonp(generator, mapper);

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.write(this.sort);

		}
		if (this.start != null) {

			generator.writeKey("start");
			generator.write(this.start);

		}
		if (this.end != null) {

			generator.writeKey("end");
			generator.write(this.end);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetBucketsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetBucketsRequest> {
		private String jobId;

		@Nullable
		private String timestamp;

		@Nullable
		private Number from;

		@Nullable
		private Number size;

		@Nullable
		private Number anomalyScore;

		@Nullable
		private Boolean desc;

		@Nullable
		private Boolean excludeInterim;

		@Nullable
		private Boolean expand;

		@Nullable
		private Page page;

		@Nullable
		private String sort;

		@Nullable
		private String start;

		@Nullable
		private String end;

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(@Nullable String value) {
			this.timestamp = value;
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
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code anomaly_score}
		 */
		public Builder anomalyScore(@Nullable Number value) {
			this.anomalyScore = value;
			return this;
		}

		/**
		 * API name: {@code desc}
		 */
		public Builder desc(@Nullable Boolean value) {
			this.desc = value;
			return this;
		}

		/**
		 * API name: {@code exclude_interim}
		 */
		public Builder excludeInterim(@Nullable Boolean value) {
			this.excludeInterim = value;
			return this;
		}

		/**
		 * API name: {@code expand}
		 */
		public Builder expand(@Nullable Boolean value) {
			this.expand = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public Builder page(@Nullable Page value) {
			this.page = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public Builder page(Function<Page.Builder, ObjectBuilder<Page>> fn) {
			return this.page(fn.apply(new Page.Builder()).build());
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable String value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public Builder start(@Nullable String value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code end}
		 */
		public Builder end(@Nullable String value) {
			this.end = value;
			return this;
		}

		/**
		 * Builds a {@link GetBucketsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetBucketsRequest build() {

			return new GetBucketsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetBucketsRequest
	 */
	public static final JsonpDeserializer<GetBucketsRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetBucketsRequest::setupGetBucketsRequestDeserializer);

	protected static void setupGetBucketsRequestDeserializer(DelegatingDeserializer<GetBucketsRequest.Builder> op) {

		op.add(Builder::anomalyScore, JsonpDeserializer.numberDeserializer(), "anomaly_score");
		op.add(Builder::desc, JsonpDeserializer.booleanDeserializer(), "desc");
		op.add(Builder::excludeInterim, JsonpDeserializer.booleanDeserializer(), "exclude_interim");
		op.add(Builder::expand, JsonpDeserializer.booleanDeserializer(), "expand");
		op.add(Builder::page, Page.DESERIALIZER, "page");
		op.add(Builder::sort, JsonpDeserializer.stringDeserializer(), "sort");
		op.add(Builder::start, JsonpDeserializer.stringDeserializer(), "start");
		op.add(Builder::end, JsonpDeserializer.stringDeserializer(), "end");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_buckets}".
	 */
	public static final Endpoint<GetBucketsRequest, GetBucketsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;
				final int _timestamp = 1 << 1;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= _jobId;
				if (request.timestamp() != null)
					propsSet |= _timestamp;

				if (propsSet == (_jobId | _timestamp)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/results");
					buf.append("/buckets");
					buf.append("/");
					buf.append(request.timestamp);
					return buf.toString();
				}
				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/results");
					buf.append("/buckets");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.from != null) {
					params.put("from", request.from.toString());
				}
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, GetBucketsResponse.DESERIALIZER);
}
