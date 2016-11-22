package com.tju.application.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tju.application.dao.LeaveDao;
import com.tju.application.entity.Leave;

@RestController
public class LeaveController {

	@Resource
	private LeaveDao leaveDao;
	
//	@RequestMapping("/user_leave")
//	@ResponseBody
//	public List<Leave> findByNumDayLeave(@RequestParam(value="numDay", defaultValue="1")int numDay) {
//		
//		List<Leave> leave = leaveDao.findByNumDay1(numDay);
//
//		if (leave != null) {
//			return leave;
//		}
//
//		return leave;
//	}

	@RequestMapping("/type")
	@ResponseBody
	public List<Leave> findByType(@RequestParam(value="type", defaultValue="1")String type) {
		
		List<Leave> leave = leaveDao.findByType(type);

		if (leave != null) {
			return leave;
		}

		return leave;
	}
}
