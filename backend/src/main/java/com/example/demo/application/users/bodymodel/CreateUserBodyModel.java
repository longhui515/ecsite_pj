package com.example.demo.application.users.bodymodel;

import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class CreateUserBodyModel {
    private String name;
    private Integer age;
    private String address;
    private String email;
}
