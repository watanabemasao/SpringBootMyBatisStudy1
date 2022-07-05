package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.UserEntity;
import com.example.springbootmybatis.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.lang.model.element.Name;
import java.util.List;

@Service
public class UserNameServiceImpl implements UserNameService {
    private UserMapper userMapper;

    public UserNameServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public List<UserEntity> findAll() {
        return userMapper.findAll();
    }

    @Override
    public Name findById(int id) throws Exception {
        return null;
    }

    @Override
    public void create(String name) {

    }

    @Override
    public void update(int id, String name) throws Exception {

    }

}
