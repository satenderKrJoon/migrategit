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
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Ilm
public final class Ilm implements ToJsonp {
	private final Number policyCount;

	private final List<IlmPolicyStatistics> policyStats;

	// ---------------------------------------------------------------------------------------------

	protected Ilm(Builder builder) {

		this.policyCount = Objects.requireNonNull(builder.policyCount, "policy_count");
		this.policyStats = Objects.requireNonNull(builder.policyStats, "policy_stats");

	}

	/**
	 * API name: {@code policy_count}
	 */
	public Number policyCount() {
		return this.policyCount;
	}

	/**
	 * API name: {@code policy_stats}
	 */
	public List<IlmPolicyStatistics> policyStats() {
		return this.policyStats;
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

		generator.writeKey("policy_count");
		generator.write(this.policyCount.doubleValue());

		generator.writeKey("policy_stats");
		generator.writeStartArray();
		for (IlmPolicyStatistics item0 : this.policyStats) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Ilm}.
	 */
	public static class Builder implements ObjectBuilder<Ilm> {
		private Number policyCount;

		private List<IlmPolicyStatistics> policyStats;

		/**
		 * API name: {@code policy_count}
		 */
		public Builder policyCount(Number value) {
			this.policyCount = value;
			return this;
		}

		/**
		 * API name: {@code policy_stats}
		 */
		public Builder policyStats(List<IlmPolicyStatistics> value) {
			this.policyStats = value;
			return this;
		}

		/**
		 * API name: {@code policy_stats}
		 */
		public Builder policyStats(IlmPolicyStatistics... value) {
			this.policyStats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #policyStats(List)}, creating the list if needed.
		 */
		public Builder addPolicyStats(IlmPolicyStatistics value) {
			if (this.policyStats == null) {
				this.policyStats = new ArrayList<>();
			}
			this.policyStats.add(value);
			return this;
		}

		/**
		 * Set {@link #policyStats(List)} to a singleton list.
		 */
		public Builder policyStats(Function<IlmPolicyStatistics.Builder, ObjectBuilder<IlmPolicyStatistics>> fn) {
			return this.policyStats(fn.apply(new IlmPolicyStatistics.Builder()).build());
		}

		/**
		 * Add a value to {@link #policyStats(List)}, creating the list if needed.
		 */
		public Builder addPolicyStats(Function<IlmPolicyStatistics.Builder, ObjectBuilder<IlmPolicyStatistics>> fn) {
			return this.addPolicyStats(fn.apply(new IlmPolicyStatistics.Builder()).build());
		}

		/**
		 * Builds a {@link Ilm}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Ilm build() {

			return new Ilm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Ilm
	 */
	public static final JsonpDeserializer<Ilm> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Ilm::setupIlmDeserializer);

	protected static void setupIlmDeserializer(DelegatingDeserializer<Ilm.Builder> op) {

		op.add(Builder::policyCount, JsonpDeserializer.numberDeserializer(), "policy_count");
		op.add(Builder::policyStats, JsonpDeserializer.arrayDeserializer(IlmPolicyStatistics.DESERIALIZER),
				"policy_stats");

	}

}
