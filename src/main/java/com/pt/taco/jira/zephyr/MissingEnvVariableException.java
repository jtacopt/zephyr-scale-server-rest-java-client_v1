package com.pt.taco.jira.zephyr;

public class MissingEnvVariableException extends RuntimeException {

    public MissingEnvVariableException(String message) {
        super(message);
    }
}
