package com.example.demo.application.users.controller;

import com.example.demo.application.users.bodymodel.CreateUserBodyModel;
import com.example.demo.application.users.service.CreateUserService;
import com.example.demo.application.users.service.ReadUserService;
import com.example.demo.application.users.viewmodel.UserViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    CreateUserService createUserService;
    @Autowired
    ReadUserService readUserService;

    @PostMapping("/create")
    public void createUsers(@RequestBody List<CreateUserBodyModel> bodyModelList) {
        this.createUserService.createUsers(bodyModelList);
    }

    @GetMapping("/read")
    public List<UserViewModel> findUsers() {
        return this.readUserService.readUserList();
    }
}
