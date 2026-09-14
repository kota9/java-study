package com.example.study;

public class User {

    private final Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }
}
