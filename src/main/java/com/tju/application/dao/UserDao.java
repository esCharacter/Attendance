package com.tju.application.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.tju.application.entity.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
	
  public User findByUserName(String userName);
  
  List<User> findByName(String name);
} 