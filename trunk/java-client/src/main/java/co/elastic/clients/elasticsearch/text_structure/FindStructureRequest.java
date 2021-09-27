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

package co.elastic.clients.elasticsearch.text_structure;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
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
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: text_structure.find_structure.Request
public final class FindStructureRequest<TJsonDocument> implements ToJsonp {
	@Nullable
	private final String charset;

	@Nullable
	private final String columnNames;

	@Nullable
	private final String delimiter;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final String format;

	@Nullable
	private final String grokPattern;

	@Nullable
	private final Boolean hasHeaderRow;

	@Nullable
	private final Number lineMergeSizeLimit;

	@Nullable
	private final Number linesToSample;

	@Nullable
	private final String quote;

	@Nullable
	private final Boolean shouldTrimFields;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final String timestampField;

	@Nullable
	private final String timestampFormat;

	private final List<TJsonDocument> value;

	@Nullable
	private final JsonpSerializer<TJsonDocument> tJsonDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected FindStructureRequest(Builder<TJsonDocument> builder) {

		this.charset = builder.charset;
		this.columnNames = builder.columnNames;
		this.delimiter = builder.delimiter;
		this.explain = builder.explain;
		this.format = builder.format;
		this.grokPattern = builder.grokPattern;
		this.hasHeaderRow = builder.hasHeaderRow;
		this.lineMergeSizeLimit = builder.lineMergeSizeLimit;
		this.linesToSample = builder.linesToSample;
		this.quote = builder.quote;
		this.shouldTrimFields = builder.shouldTrimFields;
		this.timeout = builder.timeout;
		this.timestampField = builder.timestampField;
		this.timestampFormat = builder.timestampFormat;
		this.value = Objects.requireNonNull(builder.value, "value");
		this.tJsonDocumentSerializer = builder.tJsonDocumentSerializer;

	}

	/**
	 * The text’s character set. It must be a character set that is supported by the
	 * JVM that Elasticsearch uses. For example, UTF-8, UTF-16LE, windows-1252, or
	 * EUC-JP. If this parameter is not specified, the structure finder chooses an
	 * appropriate character set.
	 *
	 * API name: {@code charset}
	 */
	@Nullable
	public String charset() {
		return this.charset;
	}

	/**
	 * If you have set format to delimited, you can specify the column names in a
	 * comma-separated list. If this parameter is not specified, the structure
	 * finder uses the column names from the header row of the text. If the text
	 * does not have a header role, columns are named "column1", "column2",
	 * "column3", etc.
	 *
	 * API name: {@code column_names}
	 */
	@Nullable
	public String columnNames() {
		return this.columnNames;
	}

	/**
	 * If you have set format to delimited, you can specify the character used to
	 * delimit the values in each row. Only a single character is supported; the
	 * delimiter cannot have multiple characters. By default, the API considers the
	 * following possibilities: comma, tab, semi-colon, and pipe (|). In this
	 * default scenario, all rows must have the same number of fields for the
	 * delimited format to be detected. If you specify a delimiter, up to 10% of the
	 * rows can have a different number of columns than the first row.
	 *
	 * API name: {@code delimiter}
	 */
	@Nullable
	public String delimiter() {
		return this.delimiter;
	}

	/**
	 * If this parameter is set to true, the response includes a field named
	 * explanation, which is an array of strings that indicate how the structure
	 * finder produced its result.
	 *
	 * API name: {@code explain}
	 */
	@Nullable
	public Boolean explain() {
		return this.explain;
	}

	/**
	 * The high level structure of the text. Valid values are ndjson, xml,
	 * delimited, and semi_structured_text. By default, the API chooses the format.
	 * In this default scenario, all rows must have the same number of fields for a
	 * delimited format to be detected. If the format is set to delimited and the
	 * delimiter is not set, however, the API tolerates up to 5% of rows that have a
	 * different number of columns than the first row.
	 *
	 * API name: {@code format}
	 */
	@Nullable
	public String format() {
		return this.format;
	}

	/**
	 * If you have set format to semi_structured_text, you can specify a Grok
	 * pattern that is used to extract fields from every message in the text. The
	 * name of the timestamp field in the Grok pattern must match what is specified
	 * in the timestamp_field parameter. If that parameter is not specified, the
	 * name of the timestamp field in the Grok pattern must match "timestamp". If
	 * grok_pattern is not specified, the structure finder creates a Grok pattern.
	 *
	 * API name: {@code grok_pattern}
	 */
	@Nullable
	public String grokPattern() {
		return this.grokPattern;
	}

	/**
	 * If you have set format to delimited, you can use this parameter to indicate
	 * whether the column names are in the first row of the text. If this parameter
	 * is not specified, the structure finder guesses based on the similarity of the
	 * first row of the text to other rows.
	 *
	 * API name: {@code has_header_row}
	 */
	@Nullable
	public Boolean hasHeaderRow() {
		return this.hasHeaderRow;
	}

	/**
	 * The maximum number of characters in a message when lines are merged to form
	 * messages while analyzing semi-structured text. If you have extremely long
	 * messages you may need to increase this, but be aware that this may lead to
	 * very long processing times if the way to group lines into messages is
	 * misdetected.
	 *
	 * API name: {@code line_merge_size_limit}
	 */
	@Nullable
	public Number lineMergeSizeLimit() {
		return this.lineMergeSizeLimit;
	}

	/**
	 * The number of lines to include in the structural analysis, starting from the
	 * beginning of the text. The minimum is 2; If the value of this parameter is
	 * greater than the number of lines in the text, the analysis proceeds (as long
	 * as there are at least two lines in the text) for all of the lines.
	 *
	 * API name: {@code lines_to_sample}
	 */
	@Nullable
	public Number linesToSample() {
		return this.linesToSample;
	}

	/**
	 * If you have set format to delimited, you can specify the character used to
	 * quote the values in each row if they contain newlines or the delimiter
	 * character. Only a single character is supported. If this parameter is not
	 * specified, the default value is a double quote ("). If your delimited text
	 * format does not use quoting, a workaround is to set this argument to a
	 * character that does not appear anywhere in the sample.
	 *
	 * API name: {@code quote}
	 */
	@Nullable
	public String quote() {
		return this.quote;
	}

	/**
	 * If you have set format to delimited, you can specify whether values between
	 * delimiters should have whitespace trimmed from them. If this parameter is not
	 * specified and the delimiter is pipe (|), the default value is true.
	 * Otherwise, the default value is false.
	 *
	 * API name: {@code should_trim_fields}
	 */
	@Nullable
	public Boolean shouldTrimFields() {
		return this.shouldTrimFields;
	}

	/**
	 * Sets the maximum amount of time that the structure analysis make take. If the
	 * analysis is still running when the timeout expires then it will be aborted.
	 *
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code timestamp_field}
	 */
	@Nullable
	public String timestampField() {
		return this.timestampField;
	}

	/**
	 * The Java time format of the timestamp field in the text.
	 *
	 * API name: {@code timestamp_format}
	 */
	@Nullable
	public String timestampFormat() {
		return this.timestampFormat;
	}

	/**
	 * Request body.
	 *
	 * API name: {@code value}
	 */
	public List<TJsonDocument> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (TJsonDocument item0 : this.value) {
			JsonpUtils.serialize(item0, generator, tJsonDocumentSerializer, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FindStructureRequest}.
	 */
	public static class Builder<TJsonDocument> implements ObjectBuilder<FindStructureRequest<TJsonDocument>> {
		@Nullable
		private String charset;

		@Nullable
		private String columnNames;

		@Nullable
		private String delimiter;

		@Nullable
		private Boolean explain;

		@Nullable
		private String format;

		@Nullable
		private String grokPattern;

		@Nullable
		private Boolean hasHeaderRow;

		@Nullable
		private Number lineMergeSizeLimit;

		@Nullable
		private Number linesToSample;

		@Nullable
		private String quote;

		@Nullable
		private Boolean shouldTrimFields;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private String timestampField;

		@Nullable
		private String timestampFormat;

		private List<TJsonDocument> value;

		@Nullable
		private JsonpSerializer<TJsonDocument> tJsonDocumentSerializer;

		/**
		 * The text’s character set. It must be a character set that is supported by the
		 * JVM that Elasticsearch uses. For example, UTF-8, UTF-16LE, windows-1252, or
		 * EUC-JP. If this parameter is not specified, the structure finder chooses an
		 * appropriate character set.
		 *
		 * API name: {@code charset}
		 */
		public Builder<TJsonDocument> charset(@Nullable String value) {
			this.charset = value;
			return this;
		}

		/**
		 * If you have set format to delimited, you can specify the column names in a
		 * comma-separated list. If this parameter is not specified, the structure
		 * finder uses the column names from the header row of the text. If the text
		 * does not have a header role, columns are named "column1", "column2",
		 * "column3", etc.
		 *
		 * API name: {@code column_names}
		 */
		public Builder<TJsonDocument> columnNames(@Nullable String value) {
			this.columnNames = value;
			return this;
		}

		/**
		 * If you have set format to delimited, you can specify the character used to
		 * delimit the values in each row. Only a single character is supported; the
		 * delimiter cannot have multiple characters. By default, the API considers the
		 * following possibilities: comma, tab, semi-colon, and pipe (|). In this
		 * default scenario, all rows must have the same number of fields for the
		 * delimited format to be detected. If you specify a delimiter, up to 10% of the
		 * rows can have a different number of columns than the first row.
		 *
		 * API name: {@code delimiter}
		 */
		public Builder<TJsonDocument> delimiter(@Nullable String value) {
			this.delimiter = value;
			return this;
		}

		/**
		 * If this parameter is set to true, the response includes a field named
		 * explanation, which is an array of strings that indicate how the structure
		 * finder produced its result.
		 *
		 * API name: {@code explain}
		 */
		public Builder<TJsonDocument> explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * The high level structure of the text. Valid values are ndjson, xml,
		 * delimited, and semi_structured_text. By default, the API chooses the format.
		 * In this default scenario, all rows must have the same number of fields for a
		 * delimited format to be detected. If the format is set to delimited and the
		 * delimiter is not set, however, the API tolerates up to 5% of rows that have a
		 * different number of columns than the first row.
		 *
		 * API name: {@code format}
		 */
		public Builder<TJsonDocument> format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * If you have set format to semi_structured_text, you can specify a Grok
		 * pattern that is used to extract fields from every message in the text. The
		 * name of the timestamp field in the Grok pattern must match what is specified
		 * in the timestamp_field parameter. If that parameter is not specified, the
		 * name of the timestamp field in the Grok pattern must match "timestamp". If
		 * grok_pattern is not specified, the structure finder creates a Grok pattern.
		 *
		 * API name: {@code grok_pattern}
		 */
		public Builder<TJsonDocument> grokPattern(@Nullable String value) {
			this.grokPattern = value;
			return this;
		}

		/**
		 * If you have set format to delimited, you can use this parameter to indicate
		 * whether the column names are in the first row of the text. If this parameter
		 * is not specified, the structure finder guesses based on the similarity of the
		 * first row of the text to other rows.
		 *
		 * API name: {@code has_header_row}
		 */
		public Builder<TJsonDocument> hasHeaderRow(@Nullable Boolean value) {
			this.hasHeaderRow = value;
			return this;
		}

		/**
		 * The maximum number of characters in a message when lines are merged to form
		 * messages while analyzing semi-structured text. If you have extremely long
		 * messages you may need to increase this, but be aware that this may lead to
		 * very long processing times if the way to group lines into messages is
		 * misdetected.
		 *
		 * API name: {@code line_merge_size_limit}
		 */
		public Builder<TJsonDocument> lineMergeSizeLimit(@Nullable Number value) {
			this.lineMergeSizeLimit = value;
			return this;
		}

		/**
		 * The number of lines to include in the structural analysis, starting from the
		 * beginning of the text. The minimum is 2; If the value of this parameter is
		 * greater than the number of lines in the text, the analysis proceeds (as long
		 * as there are at least two lines in the text) for all of the lines.
		 *
		 * API name: {@code lines_to_sample}
		 */
		public Builder<TJsonDocument> linesToSample(@Nullable Number value) {
			this.linesToSample = value;
			return this;
		}

		/**
		 * If you have set format to delimited, you can specify the character used to
		 * quote the values in each row if they contain newlines or the delimiter
		 * character. Only a single character is supported. If this parameter is not
		 * specified, the default value is a double quote ("). If your delimited text
		 * format does not use quoting, a workaround is to set this argument to a
		 * character that does not appear anywhere in the sample.
		 *
		 * API name: {@code quote}
		 */
		public Builder<TJsonDocument> quote(@Nullable String value) {
			this.quote = value;
			return this;
		}

		/**
		 * If you have set format to delimited, you can specify whether values between
		 * delimiters should have whitespace trimmed from them. If this parameter is not
		 * specified and the delimiter is pipe (|), the default value is true.
		 * Otherwise, the default value is false.
		 *
		 * API name: {@code should_trim_fields}
		 */
		public Builder<TJsonDocument> shouldTrimFields(@Nullable Boolean value) {
			this.shouldTrimFields = value;
			return this;
		}

		/**
		 * Sets the maximum amount of time that the structure analysis make take. If the
		 * analysis is still running when the timeout expires then it will be aborted.
		 *
		 * API name: {@code timeout}
		 */
		public Builder<TJsonDocument> timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code timestamp_field}
		 */
		public Builder<TJsonDocument> timestampField(@Nullable String value) {
			this.timestampField = value;
			return this;
		}

		/**
		 * The Java time format of the timestamp field in the text.
		 *
		 * API name: {@code timestamp_format}
		 */
		public Builder<TJsonDocument> timestampFormat(@Nullable String value) {
			this.timestampFormat = value;
			return this;
		}

		/**
		 * Request body.
		 *
		 * API name: {@code value}
		 */
		public Builder<TJsonDocument> value(List<TJsonDocument> value) {
			this.value = value;
			return this;
		}

		/**
		 * Request body.
		 *
		 * API name: {@code value}
		 */
		public Builder<TJsonDocument> value(TJsonDocument... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder<TJsonDocument> addValue(TJsonDocument value) {
			if (this.value == null) {
				this.value = new ArrayList<>();
			}
			this.value.add(value);
			return this;
		}

		/**
		 * Serializer for TJsonDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TJsonDocument> tJsonDocumentSerializer(@Nullable JsonpSerializer<TJsonDocument> value) {
			this.tJsonDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link FindStructureRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FindStructureRequest<TJsonDocument> build() {

			return new FindStructureRequest<TJsonDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for FindStructureRequest
	 */
	public static <TJsonDocument> JsonpDeserializer<FindStructureRequest<TJsonDocument>> createFindStructureRequestDeserializer(
			JsonpDeserializer<TJsonDocument> tJsonDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForValue((Supplier<Builder<TJsonDocument>>) Builder::new,
				op -> FindStructureRequest.setupFindStructureRequestDeserializer(op, tJsonDocumentDeserializer));
	};

	protected static <TJsonDocument> void setupFindStructureRequestDeserializer(
			DelegatingDeserializer<FindStructureRequest.Builder<TJsonDocument>> op,
			JsonpDeserializer<TJsonDocument> tJsonDocumentDeserializer) {

		op.add(Builder::value, JsonpDeserializer.arrayDeserializer(tJsonDocumentDeserializer), "value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code text_structure.find_structure}".
	 */
	public static final Endpoint<FindStructureRequest<?>, FindStructureResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_text_structure/find_structure";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.charset != null) {
					params.put("charset", request.charset);
				}
				if (request.columnNames != null) {
					params.put("column_names", request.columnNames);
				}
				if (request.delimiter != null) {
					params.put("delimiter", request.delimiter);
				}
				if (request.explain != null) {
					params.put("explain", String.valueOf(request.explain));
				}
				if (request.format != null) {
					params.put("format", request.format);
				}
				if (request.grokPattern != null) {
					params.put("grok_pattern", request.grokPattern);
				}
				if (request.hasHeaderRow != null) {
					params.put("has_header_row", String.valueOf(request.hasHeaderRow));
				}
				if (request.lineMergeSizeLimit != null) {
					params.put("line_merge_size_limit", request.lineMergeSizeLimit.toString());
				}
				if (request.linesToSample != null) {
					params.put("lines_to_sample", request.linesToSample.toString());
				}
				if (request.quote != null) {
					params.put("quote", request.quote);
				}
				if (request.shouldTrimFields != null) {
					params.put("should_trim_fields", String.valueOf(request.shouldTrimFields));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				if (request.timestampField != null) {
					params.put("timestamp_field", request.timestampField);
				}
				if (request.timestampFormat != null) {
					params.put("timestamp_format", request.timestampFormat);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, FindStructureResponse.DESERIALIZER);
}
