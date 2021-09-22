package com.link.controller;

import com.link.dao.UserJPA;
import com.link.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class JPAController {
    @Autowired
    private UserJPA userJPA;
    @RequestMapping("/save")
    public User save(User user){
        return userJPA.save(user);

    }

}
