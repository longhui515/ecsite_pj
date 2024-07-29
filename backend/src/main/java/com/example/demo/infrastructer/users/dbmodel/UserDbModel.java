package com.example.demo.infrastructer.users.dbmodel;

import com.example.demo.domain.users.domainobject.User;
import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "users")
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class UserDbModel implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    public User adaptToUser() {
        return new User(
                this.userId,
                this.name,
                this.age,
                this.address,
                this.email
        );
    }

    public static UserDbModel adaptToUserDbModel(User user) {
        return new UserDbModel(
                user.getUserId(), user.getName(), user.getAge(), user.getAddress(), user.getEmail()
        );

    }
}
