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

// typedef: ml.get_influencers.Request
public final class GetInfluencersRequest extends RequestBase implements ToJsonp {
	private final String jobId;

	@Nullable
	private final Boolean desc;

	@Nullable
	private final String end;

	@Nullable
	private final Boolean excludeInterim;

	@Nullable
	private final Number influencerScore;

	@Nullable
	private final Number from;

	@Nullable
	private final Number size;

	@Nullable
	private final String sort;

	@Nullable
	private final String start;

	@Nullable
	private final Page page;

	// ---------------------------------------------------------------------------------------------

	protected GetInfluencersRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.desc = builder.desc;
		this.end = builder.end;
		this.excludeInterim = builder.excludeInterim;
		this.influencerScore = builder.influencerScore;
		this.from = builder.from;
		this.size = builder.size;
		this.sort = builder.sort;
		this.start = builder.start;
		this.page = builder.page;

	}

	/**
	 * Identifier for the anomaly detection job.
	 *
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * If true, the results are sorted in descending order.
	 *
	 * API name: {@code desc}
	 */
	@Nullable
	public Boolean desc() {
		return this.desc;
	}

	/**
	 * Returns influencers with timestamps earlier than this time.
	 *
	 * API name: {@code end}
	 */
	@Nullable
	public String end() {
		return this.end;
	}

	/**
	 * If true, the output excludes interim results. By default, interim results are
	 * included.
	 *
	 * API name: {@code exclude_interim}
	 */
	@Nullable
	public Boolean excludeInterim() {
		return this.excludeInterim;
	}

	/**
	 * Returns influencers with anomaly scores greater than or equal to this value.
	 *
	 * API name: {@code influencer_score}
	 */
	@Nullable
	public Number influencerScore() {
		return this.influencerScore;
	}

	/**
	 * Skips the specified number of influencers.
	 *
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * Specifies the maximum number of influencers to obtain.
	 *
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * Specifies the sort field for the requested influencers. By default, the
	 * influencers are sorted by the influencer_score value.
	 *
	 * API name: {@code sort}
	 */
	@Nullable
	public String sort() {
		return this.sort;
	}

	/**
	 * Returns influencers with timestamps after this time.
	 *
	 * API name: {@code start}
	 */
	@Nullable
	public String start() {
		return this.start;
	}

	/**
	 * API name: {@code page}
	 */
	@Nullable
	public Page page() {
		return this.page;
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

		if (this.page != null) {

			generator.writeKey("page");
			this.page.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetInfluencersRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetInfluencersRequest> {
		private String jobId;

		@Nullable
		private Boolean desc;

		@Nullable
		private String end;

		@Nullable
		private Boolean excludeInterim;

		@Nullable
		private Number influencerScore;

		@Nullable
		private Number from;

		@Nullable
		private Number size;

		@Nullable
		private String sort;

		@Nullable
		private String start;

		@Nullable
		private Page page;

		/**
		 * Identifier for the anomaly detection job.
		 *
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * If true, the results are sorted in descending order.
		 *
		 * API name: {@code desc}
		 */
		public Builder desc(@Nullable Boolean value) {
			this.desc = value;
			return this;
		}

		/**
		 * Returns influencers with timestamps earlier than this time.
		 *
		 * API name: {@code end}
		 */
		public Builder end(@Nullable String value) {
			this.end = value;
			return this;
		}

		/**
		 * If true, the output excludes interim results. By default, interim results are
		 * included.
		 *
		 * API name: {@code exclude_interim}
		 */
		public Builder excludeInterim(@Nullable Boolean value) {
			this.excludeInterim = value;
			return this;
		}

		/**
		 * Returns influencers with anomaly scores greater than or equal to this value.
		 *
		 * API name: {@code influencer_score}
		 */
		public Builder influencerScore(@Nullable Number value) {
			this.influencerScore = value;
			return this;
		}

		/**
		 * Skips the specified number of influencers.
		 *
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies the maximum number of influencers to obtain.
		 *
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Specifies the sort field for the requested influencers. By default, the
		 * influencers are sorted by the influencer_score value.
		 *
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable String value) {
			this.sort = value;
			return this;
		}

		/**
		 * Returns influencers with timestamps after this time.
		 *
		 * API name: {@code start}
		 */
		public Builder start(@Nullable String value) {
			this.start = value;
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
		 * Builds a {@link GetInfluencersRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetInfluencersRequest build() {

			return new GetInfluencersRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetInfluencersRequest
	 */
	public static final JsonpDeserializer<GetInfluencersRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetInfluencersRequest::setupGetInfluencersRequestDeserializer);

	protected static void setupGetInfluencersRequestDeserializer(
			DelegatingDeserializer<GetInfluencersRequest.Builder> op) {

		op.add(Builder::page, Page.DESERIALIZER, "page");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_influencers}".
	 */
	public static final Endpoint<GetInfluencersRequest, GetInfluencersResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/results");
					buf.append("/influencers");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.desc != null) {
					params.put("desc", String.valueOf(request.desc));
				}
				if (request.end != null) {
					params.put("end", request.end);
				}
				if (request.excludeInterim != null) {
					params.put("exclude_interim", String.valueOf(request.excludeInterim));
				}
				if (request.influencerScore != null) {
					params.put("influencer_score", request.influencerScore.toString());
				}
				if (request.from != null) {
					params.put("from", request.from.toString());
				}
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				if (request.sort != null) {
					params.put("sort", request.sort);
				}
				if (request.start != null) {
					params.put("start", request.start);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, GetInfluencersResponse.DESERIALIZER);
}
