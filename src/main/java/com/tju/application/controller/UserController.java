package com.tju.application.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.tju.application.dao.UserDao;
import com.tju.application.entity.User;

@RestController
public class UserController {

	@Resource
	private UserDao userDao;

	@RequestMapping("/user/login")
	@ResponseBody
	public User login(@RequestParam(value = "userName", defaultValue = "") String userName,
			@RequestParam(value = "password", defaultValue = "") String password) {

		User user = userDao.findLogin(userName, password);

		if (user != null) {
			return user;
		}

		return user;
	}

	@RequestMapping("/user/name")
	@ResponseBody
	public List<User> findByName(@RequestParam(value = "name", defaultValue = "") String name) {

		List<User> users = userDao.findByName(name);

		if (users != null) {
			return users;
		}
		return users;
	}
	
	@RequestMapping("/user/info")
	@ResponseBody
	public User findUserInfo(@RequestParam(value = "userName", defaultValue = "") String userName) {

		User user = userDao.findByUserName(userName);

		if (user != null) {
			return user;
		}
		return user;
	}
}