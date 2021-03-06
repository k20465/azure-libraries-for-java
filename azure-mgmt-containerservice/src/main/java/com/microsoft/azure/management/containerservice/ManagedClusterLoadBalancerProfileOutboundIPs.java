/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Desired outbound IP resources for the cluster load balancer.
 */
public class ManagedClusterLoadBalancerProfileOutboundIPs {
    /**
     * A list of public IP resources.
     */
    @JsonProperty(value = "publicIPs")
    private List<ResourceReference> publicIPs;

    /**
     * Get a list of public IP resources.
     *
     * @return the publicIPs value
     */
    public List<ResourceReference> publicIPs() {
        return this.publicIPs;
    }

    /**
     * Set a list of public IP resources.
     *
     * @param publicIPs the publicIPs value to set
     * @return the ManagedClusterLoadBalancerProfileOutboundIPs object itself.
     */
    public ManagedClusterLoadBalancerProfileOutboundIPs withPublicIPs(List<ResourceReference> publicIPs) {
        this.publicIPs = publicIPs;
        return this;
    }

}
