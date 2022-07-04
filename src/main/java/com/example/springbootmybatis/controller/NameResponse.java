package com.example.springbootmybatis.controller;

public class NameResponse {
    private int id;
    private String name;

    public NameResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
