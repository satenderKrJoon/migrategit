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

// typedef: xpack.usage.EqlFeaturesPipes
public final class EqlFeaturesPipes implements ToJsonp {
	private final Number pipeTail;

	private final Number pipeHead;

	// ---------------------------------------------------------------------------------------------

	protected EqlFeaturesPipes(Builder builder) {

		this.pipeTail = Objects.requireNonNull(builder.pipeTail, "pipe_tail");
		this.pipeHead = Objects.requireNonNull(builder.pipeHead, "pipe_head");

	}

	/**
	 * API name: {@code pipe_tail}
	 */
	public Number pipeTail() {
		return this.pipeTail;
	}

	/**
	 * API name: {@code pipe_head}
	 */
	public Number pipeHead() {
		return this.pipeHead;
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

		generator.writeKey("pipe_tail");
		generator.write(this.pipeTail.doubleValue());

		generator.writeKey("pipe_head");
		generator.write(this.pipeHead.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlFeaturesPipes}.
	 */
	public static class Builder implements ObjectBuilder<EqlFeaturesPipes> {
		private Number pipeTail;

		private Number pipeHead;

		/**
		 * API name: {@code pipe_tail}
		 */
		public Builder pipeTail(Number value) {
			this.pipeTail = value;
			return this;
		}

		/**
		 * API name: {@code pipe_head}
		 */
		public Builder pipeHead(Number value) {
			this.pipeHead = value;
			return this;
		}

		/**
		 * Builds a {@link EqlFeaturesPipes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlFeaturesPipes build() {

			return new EqlFeaturesPipes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for EqlFeaturesPipes
	 */
	public static final JsonpDeserializer<EqlFeaturesPipes> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, EqlFeaturesPipes::setupEqlFeaturesPipesDeserializer);

	protected static void setupEqlFeaturesPipesDeserializer(DelegatingDeserializer<EqlFeaturesPipes.Builder> op) {

		op.add(Builder::pipeTail, JsonpDeserializer.numberDeserializer(), "pipe_tail");
		op.add(Builder::pipeHead, JsonpDeserializer.numberDeserializer(), "pipe_head");

	}

}
