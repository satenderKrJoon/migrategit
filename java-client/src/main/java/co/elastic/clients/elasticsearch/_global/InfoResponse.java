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

import co.elastic.clients.elasticsearch._types.ElasticsearchVersionInfo;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.info.Response
public final class InfoResponse implements ToJsonp {
	private final String clusterName;

	private final String clusterUuid;

	private final String name;

	private final String tagline;

	private final ElasticsearchVersionInfo version;

	// ---------------------------------------------------------------------------------------------

	protected InfoResponse(Builder builder) {

		this.clusterName = Objects.requireNonNull(builder.clusterName, "cluster_name");
		this.clusterUuid = Objects.requireNonNull(builder.clusterUuid, "cluster_uuid");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.tagline = Objects.requireNonNull(builder.tagline, "tagline");
		this.version = Objects.requireNonNull(builder.version, "version");

	}

	/**
	 * API name: {@code cluster_name}
	 */
	public String clusterName() {
		return this.clusterName;
	}

	/**
	 * API name: {@code cluster_uuid}
	 */
	public String clusterUuid() {
		return this.clusterUuid;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code tagline}
	 */
	public String tagline() {
		return this.tagline;
	}

	/**
	 * API name: {@code version}
	 */
	public ElasticsearchVersionInfo version() {
		return this.version;
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

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("cluster_uuid");
		generator.write(this.clusterUuid);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("tagline");
		generator.write(this.tagline);

		generator.writeKey("version");
		this.version.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InfoResponse}.
	 */
	public static class Builder implements ObjectBuilder<InfoResponse> {
		private String clusterName;

		private String clusterUuid;

		private String name;

		private String tagline;

		private ElasticsearchVersionInfo version;

		/**
		 * API name: {@code cluster_name}
		 */
		public Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * API name: {@code cluster_uuid}
		 */
		public Builder clusterUuid(String value) {
			this.clusterUuid = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code tagline}
		 */
		public Builder tagline(String value) {
			this.tagline = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(ElasticsearchVersionInfo value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(Function<ElasticsearchVersionInfo.Builder, ObjectBuilder<ElasticsearchVersionInfo>> fn) {
			return this.version(fn.apply(new ElasticsearchVersionInfo.Builder()).build());
		}

		/**
		 * Builds a {@link InfoResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InfoResponse build() {

			return new InfoResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for InfoResponse
	 */
	public static final JsonpDeserializer<InfoResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InfoResponse::setupInfoResponseDeserializer);

	protected static void setupInfoResponseDeserializer(DelegatingDeserializer<InfoResponse.Builder> op) {

		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::clusterUuid, JsonpDeserializer.stringDeserializer(), "cluster_uuid");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::tagline, JsonpDeserializer.stringDeserializer(), "tagline");
		op.add(Builder::version, ElasticsearchVersionInfo.DESERIALIZER, "version");

	}

}
