package com.link.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository {
    public List findByName(String name);
    public List findByPassword(String password);
    public List findById(Long id);


}
