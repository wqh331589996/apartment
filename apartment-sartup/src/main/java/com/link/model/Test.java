package com.link.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Proxy(lazy = false)
@Entity
@Getter
@Setter
@Table(name = "admin_test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "name", length = 50)
    private String testName;

    @Column(name = "age")
    private Integer age;
}
