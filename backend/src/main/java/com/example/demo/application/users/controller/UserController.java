package com.example.demo.application.users.controller;

import com.example.demo.application.users.bodymodel.CreateUserBodyModel;
import com.example.demo.application.users.service.ReadUserService;
import com.example.demo.application.users.viewmodel.UserViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    ReadUserService readUserService;
    @GetMapping("/read/{id}")
    public UserViewModel findUserById(@PathVariable("id") UUID id) {
        return this.readUserService.readUserById(id);
    }
}
