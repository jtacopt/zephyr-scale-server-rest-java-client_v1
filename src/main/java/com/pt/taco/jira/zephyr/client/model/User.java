package com.pt.taco.jira.zephyr.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String key;
    private String name;
    private String emailAddress;

}
