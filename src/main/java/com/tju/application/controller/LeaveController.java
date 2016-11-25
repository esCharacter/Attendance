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

import com.tju.application.dao.LeaveDao;
import com.tju.application.entity.Leavebill;
import com.tju.application.entity.User;
import com.tju.application.entity.UserLeavebill;

@RestController
public class LeaveController {

	@Resource
	private LeaveDao leaveDao;

	/**
	 * 查找请假numDay天的假期单
	 * 
	 * @param numDay
	 * @return
	 */
	@RequestMapping("/leavebill/leaveNumDay")
	@ResponseBody
	public List<Leavebill> findByNumDayLeave(@RequestParam(value = "leaveNumDay", defaultValue = "1") int numDay) {

		List<Leavebill> leave = leaveDao.findByNumDay(numDay);

		if (leave != null) {
			return leave;
		}

		return leave;
	}

	@RequestMapping("/leavebill/leaveType")
	@ResponseBody
	public List<Leavebill> findByType(@RequestParam(value = "type", defaultValue = "1") String type) {

		List<Leavebill> leave = leaveDao.findByType(type);

		if (leave != null) {
			return leave;
		}

		return leave;
	}

	/**
	 * 查找今天请假的所有人
	 * 
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping("/leavebill/today")
	@ResponseBody
	public List<User> findUserByToday() throws ParseException {

		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
		String day = sdf.format(today);
		List<User> users = leaveDao.findByToday(day);

		if (users != null) {
			return users;
		}

		return users;
	}

	/**
	 * 按日期查找请假的人
	 * 
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping("/leavebill/date")
	@ResponseBody
	public List<User> findUserByDate(@RequestParam(value = "date", defaultValue = "") String date) {

		String day = date;
		List<User> users = leaveDao.findByToday(day);

		if (users != null) {
			return users;
		}

		return users;
	}

	@RequestMapping("/leavebill/leavebill")
	@ResponseBody
	public int addLeaveBill(@RequestParam(value = "userId", defaultValue = "0") Long userId, String leaveDate,
			@RequestParam(value = "numOfDays", defaultValue = "0")int numOfDays, String type, String describe) {

		if (userId == 0) {
			return 0;
		}

		int result = 0;

		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
		String applicationTime = sdf.format(today);

		Leavebill thisBill = leaveDao.save(new Leavebill(applicationTime, 
				leaveDate, numOfDays, type, describe, "0"));
		
		leaveDao.save(new UserLeavebill(userId, thisBill.getId()));

		result = 1;
		return result;
	}
}
