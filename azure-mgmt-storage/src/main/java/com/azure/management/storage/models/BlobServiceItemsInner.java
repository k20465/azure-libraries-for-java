// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The BlobServiceItems model.
 */
@Immutable
public final class BlobServiceItemsInner {
    /*
     * List of blob services returned.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<BlobServicePropertiesInner> value;

    /**
     * Get the value property: List of blob services returned.
     * 
     * @return the value value.
     */
    public List<BlobServicePropertiesInner> getValue() {
        return this.value;
    }
}
