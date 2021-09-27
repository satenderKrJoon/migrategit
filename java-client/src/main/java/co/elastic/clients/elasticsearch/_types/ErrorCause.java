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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.elasticsearch._global.scripts_painless_execute.PainlessExecutionPosition;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.ErrorCause
public class ErrorCause implements ToJsonp {
	private final String type;

	private final String reason;

	@Nullable
	private final co.elastic.clients.elasticsearch._types.ErrorCause causedBy;

	@Nullable
	private final JsonValue shard;

	@Nullable
	private final String stackTrace;

	@Nullable
	private final List<co.elastic.clients.elasticsearch._types.ErrorCause> rootCause;

	@Nullable
	private final Number bytesLimit;

	@Nullable
	private final Number bytesWanted;

	@Nullable
	private final Number column;

	@Nullable
	private final Number col;

	@Nullable
	private final List<ShardFailure> failedShards;

	@Nullable
	private final Boolean grouped;

	@Nullable
	private final String index;

	@Nullable
	private final String indexUuid;

	@Nullable
	private final String language;

	@Nullable
	private final String licensedExpiredFeature;

	@Nullable
	private final Number line;

	@Nullable
	private final Number maxBuckets;

	@Nullable
	private final String phase;

	@Nullable
	private final String propertyName;

	@Nullable
	private final String processorType;

	@Nullable
	private final List<String> resourceId;

	@Nullable
	private final String resourceType;

	@Nullable
	private final String script;

	@Nullable
	private final List<String> scriptStack;

	@Nullable
	private final Map<String, List<String>> header;

	@Nullable
	private final String lang;

	@Nullable
	private final PainlessExecutionPosition position;

	// ---------------------------------------------------------------------------------------------

	protected ErrorCause(AbstractBuilder<?> builder) {

		this.type = Objects.requireNonNull(builder.type, "type");
		this.reason = Objects.requireNonNull(builder.reason, "reason");
		this.causedBy = builder.causedBy;
		this.shard = builder.shard;
		this.stackTrace = builder.stackTrace;
		this.rootCause = builder.rootCause;
		this.bytesLimit = builder.bytesLimit;
		this.bytesWanted = builder.bytesWanted;
		this.column = builder.column;
		this.col = builder.col;
		this.failedShards = builder.failedShards;
		this.grouped = builder.grouped;
		this.index = builder.index;
		this.indexUuid = builder.indexUuid;
		this.language = builder.language;
		this.licensedExpiredFeature = builder.licensedExpiredFeature;
		this.line = builder.line;
		this.maxBuckets = builder.maxBuckets;
		this.phase = builder.phase;
		this.propertyName = builder.propertyName;
		this.processorType = builder.processorType;
		this.resourceId = builder.resourceId;
		this.resourceType = builder.resourceType;
		this.script = builder.script;
		this.scriptStack = builder.scriptStack;
		this.header = builder.header;
		this.lang = builder.lang;
		this.position = builder.position;

	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code reason}
	 */
	public String reason() {
		return this.reason;
	}

	/**
	 * API name: {@code caused_by}
	 */
	@Nullable
	public co.elastic.clients.elasticsearch._types.ErrorCause causedBy() {
		return this.causedBy;
	}

	/**
	 * API name: {@code shard}
	 */
	@Nullable
	public JsonValue shard() {
		return this.shard;
	}

	/**
	 * API name: {@code stack_trace}
	 */
	@Nullable
	public String stackTrace() {
		return this.stackTrace;
	}

	/**
	 * API name: {@code root_cause}
	 */
	@Nullable
	public List<co.elastic.clients.elasticsearch._types.ErrorCause> rootCause() {
		return this.rootCause;
	}

	/**
	 * API name: {@code bytes_limit}
	 */
	@Nullable
	public Number bytesLimit() {
		return this.bytesLimit;
	}

	/**
	 * API name: {@code bytes_wanted}
	 */
	@Nullable
	public Number bytesWanted() {
		return this.bytesWanted;
	}

	/**
	 * API name: {@code column}
	 */
	@Nullable
	public Number column() {
		return this.column;
	}

	/**
	 * API name: {@code col}
	 */
	@Nullable
	public Number col() {
		return this.col;
	}

	/**
	 * API name: {@code failed_shards}
	 */
	@Nullable
	public List<ShardFailure> failedShards() {
		return this.failedShards;
	}

	/**
	 * API name: {@code grouped}
	 */
	@Nullable
	public Boolean grouped() {
		return this.grouped;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code index_uuid}
	 */
	@Nullable
	public String indexUuid() {
		return this.indexUuid;
	}

	/**
	 * API name: {@code language}
	 */
	@Nullable
	public String language() {
		return this.language;
	}

	/**
	 * API name: {@code licensed_expired_feature}
	 */
	@Nullable
	public String licensedExpiredFeature() {
		return this.licensedExpiredFeature;
	}

	/**
	 * API name: {@code line}
	 */
	@Nullable
	public Number line() {
		return this.line;
	}

	/**
	 * API name: {@code max_buckets}
	 */
	@Nullable
	public Number maxBuckets() {
		return this.maxBuckets;
	}

	/**
	 * API name: {@code phase}
	 */
	@Nullable
	public String phase() {
		return this.phase;
	}

	/**
	 * API name: {@code property_name}
	 */
	@Nullable
	public String propertyName() {
		return this.propertyName;
	}

	/**
	 * API name: {@code processor_type}
	 */
	@Nullable
	public String processorType() {
		return this.processorType;
	}

	/**
	 * resource id
	 *
	 * API name: {@code resource_id}
	 */
	@Nullable
	public List<String> resourceId() {
		return this.resourceId;
	}

	/**
	 * resource type
	 *
	 * API name: {@code resource_type}
	 */
	@Nullable
	public String resourceType() {
		return this.resourceType;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public String script() {
		return this.script;
	}

	/**
	 * API name: {@code script_stack}
	 */
	@Nullable
	public List<String> scriptStack() {
		return this.scriptStack;
	}

	/**
	 * API name: {@code header}
	 */
	@Nullable
	public Map<String, List<String>> header() {
		return this.header;
	}

	/**
	 * API name: {@code lang}
	 */
	@Nullable
	public String lang() {
		return this.lang;
	}

	/**
	 * API name: {@code position}
	 */
	@Nullable
	public PainlessExecutionPosition position() {
		return this.position;
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

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("reason");
		generator.write(this.reason);

		if (this.causedBy != null) {

			generator.writeKey("caused_by");
			this.causedBy.toJsonp(generator, mapper);

		}
		if (this.shard != null) {

			generator.writeKey("shard");
			generator.write(this.shard);

		}
		if (this.stackTrace != null) {

			generator.writeKey("stack_trace");
			generator.write(this.stackTrace);

		}
		if (this.rootCause != null) {

			generator.writeKey("root_cause");
			generator.writeStartArray();
			for (co.elastic.clients.elasticsearch._types.ErrorCause item0 : this.rootCause) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.bytesLimit != null) {

			generator.writeKey("bytes_limit");
			generator.write(this.bytesLimit.doubleValue());

		}
		if (this.bytesWanted != null) {

			generator.writeKey("bytes_wanted");
			generator.write(this.bytesWanted.doubleValue());

		}
		if (this.column != null) {

			generator.writeKey("column");
			generator.write(this.column.doubleValue());

		}
		if (this.col != null) {

			generator.writeKey("col");
			generator.write(this.col.doubleValue());

		}
		if (this.failedShards != null) {

			generator.writeKey("failed_shards");
			generator.writeStartArray();
			for (ShardFailure item0 : this.failedShards) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.grouped != null) {

			generator.writeKey("grouped");
			generator.write(this.grouped);

		}
		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.indexUuid != null) {

			generator.writeKey("index_uuid");
			generator.write(this.indexUuid);

		}
		if (this.language != null) {

			generator.writeKey("language");
			generator.write(this.language);

		}
		if (this.licensedExpiredFeature != null) {

			generator.writeKey("licensed_expired_feature");
			generator.write(this.licensedExpiredFeature);

		}
		if (this.line != null) {

			generator.writeKey("line");
			generator.write(this.line.doubleValue());

		}
		if (this.maxBuckets != null) {

			generator.writeKey("max_buckets");
			generator.write(this.maxBuckets.doubleValue());

		}
		if (this.phase != null) {

			generator.writeKey("phase");
			generator.write(this.phase);

		}
		if (this.propertyName != null) {

			generator.writeKey("property_name");
			generator.write(this.propertyName);

		}
		if (this.processorType != null) {

			generator.writeKey("processor_type");
			generator.write(this.processorType);

		}
		if (this.resourceId != null) {

			generator.writeKey("resource_id");
			generator.writeStartArray();
			for (String item0 : this.resourceId) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.resourceType != null) {

			generator.writeKey("resource_type");
			generator.write(this.resourceType);

		}
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.scriptStack != null) {

			generator.writeKey("script_stack");
			generator.writeStartArray();
			for (String item0 : this.scriptStack) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.header != null) {

			generator.writeKey("header");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.header.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				for (String item1 : item0.getValue()) {
					generator.write(item1);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.lang != null) {

			generator.writeKey("lang");
			generator.write(this.lang);

		}
		if (this.position != null) {

			generator.writeKey("position");
			this.position.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ErrorCause}.
	 */
	public static class Builder extends ErrorCause.AbstractBuilder<Builder> implements ObjectBuilder<ErrorCause> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ErrorCause}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ErrorCause build() {

			return new ErrorCause(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private String type;

		private String reason;

		@Nullable
		private co.elastic.clients.elasticsearch._types.ErrorCause causedBy;

		@Nullable
		private JsonValue shard;

		@Nullable
		private String stackTrace;

		@Nullable
		private List<co.elastic.clients.elasticsearch._types.ErrorCause> rootCause;

		@Nullable
		private Number bytesLimit;

		@Nullable
		private Number bytesWanted;

		@Nullable
		private Number column;

		@Nullable
		private Number col;

		@Nullable
		private List<ShardFailure> failedShards;

		@Nullable
		private Boolean grouped;

		@Nullable
		private String index;

		@Nullable
		private String indexUuid;

		@Nullable
		private String language;

		@Nullable
		private String licensedExpiredFeature;

		@Nullable
		private Number line;

		@Nullable
		private Number maxBuckets;

		@Nullable
		private String phase;

		@Nullable
		private String propertyName;

		@Nullable
		private String processorType;

		@Nullable
		private List<String> resourceId;

		@Nullable
		private String resourceType;

		@Nullable
		private String script;

		@Nullable
		private List<String> scriptStack;

		@Nullable
		private Map<String, List<String>> header;

		@Nullable
		private String lang;

		@Nullable
		private PainlessExecutionPosition position;

		/**
		 * API name: {@code type}
		 */
		public BuilderT type(String value) {
			this.type = value;
			return self();
		}

		/**
		 * API name: {@code reason}
		 */
		public BuilderT reason(String value) {
			this.reason = value;
			return self();
		}

		/**
		 * API name: {@code caused_by}
		 */
		public BuilderT causedBy(@Nullable co.elastic.clients.elasticsearch._types.ErrorCause value) {
			this.causedBy = value;
			return self();
		}

		/**
		 * API name: {@code caused_by}
		 */
		public BuilderT causedBy(
				Function<co.elastic.clients.elasticsearch._types.ErrorCause.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.ErrorCause>> fn) {
			return this.causedBy(fn.apply(new co.elastic.clients.elasticsearch._types.ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code shard}
		 */
		public BuilderT shard(@Nullable JsonValue value) {
			this.shard = value;
			return self();
		}

		/**
		 * API name: {@code stack_trace}
		 */
		public BuilderT stackTrace(@Nullable String value) {
			this.stackTrace = value;
			return self();
		}

		/**
		 * API name: {@code root_cause}
		 */
		public BuilderT rootCause(@Nullable List<co.elastic.clients.elasticsearch._types.ErrorCause> value) {
			this.rootCause = value;
			return self();
		}

		/**
		 * API name: {@code root_cause}
		 */
		public BuilderT rootCause(co.elastic.clients.elasticsearch._types.ErrorCause... value) {
			this.rootCause = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #rootCause(List)}, creating the list if needed.
		 */
		public BuilderT addRootCause(co.elastic.clients.elasticsearch._types.ErrorCause value) {
			if (this.rootCause == null) {
				this.rootCause = new ArrayList<>();
			}
			this.rootCause.add(value);
			return self();
		}

		/**
		 * Set {@link #rootCause(List)} to a singleton list.
		 */
		public BuilderT rootCause(
				Function<co.elastic.clients.elasticsearch._types.ErrorCause.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.ErrorCause>> fn) {
			return this.rootCause(fn.apply(new co.elastic.clients.elasticsearch._types.ErrorCause.Builder()).build());
		}

		/**
		 * Add a value to {@link #rootCause(List)}, creating the list if needed.
		 */
		public BuilderT addRootCause(
				Function<co.elastic.clients.elasticsearch._types.ErrorCause.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.ErrorCause>> fn) {
			return this
					.addRootCause(fn.apply(new co.elastic.clients.elasticsearch._types.ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code bytes_limit}
		 */
		public BuilderT bytesLimit(@Nullable Number value) {
			this.bytesLimit = value;
			return self();
		}

		/**
		 * API name: {@code bytes_wanted}
		 */
		public BuilderT bytesWanted(@Nullable Number value) {
			this.bytesWanted = value;
			return self();
		}

		/**
		 * API name: {@code column}
		 */
		public BuilderT column(@Nullable Number value) {
			this.column = value;
			return self();
		}

		/**
		 * API name: {@code col}
		 */
		public BuilderT col(@Nullable Number value) {
			this.col = value;
			return self();
		}

		/**
		 * API name: {@code failed_shards}
		 */
		public BuilderT failedShards(@Nullable List<ShardFailure> value) {
			this.failedShards = value;
			return self();
		}

		/**
		 * API name: {@code failed_shards}
		 */
		public BuilderT failedShards(ShardFailure... value) {
			this.failedShards = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #failedShards(List)}, creating the list if needed.
		 */
		public BuilderT addFailedShards(ShardFailure value) {
			if (this.failedShards == null) {
				this.failedShards = new ArrayList<>();
			}
			this.failedShards.add(value);
			return self();
		}

		/**
		 * Set {@link #failedShards(List)} to a singleton list.
		 */
		public BuilderT failedShards(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return this.failedShards(fn.apply(new ShardFailure.Builder()).build());
		}

		/**
		 * Add a value to {@link #failedShards(List)}, creating the list if needed.
		 */
		public BuilderT addFailedShards(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return this.addFailedShards(fn.apply(new ShardFailure.Builder()).build());
		}

		/**
		 * API name: {@code grouped}
		 */
		public BuilderT grouped(@Nullable Boolean value) {
			this.grouped = value;
			return self();
		}

		/**
		 * API name: {@code index}
		 */
		public BuilderT index(@Nullable String value) {
			this.index = value;
			return self();
		}

		/**
		 * API name: {@code index_uuid}
		 */
		public BuilderT indexUuid(@Nullable String value) {
			this.indexUuid = value;
			return self();
		}

		/**
		 * API name: {@code language}
		 */
		public BuilderT language(@Nullable String value) {
			this.language = value;
			return self();
		}

		/**
		 * API name: {@code licensed_expired_feature}
		 */
		public BuilderT licensedExpiredFeature(@Nullable String value) {
			this.licensedExpiredFeature = value;
			return self();
		}

		/**
		 * API name: {@code line}
		 */
		public BuilderT line(@Nullable Number value) {
			this.line = value;
			return self();
		}

		/**
		 * API name: {@code max_buckets}
		 */
		public BuilderT maxBuckets(@Nullable Number value) {
			this.maxBuckets = value;
			return self();
		}

		/**
		 * API name: {@code phase}
		 */
		public BuilderT phase(@Nullable String value) {
			this.phase = value;
			return self();
		}

		/**
		 * API name: {@code property_name}
		 */
		public BuilderT propertyName(@Nullable String value) {
			this.propertyName = value;
			return self();
		}

		/**
		 * API name: {@code processor_type}
		 */
		public BuilderT processorType(@Nullable String value) {
			this.processorType = value;
			return self();
		}

		/**
		 * resource id
		 *
		 * API name: {@code resource_id}
		 */
		public BuilderT resourceId(@Nullable List<String> value) {
			this.resourceId = value;
			return self();
		}

		/**
		 * resource id
		 *
		 * API name: {@code resource_id}
		 */
		public BuilderT resourceId(String... value) {
			this.resourceId = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #resourceId(List)}, creating the list if needed.
		 */
		public BuilderT addResourceId(String value) {
			if (this.resourceId == null) {
				this.resourceId = new ArrayList<>();
			}
			this.resourceId.add(value);
			return self();
		}

		/**
		 * resource type
		 *
		 * API name: {@code resource_type}
		 */
		public BuilderT resourceType(@Nullable String value) {
			this.resourceType = value;
			return self();
		}

		/**
		 * API name: {@code script}
		 */
		public BuilderT script(@Nullable String value) {
			this.script = value;
			return self();
		}

		/**
		 * API name: {@code script_stack}
		 */
		public BuilderT scriptStack(@Nullable List<String> value) {
			this.scriptStack = value;
			return self();
		}

		/**
		 * API name: {@code script_stack}
		 */
		public BuilderT scriptStack(String... value) {
			this.scriptStack = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #scriptStack(List)}, creating the list if needed.
		 */
		public BuilderT addScriptStack(String value) {
			if (this.scriptStack == null) {
				this.scriptStack = new ArrayList<>();
			}
			this.scriptStack.add(value);
			return self();
		}

		/**
		 * API name: {@code header}
		 */
		public BuilderT header(@Nullable Map<String, List<String>> value) {
			this.header = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #header(Map)}, creating the map if needed.
		 */
		public BuilderT putHeader(String key, List<String> value) {
			if (this.header == null) {
				this.header = new HashMap<>();
			}
			this.header.put(key, value);
			return self();
		}

		/**
		 * API name: {@code lang}
		 */
		public BuilderT lang(@Nullable String value) {
			this.lang = value;
			return self();
		}

		/**
		 * API name: {@code position}
		 */
		public BuilderT position(@Nullable PainlessExecutionPosition value) {
			this.position = value;
			return self();
		}

		/**
		 * API name: {@code position}
		 */
		public BuilderT position(
				Function<PainlessExecutionPosition.Builder, ObjectBuilder<PainlessExecutionPosition>> fn) {
			return this.position(fn.apply(new PainlessExecutionPosition.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ErrorCause
	 */
	public static final JsonpDeserializer<ErrorCause> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ErrorCause::setupErrorCauseDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupErrorCauseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(AbstractBuilder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(AbstractBuilder::causedBy, co.elastic.clients.elasticsearch._types.ErrorCause.DESERIALIZER, "caused_by");
		op.add(AbstractBuilder::shard, JsonpDeserializer.jsonValueDeserializer(), "shard");
		op.add(AbstractBuilder::stackTrace, JsonpDeserializer.stringDeserializer(), "stack_trace");
		op.add(AbstractBuilder::rootCause,
				JsonpDeserializer.arrayDeserializer(co.elastic.clients.elasticsearch._types.ErrorCause.DESERIALIZER),
				"root_cause");
		op.add(AbstractBuilder::bytesLimit, JsonpDeserializer.numberDeserializer(), "bytes_limit");
		op.add(AbstractBuilder::bytesWanted, JsonpDeserializer.numberDeserializer(), "bytes_wanted");
		op.add(AbstractBuilder::column, JsonpDeserializer.numberDeserializer(), "column");
		op.add(AbstractBuilder::col, JsonpDeserializer.numberDeserializer(), "col");
		op.add(AbstractBuilder::failedShards, JsonpDeserializer.arrayDeserializer(ShardFailure.DESERIALIZER),
				"failed_shards");
		op.add(AbstractBuilder::grouped, JsonpDeserializer.booleanDeserializer(), "grouped");
		op.add(AbstractBuilder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(AbstractBuilder::indexUuid, JsonpDeserializer.stringDeserializer(), "index_uuid");
		op.add(AbstractBuilder::language, JsonpDeserializer.stringDeserializer(), "language");
		op.add(AbstractBuilder::licensedExpiredFeature, JsonpDeserializer.stringDeserializer(),
				"licensed_expired_feature");
		op.add(AbstractBuilder::line, JsonpDeserializer.numberDeserializer(), "line");
		op.add(AbstractBuilder::maxBuckets, JsonpDeserializer.numberDeserializer(), "max_buckets");
		op.add(AbstractBuilder::phase, JsonpDeserializer.stringDeserializer(), "phase");
		op.add(AbstractBuilder::propertyName, JsonpDeserializer.stringDeserializer(), "property_name");
		op.add(AbstractBuilder::processorType, JsonpDeserializer.stringDeserializer(), "processor_type");
		op.add(AbstractBuilder::resourceId, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"resource_id", "resource.id");
		op.add(AbstractBuilder::resourceType, JsonpDeserializer.stringDeserializer(), "resource_type", "resource.type");
		op.add(AbstractBuilder::script, JsonpDeserializer.stringDeserializer(), "script");
		op.add(AbstractBuilder::scriptStack,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "script_stack");
		op.add(AbstractBuilder::header, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "header");
		op.add(AbstractBuilder::lang, JsonpDeserializer.stringDeserializer(), "lang");
		op.add(AbstractBuilder::position, PainlessExecutionPosition.DESERIALIZER, "position");

	}

}
