package com.example.demo.domain.users.irepositoryinterface;

import com.example.demo.domain.users.domainobject.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IUserRepositoryInterface {

    public List<User> findAll();

    public User findById(UUID id);

    public User createUser(User user);

    public Optional<User> findByMail(String mail);
}
