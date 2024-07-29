package com.example.demo.domain.users.domainobject;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
@EqualsAndHashCode
public class User {
    private final UUID userId;
    private final String name;
    private final Integer age;
    private final String address;
    private final String email;


    public User(UUID userId, String name, Integer age, String address, String email) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public static User createUser(UUID userId, String name, Integer age, String address, String email) {
        return new User(
                userId, name, age, address, email
        );
    }
}
