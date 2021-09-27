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

import co.elastic.clients.elasticsearch.ml.info.Defaults;
import co.elastic.clients.elasticsearch.ml.info.Limits;
import co.elastic.clients.elasticsearch.ml.info.NativeCode;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.info.Response
public final class InfoResponse implements ToJsonp {
	private final Defaults defaults;

	private final Limits limits;

	private final Boolean upgradeMode;

	private final NativeCode nativeCode;

	// ---------------------------------------------------------------------------------------------

	protected InfoResponse(Builder builder) {

		this.defaults = Objects.requireNonNull(builder.defaults, "defaults");
		this.limits = Objects.requireNonNull(builder.limits, "limits");
		this.upgradeMode = Objects.requireNonNull(builder.upgradeMode, "upgrade_mode");
		this.nativeCode = Objects.requireNonNull(builder.nativeCode, "native_code");

	}

	/**
	 * API name: {@code defaults}
	 */
	public Defaults defaults() {
		return this.defaults;
	}

	/**
	 * API name: {@code limits}
	 */
	public Limits limits() {
		return this.limits;
	}

	/**
	 * API name: {@code upgrade_mode}
	 */
	public Boolean upgradeMode() {
		return this.upgradeMode;
	}

	/**
	 * API name: {@code native_code}
	 */
	public NativeCode nativeCode() {
		return this.nativeCode;
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

		generator.writeKey("defaults");
		this.defaults.toJsonp(generator, mapper);

		generator.writeKey("limits");
		this.limits.toJsonp(generator, mapper);

		generator.writeKey("upgrade_mode");
		generator.write(this.upgradeMode);

		generator.writeKey("native_code");
		this.nativeCode.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InfoResponse}.
	 */
	public static class Builder implements ObjectBuilder<InfoResponse> {
		private Defaults defaults;

		private Limits limits;

		private Boolean upgradeMode;

		private NativeCode nativeCode;

		/**
		 * API name: {@code defaults}
		 */
		public Builder defaults(Defaults value) {
			this.defaults = value;
			return this;
		}

		/**
		 * API name: {@code defaults}
		 */
		public Builder defaults(Function<Defaults.Builder, ObjectBuilder<Defaults>> fn) {
			return this.defaults(fn.apply(new Defaults.Builder()).build());
		}

		/**
		 * API name: {@code limits}
		 */
		public Builder limits(Limits value) {
			this.limits = value;
			return this;
		}

		/**
		 * API name: {@code limits}
		 */
		public Builder limits(Function<Limits.Builder, ObjectBuilder<Limits>> fn) {
			return this.limits(fn.apply(new Limits.Builder()).build());
		}

		/**
		 * API name: {@code upgrade_mode}
		 */
		public Builder upgradeMode(Boolean value) {
			this.upgradeMode = value;
			return this;
		}

		/**
		 * API name: {@code native_code}
		 */
		public Builder nativeCode(NativeCode value) {
			this.nativeCode = value;
			return this;
		}

		/**
		 * API name: {@code native_code}
		 */
		public Builder nativeCode(Function<NativeCode.Builder, ObjectBuilder<NativeCode>> fn) {
			return this.nativeCode(fn.apply(new NativeCode.Builder()).build());
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

		op.add(Builder::defaults, Defaults.DESERIALIZER, "defaults");
		op.add(Builder::limits, Limits.DESERIALIZER, "limits");
		op.add(Builder::upgradeMode, JsonpDeserializer.booleanDeserializer(), "upgrade_mode");
		op.add(Builder::nativeCode, NativeCode.DESERIALIZER, "native_code");

	}

}
