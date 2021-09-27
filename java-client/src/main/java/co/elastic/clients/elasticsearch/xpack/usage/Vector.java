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
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.Vector
public final class Vector extends Base {
	private final Number denseVectorDimsAvgCount;

	private final Number denseVectorFieldsCount;

	@Nullable
	private final Number sparseVectorFieldsCount;

	// ---------------------------------------------------------------------------------------------

	protected Vector(Builder builder) {
		super(builder);
		this.denseVectorDimsAvgCount = Objects.requireNonNull(builder.denseVectorDimsAvgCount,
				"dense_vector_dims_avg_count");
		this.denseVectorFieldsCount = Objects.requireNonNull(builder.denseVectorFieldsCount,
				"dense_vector_fields_count");
		this.sparseVectorFieldsCount = builder.sparseVectorFieldsCount;

	}

	/**
	 * API name: {@code dense_vector_dims_avg_count}
	 */
	public Number denseVectorDimsAvgCount() {
		return this.denseVectorDimsAvgCount;
	}

	/**
	 * API name: {@code dense_vector_fields_count}
	 */
	public Number denseVectorFieldsCount() {
		return this.denseVectorFieldsCount;
	}

	/**
	 * API name: {@code sparse_vector_fields_count}
	 */
	@Nullable
	public Number sparseVectorFieldsCount() {
		return this.sparseVectorFieldsCount;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("dense_vector_dims_avg_count");
		generator.write(this.denseVectorDimsAvgCount.doubleValue());

		generator.writeKey("dense_vector_fields_count");
		generator.write(this.denseVectorFieldsCount.doubleValue());

		if (this.sparseVectorFieldsCount != null) {

			generator.writeKey("sparse_vector_fields_count");
			generator.write(this.sparseVectorFieldsCount.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Vector}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Vector> {
		private Number denseVectorDimsAvgCount;

		private Number denseVectorFieldsCount;

		@Nullable
		private Number sparseVectorFieldsCount;

		/**
		 * API name: {@code dense_vector_dims_avg_count}
		 */
		public Builder denseVectorDimsAvgCount(Number value) {
			this.denseVectorDimsAvgCount = value;
			return this;
		}

		/**
		 * API name: {@code dense_vector_fields_count}
		 */
		public Builder denseVectorFieldsCount(Number value) {
			this.denseVectorFieldsCount = value;
			return this;
		}

		/**
		 * API name: {@code sparse_vector_fields_count}
		 */
		public Builder sparseVectorFieldsCount(@Nullable Number value) {
			this.sparseVectorFieldsCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Vector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Vector build() {

			return new Vector(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Vector
	 */
	public static final JsonpDeserializer<Vector> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Vector::setupVectorDeserializer);

	protected static void setupVectorDeserializer(DelegatingDeserializer<Vector.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::denseVectorDimsAvgCount, JsonpDeserializer.numberDeserializer(), "dense_vector_dims_avg_count");
		op.add(Builder::denseVectorFieldsCount, JsonpDeserializer.numberDeserializer(), "dense_vector_fields_count");
		op.add(Builder::sparseVectorFieldsCount, JsonpDeserializer.numberDeserializer(), "sparse_vector_fields_count");

	}

}
