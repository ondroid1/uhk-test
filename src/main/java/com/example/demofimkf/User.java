package com.example.demofimkf;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {

    private long id;
    private String name;
    private int birthYear;

    public long getId() {
        return id;
    }

    public void setId() {
       // id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
