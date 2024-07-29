package com.example.demo.infrastructer.users.jparepository;

import com.example.demo.infrastructer.users.dbmodel.UserDbModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface IUserJpaRepository extends JpaRepository<UserDbModel, UUID> {
}
