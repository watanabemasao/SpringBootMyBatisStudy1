package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserNameService {
    List<UserEntity> findAll();
    Optional findById(int id)throws Exception;
    void create(String name);
    void update(int id, String name)throws Exception;
}
