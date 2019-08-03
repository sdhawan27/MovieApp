package com.catalystone.mbs.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="user_info")
public class User {

    @Column(name="username")
    @Id
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="role")
    private String role;

}
