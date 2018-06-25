/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL table item.
 */
public class USqlTable extends CatalogItem {
    /**
     * the name of the database.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * the name of the schema associated with this table and database.
     */
    @JsonProperty(value = "schemaName")
    private String schemaName;

    /**
     * the name of the table.
     */
    @JsonProperty(value = "tableName")
    private String name;

    /**
     * the list of columns in this table.
     */
    @JsonProperty(value = "columnList")
    private List<USqlTableColumn> columnList;

    /**
     * the list of indices in this table.
     */
    @JsonProperty(value = "indexList")
    private List<USqlIndex> indexList;

    /**
     * the list of partition keys in the table.
     */
    @JsonProperty(value = "partitionKeyList")
    private List<String> partitionKeyList;

    /**
     * the external table associated with the table.
     */
    @JsonProperty(value = "externalTable")
    private ExternalTable externalTable;

    /**
     * the distributions info of the table.
     */
    @JsonProperty(value = "distributionInfo")
    private USqlDistributionInfo distributionInfo;

    /**
     * Get the name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the database.
     *
     * @param databaseName the databaseName value to set
     * @return the USqlTable object itself.
     */
    public USqlTable withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the name of the schema associated with this table and database.
     *
     * @return the schemaName value
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Set the name of the schema associated with this table and database.
     *
     * @param schemaName the schemaName value to set
     * @return the USqlTable object itself.
     */
    public USqlTable withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get the name of the table.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the table.
     *
     * @param name the name value to set
     * @return the USqlTable object itself.
     */
    public USqlTable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the list of columns in this table.
     *
     * @return the columnList value
     */
    public List<USqlTableColumn> columnList() {
        return this.columnList;
    }

    /**
     * Set the list of columns in this table.
     *
     * @param columnList the columnList value to set
     * @return the USqlTable object itself.
     */
    public USqlTable withColumnList(List<USqlTableColumn> columnList) {
        this.columnList = columnList;
        return this;
    }

    /**
     * Get the list of indices in this table.
     *
     * @return the indexList value
     */
    public List<USqlIndex> indexList() {
        return this.indexList;
    }

    /**
     * Set the list of indices in this table.
     *
     * @param indexList the indexList value to set
     * @return the USqlTable object itself.
     */
    public USqlTable withIndexList(List<USqlIndex> indexList) {
        this.indexList = indexList;
        return this;
    }

    /**
     * Get the list of partition keys in the table.
     *
     * @return the partitionKeyList value
     */
    public List<String> partitionKeyList() {
        return this.partitionKeyList;
    }

    /**
     * Set the list of partition keys in the table.
     *
     * @param partitionKeyList the partitionKeyList value to set
     * @return the USqlTable object itself.
     */
    public USqlTable withPartitionKeyList(List<String> partitionKeyList) {
        this.partitionKeyList = partitionKeyList;
        return this;
    }

    /**
     * Get the external table associated with the table.
     *
     * @return the externalTable value
     */
    public ExternalTable externalTable() {
        return this.externalTable;
    }

    /**
     * Set the external table associated with the table.
     *
     * @param externalTable the externalTable value to set
     * @return the USqlTable object itself.
     */
    public USqlTable withExternalTable(ExternalTable externalTable) {
        this.externalTable = externalTable;
        return this;
    }

    /**
     * Get the distributions info of the table.
     *
     * @return the distributionInfo value
     */
    public USqlDistributionInfo distributionInfo() {
        return this.distributionInfo;
    }

    /**
     * Set the distributions info of the table.
     *
     * @param distributionInfo the distributionInfo value to set
     * @return the USqlTable object itself.
     */
    public USqlTable withDistributionInfo(USqlDistributionInfo distributionInfo) {
        this.distributionInfo = distributionInfo;
        return this;
    }

}
