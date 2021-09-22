package com.link.dao;

import com.link.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserJPA extends JpaRepository<User,String> , JpaSpecificationExecutor<User> {

}
