/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.OperatingSystemTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Specifies information about the gallery Application Definition that you want
 * to create or update.
 */
@JsonFlatten
public class GalleryApplicationInner extends Resource {
    /**
     * The description of this gallery Application Definition resource. This
     * property is updatable.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The Eula agreement for the gallery Application Definition.
     */
    @JsonProperty(value = "properties.eula")
    private String eula;

    /**
     * The privacy statement uri.
     */
    @JsonProperty(value = "properties.privacyStatementUri")
    private String privacyStatementUri;

    /**
     * The release note uri.
     */
    @JsonProperty(value = "properties.releaseNoteUri")
    private String releaseNoteUri;

    /**
     * The end of life date of the gallery Application Definition. This
     * property can be used for decommissioning purposes. This property is
     * updatable.
     */
    @JsonProperty(value = "properties.endOfLifeDate")
    private DateTime endOfLifeDate;

    /**
     * This property allows you to specify the supported type of the OS that
     * application is built for. &lt;br&gt;&lt;br&gt; Possible values are:
     * &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
     * Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.supportedOSType", required = true)
    private OperatingSystemTypes supportedOSType;

    /**
     * Get the description of this gallery Application Definition resource. This property is updatable.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of this gallery Application Definition resource. This property is updatable.
     *
     * @param description the description value to set
     * @return the GalleryApplicationInner object itself.
     */
    public GalleryApplicationInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the Eula agreement for the gallery Application Definition.
     *
     * @return the eula value
     */
    public String eula() {
        return this.eula;
    }

    /**
     * Set the Eula agreement for the gallery Application Definition.
     *
     * @param eula the eula value to set
     * @return the GalleryApplicationInner object itself.
     */
    public GalleryApplicationInner withEula(String eula) {
        this.eula = eula;
        return this;
    }

    /**
     * Get the privacy statement uri.
     *
     * @return the privacyStatementUri value
     */
    public String privacyStatementUri() {
        return this.privacyStatementUri;
    }

    /**
     * Set the privacy statement uri.
     *
     * @param privacyStatementUri the privacyStatementUri value to set
     * @return the GalleryApplicationInner object itself.
     */
    public GalleryApplicationInner withPrivacyStatementUri(String privacyStatementUri) {
        this.privacyStatementUri = privacyStatementUri;
        return this;
    }

    /**
     * Get the release note uri.
     *
     * @return the releaseNoteUri value
     */
    public String releaseNoteUri() {
        return this.releaseNoteUri;
    }

    /**
     * Set the release note uri.
     *
     * @param releaseNoteUri the releaseNoteUri value to set
     * @return the GalleryApplicationInner object itself.
     */
    public GalleryApplicationInner withReleaseNoteUri(String releaseNoteUri) {
        this.releaseNoteUri = releaseNoteUri;
        return this;
    }

    /**
     * Get the end of life date of the gallery Application Definition. This property can be used for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value
     */
    public DateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the end of life date of the gallery Application Definition. This property can be used for decommissioning purposes. This property is updatable.
     *
     * @param endOfLifeDate the endOfLifeDate value to set
     * @return the GalleryApplicationInner object itself.
     */
    public GalleryApplicationInner withEndOfLifeDate(DateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /**
     * Get this property allows you to specify the supported type of the OS that application is built for. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**. Possible values include: 'Windows', 'Linux'.
     *
     * @return the supportedOSType value
     */
    public OperatingSystemTypes supportedOSType() {
        return this.supportedOSType;
    }

    /**
     * Set this property allows you to specify the supported type of the OS that application is built for. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**. Possible values include: 'Windows', 'Linux'.
     *
     * @param supportedOSType the supportedOSType value to set
     * @return the GalleryApplicationInner object itself.
     */
    public GalleryApplicationInner withSupportedOSType(OperatingSystemTypes supportedOSType) {
        this.supportedOSType = supportedOSType;
        return this;
    }

}
