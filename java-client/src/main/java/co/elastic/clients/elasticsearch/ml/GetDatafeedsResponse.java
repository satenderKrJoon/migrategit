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
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_datafeeds.Response
public final class GetDatafeedsResponse implements ToJsonp {
	private final Number count;

	private final List<Datafeed> datafeeds;

	// ---------------------------------------------------------------------------------------------

	protected GetDatafeedsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.datafeeds = Objects.requireNonNull(builder.datafeeds, "datafeeds");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code datafeeds}
	 */
	public List<Datafeed> datafeeds() {
		return this.datafeeds;
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

		generator.writeKey("datafeeds");
		generator.writeStartArray();
		for (Datafeed item0 : this.datafeeds) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDatafeedsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetDatafeedsResponse> {
		private Number count;

		private List<Datafeed> datafeeds;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code datafeeds}
		 */
		public Builder datafeeds(List<Datafeed> value) {
			this.datafeeds = value;
			return this;
		}

		/**
		 * API name: {@code datafeeds}
		 */
		public Builder datafeeds(Datafeed... value) {
			this.datafeeds = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #datafeeds(List)}, creating the list if needed.
		 */
		public Builder addDatafeeds(Datafeed value) {
			if (this.datafeeds == null) {
				this.datafeeds = new ArrayList<>();
			}
			this.datafeeds.add(value);
			return this;
		}

		/**
		 * Set {@link #datafeeds(List)} to a singleton list.
		 */
		public Builder datafeeds(Function<Datafeed.Builder, ObjectBuilder<Datafeed>> fn) {
			return this.datafeeds(fn.apply(new Datafeed.Builder()).build());
		}

		/**
		 * Add a value to {@link #datafeeds(List)}, creating the list if needed.
		 */
		public Builder addDatafeeds(Function<Datafeed.Builder, ObjectBuilder<Datafeed>> fn) {
			return this.addDatafeeds(fn.apply(new Datafeed.Builder()).build());
		}

		/**
		 * Builds a {@link GetDatafeedsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDatafeedsResponse build() {

			return new GetDatafeedsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetDatafeedsResponse
	 */
	public static final JsonpDeserializer<GetDatafeedsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetDatafeedsResponse::setupGetDatafeedsResponseDeserializer);

	protected static void setupGetDatafeedsResponseDeserializer(
			DelegatingDeserializer<GetDatafeedsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::datafeeds, JsonpDeserializer.arrayDeserializer(Datafeed.DESERIALIZER), "datafeeds");

	}

}
