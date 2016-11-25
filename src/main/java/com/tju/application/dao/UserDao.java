package com.tju.application.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.tju.application.entity.User;

public interface UserDao extends CrudRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.userName = :userName and u.password = :password")
	public User findLogin(@Param("userName")String userName, @Param("password")String password);

	public User findByUserName(String userName);

	public List<User> findByName(String name);
}