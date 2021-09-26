package com.link.controller;

import com.link.dao.UserDao;
import com.link.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList=userDao.queryUserList();
        for (User user :userList){
            System.out.println(user);
        }
        return userList;
    }
}
