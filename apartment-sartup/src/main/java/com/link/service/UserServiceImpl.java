package com.link.service;


import com.link.api.UserService;
import com.link.dao.UserDao;
import com.link.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class UserServiceImpl implements UserService {
@Autowired
    private UserDao userDao;

    @Override
    public User login(String userCode, String password) {
        return (User) userDao;
    }
}

