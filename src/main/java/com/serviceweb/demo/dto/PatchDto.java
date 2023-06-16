package com.serviceweb.demo.dto;

public class PatchDto {
    String op;
    String key;
    String value;

    public PatchDto(java.lang.String op, String key, java.lang.String value) {
        this.op = op;
        this.key = key;
        this.value = value;
    }

    public java.lang.String getOp() {
        return op;
    }

    public String getKey() {
        return key;
    }

    public java.lang.String getValue() {
        return value;
    }
}
