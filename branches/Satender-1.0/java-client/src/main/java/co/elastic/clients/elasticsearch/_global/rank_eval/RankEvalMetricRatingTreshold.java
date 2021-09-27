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

package co.elastic.clients.elasticsearch._global.rank_eval;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalMetricRatingTreshold
public abstract class RankEvalMetricRatingTreshold extends RankEvalMetricBase {
	@Nullable
	private final Number relevantRatingThreshold;

	// ---------------------------------------------------------------------------------------------

	protected RankEvalMetricRatingTreshold(AbstractBuilder<?> builder) {
		super(builder);
		this.relevantRatingThreshold = builder.relevantRatingThreshold;

	}

	/**
	 * Sets the rating threshold above which documents are considered to be
	 * "relevant".
	 *
	 * API name: {@code relevant_rating_threshold}
	 */
	@Nullable
	public Number relevantRatingThreshold() {
		return this.relevantRatingThreshold;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.relevantRatingThreshold != null) {

			generator.writeKey("relevant_rating_threshold");
			generator.write(this.relevantRatingThreshold.doubleValue());

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				RankEvalMetricBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Number relevantRatingThreshold;

		/**
		 * Sets the rating threshold above which documents are considered to be
		 * "relevant".
		 *
		 * API name: {@code relevant_rating_threshold}
		 */
		public BuilderT relevantRatingThreshold(@Nullable Number value) {
			this.relevantRatingThreshold = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupRankEvalMetricRatingTresholdDeserializer(
			DelegatingDeserializer<BuilderT> op) {
		RankEvalMetricBase.setupRankEvalMetricBaseDeserializer(op);
		op.add(AbstractBuilder::relevantRatingThreshold, JsonpDeserializer.numberDeserializer(),
				"relevant_rating_threshold");

	}

}
