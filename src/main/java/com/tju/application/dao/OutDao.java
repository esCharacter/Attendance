package com.tju.application.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tju.application.entity.Outbill;
import com.tju.application.entity.User;

public interface OutDao extends CrudRepository<Outbill, Long>{
	//@Query("SELECT o FROM outbill o WHERE o.numOfHours = :numHour")
	//List<Outbill> findByNumHour(@Param("numHour") int numHour);
	
//	/*
//	 * 查看某天已同意的外出申请
//	 * */
//	@Query("SELECT u FROM User u WHERE u.id IN (SELECT uo.userId "
//			+ "FROM UserOutbill uo WHERE uo.outId IN (SELECT o.id "
//			+ "FROM Outbill o WHERE DATE_FORMAT(o.out_time,'%Y-%m-%d')= :day AND o.state = 1))")
//	List<User> findOutByToday(@Param("day")String day);
	
	/*
	 * 查看某部门某日对应状态外出情况
	 * */
	@Query("SELECT u FROM User u WHERE u.id IN(SELECT ud.employeeId "
			+ "FROM UserDepartment ud WHERE ud.departmentId = :department_id AND ud.employeeId IN(SELECT uo.userId "
			+ "FROM UserOutbill uo WHERE uo.outId IN(SELECT o.id "
			+ "FROM Outbill o WHERE DATE_FORMAT(o.out_time,'%Y-%m-%d')= :day AND o.state = :state)))")
	List<User> findOutByTodayByDepartment(@Param("day")String day, @Param("state") int state, @Param("department_id") Long department_id);

	/*
	 * 查看属下某天所有申请
	 * */
	@Query("SELECT o FROM Outbill o WHERE o.id IN(SELECT uo.outId "
			+ "FROM UserOutbill uo WHERE u.userId IN(SELECT ud.employeeId "
			+ "FROM UserDepartment ud WHERE ud.departmentId = :department_id)) AND DATE_FORMAT(o.out_time,'%Y-%m-%d')= :day")
	List<Outbill>findOutApByToday(@Param("day")String day,@Param("department_id") Long department_id);
	
	/*
	 * 查看属下所有对应状态的申请
	 * */
	@Query("SELECT o FROM Outbill o WHERE o.id IN(SELECT uo.outId "
			+ "FROM UserOutbill uo WHERE uo.userId IN(SELECT ud.userId "
			+ "FROM UserDepartment ud WHERE ud.departmentId = :department_id)) AND o.state = :state")
	List<Outbill>findApByState(@Param("state") int state,@Param("department_id") Long departmet_id );
	
	/*
	 * 增加一条申请
	 * */
	
	/*
	 * 修改申请的状态
	 * */
	@Query("UPDATE Outbill o SET o.state = :state WHERE o.id = :id")
	List<Outbill> setApStateById(@Param("id") Long id,@Param("state") int state);
}
