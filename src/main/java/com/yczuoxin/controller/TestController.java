package com.yczuoxin.controller;

import com.yczuoxin.domain.User;
import com.yczuoxin.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public User getUser() {
        return userMapper.getUser();
    }

}
