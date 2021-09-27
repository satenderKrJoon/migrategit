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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._global.reindex.Destination;
import co.elastic.clients.elasticsearch._global.reindex.Source;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.update_transform.Response
public final class UpdateTransformResponse implements ToJsonp {
	private final Number createTime;

	private final String description;

	private final Destination dest;

	private final JsonValue frequency;

	private final String id;

	private final Pivot pivot;

	private final Settings settings;

	private final Source source;

	@Nullable
	private final SyncContainer sync;

	private final String version;

	// ---------------------------------------------------------------------------------------------

	protected UpdateTransformResponse(Builder builder) {

		this.createTime = Objects.requireNonNull(builder.createTime, "create_time");
		this.description = Objects.requireNonNull(builder.description, "description");
		this.dest = Objects.requireNonNull(builder.dest, "dest");
		this.frequency = Objects.requireNonNull(builder.frequency, "frequency");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.pivot = Objects.requireNonNull(builder.pivot, "pivot");
		this.settings = Objects.requireNonNull(builder.settings, "settings");
		this.source = Objects.requireNonNull(builder.source, "source");
		this.sync = builder.sync;
		this.version = Objects.requireNonNull(builder.version, "version");

	}

	/**
	 * API name: {@code create_time}
	 */
	public Number createTime() {
		return this.createTime;
	}

	/**
	 * API name: {@code description}
	 */
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code dest}
	 */
	public Destination dest() {
		return this.dest;
	}

	/**
	 * API name: {@code frequency}
	 */
	public JsonValue frequency() {
		return this.frequency;
	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code pivot}
	 */
	public Pivot pivot() {
		return this.pivot;
	}

	/**
	 * API name: {@code settings}
	 */
	public Settings settings() {
		return this.settings;
	}

	/**
	 * API name: {@code source}
	 */
	public Source source() {
		return this.source;
	}

	/**
	 * API name: {@code sync}
	 */
	@Nullable
	public SyncContainer sync() {
		return this.sync;
	}

	/**
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
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

		generator.writeKey("create_time");
		generator.write(this.createTime.doubleValue());

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("dest");
		this.dest.toJsonp(generator, mapper);

		generator.writeKey("frequency");
		generator.write(this.frequency);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("pivot");
		this.pivot.toJsonp(generator, mapper);

		generator.writeKey("settings");
		this.settings.toJsonp(generator, mapper);

		generator.writeKey("source");
		this.source.toJsonp(generator, mapper);

		if (this.sync != null) {

			generator.writeKey("sync");
			this.sync.toJsonp(generator, mapper);

		}

		generator.writeKey("version");
		generator.write(this.version);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateTransformResponse}.
	 */
	public static class Builder implements ObjectBuilder<UpdateTransformResponse> {
		private Number createTime;

		private String description;

		private Destination dest;

		private JsonValue frequency;

		private String id;

		private Pivot pivot;

		private Settings settings;

		private Source source;

		@Nullable
		private SyncContainer sync;

		private String version;

		/**
		 * API name: {@code create_time}
		 */
		public Builder createTime(Number value) {
			this.createTime = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code dest}
		 */
		public Builder dest(Destination value) {
			this.dest = value;
			return this;
		}

		/**
		 * API name: {@code dest}
		 */
		public Builder dest(Function<Destination.Builder, ObjectBuilder<Destination>> fn) {
			return this.dest(fn.apply(new Destination.Builder()).build());
		}

		/**
		 * API name: {@code frequency}
		 */
		public Builder frequency(JsonValue value) {
			this.frequency = value;
			return this;
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code pivot}
		 */
		public Builder pivot(Pivot value) {
			this.pivot = value;
			return this;
		}

		/**
		 * API name: {@code pivot}
		 */
		public Builder pivot(Function<Pivot.Builder, ObjectBuilder<Pivot>> fn) {
			return this.pivot(fn.apply(new Pivot.Builder()).build());
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(Settings value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(Function<Settings.Builder, ObjectBuilder<Settings>> fn) {
			return this.settings(fn.apply(new Settings.Builder()).build());
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(Source value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(Function<Source.Builder, ObjectBuilder<Source>> fn) {
			return this.source(fn.apply(new Source.Builder()).build());
		}

		/**
		 * API name: {@code sync}
		 */
		public Builder sync(@Nullable SyncContainer value) {
			this.sync = value;
			return this;
		}

		/**
		 * API name: {@code sync}
		 */
		public Builder sync(Function<SyncContainer.Builder, ObjectBuilder<SyncContainer>> fn) {
			return this.sync(fn.apply(new SyncContainer.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link UpdateTransformResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateTransformResponse build() {

			return new UpdateTransformResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for UpdateTransformResponse
	 */
	public static final JsonpDeserializer<UpdateTransformResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, UpdateTransformResponse::setupUpdateTransformResponseDeserializer);

	protected static void setupUpdateTransformResponseDeserializer(
			DelegatingDeserializer<UpdateTransformResponse.Builder> op) {

		op.add(Builder::createTime, JsonpDeserializer.numberDeserializer(), "create_time");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::dest, Destination.DESERIALIZER, "dest");
		op.add(Builder::frequency, JsonpDeserializer.jsonValueDeserializer(), "frequency");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::pivot, Pivot.DESERIALIZER, "pivot");
		op.add(Builder::settings, Settings.DESERIALIZER, "settings");
		op.add(Builder::source, Source.DESERIALIZER, "source");
		op.add(Builder::sync, SyncContainer.DESERIALIZER, "sync");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
