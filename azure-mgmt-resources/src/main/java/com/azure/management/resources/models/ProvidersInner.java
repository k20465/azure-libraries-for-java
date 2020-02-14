// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Providers.
 */
public final class ProvidersInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ProvidersService service;

    /**
     * The service client containing this operation class.
     */
    private ResourceManagementClientImpl client;

    /**
     * Initializes an instance of ProvidersInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ProvidersInner(ResourceManagementClientImpl client) {
        this.service = RestProxy.create(ProvidersService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ResourceManagementClientProviders to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ResourceManagementClientProviders")
    private interface ProvidersService {
        @Post("/subscriptions/{subscriptionId}/providers/{resourceProviderNamespace}/unregister")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ProviderInner>> unregister(@HostParam("$host") String host, @PathParam("resourceProviderNamespace") String resourceProviderNamespace, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Post("/subscriptions/{subscriptionId}/providers/{resourceProviderNamespace}/register")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ProviderInner>> register(@HostParam("$host") String host, @PathParam("resourceProviderNamespace") String resourceProviderNamespace, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ProviderListResultInner>> list(@HostParam("$host") String host, @QueryParam("$top") Integer top, @QueryParam("$expand") String expand, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/providers")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ProviderListResultInner>> listAtTenantScope(@HostParam("$host") String host, @QueryParam("$top") Integer top, @QueryParam("$expand") String expand, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/{resourceProviderNamespace}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ProviderInner>> get(@HostParam("$host") String host, @QueryParam("$expand") String expand, @PathParam("resourceProviderNamespace") String resourceProviderNamespace, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/providers/{resourceProviderNamespace}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ProviderInner>> getAtTenantScope(@HostParam("$host") String host, @QueryParam("$expand") String expand, @PathParam("resourceProviderNamespace") String resourceProviderNamespace, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ProviderListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ProviderListResultInner>> listAtTenantScopeNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Unregisters a subscription from a resource provider.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ProviderInner>> unregisterWithResponseAsync(String resourceProviderNamespace) {
        return service.unregister(this.client.getHost(), resourceProviderNamespace, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    /**
     * Unregisters a subscription from a resource provider.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProviderInner> unregisterAsync(String resourceProviderNamespace) {
        return unregisterWithResponseAsync(resourceProviderNamespace)
            .flatMap((SimpleResponse<ProviderInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Unregisters a subscription from a resource provider.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProviderInner unregister(String resourceProviderNamespace) {
        return unregisterAsync(resourceProviderNamespace).block();
    }

    /**
     * Registers a subscription with a resource provider.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ProviderInner>> registerWithResponseAsync(String resourceProviderNamespace) {
        return service.register(this.client.getHost(), resourceProviderNamespace, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    /**
     * Registers a subscription with a resource provider.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProviderInner> registerAsync(String resourceProviderNamespace) {
        return registerWithResponseAsync(resourceProviderNamespace)
            .flatMap((SimpleResponse<ProviderInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Registers a subscription with a resource provider.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProviderInner register(String resourceProviderNamespace) {
        return registerAsync(resourceProviderNamespace).block();
    }

    /**
     * Gets all resource providers for a subscription.
     * 
     * @param top 
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderInner>> listSinglePageAsync(Integer top, String expand) {
        return service.list(this.client.getHost(), top, expand, this.client.getSubscriptionId(), this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets all resource providers for a subscription.
     * 
     * @param top 
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ProviderInner> listAsync(Integer top, String expand) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(top, expand),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all resource providers for a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ProviderInner> listAsync() {
        final Integer top = null;
        final String expand = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(top, expand),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all resource providers for a subscription.
     * 
     * @param top 
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProviderInner> list(Integer top, String expand) {
        return new PagedIterable<>(listAsync(top, expand));
    }

    /**
     * Gets all resource providers for a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProviderInner> list() {
        final Integer top = null;
        final String expand = null;
        return new PagedIterable<>(listAsync(top, expand));
    }

    /**
     * Gets all resource providers for the tenant.
     * 
     * @param top 
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderInner>> listAtTenantScopeSinglePageAsync(Integer top, String expand) {
        return service.listAtTenantScope(this.client.getHost(), top, expand, this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets all resource providers for the tenant.
     * 
     * @param top 
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ProviderInner> listAtTenantScopeAsync(Integer top, String expand) {
        return new PagedFlux<>(
            () -> listAtTenantScopeSinglePageAsync(top, expand),
            nextLink -> listAtTenantScopeNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all resource providers for the tenant.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ProviderInner> listAtTenantScopeAsync() {
        final Integer top = null;
        final String expand = null;
        return new PagedFlux<>(
            () -> listAtTenantScopeSinglePageAsync(top, expand),
            nextLink -> listAtTenantScopeNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all resource providers for the tenant.
     * 
     * @param top 
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProviderInner> listAtTenantScope(Integer top, String expand) {
        return new PagedIterable<>(listAtTenantScopeAsync(top, expand));
    }

    /**
     * Gets all resource providers for the tenant.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProviderInner> listAtTenantScope() {
        final Integer top = null;
        final String expand = null;
        return new PagedIterable<>(listAtTenantScopeAsync(top, expand));
    }

    /**
     * Gets the specified resource provider.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ProviderInner>> getWithResponseAsync(String resourceProviderNamespace, String expand) {
        return service.get(this.client.getHost(), expand, resourceProviderNamespace, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    /**
     * Gets the specified resource provider.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProviderInner> getAsync(String resourceProviderNamespace, String expand) {
        return getWithResponseAsync(resourceProviderNamespace, expand)
            .flatMap((SimpleResponse<ProviderInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified resource provider.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProviderInner> getAsync(String resourceProviderNamespace) {
        final String expand = null;
        return getWithResponseAsync(resourceProviderNamespace, expand)
            .flatMap((SimpleResponse<ProviderInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified resource provider.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProviderInner get(String resourceProviderNamespace, String expand) {
        return getAsync(resourceProviderNamespace, expand).block();
    }

    /**
     * Gets the specified resource provider.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProviderInner get(String resourceProviderNamespace) {
        final String expand = null;
        return getAsync(resourceProviderNamespace, expand).block();
    }

    /**
     * Gets the specified resource provider at the tenant level.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ProviderInner>> getAtTenantScopeWithResponseAsync(String resourceProviderNamespace, String expand) {
        return service.getAtTenantScope(this.client.getHost(), expand, resourceProviderNamespace, this.client.getApiVersion());
    }

    /**
     * Gets the specified resource provider at the tenant level.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProviderInner> getAtTenantScopeAsync(String resourceProviderNamespace, String expand) {
        return getAtTenantScopeWithResponseAsync(resourceProviderNamespace, expand)
            .flatMap((SimpleResponse<ProviderInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified resource provider at the tenant level.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProviderInner> getAtTenantScopeAsync(String resourceProviderNamespace) {
        final String expand = null;
        return getAtTenantScopeWithResponseAsync(resourceProviderNamespace, expand)
            .flatMap((SimpleResponse<ProviderInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified resource provider at the tenant level.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @param expand The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProviderInner getAtTenantScope(String resourceProviderNamespace, String expand) {
        return getAtTenantScopeAsync(resourceProviderNamespace, expand).block();
    }

    /**
     * Gets the specified resource provider at the tenant level.
     * 
     * @param resourceProviderNamespace The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProviderInner getAtTenantScope(String resourceProviderNamespace) {
        final String expand = null;
        return getAtTenantScopeAsync(resourceProviderNamespace, expand).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderInner>> listAtTenantScopeNextSinglePageAsync(String nextLink) {
        return service.listAtTenantScopeNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }
}
