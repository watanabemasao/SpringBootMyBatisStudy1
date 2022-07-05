package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.UserEntity;

import java.time.LocalDate;

public class NameResponse {
    private int id;
    private String name;
    private LocalDate birthday;

    public NameResponse(UserEntity userEntity) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
