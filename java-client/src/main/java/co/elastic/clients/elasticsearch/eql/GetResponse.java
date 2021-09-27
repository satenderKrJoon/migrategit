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

package co.elastic.clients.elasticsearch.eql;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: eql.get.Response
public final class GetResponse<TEvent> extends EqlSearchResponseBase<TEvent> {
	@Nullable
	private final JsonpSerializer<TEvent> tEventSerializer;

	// ---------------------------------------------------------------------------------------------

	protected GetResponse(Builder<TEvent> builder) {
		super(builder);
		this.tEventSerializer = builder.tEventSerializer;

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetResponse}.
	 */
	public static class Builder<TEvent> extends EqlSearchResponseBase.AbstractBuilder<TEvent, Builder<TEvent>>
			implements
				ObjectBuilder<GetResponse<TEvent>> {
		@Nullable
		private JsonpSerializer<TEvent> tEventSerializer;

		/**
		 * Serializer for TEvent. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TEvent> tEventSerializer(@Nullable JsonpSerializer<TEvent> value) {
			this.tEventSerializer = value;
			return this;
		}

		@Override
		protected Builder<TEvent> self() {
			return this;
		}

		/**
		 * Builds a {@link GetResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetResponse<TEvent> build() {

			return new GetResponse<TEvent>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for GetResponse
	 */
	public static <TEvent> JsonpDeserializer<GetResponse<TEvent>> createGetResponseDeserializer(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TEvent>>) Builder::new,
				op -> GetResponse.setupGetResponseDeserializer(op, tEventDeserializer));
	};

	protected static <TEvent> void setupGetResponseDeserializer(DelegatingDeserializer<GetResponse.Builder<TEvent>> op,
			JsonpDeserializer<TEvent> tEventDeserializer) {
		EqlSearchResponseBase.setupEqlSearchResponseBaseDeserializer(op, tEventDeserializer);

	}

}
