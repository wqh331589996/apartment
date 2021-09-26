package com.link.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name", nullable = true, length = 30)
    private String name;
    @Column(name = "password", nullable = true, length = 30)
    private String password;



}


