package com.example.demo.application.users.bodymodel;

import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class CreateUserBodyModel {
    private String familyName;
    private String familyNameRuby;
    private String firstName;
    private String firstNameRuby;
    private String mail;
    private String password;
}
