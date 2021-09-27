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

package co.elastic.clients.elasticsearch.cluster.reroute;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.reroute.Command
public final class Command implements ToJsonp {
	@Nullable
	private final CommandCancelAction cancel;

	@Nullable
	private final CommandMoveAction move;

	@Nullable
	private final CommandAllocateReplicaAction allocateReplica;

	@Nullable
	private final CommandAllocatePrimaryAction allocateStalePrimary;

	@Nullable
	private final CommandAllocatePrimaryAction allocateEmptyPrimary;

	// ---------------------------------------------------------------------------------------------

	protected Command(Builder builder) {

		this.cancel = builder.cancel;
		this.move = builder.move;
		this.allocateReplica = builder.allocateReplica;
		this.allocateStalePrimary = builder.allocateStalePrimary;
		this.allocateEmptyPrimary = builder.allocateEmptyPrimary;

	}

	/**
	 * Cancel allocation of a shard (or recovery). Accepts index and shard for index
	 * name and shard number, and node for the node to cancel the shard allocation
	 * on. This can be used to force resynchronization of existing replicas from the
	 * primary shard by cancelling them and allowing them to be reinitialized
	 * through the standard recovery process. By default only replica shard
	 * allocations can be cancelled. If it is necessary to cancel the allocation of
	 * a primary shard then the allow_primary flag must also be included in the
	 * request.
	 *
	 * API name: {@code cancel}
	 */
	@Nullable
	public CommandCancelAction cancel() {
		return this.cancel;
	}

	/**
	 * Move a started shard from one node to another node. Accepts index and shard
	 * for index name and shard number, from_node for the node to move the shard
	 * from, and to_node for the node to move the shard to.
	 *
	 * API name: {@code move}
	 */
	@Nullable
	public CommandMoveAction move() {
		return this.move;
	}

	/**
	 * Allocate an unassigned replica shard to a node. Accepts index and shard for
	 * index name and shard number, and node to allocate the shard to. Takes
	 * allocation deciders into account.
	 *
	 * API name: {@code allocate_replica}
	 */
	@Nullable
	public CommandAllocateReplicaAction allocateReplica() {
		return this.allocateReplica;
	}

	/**
	 * Allocate a primary shard to a node that holds a stale copy. Accepts the index
	 * and shard for index name and shard number, and node to allocate the shard to.
	 * Using this command may lead to data loss for the provided shard id. If a node
	 * which has the good copy of the data rejoins the cluster later on, that data
	 * will be deleted or overwritten with the data of the stale copy that was
	 * forcefully allocated with this command. To ensure that these implications are
	 * well-understood, this command requires the flag accept_data_loss to be
	 * explicitly set to true.
	 *
	 * API name: {@code allocate_stale_primary}
	 */
	@Nullable
	public CommandAllocatePrimaryAction allocateStalePrimary() {
		return this.allocateStalePrimary;
	}

	/**
	 * Allocate an empty primary shard to a node. Accepts the index and shard for
	 * index name and shard number, and node to allocate the shard to. Using this
	 * command leads to a complete loss of all data that was indexed into this
	 * shard, if it was previously started. If a node which has a copy of the data
	 * rejoins the cluster later on, that data will be deleted. To ensure that these
	 * implications are well-understood, this command requires the flag
	 * accept_data_loss to be explicitly set to true.
	 *
	 * API name: {@code allocate_empty_primary}
	 */
	@Nullable
	public CommandAllocatePrimaryAction allocateEmptyPrimary() {
		return this.allocateEmptyPrimary;
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

		if (this.cancel != null) {

			generator.writeKey("cancel");
			this.cancel.toJsonp(generator, mapper);

		}
		if (this.move != null) {

			generator.writeKey("move");
			this.move.toJsonp(generator, mapper);

		}
		if (this.allocateReplica != null) {

			generator.writeKey("allocate_replica");
			this.allocateReplica.toJsonp(generator, mapper);

		}
		if (this.allocateStalePrimary != null) {

			generator.writeKey("allocate_stale_primary");
			this.allocateStalePrimary.toJsonp(generator, mapper);

		}
		if (this.allocateEmptyPrimary != null) {

			generator.writeKey("allocate_empty_primary");
			this.allocateEmptyPrimary.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Command}.
	 */
	public static class Builder implements ObjectBuilder<Command> {
		@Nullable
		private CommandCancelAction cancel;

		@Nullable
		private CommandMoveAction move;

		@Nullable
		private CommandAllocateReplicaAction allocateReplica;

		@Nullable
		private CommandAllocatePrimaryAction allocateStalePrimary;

		@Nullable
		private CommandAllocatePrimaryAction allocateEmptyPrimary;

		/**
		 * Cancel allocation of a shard (or recovery). Accepts index and shard for index
		 * name and shard number, and node for the node to cancel the shard allocation
		 * on. This can be used to force resynchronization of existing replicas from the
		 * primary shard by cancelling them and allowing them to be reinitialized
		 * through the standard recovery process. By default only replica shard
		 * allocations can be cancelled. If it is necessary to cancel the allocation of
		 * a primary shard then the allow_primary flag must also be included in the
		 * request.
		 *
		 * API name: {@code cancel}
		 */
		public Builder cancel(@Nullable CommandCancelAction value) {
			this.cancel = value;
			return this;
		}

		/**
		 * Cancel allocation of a shard (or recovery). Accepts index and shard for index
		 * name and shard number, and node for the node to cancel the shard allocation
		 * on. This can be used to force resynchronization of existing replicas from the
		 * primary shard by cancelling them and allowing them to be reinitialized
		 * through the standard recovery process. By default only replica shard
		 * allocations can be cancelled. If it is necessary to cancel the allocation of
		 * a primary shard then the allow_primary flag must also be included in the
		 * request.
		 *
		 * API name: {@code cancel}
		 */
		public Builder cancel(Function<CommandCancelAction.Builder, ObjectBuilder<CommandCancelAction>> fn) {
			return this.cancel(fn.apply(new CommandCancelAction.Builder()).build());
		}

		/**
		 * Move a started shard from one node to another node. Accepts index and shard
		 * for index name and shard number, from_node for the node to move the shard
		 * from, and to_node for the node to move the shard to.
		 *
		 * API name: {@code move}
		 */
		public Builder move(@Nullable CommandMoveAction value) {
			this.move = value;
			return this;
		}

		/**
		 * Move a started shard from one node to another node. Accepts index and shard
		 * for index name and shard number, from_node for the node to move the shard
		 * from, and to_node for the node to move the shard to.
		 *
		 * API name: {@code move}
		 */
		public Builder move(Function<CommandMoveAction.Builder, ObjectBuilder<CommandMoveAction>> fn) {
			return this.move(fn.apply(new CommandMoveAction.Builder()).build());
		}

		/**
		 * Allocate an unassigned replica shard to a node. Accepts index and shard for
		 * index name and shard number, and node to allocate the shard to. Takes
		 * allocation deciders into account.
		 *
		 * API name: {@code allocate_replica}
		 */
		public Builder allocateReplica(@Nullable CommandAllocateReplicaAction value) {
			this.allocateReplica = value;
			return this;
		}

		/**
		 * Allocate an unassigned replica shard to a node. Accepts index and shard for
		 * index name and shard number, and node to allocate the shard to. Takes
		 * allocation deciders into account.
		 *
		 * API name: {@code allocate_replica}
		 */
		public Builder allocateReplica(
				Function<CommandAllocateReplicaAction.Builder, ObjectBuilder<CommandAllocateReplicaAction>> fn) {
			return this.allocateReplica(fn.apply(new CommandAllocateReplicaAction.Builder()).build());
		}

		/**
		 * Allocate a primary shard to a node that holds a stale copy. Accepts the index
		 * and shard for index name and shard number, and node to allocate the shard to.
		 * Using this command may lead to data loss for the provided shard id. If a node
		 * which has the good copy of the data rejoins the cluster later on, that data
		 * will be deleted or overwritten with the data of the stale copy that was
		 * forcefully allocated with this command. To ensure that these implications are
		 * well-understood, this command requires the flag accept_data_loss to be
		 * explicitly set to true.
		 *
		 * API name: {@code allocate_stale_primary}
		 */
		public Builder allocateStalePrimary(@Nullable CommandAllocatePrimaryAction value) {
			this.allocateStalePrimary = value;
			return this;
		}

		/**
		 * Allocate a primary shard to a node that holds a stale copy. Accepts the index
		 * and shard for index name and shard number, and node to allocate the shard to.
		 * Using this command may lead to data loss for the provided shard id. If a node
		 * which has the good copy of the data rejoins the cluster later on, that data
		 * will be deleted or overwritten with the data of the stale copy that was
		 * forcefully allocated with this command. To ensure that these implications are
		 * well-understood, this command requires the flag accept_data_loss to be
		 * explicitly set to true.
		 *
		 * API name: {@code allocate_stale_primary}
		 */
		public Builder allocateStalePrimary(
				Function<CommandAllocatePrimaryAction.Builder, ObjectBuilder<CommandAllocatePrimaryAction>> fn) {
			return this.allocateStalePrimary(fn.apply(new CommandAllocatePrimaryAction.Builder()).build());
		}

		/**
		 * Allocate an empty primary shard to a node. Accepts the index and shard for
		 * index name and shard number, and node to allocate the shard to. Using this
		 * command leads to a complete loss of all data that was indexed into this
		 * shard, if it was previously started. If a node which has a copy of the data
		 * rejoins the cluster later on, that data will be deleted. To ensure that these
		 * implications are well-understood, this command requires the flag
		 * accept_data_loss to be explicitly set to true.
		 *
		 * API name: {@code allocate_empty_primary}
		 */
		public Builder allocateEmptyPrimary(@Nullable CommandAllocatePrimaryAction value) {
			this.allocateEmptyPrimary = value;
			return this;
		}

		/**
		 * Allocate an empty primary shard to a node. Accepts the index and shard for
		 * index name and shard number, and node to allocate the shard to. Using this
		 * command leads to a complete loss of all data that was indexed into this
		 * shard, if it was previously started. If a node which has a copy of the data
		 * rejoins the cluster later on, that data will be deleted. To ensure that these
		 * implications are well-understood, this command requires the flag
		 * accept_data_loss to be explicitly set to true.
		 *
		 * API name: {@code allocate_empty_primary}
		 */
		public Builder allocateEmptyPrimary(
				Function<CommandAllocatePrimaryAction.Builder, ObjectBuilder<CommandAllocatePrimaryAction>> fn) {
			return this.allocateEmptyPrimary(fn.apply(new CommandAllocatePrimaryAction.Builder()).build());
		}

		/**
		 * Builds a {@link Command}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Command build() {

			return new Command(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Command
	 */
	public static final JsonpDeserializer<Command> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Command::setupCommandDeserializer);

	protected static void setupCommandDeserializer(DelegatingDeserializer<Command.Builder> op) {

		op.add(Builder::cancel, CommandCancelAction.DESERIALIZER, "cancel");
		op.add(Builder::move, CommandMoveAction.DESERIALIZER, "move");
		op.add(Builder::allocateReplica, CommandAllocateReplicaAction.DESERIALIZER, "allocate_replica");
		op.add(Builder::allocateStalePrimary, CommandAllocatePrimaryAction.DESERIALIZER, "allocate_stale_primary");
		op.add(Builder::allocateEmptyPrimary, CommandAllocatePrimaryAction.DESERIALIZER, "allocate_empty_primary");

	}

}
