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

// typedef: ml._types.Influence
public final class Influence implements ToJsonp {
	private final String influencerFieldName;

	private final List<String> influencerFieldValues;

	// ---------------------------------------------------------------------------------------------

	protected Influence(Builder builder) {

		this.influencerFieldName = Objects.requireNonNull(builder.influencerFieldName, "influencer_field_name");
		this.influencerFieldValues = Objects.requireNonNull(builder.influencerFieldValues, "influencer_field_values");

	}

	/**
	 * API name: {@code influencer_field_name}
	 */
	public String influencerFieldName() {
		return this.influencerFieldName;
	}

	/**
	 * API name: {@code influencer_field_values}
	 */
	public List<String> influencerFieldValues() {
		return this.influencerFieldValues;
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

		generator.writeKey("influencer_field_name");
		generator.write(this.influencerFieldName);

		generator.writeKey("influencer_field_values");
		generator.writeStartArray();
		for (String item0 : this.influencerFieldValues) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Influence}.
	 */
	public static class Builder implements ObjectBuilder<Influence> {
		private String influencerFieldName;

		private List<String> influencerFieldValues;

		/**
		 * API name: {@code influencer_field_name}
		 */
		public Builder influencerFieldName(String value) {
			this.influencerFieldName = value;
			return this;
		}

		/**
		 * API name: {@code influencer_field_values}
		 */
		public Builder influencerFieldValues(List<String> value) {
			this.influencerFieldValues = value;
			return this;
		}

		/**
		 * API name: {@code influencer_field_values}
		 */
		public Builder influencerFieldValues(String... value) {
			this.influencerFieldValues = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #influencerFieldValues(List)}, creating the list if
		 * needed.
		 */
		public Builder addInfluencerFieldValues(String value) {
			if (this.influencerFieldValues == null) {
				this.influencerFieldValues = new ArrayList<>();
			}
			this.influencerFieldValues.add(value);
			return this;
		}

		/**
		 * Builds a {@link Influence}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Influence build() {

			return new Influence(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Influence
	 */
	public static final JsonpDeserializer<Influence> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Influence::setupInfluenceDeserializer);

	protected static void setupInfluenceDeserializer(DelegatingDeserializer<Influence.Builder> op) {

		op.add(Builder::influencerFieldName, JsonpDeserializer.stringDeserializer(), "influencer_field_name");
		op.add(Builder::influencerFieldValues,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "influencer_field_values");

	}

}
