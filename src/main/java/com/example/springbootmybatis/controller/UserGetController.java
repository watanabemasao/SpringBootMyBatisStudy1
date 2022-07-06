package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.service.UserNameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserGetController {
    private final UserNameService userNameService;

    public UserGetController(UserNameService userNameService){
        this.userNameService =userNameService;
    }

    @GetMapping("/users")
    public List<NameResponse> getNames() {
        return userNameService.findAll().stream().map(NameResponse::new).toList();
    }

}
