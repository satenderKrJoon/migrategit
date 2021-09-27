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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.scripts_painless_execute.Response
public final class ScriptsPainlessExecuteResponse<TResult> implements ToJsonp {
	private final TResult result;

	@Nullable
	private final JsonpSerializer<TResult> tResultSerializer;

	// ---------------------------------------------------------------------------------------------

	protected ScriptsPainlessExecuteResponse(Builder<TResult> builder) {

		this.result = Objects.requireNonNull(builder.result, "result");
		this.tResultSerializer = builder.tResultSerializer;

	}

	/**
	 * API name: {@code result}
	 */
	public TResult result() {
		return this.result;
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

		generator.writeKey("result");
		JsonpUtils.serialize(this.result, generator, tResultSerializer, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptsPainlessExecuteResponse}.
	 */
	public static class Builder<TResult> implements ObjectBuilder<ScriptsPainlessExecuteResponse<TResult>> {
		private TResult result;

		@Nullable
		private JsonpSerializer<TResult> tResultSerializer;

		/**
		 * API name: {@code result}
		 */
		public Builder<TResult> result(TResult value) {
			this.result = value;
			return this;
		}

		/**
		 * Serializer for TResult. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TResult> tResultSerializer(@Nullable JsonpSerializer<TResult> value) {
			this.tResultSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link ScriptsPainlessExecuteResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptsPainlessExecuteResponse<TResult> build() {

			return new ScriptsPainlessExecuteResponse<TResult>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for ScriptsPainlessExecuteResponse
	 */
	public static <TResult> JsonpDeserializer<ScriptsPainlessExecuteResponse<TResult>> createScriptsPainlessExecuteResponseDeserializer(
			JsonpDeserializer<TResult> tResultDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TResult>>) Builder::new,
				op -> ScriptsPainlessExecuteResponse.setupScriptsPainlessExecuteResponseDeserializer(op,
						tResultDeserializer));
	};

	protected static <TResult> void setupScriptsPainlessExecuteResponseDeserializer(
			DelegatingDeserializer<ScriptsPainlessExecuteResponse.Builder<TResult>> op,
			JsonpDeserializer<TResult> tResultDeserializer) {

		op.add(Builder::result, tResultDeserializer, "result");

	}

}
