package com.example.demo.application.users.viewmodel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@ToString
@EqualsAndHashCode
@Getter
public class UserViewModel {
    private final UUID userId;
    private final String name;
    private final Integer age;
    private final String address;
    private final String email;

    public UserViewModel(UUID userId, String name, Integer age, String address, String email) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public static UserViewModel adaptToUserVewModel(UUID userId, String name, Integer age, String address, String email) {
        return new UserViewModel(
                userId, name, age, address, email
        );
    }
}
