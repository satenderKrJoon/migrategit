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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: xpack.usage.CustomSettings
public final class CustomSettings implements ToJsonp {
	@Nullable
	private final List<JsonValue> customUrls;

	@Nullable
	private final String createdBy;

	@Nullable
	private final Map<String, String> jobTags;

	// ---------------------------------------------------------------------------------------------

	protected CustomSettings(Builder builder) {

		this.customUrls = builder.customUrls;
		this.createdBy = builder.createdBy;
		this.jobTags = builder.jobTags;

	}

	/**
	 * API name: {@code custom_urls}
	 */
	@Nullable
	public List<JsonValue> customUrls() {
		return this.customUrls;
	}

	/**
	 * API name: {@code created_by}
	 */
	@Nullable
	public String createdBy() {
		return this.createdBy;
	}

	/**
	 * API name: {@code job_tags}
	 */
	@Nullable
	public Map<String, String> jobTags() {
		return this.jobTags;
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

		if (this.customUrls != null) {

			generator.writeKey("custom_urls");
			generator.writeStartArray();
			for (JsonValue item0 : this.customUrls) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.createdBy != null) {

			generator.writeKey("created_by");
			generator.write(this.createdBy);

		}
		if (this.jobTags != null) {

			generator.writeKey("job_tags");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.jobTags.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CustomSettings}.
	 */
	public static class Builder implements ObjectBuilder<CustomSettings> {
		@Nullable
		private List<JsonValue> customUrls;

		@Nullable
		private String createdBy;

		@Nullable
		private Map<String, String> jobTags;

		/**
		 * API name: {@code custom_urls}
		 */
		public Builder customUrls(@Nullable List<JsonValue> value) {
			this.customUrls = value;
			return this;
		}

		/**
		 * API name: {@code custom_urls}
		 */
		public Builder customUrls(JsonValue... value) {
			this.customUrls = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #customUrls(List)}, creating the list if needed.
		 */
		public Builder addCustomUrls(JsonValue value) {
			if (this.customUrls == null) {
				this.customUrls = new ArrayList<>();
			}
			this.customUrls.add(value);
			return this;
		}

		/**
		 * API name: {@code created_by}
		 */
		public Builder createdBy(@Nullable String value) {
			this.createdBy = value;
			return this;
		}

		/**
		 * API name: {@code job_tags}
		 */
		public Builder jobTags(@Nullable Map<String, String> value) {
			this.jobTags = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #jobTags(Map)}, creating the map if needed.
		 */
		public Builder putJobTags(String key, String value) {
			if (this.jobTags == null) {
				this.jobTags = new HashMap<>();
			}
			this.jobTags.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link CustomSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CustomSettings build() {

			return new CustomSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CustomSettings
	 */
	public static final JsonpDeserializer<CustomSettings> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CustomSettings::setupCustomSettingsDeserializer);

	protected static void setupCustomSettingsDeserializer(DelegatingDeserializer<CustomSettings.Builder> op) {

		op.add(Builder::customUrls, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"custom_urls");
		op.add(Builder::createdBy, JsonpDeserializer.stringDeserializer(), "created_by");
		op.add(Builder::jobTags, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"job_tags");

	}

}
