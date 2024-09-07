package com.example.demo.application.users.service;

import com.example.demo.application.users.viewmodel.UserViewModel;
import com.example.demo.domain.users.domainobject.User;
import com.example.demo.domain.users.irepositoryinterface.IUserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ReadUserService {
    @Autowired
    IUserRepositoryInterface userRepository;

    @Transactional
    public UserViewModel readUserById(UUID id) {
        User user =
                this.userRepository.findById(id);

        return UserViewModel.adaptToUserVewModel(user.getId(), user.getFamilyName(), user.getFirstName(),
                user.getMail());
    }

}
