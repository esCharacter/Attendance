package com.tju.application.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tju.application.dao.OutDao;
import com.tju.application.entity.User;

@RestController
public class OutController {
	@Resource
	OutDao outDao;
	
	/**
	 * 查找今天外出的所有人
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping("/outbill/today")
	@ResponseBody
	public List<User> findUserByToday() throws ParseException {

		Date today=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
		String day=sdf.format(today);
		List<User> users = outDao.findByToday(day);

		if (users != null) {
			return users;
		}

		return users;
	}
	
	/*
	 * 查找某天外出的所有人
	 * @return
	 * @throws ParseException
	 * */
	@RequestMapping("/outbill/date")
	@ResponseBody
	public List<User> findUserByDate(@RequestParam(value = "date",defaultValue = "") String date){
		String day = date;
		List<User> users = outDao.findByToday(day);
		
		if(users!=null){
			return users;
		}
		return users;
	}

}
