package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.service.UserNameServise;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserGetController {
    private final UserNameServise userNameServise;

    public UserGetController(UserNameServise userNameServise){
        this.userNameServise =userNameServise;
    }

    @GetMapping("/names")
    public List<NameResponse> getNames() {
        return UserNameServise.findAll().stream().map(NameResponse::new).toList();
    }
}
