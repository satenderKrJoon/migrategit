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

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class DataframeAnalysisFeatureProcessor extends TaggedUnion<DataframeAnalysisFeatureProcessor.Tag, Object>
		implements
			ToJsonp {

	public enum Tag implements StringEnum {

		frequencyEncoding("frequency_encoding"),

		multiEncoding("multi_encoding"),

		nGramEncoding("n_gram_encoding"),

		oneHotEncoding("one_hot_encoding"),

		targetMeanEncoding("target_mean_encoding"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	private DataframeAnalysisFeatureProcessor(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link DataframeAnalysisFeatureProcessor} of a
	 * {@code frequency_encoding} kind?
	 */
	public boolean isFrequencyEncoding() {
		return is(Tag.frequencyEncoding);
	}

	/**
	 * Get the {@code frequency_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code frequency_encoding}
	 *             kind.
	 */
	public DataframeAnalysisFeatureProcessorFrequencyEncoding frequencyEncoding() {
		return get(Tag.frequencyEncoding);
	}

	/**
	 * Is this {@link DataframeAnalysisFeatureProcessor} of a {@code multi_encoding}
	 * kind?
	 */
	public boolean isMultiEncoding() {
		return is(Tag.multiEncoding);
	}

	/**
	 * Get the {@code multi_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_encoding} kind.
	 */
	public DataframeAnalysisFeatureProcessorMultiEncoding multiEncoding() {
		return get(Tag.multiEncoding);
	}

	/**
	 * Is this {@link DataframeAnalysisFeatureProcessor} of a
	 * {@code n_gram_encoding} kind?
	 */
	public boolean isNGramEncoding() {
		return is(Tag.nGramEncoding);
	}

	/**
	 * Get the {@code n_gram_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code n_gram_encoding}
	 *             kind.
	 */
	public DataframeAnalysisFeatureProcessorNGramEncoding nGramEncoding() {
		return get(Tag.nGramEncoding);
	}

	/**
	 * Is this {@link DataframeAnalysisFeatureProcessor} of a
	 * {@code one_hot_encoding} kind?
	 */
	public boolean isOneHotEncoding() {
		return is(Tag.oneHotEncoding);
	}

	/**
	 * Get the {@code one_hot_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code one_hot_encoding}
	 *             kind.
	 */
	public DataframeAnalysisFeatureProcessorOneHotEncoding oneHotEncoding() {
		return get(Tag.oneHotEncoding);
	}

	/**
	 * Is this {@link DataframeAnalysisFeatureProcessor} of a
	 * {@code target_mean_encoding} kind?
	 */
	public boolean isTargetMeanEncoding() {
		return is(Tag.targetMeanEncoding);
	}

	/**
	 * Get the {@code target_mean_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code target_mean_encoding}
	 *             kind.
	 */
	public DataframeAnalysisFeatureProcessorTargetMeanEncoding targetMeanEncoding() {
		return get(Tag.targetMeanEncoding);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> frequencyEncoding(
				DataframeAnalysisFeatureProcessorFrequencyEncoding v) {
			this.$variant = v;
			this.$tag = Tag.frequencyEncoding;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> frequencyEncoding(
				Function<DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorFrequencyEncoding>> f) {
			return this.frequencyEncoding(
					f.apply(new DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> multiEncoding(
				DataframeAnalysisFeatureProcessorMultiEncoding v) {
			this.$variant = v;
			this.$tag = Tag.multiEncoding;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> multiEncoding(
				Function<DataframeAnalysisFeatureProcessorMultiEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorMultiEncoding>> f) {
			return this.multiEncoding(f.apply(new DataframeAnalysisFeatureProcessorMultiEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> nGramEncoding(
				DataframeAnalysisFeatureProcessorNGramEncoding v) {
			this.$variant = v;
			this.$tag = Tag.nGramEncoding;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> nGramEncoding(
				Function<DataframeAnalysisFeatureProcessorNGramEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorNGramEncoding>> f) {
			return this.nGramEncoding(f.apply(new DataframeAnalysisFeatureProcessorNGramEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> oneHotEncoding(
				DataframeAnalysisFeatureProcessorOneHotEncoding v) {
			this.$variant = v;
			this.$tag = Tag.oneHotEncoding;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> oneHotEncoding(
				Function<DataframeAnalysisFeatureProcessorOneHotEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorOneHotEncoding>> f) {
			return this.oneHotEncoding(f.apply(new DataframeAnalysisFeatureProcessorOneHotEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> targetMeanEncoding(
				DataframeAnalysisFeatureProcessorTargetMeanEncoding v) {
			this.$variant = v;
			this.$tag = Tag.targetMeanEncoding;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> targetMeanEncoding(
				Function<DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorTargetMeanEncoding>> f) {
			return this.targetMeanEncoding(
					f.apply(new DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder()).build());
		}

		protected DataframeAnalysisFeatureProcessor build() {
			return new DataframeAnalysisFeatureProcessor(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<DataframeAnalysisFeatureProcessor> DESERIALIZER = JsonpDeserializer
			.lazy(DataframeAnalysisFeatureProcessor::buildDeserializer);

	private static JsonpDeserializer<DataframeAnalysisFeatureProcessor> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::frequencyEncoding, DataframeAnalysisFeatureProcessorFrequencyEncoding.DESERIALIZER,
				"frequency_encoding");
		op.add(Builder::multiEncoding, DataframeAnalysisFeatureProcessorMultiEncoding.DESERIALIZER, "multi_encoding");
		op.add(Builder::nGramEncoding, DataframeAnalysisFeatureProcessorNGramEncoding.DESERIALIZER, "n_gram_encoding");
		op.add(Builder::oneHotEncoding, DataframeAnalysisFeatureProcessorOneHotEncoding.DESERIALIZER,
				"one_hot_encoding");
		op.add(Builder::targetMeanEncoding, DataframeAnalysisFeatureProcessorTargetMeanEncoding.DESERIALIZER,
				"target_mean_encoding");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
