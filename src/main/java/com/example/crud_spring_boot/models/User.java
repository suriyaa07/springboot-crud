package com.example.crud_spring_boot.models;

public class User {

    //constructor
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //get and set ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //get and set EMAIL
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //get and set NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Long id;
    private String name;
    private String email;
}
