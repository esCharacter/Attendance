package com.tju.application.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tju.application.dao.LeaveDao;
import com.tju.application.entity.Leavebill;

@RestController
public class LeaveController {

	@Resource
	private LeaveDao leaveDao;
	
	@RequestMapping("/user_leave")
	@ResponseBody
	public List<Leavebill> findByNumDayLeave(@RequestParam(value="numDay", defaultValue="1")int numDay) {
		
		List<Leavebill> leave = leaveDao.findByNumDay(numDay);

		if (leave != null) {
			return leave;
		}

		return leave;
	}

	@RequestMapping("/type")
	@ResponseBody
	public List<Leavebill> findByType(@RequestParam(value="type", defaultValue="1")String type) {
		
		List<Leavebill> leave = leaveDao.findByType(type);

		if (leave != null) {
			return leave;
		}

		return leave;
	}
}
