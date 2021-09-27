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

package co.elastic.clients.elasticsearch.cluster.stats;

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

// typedef: cluster.stats.ClusterOperatingSystem
public final class ClusterOperatingSystem implements ToJsonp {
	private final Number allocatedProcessors;

	private final Number availableProcessors;

	private final OperatingSystemMemoryInfo mem;

	private final List<ClusterOperatingSystemName> names;

	private final List<ClusterOperatingSystemName> prettyNames;

	@Nullable
	private final List<ClusterOperatingSystemArchitecture> architectures;

	// ---------------------------------------------------------------------------------------------

	protected ClusterOperatingSystem(Builder builder) {

		this.allocatedProcessors = Objects.requireNonNull(builder.allocatedProcessors, "allocated_processors");
		this.availableProcessors = Objects.requireNonNull(builder.availableProcessors, "available_processors");
		this.mem = Objects.requireNonNull(builder.mem, "mem");
		this.names = Objects.requireNonNull(builder.names, "names");
		this.prettyNames = Objects.requireNonNull(builder.prettyNames, "pretty_names");
		this.architectures = builder.architectures;

	}

	/**
	 * API name: {@code allocated_processors}
	 */
	public Number allocatedProcessors() {
		return this.allocatedProcessors;
	}

	/**
	 * API name: {@code available_processors}
	 */
	public Number availableProcessors() {
		return this.availableProcessors;
	}

	/**
	 * API name: {@code mem}
	 */
	public OperatingSystemMemoryInfo mem() {
		return this.mem;
	}

	/**
	 * API name: {@code names}
	 */
	public List<ClusterOperatingSystemName> names() {
		return this.names;
	}

	/**
	 * API name: {@code pretty_names}
	 */
	public List<ClusterOperatingSystemName> prettyNames() {
		return this.prettyNames;
	}

	/**
	 * API name: {@code architectures}
	 */
	@Nullable
	public List<ClusterOperatingSystemArchitecture> architectures() {
		return this.architectures;
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

		generator.writeKey("allocated_processors");
		generator.write(this.allocatedProcessors.doubleValue());

		generator.writeKey("available_processors");
		generator.write(this.availableProcessors.doubleValue());

		generator.writeKey("mem");
		this.mem.toJsonp(generator, mapper);

		generator.writeKey("names");
		generator.writeStartArray();
		for (ClusterOperatingSystemName item0 : this.names) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("pretty_names");
		generator.writeStartArray();
		for (ClusterOperatingSystemName item0 : this.prettyNames) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		if (this.architectures != null) {

			generator.writeKey("architectures");
			generator.writeStartArray();
			for (ClusterOperatingSystemArchitecture item0 : this.architectures) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterOperatingSystem}.
	 */
	public static class Builder implements ObjectBuilder<ClusterOperatingSystem> {
		private Number allocatedProcessors;

		private Number availableProcessors;

		private OperatingSystemMemoryInfo mem;

		private List<ClusterOperatingSystemName> names;

		private List<ClusterOperatingSystemName> prettyNames;

		@Nullable
		private List<ClusterOperatingSystemArchitecture> architectures;

		/**
		 * API name: {@code allocated_processors}
		 */
		public Builder allocatedProcessors(Number value) {
			this.allocatedProcessors = value;
			return this;
		}

		/**
		 * API name: {@code available_processors}
		 */
		public Builder availableProcessors(Number value) {
			this.availableProcessors = value;
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(OperatingSystemMemoryInfo value) {
			this.mem = value;
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(Function<OperatingSystemMemoryInfo.Builder, ObjectBuilder<OperatingSystemMemoryInfo>> fn) {
			return this.mem(fn.apply(new OperatingSystemMemoryInfo.Builder()).build());
		}

		/**
		 * API name: {@code names}
		 */
		public Builder names(List<ClusterOperatingSystemName> value) {
			this.names = value;
			return this;
		}

		/**
		 * API name: {@code names}
		 */
		public Builder names(ClusterOperatingSystemName... value) {
			this.names = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #names(List)}, creating the list if needed.
		 */
		public Builder addNames(ClusterOperatingSystemName value) {
			if (this.names == null) {
				this.names = new ArrayList<>();
			}
			this.names.add(value);
			return this;
		}

		/**
		 * Set {@link #names(List)} to a singleton list.
		 */
		public Builder names(
				Function<ClusterOperatingSystemName.Builder, ObjectBuilder<ClusterOperatingSystemName>> fn) {
			return this.names(fn.apply(new ClusterOperatingSystemName.Builder()).build());
		}

		/**
		 * Add a value to {@link #names(List)}, creating the list if needed.
		 */
		public Builder addNames(
				Function<ClusterOperatingSystemName.Builder, ObjectBuilder<ClusterOperatingSystemName>> fn) {
			return this.addNames(fn.apply(new ClusterOperatingSystemName.Builder()).build());
		}

		/**
		 * API name: {@code pretty_names}
		 */
		public Builder prettyNames(List<ClusterOperatingSystemName> value) {
			this.prettyNames = value;
			return this;
		}

		/**
		 * API name: {@code pretty_names}
		 */
		public Builder prettyNames(ClusterOperatingSystemName... value) {
			this.prettyNames = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #prettyNames(List)}, creating the list if needed.
		 */
		public Builder addPrettyNames(ClusterOperatingSystemName value) {
			if (this.prettyNames == null) {
				this.prettyNames = new ArrayList<>();
			}
			this.prettyNames.add(value);
			return this;
		}

		/**
		 * Set {@link #prettyNames(List)} to a singleton list.
		 */
		public Builder prettyNames(
				Function<ClusterOperatingSystemName.Builder, ObjectBuilder<ClusterOperatingSystemName>> fn) {
			return this.prettyNames(fn.apply(new ClusterOperatingSystemName.Builder()).build());
		}

		/**
		 * Add a value to {@link #prettyNames(List)}, creating the list if needed.
		 */
		public Builder addPrettyNames(
				Function<ClusterOperatingSystemName.Builder, ObjectBuilder<ClusterOperatingSystemName>> fn) {
			return this.addPrettyNames(fn.apply(new ClusterOperatingSystemName.Builder()).build());
		}

		/**
		 * API name: {@code architectures}
		 */
		public Builder architectures(@Nullable List<ClusterOperatingSystemArchitecture> value) {
			this.architectures = value;
			return this;
		}

		/**
		 * API name: {@code architectures}
		 */
		public Builder architectures(ClusterOperatingSystemArchitecture... value) {
			this.architectures = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #architectures(List)}, creating the list if needed.
		 */
		public Builder addArchitectures(ClusterOperatingSystemArchitecture value) {
			if (this.architectures == null) {
				this.architectures = new ArrayList<>();
			}
			this.architectures.add(value);
			return this;
		}

		/**
		 * Set {@link #architectures(List)} to a singleton list.
		 */
		public Builder architectures(
				Function<ClusterOperatingSystemArchitecture.Builder, ObjectBuilder<ClusterOperatingSystemArchitecture>> fn) {
			return this.architectures(fn.apply(new ClusterOperatingSystemArchitecture.Builder()).build());
		}

		/**
		 * Add a value to {@link #architectures(List)}, creating the list if needed.
		 */
		public Builder addArchitectures(
				Function<ClusterOperatingSystemArchitecture.Builder, ObjectBuilder<ClusterOperatingSystemArchitecture>> fn) {
			return this.addArchitectures(fn.apply(new ClusterOperatingSystemArchitecture.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterOperatingSystem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterOperatingSystem build() {

			return new ClusterOperatingSystem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterOperatingSystem
	 */
	public static final JsonpDeserializer<ClusterOperatingSystem> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterOperatingSystem::setupClusterOperatingSystemDeserializer);

	protected static void setupClusterOperatingSystemDeserializer(
			DelegatingDeserializer<ClusterOperatingSystem.Builder> op) {

		op.add(Builder::allocatedProcessors, JsonpDeserializer.numberDeserializer(), "allocated_processors");
		op.add(Builder::availableProcessors, JsonpDeserializer.numberDeserializer(), "available_processors");
		op.add(Builder::mem, OperatingSystemMemoryInfo.DESERIALIZER, "mem");
		op.add(Builder::names, JsonpDeserializer.arrayDeserializer(ClusterOperatingSystemName.DESERIALIZER), "names");
		op.add(Builder::prettyNames, JsonpDeserializer.arrayDeserializer(ClusterOperatingSystemName.DESERIALIZER),
				"pretty_names");
		op.add(Builder::architectures,
				JsonpDeserializer.arrayDeserializer(ClusterOperatingSystemArchitecture.DESERIALIZER), "architectures");

	}

}
