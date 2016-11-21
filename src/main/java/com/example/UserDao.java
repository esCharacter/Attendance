package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
	
  public User findByUserName(String userName);
  
  List<User> findByName(String name);
} 