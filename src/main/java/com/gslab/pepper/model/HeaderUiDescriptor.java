package com.gslab.pepper.model;

public class HeaderUiDescriptor {
    String key;
    String value;

    public HeaderUiDescriptor() {
    }

    public HeaderUiDescriptor(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
