package com.tju.application.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tju.application.entity.Outbill;
import com.tju.application.entity.User;

public interface OutDao extends CrudRepository<Outbill, Long>{
	//@Query("SELECT o FROM Outbill o WHERE o.numOfHours = :numHour")
	//List<Outbill> findByNumHour(@Param("numHour") int numHour);
	
	@Query("SELECT u FROM User u WHERE u.id IN (SELECT uo.userId "
			+ "FROM UserOutbill uo WHERE uo.outId IN (SELECT o.id "
			+ "FROM Outbill o WHERE o.outTime = :day))")
	List<User> findByToday(@Param("day")String day);
}
