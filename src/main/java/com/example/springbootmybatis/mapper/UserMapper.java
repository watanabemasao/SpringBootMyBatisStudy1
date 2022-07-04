package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * name")
    List<UserEntity> findAll();

}
