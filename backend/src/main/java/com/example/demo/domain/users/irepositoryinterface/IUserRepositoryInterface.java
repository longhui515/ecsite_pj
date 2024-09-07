package com.example.demo.domain.users.irepositoryinterface;

import com.example.demo.domain.users.domainobject.User;

import java.util.List;
import java.util.UUID;

public interface IUserRepositoryInterface {

    public List<User> findAll();

    public User findById(UUID id);

    public void createUsers(List<User>userList);
}
