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

package co.elastic.clients.elasticsearch.api.security;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.security.AuthenticateRequest;
import co.elastic.clients.elasticsearch.security.AuthenticateResponse;
import co.elastic.clients.elasticsearch.security.ChangePasswordRequest;
import co.elastic.clients.elasticsearch.security.ChangePasswordResponse;
import co.elastic.clients.elasticsearch.security.ClearApiKeyCacheRequest;
import co.elastic.clients.elasticsearch.security.ClearApiKeyCacheResponse;
import co.elastic.clients.elasticsearch.security.ClearCachedPrivilegesRequest;
import co.elastic.clients.elasticsearch.security.ClearCachedPrivilegesResponse;
import co.elastic.clients.elasticsearch.security.ClearCachedRealmsRequest;
import co.elastic.clients.elasticsearch.security.ClearCachedRealmsResponse;
import co.elastic.clients.elasticsearch.security.ClearCachedRolesRequest;
import co.elastic.clients.elasticsearch.security.ClearCachedRolesResponse;
import co.elastic.clients.elasticsearch.security.ClearCachedServiceTokensRequest;
import co.elastic.clients.elasticsearch.security.ClearCachedServiceTokensResponse;
import co.elastic.clients.elasticsearch.security.CreateApiKeyRequest;
import co.elastic.clients.elasticsearch.security.CreateApiKeyResponse;
import co.elastic.clients.elasticsearch.security.CreateServiceTokenRequest;
import co.elastic.clients.elasticsearch.security.CreateServiceTokenResponse;
import co.elastic.clients.elasticsearch.security.DeletePrivilegesRequest;
import co.elastic.clients.elasticsearch.security.DeletePrivilegesResponse;
import co.elastic.clients.elasticsearch.security.DeleteRoleMappingRequest;
import co.elastic.clients.elasticsearch.security.DeleteRoleMappingResponse;
import co.elastic.clients.elasticsearch.security.DeleteRoleRequest;
import co.elastic.clients.elasticsearch.security.DeleteRoleResponse;
import co.elastic.clients.elasticsearch.security.DeleteServiceTokenRequest;
import co.elastic.clients.elasticsearch.security.DeleteServiceTokenResponse;
import co.elastic.clients.elasticsearch.security.DeleteUserRequest;
import co.elastic.clients.elasticsearch.security.DeleteUserResponse;
import co.elastic.clients.elasticsearch.security.DisableUserRequest;
import co.elastic.clients.elasticsearch.security.DisableUserResponse;
import co.elastic.clients.elasticsearch.security.EnableUserRequest;
import co.elastic.clients.elasticsearch.security.EnableUserResponse;
import co.elastic.clients.elasticsearch.security.GetApiKeyRequest;
import co.elastic.clients.elasticsearch.security.GetApiKeyResponse;
import co.elastic.clients.elasticsearch.security.GetBuiltinPrivilegesRequest;
import co.elastic.clients.elasticsearch.security.GetBuiltinPrivilegesResponse;
import co.elastic.clients.elasticsearch.security.GetPrivilegesRequest;
import co.elastic.clients.elasticsearch.security.GetPrivilegesResponse;
import co.elastic.clients.elasticsearch.security.GetRoleMappingRequest;
import co.elastic.clients.elasticsearch.security.GetRoleMappingResponse;
import co.elastic.clients.elasticsearch.security.GetRoleRequest;
import co.elastic.clients.elasticsearch.security.GetRoleResponse;
import co.elastic.clients.elasticsearch.security.GetServiceAccountsRequest;
import co.elastic.clients.elasticsearch.security.GetServiceAccountsResponse;
import co.elastic.clients.elasticsearch.security.GetServiceCredentialsRequest;
import co.elastic.clients.elasticsearch.security.GetServiceCredentialsResponse;
import co.elastic.clients.elasticsearch.security.GetTokenRequest;
import co.elastic.clients.elasticsearch.security.GetTokenResponse;
import co.elastic.clients.elasticsearch.security.GetUserPrivilegesRequest;
import co.elastic.clients.elasticsearch.security.GetUserPrivilegesResponse;
import co.elastic.clients.elasticsearch.security.GetUserRequest;
import co.elastic.clients.elasticsearch.security.GetUserResponse;
import co.elastic.clients.elasticsearch.security.GrantApiKeyRequest;
import co.elastic.clients.elasticsearch.security.GrantApiKeyResponse;
import co.elastic.clients.elasticsearch.security.HasPrivilegesRequest;
import co.elastic.clients.elasticsearch.security.HasPrivilegesResponse;
import co.elastic.clients.elasticsearch.security.InvalidateApiKeyRequest;
import co.elastic.clients.elasticsearch.security.InvalidateApiKeyResponse;
import co.elastic.clients.elasticsearch.security.InvalidateTokenRequest;
import co.elastic.clients.elasticsearch.security.InvalidateTokenResponse;
import co.elastic.clients.elasticsearch.security.PutPrivilegesRequest;
import co.elastic.clients.elasticsearch.security.PutPrivilegesResponse;
import co.elastic.clients.elasticsearch.security.PutRoleMappingRequest;
import co.elastic.clients.elasticsearch.security.PutRoleMappingResponse;
import co.elastic.clients.elasticsearch.security.PutRoleRequest;
import co.elastic.clients.elasticsearch.security.PutRoleResponse;
import co.elastic.clients.elasticsearch.security.PutUserRequest;
import co.elastic.clients.elasticsearch.security.PutUserResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the security namespace.
 */
public class SecurityClient extends ApiClient<SecurityClient> {

	public SecurityClient(Transport transport) {
		super(transport, null);
	}

	public SecurityClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: security.authenticate

	/**
	 * Enables authentication as a user and retrieve information about the
	 * authenticated user.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-authenticate.html"
	 */
	public AuthenticateResponse authenticate() throws IOException {
		return this.transport.performRequest(AuthenticateRequest.INSTANCE, AuthenticateRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: security.change_password

	/**
	 * Changes the passwords of users in the native realm and built-in users.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-change-password.html"
	 */

	public ChangePasswordResponse changePassword(ChangePasswordRequest request) throws IOException {
		return this.transport.performRequest(request, ChangePasswordRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Changes the passwords of users in the native realm and built-in users.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-change-password.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ChangePasswordResponse changePassword(
			Function<ChangePasswordRequest.Builder, ObjectBuilder<ChangePasswordRequest>> fn) throws IOException {
		return changePassword(fn.apply(new ChangePasswordRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_api_key_cache

	/**
	 * Clear a subset or all entries from the API key cache.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-api-key-cache.html"
	 */

	public ClearApiKeyCacheResponse clearApiKeyCache(ClearApiKeyCacheRequest request) throws IOException {
		return this.transport.performRequest(request, ClearApiKeyCacheRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Clear a subset or all entries from the API key cache.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-api-key-cache.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ClearApiKeyCacheResponse clearApiKeyCache(
			Function<ClearApiKeyCacheRequest.Builder, ObjectBuilder<ClearApiKeyCacheRequest>> fn) throws IOException {
		return clearApiKeyCache(fn.apply(new ClearApiKeyCacheRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_privileges

	/**
	 * Evicts application privileges from the native application privileges cache.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-privilege-cache.html"
	 */

	public ClearCachedPrivilegesResponse clearCachedPrivileges(ClearCachedPrivilegesRequest request)
			throws IOException {
		return this.transport.performRequest(request, ClearCachedPrivilegesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Evicts application privileges from the native application privileges cache.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-privilege-cache.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ClearCachedPrivilegesResponse clearCachedPrivileges(
			Function<ClearCachedPrivilegesRequest.Builder, ObjectBuilder<ClearCachedPrivilegesRequest>> fn)
			throws IOException {
		return clearCachedPrivileges(fn.apply(new ClearCachedPrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_realms

	/**
	 * Evicts users from the user cache. Can completely clear the cache or evict
	 * specific users.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-cache.html"
	 */

	public ClearCachedRealmsResponse clearCachedRealms(ClearCachedRealmsRequest request) throws IOException {
		return this.transport.performRequest(request, ClearCachedRealmsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Evicts users from the user cache. Can completely clear the cache or evict
	 * specific users.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-cache.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ClearCachedRealmsResponse clearCachedRealms(
			Function<ClearCachedRealmsRequest.Builder, ObjectBuilder<ClearCachedRealmsRequest>> fn) throws IOException {
		return clearCachedRealms(fn.apply(new ClearCachedRealmsRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_roles

	/**
	 * Evicts roles from the native role cache.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-role-cache.html"
	 */

	public ClearCachedRolesResponse clearCachedRoles(ClearCachedRolesRequest request) throws IOException {
		return this.transport.performRequest(request, ClearCachedRolesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Evicts roles from the native role cache.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-role-cache.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ClearCachedRolesResponse clearCachedRoles(
			Function<ClearCachedRolesRequest.Builder, ObjectBuilder<ClearCachedRolesRequest>> fn) throws IOException {
		return clearCachedRoles(fn.apply(new ClearCachedRolesRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_service_tokens

	/**
	 * Evicts tokens from the service account token caches.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-service-token-caches.html"
	 */

	public ClearCachedServiceTokensResponse clearCachedServiceTokens(ClearCachedServiceTokensRequest request)
			throws IOException {
		return this.transport.performRequest(request, ClearCachedServiceTokensRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Evicts tokens from the service account token caches.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-service-token-caches.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ClearCachedServiceTokensResponse clearCachedServiceTokens(
			Function<ClearCachedServiceTokensRequest.Builder, ObjectBuilder<ClearCachedServiceTokensRequest>> fn)
			throws IOException {
		return clearCachedServiceTokens(fn.apply(new ClearCachedServiceTokensRequest.Builder()).build());
	}

	// ----- Endpoint: security.create_api_key

	/**
	 * Creates an API key for access without requiring basic authentication.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-api-key.html"
	 */

	public CreateApiKeyResponse createApiKey(CreateApiKeyRequest request) throws IOException {
		return this.transport.performRequest(request, CreateApiKeyRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates an API key for access without requiring basic authentication.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-api-key.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CreateApiKeyResponse createApiKey(
			Function<CreateApiKeyRequest.Builder, ObjectBuilder<CreateApiKeyRequest>> fn) throws IOException {
		return createApiKey(fn.apply(new CreateApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.create_service_token

	/**
	 * Creates a service account token for access without requiring basic
	 * authentication.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-service-token.html"
	 */

	public CreateServiceTokenResponse createServiceToken(CreateServiceTokenRequest request) throws IOException {
		return this.transport.performRequest(request, CreateServiceTokenRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates a service account token for access without requiring basic
	 * authentication.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-service-token.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CreateServiceTokenResponse createServiceToken(
			Function<CreateServiceTokenRequest.Builder, ObjectBuilder<CreateServiceTokenRequest>> fn)
			throws IOException {
		return createServiceToken(fn.apply(new CreateServiceTokenRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_privileges

	/**
	 * Removes application privileges.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-privilege.html"
	 */

	public DeletePrivilegesResponse deletePrivileges(DeletePrivilegesRequest request) throws IOException {
		return this.transport.performRequest(request, DeletePrivilegesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Removes application privileges.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-privilege.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeletePrivilegesResponse deletePrivileges(
			Function<DeletePrivilegesRequest.Builder, ObjectBuilder<DeletePrivilegesRequest>> fn) throws IOException {
		return deletePrivileges(fn.apply(new DeletePrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_role

	/**
	 * Removes roles in the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role.html"
	 */

	public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteRoleRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Removes roles in the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteRoleResponse deleteRole(Function<DeleteRoleRequest.Builder, ObjectBuilder<DeleteRoleRequest>> fn)
			throws IOException {
		return deleteRole(fn.apply(new DeleteRoleRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_role_mapping

	/**
	 * Removes role mappings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role-mapping.html"
	 */

	public DeleteRoleMappingResponse deleteRoleMapping(DeleteRoleMappingRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteRoleMappingRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Removes role mappings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role-mapping.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteRoleMappingResponse deleteRoleMapping(
			Function<DeleteRoleMappingRequest.Builder, ObjectBuilder<DeleteRoleMappingRequest>> fn) throws IOException {
		return deleteRoleMapping(fn.apply(new DeleteRoleMappingRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_service_token

	/**
	 * Deletes a service account token.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-service-token.html"
	 */

	public DeleteServiceTokenResponse deleteServiceToken(DeleteServiceTokenRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteServiceTokenRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes a service account token.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-service-token.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteServiceTokenResponse deleteServiceToken(
			Function<DeleteServiceTokenRequest.Builder, ObjectBuilder<DeleteServiceTokenRequest>> fn)
			throws IOException {
		return deleteServiceToken(fn.apply(new DeleteServiceTokenRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_user

	/**
	 * Deletes users from the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-user.html"
	 */

	public DeleteUserResponse deleteUser(DeleteUserRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteUserRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes users from the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-user.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteUserResponse deleteUser(Function<DeleteUserRequest.Builder, ObjectBuilder<DeleteUserRequest>> fn)
			throws IOException {
		return deleteUser(fn.apply(new DeleteUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.disable_user

	/**
	 * Disables users in the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-disable-user.html"
	 */

	public DisableUserResponse disableUser(DisableUserRequest request) throws IOException {
		return this.transport.performRequest(request, DisableUserRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Disables users in the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-disable-user.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DisableUserResponse disableUser(
			Function<DisableUserRequest.Builder, ObjectBuilder<DisableUserRequest>> fn) throws IOException {
		return disableUser(fn.apply(new DisableUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.enable_user

	/**
	 * Enables users in the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-enable-user.html"
	 */

	public EnableUserResponse enableUser(EnableUserRequest request) throws IOException {
		return this.transport.performRequest(request, EnableUserRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Enables users in the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-enable-user.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final EnableUserResponse enableUser(Function<EnableUserRequest.Builder, ObjectBuilder<EnableUserRequest>> fn)
			throws IOException {
		return enableUser(fn.apply(new EnableUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_api_key

	/**
	 * Retrieves information for one or more API keys.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-api-key.html"
	 */

	public GetApiKeyResponse getApiKey(GetApiKeyRequest request) throws IOException {
		return this.transport.performRequest(request, GetApiKeyRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves information for one or more API keys.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-api-key.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetApiKeyResponse getApiKey(Function<GetApiKeyRequest.Builder, ObjectBuilder<GetApiKeyRequest>> fn)
			throws IOException {
		return getApiKey(fn.apply(new GetApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_builtin_privileges

	/**
	 * Retrieves the list of cluster privileges and index privileges that are
	 * available in this version of Elasticsearch.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-builtin-privileges.html"
	 */
	public GetBuiltinPrivilegesResponse getBuiltinPrivileges() throws IOException {
		return this.transport.performRequest(GetBuiltinPrivilegesRequest.INSTANCE, GetBuiltinPrivilegesRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: security.get_privileges

	/**
	 * Retrieves application privileges.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-privileges.html"
	 */

	public GetPrivilegesResponse getPrivileges(GetPrivilegesRequest request) throws IOException {
		return this.transport.performRequest(request, GetPrivilegesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves application privileges.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-privileges.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetPrivilegesResponse getPrivileges(
			Function<GetPrivilegesRequest.Builder, ObjectBuilder<GetPrivilegesRequest>> fn) throws IOException {
		return getPrivileges(fn.apply(new GetPrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_role

	/**
	 * Retrieves roles in the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role.html"
	 */

	public GetRoleResponse getRole(GetRoleRequest request) throws IOException {
		return this.transport.performRequest(request, GetRoleRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves roles in the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetRoleResponse getRole(Function<GetRoleRequest.Builder, ObjectBuilder<GetRoleRequest>> fn)
			throws IOException {
		return getRole(fn.apply(new GetRoleRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_role_mapping

	/**
	 * Retrieves role mappings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role-mapping.html"
	 */

	public GetRoleMappingResponse getRoleMapping(GetRoleMappingRequest request) throws IOException {
		return this.transport.performRequest(request, GetRoleMappingRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves role mappings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role-mapping.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetRoleMappingResponse getRoleMapping(
			Function<GetRoleMappingRequest.Builder, ObjectBuilder<GetRoleMappingRequest>> fn) throws IOException {
		return getRoleMapping(fn.apply(new GetRoleMappingRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_service_accounts

	/**
	 * Retrieves information about service accounts.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-accounts.html"
	 */

	public GetServiceAccountsResponse getServiceAccounts(GetServiceAccountsRequest request) throws IOException {
		return this.transport.performRequest(request, GetServiceAccountsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves information about service accounts.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-accounts.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetServiceAccountsResponse getServiceAccounts(
			Function<GetServiceAccountsRequest.Builder, ObjectBuilder<GetServiceAccountsRequest>> fn)
			throws IOException {
		return getServiceAccounts(fn.apply(new GetServiceAccountsRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_service_credentials

	/**
	 * Retrieves information of all service credentials for a service account.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-credentials.html"
	 */

	public GetServiceCredentialsResponse getServiceCredentials(GetServiceCredentialsRequest request)
			throws IOException {
		return this.transport.performRequest(request, GetServiceCredentialsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves information of all service credentials for a service account.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-credentials.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetServiceCredentialsResponse getServiceCredentials(
			Function<GetServiceCredentialsRequest.Builder, ObjectBuilder<GetServiceCredentialsRequest>> fn)
			throws IOException {
		return getServiceCredentials(fn.apply(new GetServiceCredentialsRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_token

	/**
	 * Creates a bearer token for access without requiring basic authentication.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-token.html"
	 */

	public GetTokenResponse getToken(GetTokenRequest request) throws IOException {
		return this.transport.performRequest(request, GetTokenRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates a bearer token for access without requiring basic authentication.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-token.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetTokenResponse getToken(Function<GetTokenRequest.Builder, ObjectBuilder<GetTokenRequest>> fn)
			throws IOException {
		return getToken(fn.apply(new GetTokenRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_user

	/**
	 * Retrieves information about users in the native realm and built-in users.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user.html"
	 */

	public GetUserResponse getUser(GetUserRequest request) throws IOException {
		return this.transport.performRequest(request, GetUserRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves information about users in the native realm and built-in users.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetUserResponse getUser(Function<GetUserRequest.Builder, ObjectBuilder<GetUserRequest>> fn)
			throws IOException {
		return getUser(fn.apply(new GetUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_user_privileges

	/**
	 * Retrieves security privileges for the logged in user.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-privileges.html"
	 */

	public GetUserPrivilegesResponse getUserPrivileges(GetUserPrivilegesRequest request) throws IOException {
		return this.transport.performRequest(request, GetUserPrivilegesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves security privileges for the logged in user.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-privileges.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetUserPrivilegesResponse getUserPrivileges(
			Function<GetUserPrivilegesRequest.Builder, ObjectBuilder<GetUserPrivilegesRequest>> fn) throws IOException {
		return getUserPrivileges(fn.apply(new GetUserPrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.grant_api_key

	/**
	 * Creates an API key on behalf of another user.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-grant-api-key.html"
	 */

	public GrantApiKeyResponse grantApiKey(GrantApiKeyRequest request) throws IOException {
		return this.transport.performRequest(request, GrantApiKeyRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates an API key on behalf of another user.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-grant-api-key.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GrantApiKeyResponse grantApiKey(
			Function<GrantApiKeyRequest.Builder, ObjectBuilder<GrantApiKeyRequest>> fn) throws IOException {
		return grantApiKey(fn.apply(new GrantApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.has_privileges

	/**
	 * Determines whether the specified user has a specified list of privileges.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges.html"
	 */

	public HasPrivilegesResponse hasPrivileges(HasPrivilegesRequest request) throws IOException {
		return this.transport.performRequest(request, HasPrivilegesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Determines whether the specified user has a specified list of privileges.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final HasPrivilegesResponse hasPrivileges(
			Function<HasPrivilegesRequest.Builder, ObjectBuilder<HasPrivilegesRequest>> fn) throws IOException {
		return hasPrivileges(fn.apply(new HasPrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.invalidate_api_key

	/**
	 * Invalidates one or more API keys.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-api-key.html"
	 */

	public InvalidateApiKeyResponse invalidateApiKey(InvalidateApiKeyRequest request) throws IOException {
		return this.transport.performRequest(request, InvalidateApiKeyRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Invalidates one or more API keys.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-api-key.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final InvalidateApiKeyResponse invalidateApiKey(
			Function<InvalidateApiKeyRequest.Builder, ObjectBuilder<InvalidateApiKeyRequest>> fn) throws IOException {
		return invalidateApiKey(fn.apply(new InvalidateApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.invalidate_token

	/**
	 * Invalidates one or more access tokens or refresh tokens.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-token.html"
	 */

	public InvalidateTokenResponse invalidateToken(InvalidateTokenRequest request) throws IOException {
		return this.transport.performRequest(request, InvalidateTokenRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Invalidates one or more access tokens or refresh tokens.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-token.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final InvalidateTokenResponse invalidateToken(
			Function<InvalidateTokenRequest.Builder, ObjectBuilder<InvalidateTokenRequest>> fn) throws IOException {
		return invalidateToken(fn.apply(new InvalidateTokenRequest.Builder()).build());
	}

	// ----- Endpoint: security.put_privileges

	/**
	 * Adds or updates application privileges.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-privileges.html"
	 */

	public PutPrivilegesResponse putPrivileges(PutPrivilegesRequest request) throws IOException {
		return this.transport.performRequest(request, PutPrivilegesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Adds or updates application privileges.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-privileges.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutPrivilegesResponse putPrivileges(
			Function<PutPrivilegesRequest.Builder, ObjectBuilder<PutPrivilegesRequest>> fn) throws IOException {
		return putPrivileges(fn.apply(new PutPrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.put_role

	/**
	 * Adds and updates roles in the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role.html"
	 */

	public PutRoleResponse putRole(PutRoleRequest request) throws IOException {
		return this.transport.performRequest(request, PutRoleRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Adds and updates roles in the native realm.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutRoleResponse putRole(Function<PutRoleRequest.Builder, ObjectBuilder<PutRoleRequest>> fn)
			throws IOException {
		return putRole(fn.apply(new PutRoleRequest.Builder()).build());
	}

	// ----- Endpoint: security.put_role_mapping

	/**
	 * Creates and updates role mappings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role-mapping.html"
	 */

	public PutRoleMappingResponse putRoleMapping(PutRoleMappingRequest request) throws IOException {
		return this.transport.performRequest(request, PutRoleMappingRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates and updates role mappings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role-mapping.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutRoleMappingResponse putRoleMapping(
			Function<PutRoleMappingRequest.Builder, ObjectBuilder<PutRoleMappingRequest>> fn) throws IOException {
		return putRoleMapping(fn.apply(new PutRoleMappingRequest.Builder()).build());
	}

	// ----- Endpoint: security.put_user

	/**
	 * Adds and updates users in the native realm. These users are commonly referred
	 * to as native users.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-user.html"
	 */

	public PutUserResponse putUser(PutUserRequest request) throws IOException {
		return this.transport.performRequest(request, PutUserRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Adds and updates users in the native realm. These users are commonly referred
	 * to as native users.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-user.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutUserResponse putUser(Function<PutUserRequest.Builder, ObjectBuilder<PutUserRequest>> fn)
			throws IOException {
		return putUser(fn.apply(new PutUserRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #SecurityClient} with specific request options.
	 */
	@Override
	public SecurityClient withRequestOptions(@Nullable RequestOptions options) {
		return new SecurityClient(transport, options);
	}

	/**
	 * Creates a new {@link #SecurityClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public SecurityClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
