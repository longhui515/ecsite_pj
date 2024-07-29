package com.example.demo.application.users.service;

import com.example.demo.application.users.bodymodel.CreateUserBodyModel;
import com.example.demo.domain.users.domainobject.User;
import com.example.demo.domain.users.irepositoryinterface.IUserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CreateUserService {
    @Autowired
    IUserRepositoryInterface userRepository;

    public void createUsers(List<CreateUserBodyModel> userBodyModelList) {

        List<User> createUserList = userBodyModelList.stream().map(
                bodyModel -> User.createUser(
                        UUID.randomUUID() ,
                        bodyModel.getName(),
                        bodyModel.getAge(),
                        bodyModel.getAddress(),
                        bodyModel.getEmail()
                )
        ).collect(Collectors.toList());

        this.userRepository.createUsers(createUserList);
    }
}
