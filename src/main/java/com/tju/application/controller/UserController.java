package com.tju.application.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tju.application.dao.UserDao;
import com.tju.application.entity.User;

@RestController
public class UserController {

	@Resource
	private UserDao userDao;

	@RequestMapping("/get-by-userName")
	@ResponseBody
	public User findByUserName(String userName) {

		User user = userDao.findByUserName(userName);

		if (user != null) {
			return user;
		}

		return user;
	}

	@RequestMapping("/name")
	@ResponseBody
	public List<User> findByName(String name) {

		List<User> user = userDao.findByName(name);

		if (user != null) {
			return user;
		}

		return user;
	}
}