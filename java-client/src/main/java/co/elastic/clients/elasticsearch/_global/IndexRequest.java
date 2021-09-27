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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.index.Request
public final class IndexRequest<TDocument> extends RequestBase implements ToJsonp {
	@Nullable
	private final String id;

	private final String index;

	@Nullable
	private final String type;

	@Nullable
	private final Number ifPrimaryTerm;

	@Nullable
	private final Number ifSeqNo;

	@Nullable
	private final JsonValue opType;

	@Nullable
	private final String pipeline;

	@Nullable
	private final JsonValue refresh;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final Number version;

	@Nullable
	private final JsonValue versionType;

	@Nullable
	private final JsonValue waitForActiveShards;

	@Nullable
	private final Boolean requireAlias;

	private final TDocument value;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected IndexRequest(Builder<TDocument> builder) {

		this.id = builder.id;
		this.index = Objects.requireNonNull(builder.index, "index");
		this.type = builder.type;
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSeqNo = builder.ifSeqNo;
		this.opType = builder.opType;
		this.pipeline = builder.pipeline;
		this.refresh = builder.refresh;
		this.routing = builder.routing;
		this.timeout = builder.timeout;
		this.version = builder.version;
		this.versionType = builder.versionType;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.requireAlias = builder.requireAlias;
		this.value = Objects.requireNonNull(builder.value, "value");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code if_primary_term}
	 */
	@Nullable
	public Number ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * API name: {@code if_seq_no}
	 */
	@Nullable
	public Number ifSeqNo() {
		return this.ifSeqNo;
	}

	/**
	 * API name: {@code op_type}
	 */
	@Nullable
	public JsonValue opType() {
		return this.opType;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public String pipeline() {
		return this.pipeline;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code version_type}
	 */
	@Nullable
	public JsonValue versionType() {
		return this.versionType;
	}

	/**
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * API name: {@code require_alias}
	 */
	@Nullable
	public Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * Request body.
	 *
	 * API name: {@code value}
	 */
	public TDocument value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		JsonpUtils.serialize(this.value, generator, tDocumentSerializer, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRequest}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<IndexRequest<TDocument>> {
		@Nullable
		private String id;

		private String index;

		@Nullable
		private String type;

		@Nullable
		private Number ifPrimaryTerm;

		@Nullable
		private Number ifSeqNo;

		@Nullable
		private JsonValue opType;

		@Nullable
		private String pipeline;

		@Nullable
		private JsonValue refresh;

		@Nullable
		private JsonValue routing;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private Number version;

		@Nullable
		private JsonValue versionType;

		@Nullable
		private JsonValue waitForActiveShards;

		@Nullable
		private Boolean requireAlias;

		private TDocument value;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code id}
		 */
		public Builder<TDocument> id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder<TDocument> type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code if_primary_term}
		 */
		public Builder<TDocument> ifPrimaryTerm(@Nullable Number value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code if_seq_no}
		 */
		public Builder<TDocument> ifSeqNo(@Nullable Number value) {
			this.ifSeqNo = value;
			return this;
		}

		/**
		 * API name: {@code op_type}
		 */
		public Builder<TDocument> opType(@Nullable JsonValue value) {
			this.opType = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public Builder<TDocument> pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public Builder<TDocument> refresh(@Nullable JsonValue value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder<TDocument> routing(@Nullable JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder<TDocument> timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder<TDocument> version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version_type}
		 */
		public Builder<TDocument> versionType(@Nullable JsonValue value) {
			this.versionType = value;
			return this;
		}

		/**
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder<TDocument> waitForActiveShards(@Nullable JsonValue value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * API name: {@code require_alias}
		 */
		public Builder<TDocument> requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * Request body.
		 *
		 * API name: {@code value}
		 */
		public Builder<TDocument> value(TDocument value) {
			this.value = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link IndexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRequest<TDocument> build() {

			return new IndexRequest<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for IndexRequest
	 */
	public static <TDocument> JsonpDeserializer<IndexRequest<TDocument>> createIndexRequestDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForValue((Supplier<Builder<TDocument>>) Builder::new,
				op -> IndexRequest.setupIndexRequestDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupIndexRequestDeserializer(
			DelegatingDeserializer<IndexRequest.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::value, tDocumentDeserializer, "value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code index}".
	 */
	public static final Endpoint<IndexRequest<?>, IndexResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int _id = 1 << 0;
				final int _index = 1 << 1;
				final int _type = 1 << 2;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;
				if (request.index() != null)
					propsSet |= _index;
				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == (_index | _id))
					return "PUT";
				if (propsSet == (_index))
					return "POST";
				if (propsSet == (_index | _type))
					return "POST";
				if (propsSet == (_index | _type | _id))
					return "PUT";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int _id = 1 << 0;
				final int _index = 1 << 1;
				final int _type = 1 << 2;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;
				if (request.index() != null)
					propsSet |= _index;
				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == (_index | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_doc");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_doc");
					return buf.toString();
				}
				if (propsSet == (_index | _type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/");
					buf.append(request.type);
					return buf.toString();
				}
				if (propsSet == (_index | _type | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/");
					buf.append(request.type);
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ifPrimaryTerm != null) {
					params.put("if_primary_term", request.ifPrimaryTerm.toString());
				}
				if (request.ifSeqNo != null) {
					params.put("if_seq_no", request.ifSeqNo.toString());
				}
				if (request.opType != null) {
					params.put("op_type", request.opType.toString());
				}
				if (request.pipeline != null) {
					params.put("pipeline", request.pipeline);
				}
				if (request.refresh != null) {
					params.put("refresh", request.refresh.toString());
				}
				if (request.routing != null) {
					params.put("routing", request.routing.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				if (request.version != null) {
					params.put("version", request.version.toString());
				}
				if (request.versionType != null) {
					params.put("version_type", request.versionType.toString());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards.toString());
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, IndexResponse.DESERIALIZER);
}
