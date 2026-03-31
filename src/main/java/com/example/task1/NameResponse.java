package com.example.task1;

public class NameResponse {
    private String fullName;

    public NameResponse() {
    }

    public NameResponse(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}