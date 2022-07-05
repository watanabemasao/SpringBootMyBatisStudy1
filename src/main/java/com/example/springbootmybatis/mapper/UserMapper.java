package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    @Select("SELECT * Users")
    List<UserEntity> findAll();
    @Select("SELECT * FROM Users WHERE id = #{id}")
    Optional<UserEntity> findById(int id);


}
