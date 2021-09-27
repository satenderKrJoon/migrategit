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

package co.elastic.clients.elasticsearch.license.post;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: license.post.Acknowledgement
public final class Acknowledgement implements ToJsonp {
	private final List<String> license;

	private final String message;

	// ---------------------------------------------------------------------------------------------

	protected Acknowledgement(Builder builder) {

		this.license = Objects.requireNonNull(builder.license, "license");
		this.message = Objects.requireNonNull(builder.message, "message");

	}

	/**
	 * API name: {@code license}
	 */
	public List<String> license() {
		return this.license;
	}

	/**
	 * API name: {@code message}
	 */
	public String message() {
		return this.message;
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

		generator.writeKey("license");
		generator.writeStartArray();
		for (String item0 : this.license) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("message");
		generator.write(this.message);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Acknowledgement}.
	 */
	public static class Builder implements ObjectBuilder<Acknowledgement> {
		private List<String> license;

		private String message;

		/**
		 * API name: {@code license}
		 */
		public Builder license(List<String> value) {
			this.license = value;
			return this;
		}

		/**
		 * API name: {@code license}
		 */
		public Builder license(String... value) {
			this.license = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #license(List)}, creating the list if needed.
		 */
		public Builder addLicense(String value) {
			if (this.license == null) {
				this.license = new ArrayList<>();
			}
			this.license.add(value);
			return this;
		}

		/**
		 * API name: {@code message}
		 */
		public Builder message(String value) {
			this.message = value;
			return this;
		}

		/**
		 * Builds a {@link Acknowledgement}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Acknowledgement build() {

			return new Acknowledgement(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Acknowledgement
	 */
	public static final JsonpDeserializer<Acknowledgement> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Acknowledgement::setupAcknowledgementDeserializer);

	protected static void setupAcknowledgementDeserializer(DelegatingDeserializer<Acknowledgement.Builder> op) {

		op.add(Builder::license, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"license");
		op.add(Builder::message, JsonpDeserializer.stringDeserializer(), "message");

	}

}
