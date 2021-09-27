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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.WatcherActionTotals
public final class WatcherActionTotals implements ToJsonp {
	private final Number total;

	private final Number totalTimeInMs;

	// ---------------------------------------------------------------------------------------------

	protected WatcherActionTotals(Builder builder) {

		this.total = Objects.requireNonNull(builder.total, "total");
		this.totalTimeInMs = Objects.requireNonNull(builder.totalTimeInMs, "total_time_in_ms");

	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code total_time_in_ms}
	 */
	public Number totalTimeInMs() {
		return this.totalTimeInMs;
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

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		generator.writeKey("total_time_in_ms");
		generator.write(this.totalTimeInMs.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherActionTotals}.
	 */
	public static class Builder implements ObjectBuilder<WatcherActionTotals> {
		private Number total;

		private Number totalTimeInMs;

		/**
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_time_in_ms}
		 */
		public Builder totalTimeInMs(Number value) {
			this.totalTimeInMs = value;
			return this;
		}

		/**
		 * Builds a {@link WatcherActionTotals}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherActionTotals build() {

			return new WatcherActionTotals(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for WatcherActionTotals
	 */
	public static final JsonpDeserializer<WatcherActionTotals> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, WatcherActionTotals::setupWatcherActionTotalsDeserializer);

	protected static void setupWatcherActionTotalsDeserializer(DelegatingDeserializer<WatcherActionTotals.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::totalTimeInMs, JsonpDeserializer.numberDeserializer(), "total_time_in_ms");

	}

}
