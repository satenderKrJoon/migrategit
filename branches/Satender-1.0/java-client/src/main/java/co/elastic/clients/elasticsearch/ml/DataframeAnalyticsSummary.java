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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsSummary
public final class DataframeAnalyticsSummary implements ToJsonp {
	private final String id;

	private final DataframeAnalyticsSource source;

	private final DataframeAnalyticsDestination dest;

	private final DataframeAnalysisContainer analysis;

	@Nullable
	private final String description;

	@Nullable
	private final String modelMemoryLimit;

	@Nullable
	private final Number maxNumThreads;

	@Nullable
	private final JsonValue analyzedFields;

	@Nullable
	private final Boolean allowLazyStart;

	@Nullable
	private final Number createTime;

	@Nullable
	private final String version;

	// ---------------------------------------------------------------------------------------------

	protected DataframeAnalyticsSummary(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.source = Objects.requireNonNull(builder.source, "source");
		this.dest = Objects.requireNonNull(builder.dest, "dest");
		this.analysis = Objects.requireNonNull(builder.analysis, "analysis");
		this.description = builder.description;
		this.modelMemoryLimit = builder.modelMemoryLimit;
		this.maxNumThreads = builder.maxNumThreads;
		this.analyzedFields = builder.analyzedFields;
		this.allowLazyStart = builder.allowLazyStart;
		this.createTime = builder.createTime;
		this.version = builder.version;

	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code source}
	 */
	public DataframeAnalyticsSource source() {
		return this.source;
	}

	/**
	 * API name: {@code dest}
	 */
	public DataframeAnalyticsDestination dest() {
		return this.dest;
	}

	/**
	 * API name: {@code analysis}
	 */
	public DataframeAnalysisContainer analysis() {
		return this.analysis;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code model_memory_limit}
	 */
	@Nullable
	public String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * API name: {@code max_num_threads}
	 */
	@Nullable
	public Number maxNumThreads() {
		return this.maxNumThreads;
	}

	/**
	 * API name: {@code analyzed_fields}
	 */
	@Nullable
	public JsonValue analyzedFields() {
		return this.analyzedFields;
	}

	/**
	 * API name: {@code allow_lazy_start}
	 */
	@Nullable
	public Boolean allowLazyStart() {
		return this.allowLazyStart;
	}

	/**
	 * API name: {@code create_time}
	 */
	@Nullable
	public Number createTime() {
		return this.createTime;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public String version() {
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("source");
		this.source.toJsonp(generator, mapper);

		generator.writeKey("dest");
		this.dest.toJsonp(generator, mapper);

		generator.writeKey("analysis");
		this.analysis.toJsonp(generator, mapper);

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.modelMemoryLimit != null) {

			generator.writeKey("model_memory_limit");
			generator.write(this.modelMemoryLimit);

		}
		if (this.maxNumThreads != null) {

			generator.writeKey("max_num_threads");
			generator.write(this.maxNumThreads.doubleValue());

		}
		if (this.analyzedFields != null) {

			generator.writeKey("analyzed_fields");
			generator.write(this.analyzedFields);

		}
		if (this.allowLazyStart != null) {

			generator.writeKey("allow_lazy_start");
			generator.write(this.allowLazyStart);

		}
		if (this.createTime != null) {

			generator.writeKey("create_time");
			generator.write(this.createTime.doubleValue());

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsSummary}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalyticsSummary> {
		private String id;

		private DataframeAnalyticsSource source;

		private DataframeAnalyticsDestination dest;

		private DataframeAnalysisContainer analysis;

		@Nullable
		private String description;

		@Nullable
		private String modelMemoryLimit;

		@Nullable
		private Number maxNumThreads;

		@Nullable
		private JsonValue analyzedFields;

		@Nullable
		private Boolean allowLazyStart;

		@Nullable
		private Number createTime;

		@Nullable
		private String version;

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(DataframeAnalyticsSource value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(Function<DataframeAnalyticsSource.Builder, ObjectBuilder<DataframeAnalyticsSource>> fn) {
			return this.source(fn.apply(new DataframeAnalyticsSource.Builder()).build());
		}

		/**
		 * API name: {@code dest}
		 */
		public Builder dest(DataframeAnalyticsDestination value) {
			this.dest = value;
			return this;
		}

		/**
		 * API name: {@code dest}
		 */
		public Builder dest(
				Function<DataframeAnalyticsDestination.Builder, ObjectBuilder<DataframeAnalyticsDestination>> fn) {
			return this.dest(fn.apply(new DataframeAnalyticsDestination.Builder()).build());
		}

		/**
		 * API name: {@code analysis}
		 */
		public Builder analysis(DataframeAnalysisContainer value) {
			this.analysis = value;
			return this;
		}

		/**
		 * API name: {@code analysis}
		 */
		public Builder analysis(
				Function<DataframeAnalysisContainer.Builder, ObjectBuilder<DataframeAnalysisContainer>> fn) {
			return this.analysis(fn.apply(new DataframeAnalysisContainer.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code model_memory_limit}
		 */
		public Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * API name: {@code max_num_threads}
		 */
		public Builder maxNumThreads(@Nullable Number value) {
			this.maxNumThreads = value;
			return this;
		}

		/**
		 * API name: {@code analyzed_fields}
		 */
		public Builder analyzedFields(@Nullable JsonValue value) {
			this.analyzedFields = value;
			return this;
		}

		/**
		 * API name: {@code allow_lazy_start}
		 */
		public Builder allowLazyStart(@Nullable Boolean value) {
			this.allowLazyStart = value;
			return this;
		}

		/**
		 * API name: {@code create_time}
		 */
		public Builder createTime(@Nullable Number value) {
			this.createTime = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsSummary build() {

			return new DataframeAnalyticsSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataframeAnalyticsSummary
	 */
	public static final JsonpDeserializer<DataframeAnalyticsSummary> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DataframeAnalyticsSummary::setupDataframeAnalyticsSummaryDeserializer);

	protected static void setupDataframeAnalyticsSummaryDeserializer(
			DelegatingDeserializer<DataframeAnalyticsSummary.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::source, DataframeAnalyticsSource.DESERIALIZER, "source");
		op.add(Builder::dest, DataframeAnalyticsDestination.DESERIALIZER, "dest");
		op.add(Builder::analysis, DataframeAnalysisContainer.DESERIALIZER, "analysis");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");
		op.add(Builder::maxNumThreads, JsonpDeserializer.numberDeserializer(), "max_num_threads");
		op.add(Builder::analyzedFields, JsonpDeserializer.jsonValueDeserializer(), "analyzed_fields");
		op.add(Builder::allowLazyStart, JsonpDeserializer.booleanDeserializer(), "allow_lazy_start");
		op.add(Builder::createTime, JsonpDeserializer.numberDeserializer(), "create_time");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
