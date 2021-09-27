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

package co.elastic.clients.elasticsearch.watcher;

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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.PagerDutyEvent
public final class PagerDutyEvent implements ToJsonp {
	private final String account;

	private final Boolean attachPayload;

	private final String client;

	private final String clientUrl;

	private final List<PagerDutyContext> context;

	private final String description;

	private final JsonValue eventType;

	private final String incidentKey;

	// ---------------------------------------------------------------------------------------------

	protected PagerDutyEvent(Builder builder) {

		this.account = Objects.requireNonNull(builder.account, "account");
		this.attachPayload = Objects.requireNonNull(builder.attachPayload, "attach_payload");
		this.client = Objects.requireNonNull(builder.client, "client");
		this.clientUrl = Objects.requireNonNull(builder.clientUrl, "client_url");
		this.context = Objects.requireNonNull(builder.context, "context");
		this.description = Objects.requireNonNull(builder.description, "description");
		this.eventType = Objects.requireNonNull(builder.eventType, "event_type");
		this.incidentKey = Objects.requireNonNull(builder.incidentKey, "incident_key");

	}

	/**
	 * API name: {@code account}
	 */
	public String account() {
		return this.account;
	}

	/**
	 * API name: {@code attach_payload}
	 */
	public Boolean attachPayload() {
		return this.attachPayload;
	}

	/**
	 * API name: {@code client}
	 */
	public String client() {
		return this.client;
	}

	/**
	 * API name: {@code client_url}
	 */
	public String clientUrl() {
		return this.clientUrl;
	}

	/**
	 * API name: {@code context}
	 */
	public List<PagerDutyContext> context() {
		return this.context;
	}

	/**
	 * API name: {@code description}
	 */
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code event_type}
	 */
	public JsonValue eventType() {
		return this.eventType;
	}

	/**
	 * API name: {@code incident_key}
	 */
	public String incidentKey() {
		return this.incidentKey;
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

		generator.writeKey("account");
		generator.write(this.account);

		generator.writeKey("attach_payload");
		generator.write(this.attachPayload);

		generator.writeKey("client");
		generator.write(this.client);

		generator.writeKey("client_url");
		generator.write(this.clientUrl);

		generator.writeKey("context");
		generator.writeStartArray();
		for (PagerDutyContext item0 : this.context) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("event_type");
		generator.write(this.eventType);

		generator.writeKey("incident_key");
		generator.write(this.incidentKey);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PagerDutyEvent}.
	 */
	public static class Builder implements ObjectBuilder<PagerDutyEvent> {
		private String account;

		private Boolean attachPayload;

		private String client;

		private String clientUrl;

		private List<PagerDutyContext> context;

		private String description;

		private JsonValue eventType;

		private String incidentKey;

		/**
		 * API name: {@code account}
		 */
		public Builder account(String value) {
			this.account = value;
			return this;
		}

		/**
		 * API name: {@code attach_payload}
		 */
		public Builder attachPayload(Boolean value) {
			this.attachPayload = value;
			return this;
		}

		/**
		 * API name: {@code client}
		 */
		public Builder client(String value) {
			this.client = value;
			return this;
		}

		/**
		 * API name: {@code client_url}
		 */
		public Builder clientUrl(String value) {
			this.clientUrl = value;
			return this;
		}

		/**
		 * API name: {@code context}
		 */
		public Builder context(List<PagerDutyContext> value) {
			this.context = value;
			return this;
		}

		/**
		 * API name: {@code context}
		 */
		public Builder context(PagerDutyContext... value) {
			this.context = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #context(List)}, creating the list if needed.
		 */
		public Builder addContext(PagerDutyContext value) {
			if (this.context == null) {
				this.context = new ArrayList<>();
			}
			this.context.add(value);
			return this;
		}

		/**
		 * Set {@link #context(List)} to a singleton list.
		 */
		public Builder context(Function<PagerDutyContext.Builder, ObjectBuilder<PagerDutyContext>> fn) {
			return this.context(fn.apply(new PagerDutyContext.Builder()).build());
		}

		/**
		 * Add a value to {@link #context(List)}, creating the list if needed.
		 */
		public Builder addContext(Function<PagerDutyContext.Builder, ObjectBuilder<PagerDutyContext>> fn) {
			return this.addContext(fn.apply(new PagerDutyContext.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code event_type}
		 */
		public Builder eventType(JsonValue value) {
			this.eventType = value;
			return this;
		}

		/**
		 * API name: {@code incident_key}
		 */
		public Builder incidentKey(String value) {
			this.incidentKey = value;
			return this;
		}

		/**
		 * Builds a {@link PagerDutyEvent}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PagerDutyEvent build() {

			return new PagerDutyEvent(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PagerDutyEvent
	 */
	public static final JsonpDeserializer<PagerDutyEvent> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PagerDutyEvent::setupPagerDutyEventDeserializer);

	protected static void setupPagerDutyEventDeserializer(DelegatingDeserializer<PagerDutyEvent.Builder> op) {

		op.add(Builder::account, JsonpDeserializer.stringDeserializer(), "account");
		op.add(Builder::attachPayload, JsonpDeserializer.booleanDeserializer(), "attach_payload");
		op.add(Builder::client, JsonpDeserializer.stringDeserializer(), "client");
		op.add(Builder::clientUrl, JsonpDeserializer.stringDeserializer(), "client_url");
		op.add(Builder::context, JsonpDeserializer.arrayDeserializer(PagerDutyContext.DESERIALIZER), "context");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::eventType, JsonpDeserializer.jsonValueDeserializer(), "event_type");
		op.add(Builder::incidentKey, JsonpDeserializer.stringDeserializer(), "incident_key");

	}

}
