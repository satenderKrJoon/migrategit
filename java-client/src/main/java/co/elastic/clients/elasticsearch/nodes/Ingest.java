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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Ingest
public final class Ingest implements ToJsonp {
	private final Map<String, IngestTotal> pipelines;

	private final IngestTotal total;

	// ---------------------------------------------------------------------------------------------

	protected Ingest(Builder builder) {

		this.pipelines = Objects.requireNonNull(builder.pipelines, "pipelines");
		this.total = Objects.requireNonNull(builder.total, "total");

	}

	/**
	 * API name: {@code pipelines}
	 */
	public Map<String, IngestTotal> pipelines() {
		return this.pipelines;
	}

	/**
	 * API name: {@code total}
	 */
	public IngestTotal total() {
		return this.total;
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

		generator.writeKey("pipelines");
		generator.writeStartObject();
		for (Map.Entry<String, IngestTotal> item0 : this.pipelines.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("total");
		this.total.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Ingest}.
	 */
	public static class Builder implements ObjectBuilder<Ingest> {
		private Map<String, IngestTotal> pipelines;

		private IngestTotal total;

		/**
		 * API name: {@code pipelines}
		 */
		public Builder pipelines(Map<String, IngestTotal> value) {
			this.pipelines = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #pipelines(Map)}, creating the map if needed.
		 */
		public Builder putPipelines(String key, IngestTotal value) {
			if (this.pipelines == null) {
				this.pipelines = new HashMap<>();
			}
			this.pipelines.put(key, value);
			return this;
		}

		/**
		 * Set {@link #pipelines(Map)} to a singleton map.
		 */
		public Builder pipelines(String key, Function<IngestTotal.Builder, ObjectBuilder<IngestTotal>> fn) {
			return this.pipelines(Collections.singletonMap(key, fn.apply(new IngestTotal.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #pipelines(Map)}, creating the map if needed.
		 */
		public Builder putPipelines(String key, Function<IngestTotal.Builder, ObjectBuilder<IngestTotal>> fn) {
			return this.putPipelines(key, fn.apply(new IngestTotal.Builder()).build());
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(IngestTotal value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Function<IngestTotal.Builder, ObjectBuilder<IngestTotal>> fn) {
			return this.total(fn.apply(new IngestTotal.Builder()).build());
		}

		/**
		 * Builds a {@link Ingest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Ingest build() {

			return new Ingest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Ingest
	 */
	public static final JsonpDeserializer<Ingest> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Ingest::setupIngestDeserializer);

	protected static void setupIngestDeserializer(DelegatingDeserializer<Ingest.Builder> op) {

		op.add(Builder::pipelines, JsonpDeserializer.stringMapDeserializer(IngestTotal.DESERIALIZER), "pipelines");
		op.add(Builder::total, IngestTotal.DESERIALIZER, "total");

	}

}
