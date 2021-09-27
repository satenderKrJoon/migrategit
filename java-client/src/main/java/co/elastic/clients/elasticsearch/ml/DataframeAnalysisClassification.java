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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisClassification
public final class DataframeAnalysisClassification extends DataframeAnalysis {
	@Nullable
	private final String classAssignmentObjective;

	@Nullable
	private final Number numTopClasses;

	// ---------------------------------------------------------------------------------------------

	protected DataframeAnalysisClassification(Builder builder) {
		super(builder);
		this.classAssignmentObjective = builder.classAssignmentObjective;
		this.numTopClasses = builder.numTopClasses;

	}

	/**
	 * API name: {@code class_assignment_objective}
	 */
	@Nullable
	public String classAssignmentObjective() {
		return this.classAssignmentObjective;
	}

	/**
	 * API name: {@code num_top_classes}
	 */
	@Nullable
	public Number numTopClasses() {
		return this.numTopClasses;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.classAssignmentObjective != null) {

			generator.writeKey("class_assignment_objective");
			generator.write(this.classAssignmentObjective);

		}
		if (this.numTopClasses != null) {

			generator.writeKey("num_top_classes");
			generator.write(this.numTopClasses.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalysisClassification}.
	 */
	public static class Builder extends DataframeAnalysis.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataframeAnalysisClassification> {
		@Nullable
		private String classAssignmentObjective;

		@Nullable
		private Number numTopClasses;

		/**
		 * API name: {@code class_assignment_objective}
		 */
		public Builder classAssignmentObjective(@Nullable String value) {
			this.classAssignmentObjective = value;
			return this;
		}

		/**
		 * API name: {@code num_top_classes}
		 */
		public Builder numTopClasses(@Nullable Number value) {
			this.numTopClasses = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalysisClassification}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalysisClassification build() {

			return new DataframeAnalysisClassification(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataframeAnalysisClassification
	 */
	public static final JsonpDeserializer<DataframeAnalysisClassification> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					DataframeAnalysisClassification::setupDataframeAnalysisClassificationDeserializer);

	protected static void setupDataframeAnalysisClassificationDeserializer(
			DelegatingDeserializer<DataframeAnalysisClassification.Builder> op) {
		DataframeAnalysis.setupDataframeAnalysisDeserializer(op);
		op.add(Builder::classAssignmentObjective, JsonpDeserializer.stringDeserializer(), "class_assignment_objective");
		op.add(Builder::numTopClasses, JsonpDeserializer.numberDeserializer(), "num_top_classes");

	}

}
