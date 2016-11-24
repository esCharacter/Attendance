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
	
	/*
	 * 查看今天已同意的外出申请
	 * */
	@Query("SELECT u FROM User u WHERE u.id IN (SELECT uo.userId "
			+ "FROM UserOutbill uo WHERE uo.outId IN (SELECT o.id "
			+ "FROM Outbill o WHERE DATE_FORMAT(o.out_time,'%Y-%m-%d')= :day AND o.state = 1))")
	List<User> findOutByToday(@Param("day")String day);

	/*
	 * 查看今天所有申请
	 * */
	@Query("SELECT u FROM User u WHERE u.id IN (SELECT uo.userId "
			+ "FROM UserOutbill uo WHERE uo.outId IN (SELECT o.id "
			+ "FROM Outbill o WHERE date_format(o.out_time,'%Y-%m-%d')=:day))")
	List<User>findOutApByToday(@Param("day")String day);
	
	/*
	 * 查看对应状态的申请
	 * */
	@Query("SELECT o FROM Outbill o WHERE o.state = :status")
	List<Outbill> findApByStatus(@Param("status") int status);
}
