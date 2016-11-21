package com.example;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Resource
	private UserDao userDao;
	
	@RequestMapping("/get-by-userName")
	@ResponseBody
	public User findByUserName(String userName) {
		String userId;

		User user = userDao.findByUserName(userName);

		if (user != null) {
			userId = String.valueOf(user.getId());
			return user;
		}

		return user;
	}
}