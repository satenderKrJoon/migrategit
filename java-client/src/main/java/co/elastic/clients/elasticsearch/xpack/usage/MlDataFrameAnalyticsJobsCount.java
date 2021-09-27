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

// typedef: xpack.usage.MlDataFrameAnalyticsJobsCount
public final class MlDataFrameAnalyticsJobsCount implements ToJsonp {
	private final Number count;

	// ---------------------------------------------------------------------------------------------

	protected MlDataFrameAnalyticsJobsCount(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDataFrameAnalyticsJobsCount}.
	 */
	public static class Builder implements ObjectBuilder<MlDataFrameAnalyticsJobsCount> {
		private Number count;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * Builds a {@link MlDataFrameAnalyticsJobsCount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDataFrameAnalyticsJobsCount build() {

			return new MlDataFrameAnalyticsJobsCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MlDataFrameAnalyticsJobsCount
	 */
	public static final JsonpDeserializer<MlDataFrameAnalyticsJobsCount> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					MlDataFrameAnalyticsJobsCount::setupMlDataFrameAnalyticsJobsCountDeserializer);

	protected static void setupMlDataFrameAnalyticsJobsCountDeserializer(
			DelegatingDeserializer<MlDataFrameAnalyticsJobsCount.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");

	}

}
