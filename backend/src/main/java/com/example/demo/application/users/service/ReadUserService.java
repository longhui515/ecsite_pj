package com.example.demo.application.users.service;

import com.example.demo.application.users.viewmodel.UserViewModel;
import com.example.demo.domain.users.irepositoryinterface.IUserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReadUserService {
    @Autowired
    IUserRepositoryInterface userRepository;

    @Transactional
    public List<UserViewModel> readUserList() {
        return
                this.userRepository.findAll().stream().map(
                        user ->
                                UserViewModel.adaptToUserVewModel(
                                        user.getUserId(), user.getName(), user.getAge(),
                                        user.getAddress(), user.getEmail()
                                )
                ).collect(Collectors.toList());
    }

}
