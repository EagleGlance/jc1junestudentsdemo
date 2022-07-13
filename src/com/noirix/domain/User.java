package com.noirix.domain;

public class User {

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public void process() {
        throw new RuntimeException("User runtime exception");
    }
}
