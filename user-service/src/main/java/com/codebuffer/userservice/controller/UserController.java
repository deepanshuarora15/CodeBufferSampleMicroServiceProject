package com.codebuffer.userservice.controller;

import com.codebuffer.userservice.VO.ResponseTemplateVO;
import com.codebuffer.userservice.entity.User;
import com.codebuffer.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of UserController class");
        return userService.saveUser(user);
    }
    @GetMapping(path="/{userId}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable Long userId){
        return userService.getUserWithDepartment(userId);
    }
}
