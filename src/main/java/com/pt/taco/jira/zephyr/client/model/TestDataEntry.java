/*
 * Zephyr Scale Server API (v1)
 * ## DISCLAIMER  We strongly discourage and do not endorse using private APIs for any purpose. Important points to remember:  1. **Non-Endorsement**: We do not support or endorse private API usage.  2. **API Changes**: Private APIs may change without notice; use them at your own risk.  3. **Data Responsibility**: We are not responsible for issues arising from private API use, such ***as data corruption***.  Please follow our terms of service and official ***public*** APIs for a stable and secure application experience. Unauthorized private API use may lead to instability and ***data corruption***.  ## Accessing the API The Zephyr Scale REST API is ready to use if you have Zephyr Scale installed on your JIRA instance. All API uses the following base URL: ``` http://your-jira-host:port/your-jira-context/rest/atm/1.0/ ``` For instance, you can create test results using the \"testresult\" api: ``` POST http://localhost:2990/jira/rest/atm/1.0/testresult ```  ## Authentication Basics Any authentication that works with JIRA will work with the Zephyr Scale REST API. The prefered authentication methods are OAuth and HTTP Basic. See the [JIRA SERVER REST API](https://developer.atlassian.com/server/jira/platform/rest-apis) docs for details. ## Using Status and Environment Fields Some entities, such as the Test Results, may have status and environment fields. The values of these fields are identified by name, not by the localized name. Both fields may have custom values defined by the user on the Zephyr Scale configuration area. All values are **case sensitive**, and they must be set just as displayed on the add-on.  These are the default values, which must be used on the APIs instead of their localized versions: * Test Cases:   * Draft   * Approved   * Deprecated  * Test Runs:   * Not Executed   * In Progress   * Done  * Test Results:   * Not Executed   * In Progress   * Pass   * Fail   * Blocked ## Handling Date Format The API supports the ISO 8601 format for date/time fields. This allows you to pass in the level of detail you need to. When a field is not specified, the earliest possible value is the default. For example, if you do not specify a time of day, we will default to 00:00 (midnight). Similarly, not specifying a timezone defaults the timezone to GMT. The full representation is of the format: ``` yyyy-MM-ddTHH:mm:ss.SSSZ ``` This table illustrates some example valid dates and times:  | Input | Equivalent to | | ------ | ----------- | | 2016 | 2016-01-01T00:00:00.000Z | | 2016-04 | 2016-04-01T00:00:00.000Z | | 2016-04-15 | 2016-04-15T00:00:00.000Z | | 2016-04-15T16 | 2016-04-15T16:00:00.000Z | | 2016-04-15T16:15 | 2016-04-15T16:15:00.000Z | | 2016-04-15T16:15Z | 2016-04-15T16:15:00.000Z (GMT time zone) | | 2016-04-15T16:15-0300 | 2016-04-15T16:15:00.000-0300 (Brazil time zone) |
 *
 * The version of the OpenAPI document: 1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.pt.taco.jira.zephyr.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.SerializedName;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * TestDataEntry
 */
@NoArgsConstructor
@JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class TestDataEntry {
    public static final String SERIALIZED_NAME_NAME = "name";
    public static final String SERIALIZED_NAME_INDEX = "index";
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    @SerializedName(SERIALIZED_NAME_INDEX)
    private BigDecimal index;
    @SerializedName(SERIALIZED_NAME_ID)
    private BigDecimal id;
    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;

    @SerializedName("dataSetItem")
    private DataSetItem dataSetItem;

    public TestDataEntry name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @javax.annotation.Nullable

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public TestDataEntry index(BigDecimal index) {

        this.index = index;
        return this;
    }

    /**
     * Get index
     *
     * @return index
     **/
    @javax.annotation.Nullable

    public BigDecimal getIndex() {
        return index;
    }


    public void setIndex(BigDecimal index) {
        this.index = index;
    }


    public TestDataEntry id(BigDecimal id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nullable

    public BigDecimal getId() {
        return id;
    }


    public void setId(BigDecimal id) {
        this.id = id;
    }


    public TestDataEntry value(String value) {

        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public DataSetItem getDataSetItem() {
        return dataSetItem;
    }

    public void setDataSetItem(final DataSetItem dataSetItem) {
        this.dataSetItem = dataSetItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestDataEntry testDataEntry = (TestDataEntry) o;
        return Objects.equals(this.name, testDataEntry.name) &&
                Objects.equals(this.index, testDataEntry.index) &&
                Objects.equals(this.id, testDataEntry.id) &&
                Objects.equals(this.value, testDataEntry.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, index, id, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestDataEntry {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

