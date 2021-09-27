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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.get_service_credentials.Response
public final class GetServiceCredentialsResponse implements ToJsonp {
	private final String serviceAccount;

	private final String nodeName;

	private final Number count;

	private final Map<String, JsonValue> tokens;

	private final Map<String, JsonValue> fileTokens;

	// ---------------------------------------------------------------------------------------------

	protected GetServiceCredentialsResponse(Builder builder) {

		this.serviceAccount = Objects.requireNonNull(builder.serviceAccount, "service_account");
		this.nodeName = Objects.requireNonNull(builder.nodeName, "node_name");
		this.count = Objects.requireNonNull(builder.count, "count");
		this.tokens = Objects.requireNonNull(builder.tokens, "tokens");
		this.fileTokens = Objects.requireNonNull(builder.fileTokens, "file_tokens");

	}

	/**
	 * API name: {@code service_account}
	 */
	public String serviceAccount() {
		return this.serviceAccount;
	}

	/**
	 * API name: {@code node_name}
	 */
	public String nodeName() {
		return this.nodeName;
	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code tokens}
	 */
	public Map<String, JsonValue> tokens() {
		return this.tokens;
	}

	/**
	 * API name: {@code file_tokens}
	 */
	public Map<String, JsonValue> fileTokens() {
		return this.fileTokens;
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

		generator.writeKey("service_account");
		generator.write(this.serviceAccount);

		generator.writeKey("node_name");
		generator.write(this.nodeName);

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("tokens");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.tokens.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("file_tokens");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.fileTokens.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetServiceCredentialsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetServiceCredentialsResponse> {
		private String serviceAccount;

		private String nodeName;

		private Number count;

		private Map<String, JsonValue> tokens;

		private Map<String, JsonValue> fileTokens;

		/**
		 * API name: {@code service_account}
		 */
		public Builder serviceAccount(String value) {
			this.serviceAccount = value;
			return this;
		}

		/**
		 * API name: {@code node_name}
		 */
		public Builder nodeName(String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		public Builder tokens(Map<String, JsonValue> value) {
			this.tokens = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #tokens(Map)}, creating the map if needed.
		 */
		public Builder putTokens(String key, JsonValue value) {
			if (this.tokens == null) {
				this.tokens = new HashMap<>();
			}
			this.tokens.put(key, value);
			return this;
		}

		/**
		 * API name: {@code file_tokens}
		 */
		public Builder fileTokens(Map<String, JsonValue> value) {
			this.fileTokens = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fileTokens(Map)}, creating the map if needed.
		 */
		public Builder putFileTokens(String key, JsonValue value) {
			if (this.fileTokens == null) {
				this.fileTokens = new HashMap<>();
			}
			this.fileTokens.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link GetServiceCredentialsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetServiceCredentialsResponse build() {

			return new GetServiceCredentialsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetServiceCredentialsResponse
	 */
	public static final JsonpDeserializer<GetServiceCredentialsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					GetServiceCredentialsResponse::setupGetServiceCredentialsResponseDeserializer);

	protected static void setupGetServiceCredentialsResponseDeserializer(
			DelegatingDeserializer<GetServiceCredentialsResponse.Builder> op) {

		op.add(Builder::serviceAccount, JsonpDeserializer.stringDeserializer(), "service_account");
		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name");
		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::tokens, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"tokens");
		op.add(Builder::fileTokens, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"file_tokens");

	}

}
