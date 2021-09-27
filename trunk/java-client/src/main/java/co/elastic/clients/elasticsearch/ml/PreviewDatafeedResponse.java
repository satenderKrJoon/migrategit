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
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: ml.preview_datafeed.Response
public final class PreviewDatafeedResponse<TDocument> implements ToJsonp {
	private final List<TDocument> data;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected PreviewDatafeedResponse(Builder<TDocument> builder) {

		this.data = Objects.requireNonNull(builder.data, "data");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code data}
	 */
	public List<TDocument> data() {
		return this.data;
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

		generator.writeKey("data");
		generator.writeStartArray();
		for (TDocument item0 : this.data) {
			JsonpUtils.serialize(item0, generator, tDocumentSerializer, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PreviewDatafeedResponse}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<PreviewDatafeedResponse<TDocument>> {
		private List<TDocument> data;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code data}
		 */
		public Builder<TDocument> data(List<TDocument> value) {
			this.data = value;
			return this;
		}

		/**
		 * API name: {@code data}
		 */
		public Builder<TDocument> data(TDocument... value) {
			this.data = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #data(List)}, creating the list if needed.
		 */
		public Builder<TDocument> addData(TDocument value) {
			if (this.data == null) {
				this.data = new ArrayList<>();
			}
			this.data.add(value);
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link PreviewDatafeedResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PreviewDatafeedResponse<TDocument> build() {

			return new PreviewDatafeedResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for PreviewDatafeedResponse
	 */
	public static <TDocument> JsonpDeserializer<PreviewDatafeedResponse<TDocument>> createPreviewDatafeedResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> PreviewDatafeedResponse.setupPreviewDatafeedResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupPreviewDatafeedResponseDeserializer(
			DelegatingDeserializer<PreviewDatafeedResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::data, JsonpDeserializer.arrayDeserializer(tDocumentDeserializer), "data");

	}

}
