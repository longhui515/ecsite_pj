package com.example.demo.infrastructer.users.repository;

import com.example.demo.domain.users.domainobject.User;
import com.example.demo.domain.users.irepositoryinterface.IUserRepositoryInterface;
import com.example.demo.infrastructer.users.dbmodel.UserDbModel;
import com.example.demo.infrastructer.users.jparepository.IUserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepository implements IUserRepositoryInterface {
    @Autowired
    IUserJpaRepository userJpaRepository;

    @Override
    public List<User> findAll() {
        return this.userJpaRepository.findAll().stream().map(UserDbModel::adaptToUser).collect(Collectors.toList());
    }

    @Override
    public void createUsers(List<User> userList) {
        this.userJpaRepository.saveAll(userList.stream().map(UserDbModel::adaptToUserDbModel).collect(Collectors.toList()));
    }
}
