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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsDestination
public final class DataframeAnalyticsDestination implements ToJsonp {
	private final String index;

	@Nullable
	private final String resultsField;

	// ---------------------------------------------------------------------------------------------

	protected DataframeAnalyticsDestination(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.resultsField = builder.resultsField;

	}

	/**
	 * Defines the destination index to store the results of the data frame
	 * analytics job.
	 *
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Defines the name of the field in which to store the results of the analysis.
	 * Defaults to ml.
	 *
	 * API name: {@code results_field}
	 */
	@Nullable
	public String resultsField() {
		return this.resultsField;
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

		generator.writeKey("index");
		generator.write(this.index);

		if (this.resultsField != null) {

			generator.writeKey("results_field");
			generator.write(this.resultsField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsDestination}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalyticsDestination> {
		private String index;

		@Nullable
		private String resultsField;

		/**
		 * Defines the destination index to store the results of the data frame
		 * analytics job.
		 *
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Defines the name of the field in which to store the results of the analysis.
		 * Defaults to ml.
		 *
		 * API name: {@code results_field}
		 */
		public Builder resultsField(@Nullable String value) {
			this.resultsField = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsDestination}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsDestination build() {

			return new DataframeAnalyticsDestination(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataframeAnalyticsDestination
	 */
	public static final JsonpDeserializer<DataframeAnalyticsDestination> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					DataframeAnalyticsDestination::setupDataframeAnalyticsDestinationDeserializer);

	protected static void setupDataframeAnalyticsDestinationDeserializer(
			DelegatingDeserializer<DataframeAnalyticsDestination.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");

	}

}
