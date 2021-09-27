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

package co.elastic.clients.elasticsearch.rollup.get_rollup_job;

import co.elastic.clients.elasticsearch.rollup.FieldMetric;
import co.elastic.clients.elasticsearch.rollup.Groupings;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.get_rollup_job.RollupJobConfiguration
public final class RollupJobConfiguration implements ToJsonp {
	private final String cron;

	private final Groupings groups;

	private final String id;

	private final String indexPattern;

	private final List<FieldMetric> metrics;

	private final Number pageSize;

	private final String rollupIndex;

	private final JsonValue timeout;

	// ---------------------------------------------------------------------------------------------

	protected RollupJobConfiguration(Builder builder) {

		this.cron = Objects.requireNonNull(builder.cron, "cron");
		this.groups = Objects.requireNonNull(builder.groups, "groups");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.indexPattern = Objects.requireNonNull(builder.indexPattern, "index_pattern");
		this.metrics = Objects.requireNonNull(builder.metrics, "metrics");
		this.pageSize = Objects.requireNonNull(builder.pageSize, "page_size");
		this.rollupIndex = Objects.requireNonNull(builder.rollupIndex, "rollup_index");
		this.timeout = Objects.requireNonNull(builder.timeout, "timeout");

	}

	/**
	 * API name: {@code cron}
	 */
	public String cron() {
		return this.cron;
	}

	/**
	 * API name: {@code groups}
	 */
	public Groupings groups() {
		return this.groups;
	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code index_pattern}
	 */
	public String indexPattern() {
		return this.indexPattern;
	}

	/**
	 * API name: {@code metrics}
	 */
	public List<FieldMetric> metrics() {
		return this.metrics;
	}

	/**
	 * API name: {@code page_size}
	 */
	public Number pageSize() {
		return this.pageSize;
	}

	/**
	 * API name: {@code rollup_index}
	 */
	public String rollupIndex() {
		return this.rollupIndex;
	}

	/**
	 * API name: {@code timeout}
	 */
	public JsonValue timeout() {
		return this.timeout;
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

		generator.writeKey("cron");
		generator.write(this.cron);

		generator.writeKey("groups");
		this.groups.toJsonp(generator, mapper);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("index_pattern");
		generator.write(this.indexPattern);

		generator.writeKey("metrics");
		generator.writeStartArray();
		for (FieldMetric item0 : this.metrics) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("page_size");
		generator.write(this.pageSize.doubleValue());

		generator.writeKey("rollup_index");
		generator.write(this.rollupIndex);

		generator.writeKey("timeout");
		generator.write(this.timeout);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupJobConfiguration}.
	 */
	public static class Builder implements ObjectBuilder<RollupJobConfiguration> {
		private String cron;

		private Groupings groups;

		private String id;

		private String indexPattern;

		private List<FieldMetric> metrics;

		private Number pageSize;

		private String rollupIndex;

		private JsonValue timeout;

		/**
		 * API name: {@code cron}
		 */
		public Builder cron(String value) {
			this.cron = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(Groupings value) {
			this.groups = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(Function<Groupings.Builder, ObjectBuilder<Groupings>> fn) {
			return this.groups(fn.apply(new Groupings.Builder()).build());
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code index_pattern}
		 */
		public Builder indexPattern(String value) {
			this.indexPattern = value;
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		public Builder metrics(List<FieldMetric> value) {
			this.metrics = value;
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		public Builder metrics(FieldMetric... value) {
			this.metrics = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #metrics(List)}, creating the list if needed.
		 */
		public Builder addMetrics(FieldMetric value) {
			if (this.metrics == null) {
				this.metrics = new ArrayList<>();
			}
			this.metrics.add(value);
			return this;
		}

		/**
		 * Set {@link #metrics(List)} to a singleton list.
		 */
		public Builder metrics(Function<FieldMetric.Builder, ObjectBuilder<FieldMetric>> fn) {
			return this.metrics(fn.apply(new FieldMetric.Builder()).build());
		}

		/**
		 * Add a value to {@link #metrics(List)}, creating the list if needed.
		 */
		public Builder addMetrics(Function<FieldMetric.Builder, ObjectBuilder<FieldMetric>> fn) {
			return this.addMetrics(fn.apply(new FieldMetric.Builder()).build());
		}

		/**
		 * API name: {@code page_size}
		 */
		public Builder pageSize(Number value) {
			this.pageSize = value;
			return this;
		}

		/**
		 * API name: {@code rollup_index}
		 */
		public Builder rollupIndex(String value) {
			this.rollupIndex = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link RollupJobConfiguration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupJobConfiguration build() {

			return new RollupJobConfiguration(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RollupJobConfiguration
	 */
	public static final JsonpDeserializer<RollupJobConfiguration> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RollupJobConfiguration::setupRollupJobConfigurationDeserializer);

	protected static void setupRollupJobConfigurationDeserializer(
			DelegatingDeserializer<RollupJobConfiguration.Builder> op) {

		op.add(Builder::cron, JsonpDeserializer.stringDeserializer(), "cron");
		op.add(Builder::groups, Groupings.DESERIALIZER, "groups");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::indexPattern, JsonpDeserializer.stringDeserializer(), "index_pattern");
		op.add(Builder::metrics, JsonpDeserializer.arrayDeserializer(FieldMetric.DESERIALIZER), "metrics");
		op.add(Builder::pageSize, JsonpDeserializer.numberDeserializer(), "page_size");
		op.add(Builder::rollupIndex, JsonpDeserializer.stringDeserializer(), "rollup_index");
		op.add(Builder::timeout, JsonpDeserializer.jsonValueDeserializer(), "timeout");

	}

}
