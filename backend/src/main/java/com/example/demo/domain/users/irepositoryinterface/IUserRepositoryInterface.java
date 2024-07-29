package com.example.demo.domain.users.irepositoryinterface;

import com.example.demo.domain.users.domainobject.User;

import java.util.List;

public interface IUserRepositoryInterface {

    public List<User> findAll();

    public void createUsers(List<User>userList);
}
