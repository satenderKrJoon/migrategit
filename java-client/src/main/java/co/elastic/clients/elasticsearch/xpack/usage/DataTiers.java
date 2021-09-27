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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.DataTiers
public final class DataTiers extends Base {
	private final DataTierPhaseStatistics dataWarm;

	@Nullable
	private final DataTierPhaseStatistics dataFrozen;

	private final DataTierPhaseStatistics dataCold;

	private final DataTierPhaseStatistics dataContent;

	private final DataTierPhaseStatistics dataHot;

	// ---------------------------------------------------------------------------------------------

	protected DataTiers(Builder builder) {
		super(builder);
		this.dataWarm = Objects.requireNonNull(builder.dataWarm, "data_warm");
		this.dataFrozen = builder.dataFrozen;
		this.dataCold = Objects.requireNonNull(builder.dataCold, "data_cold");
		this.dataContent = Objects.requireNonNull(builder.dataContent, "data_content");
		this.dataHot = Objects.requireNonNull(builder.dataHot, "data_hot");

	}

	/**
	 * API name: {@code data_warm}
	 */
	public DataTierPhaseStatistics dataWarm() {
		return this.dataWarm;
	}

	/**
	 * API name: {@code data_frozen}
	 */
	@Nullable
	public DataTierPhaseStatistics dataFrozen() {
		return this.dataFrozen;
	}

	/**
	 * API name: {@code data_cold}
	 */
	public DataTierPhaseStatistics dataCold() {
		return this.dataCold;
	}

	/**
	 * API name: {@code data_content}
	 */
	public DataTierPhaseStatistics dataContent() {
		return this.dataContent;
	}

	/**
	 * API name: {@code data_hot}
	 */
	public DataTierPhaseStatistics dataHot() {
		return this.dataHot;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("data_warm");
		this.dataWarm.toJsonp(generator, mapper);

		if (this.dataFrozen != null) {

			generator.writeKey("data_frozen");
			this.dataFrozen.toJsonp(generator, mapper);

		}

		generator.writeKey("data_cold");
		this.dataCold.toJsonp(generator, mapper);

		generator.writeKey("data_content");
		this.dataContent.toJsonp(generator, mapper);

		generator.writeKey("data_hot");
		this.dataHot.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataTiers}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<DataTiers> {
		private DataTierPhaseStatistics dataWarm;

		@Nullable
		private DataTierPhaseStatistics dataFrozen;

		private DataTierPhaseStatistics dataCold;

		private DataTierPhaseStatistics dataContent;

		private DataTierPhaseStatistics dataHot;

		/**
		 * API name: {@code data_warm}
		 */
		public Builder dataWarm(DataTierPhaseStatistics value) {
			this.dataWarm = value;
			return this;
		}

		/**
		 * API name: {@code data_warm}
		 */
		public Builder dataWarm(Function<DataTierPhaseStatistics.Builder, ObjectBuilder<DataTierPhaseStatistics>> fn) {
			return this.dataWarm(fn.apply(new DataTierPhaseStatistics.Builder()).build());
		}

		/**
		 * API name: {@code data_frozen}
		 */
		public Builder dataFrozen(@Nullable DataTierPhaseStatistics value) {
			this.dataFrozen = value;
			return this;
		}

		/**
		 * API name: {@code data_frozen}
		 */
		public Builder dataFrozen(
				Function<DataTierPhaseStatistics.Builder, ObjectBuilder<DataTierPhaseStatistics>> fn) {
			return this.dataFrozen(fn.apply(new DataTierPhaseStatistics.Builder()).build());
		}

		/**
		 * API name: {@code data_cold}
		 */
		public Builder dataCold(DataTierPhaseStatistics value) {
			this.dataCold = value;
			return this;
		}

		/**
		 * API name: {@code data_cold}
		 */
		public Builder dataCold(Function<DataTierPhaseStatistics.Builder, ObjectBuilder<DataTierPhaseStatistics>> fn) {
			return this.dataCold(fn.apply(new DataTierPhaseStatistics.Builder()).build());
		}

		/**
		 * API name: {@code data_content}
		 */
		public Builder dataContent(DataTierPhaseStatistics value) {
			this.dataContent = value;
			return this;
		}

		/**
		 * API name: {@code data_content}
		 */
		public Builder dataContent(
				Function<DataTierPhaseStatistics.Builder, ObjectBuilder<DataTierPhaseStatistics>> fn) {
			return this.dataContent(fn.apply(new DataTierPhaseStatistics.Builder()).build());
		}

		/**
		 * API name: {@code data_hot}
		 */
		public Builder dataHot(DataTierPhaseStatistics value) {
			this.dataHot = value;
			return this;
		}

		/**
		 * API name: {@code data_hot}
		 */
		public Builder dataHot(Function<DataTierPhaseStatistics.Builder, ObjectBuilder<DataTierPhaseStatistics>> fn) {
			return this.dataHot(fn.apply(new DataTierPhaseStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataTiers}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataTiers build() {

			return new DataTiers(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataTiers
	 */
	public static final JsonpDeserializer<DataTiers> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DataTiers::setupDataTiersDeserializer);

	protected static void setupDataTiersDeserializer(DelegatingDeserializer<DataTiers.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::dataWarm, DataTierPhaseStatistics.DESERIALIZER, "data_warm");
		op.add(Builder::dataFrozen, DataTierPhaseStatistics.DESERIALIZER, "data_frozen");
		op.add(Builder::dataCold, DataTierPhaseStatistics.DESERIALIZER, "data_cold");
		op.add(Builder::dataContent, DataTierPhaseStatistics.DESERIALIZER, "data_content");
		op.add(Builder::dataHot, DataTierPhaseStatistics.DESERIALIZER, "data_hot");

	}

}
