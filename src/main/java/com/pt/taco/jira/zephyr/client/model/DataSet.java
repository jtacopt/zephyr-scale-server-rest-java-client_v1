package com.pt.taco.jira.zephyr.client.model;

import com.google.gson.annotations.SerializedName;

public class DataSet {

    public static final String SERIALIZED_NAME_PROJECT_KEY = "projectKey";
    public static final String SERIALIZED_NAME_NAME = "name";
    public static final String SERIALIZED_NAME_INDEX = "index";
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_PROJECT_KEY)
    private String projectKey;
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    @SerializedName(SERIALIZED_NAME_INDEX)
    private int index;
    @SerializedName(SERIALIZED_NAME_ID)
    private int id;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(final int index) {
        this.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }
}
