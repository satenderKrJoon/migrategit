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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ilm.remove_policy.Response
public final class RemovePolicyResponse implements ToJsonp {
	private final List<String> failedIndexes;

	private final Boolean hasFailures;

	// ---------------------------------------------------------------------------------------------

	protected RemovePolicyResponse(Builder builder) {

		this.failedIndexes = Objects.requireNonNull(builder.failedIndexes, "failed_indexes");
		this.hasFailures = Objects.requireNonNull(builder.hasFailures, "has_failures");

	}

	/**
	 * API name: {@code failed_indexes}
	 */
	public List<String> failedIndexes() {
		return this.failedIndexes;
	}

	/**
	 * API name: {@code has_failures}
	 */
	public Boolean hasFailures() {
		return this.hasFailures;
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

		generator.writeKey("failed_indexes");
		generator.writeStartArray();
		for (String item0 : this.failedIndexes) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("has_failures");
		generator.write(this.hasFailures);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemovePolicyResponse}.
	 */
	public static class Builder implements ObjectBuilder<RemovePolicyResponse> {
		private List<String> failedIndexes;

		private Boolean hasFailures;

		/**
		 * API name: {@code failed_indexes}
		 */
		public Builder failedIndexes(List<String> value) {
			this.failedIndexes = value;
			return this;
		}

		/**
		 * API name: {@code failed_indexes}
		 */
		public Builder failedIndexes(String... value) {
			this.failedIndexes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #failedIndexes(List)}, creating the list if needed.
		 */
		public Builder addFailedIndexes(String value) {
			if (this.failedIndexes == null) {
				this.failedIndexes = new ArrayList<>();
			}
			this.failedIndexes.add(value);
			return this;
		}

		/**
		 * API name: {@code has_failures}
		 */
		public Builder hasFailures(Boolean value) {
			this.hasFailures = value;
			return this;
		}

		/**
		 * Builds a {@link RemovePolicyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemovePolicyResponse build() {

			return new RemovePolicyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RemovePolicyResponse
	 */
	public static final JsonpDeserializer<RemovePolicyResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RemovePolicyResponse::setupRemovePolicyResponseDeserializer);

	protected static void setupRemovePolicyResponseDeserializer(
			DelegatingDeserializer<RemovePolicyResponse.Builder> op) {

		op.add(Builder::failedIndexes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"failed_indexes");
		op.add(Builder::hasFailures, JsonpDeserializer.booleanDeserializer(), "has_failures");

	}

}
