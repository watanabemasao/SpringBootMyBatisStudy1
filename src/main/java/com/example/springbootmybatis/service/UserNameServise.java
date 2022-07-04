package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.lang.model.element.Name;
import java.util.List;

public interface UserNameServise {
    List<UserEntity> findAll();
    Name findById(int id)throws Exception;
    void create(String name);
    void update(int id, String name)throws Exception;
}
