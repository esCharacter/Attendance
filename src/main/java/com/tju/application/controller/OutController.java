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
import com.tju.application.entity.Outbill;
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
	public List<User> findUserByToday(@RequestParam(value="department_id") Long department_id) throws ParseException {

		Date today=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String day=sdf.format(today);
		List<User> users = outDao.findOutByTodayByDepartment(day, 1, department_id);

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
	@RequestMapping("/outbill/day")
	@ResponseBody
	public List<User> findUserByDate(@RequestParam(value = "day",defaultValue = "") String day,@RequestParam(value = "department_id",defaultValue = "") Long department_id){
		
		List<User> users = outDao.findOutByTodayByDepartment(day, 1, department_id);
		
		if(users!=null){
			return users;
		}
		return users;
	}

	/*
	 * 查找所有未处理的申请
	 * @return
	 * */
	@RequestMapping("/outbill/untreated")
	@ResponseBody
	public List<Outbill> findUserByState(@RequestParam(value = "department_id", defaultValue = "") Long department_id){
		
		int state = 0;
		List<Outbill> outbills = outDao.findApByState(state,department_id);
		
		if(outbills!=null){
			return outbills;
		}
		
		return outbills;
	}
	
	/*
	 * 提交申请
	 * */
	
	/*
	 * 同意申请
	 * */
	@RequestMapping("/outbill/agree")
	@ResponseBody
	public void agreeAp(@RequestParam(value = "outbill_id",defaultValue = "") Long outbill_id){
		Long id = outbill_id;
		int state = 1;
		outDao.setApStateById(id, state);
	}
	
	/*
	 * 拒绝申请
	 * */
	@RequestMapping("/outbill/refuse")
	@ResponseBody
	public void refuseAp(@RequestParam(value = "outbill_id",defaultValue = "") Long outbill_id){
		Long id = outbill_id;
		int state = -1;
		outDao.setApStateById(id, state);
	}
}
