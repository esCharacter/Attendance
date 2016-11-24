package com.tju.application.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tju.application.entity.Leavebill;
import com.tju.application.entity.User;

public interface LeaveDao extends CrudRepository<Leavebill, Long> {

	@Query("SELECT l FROM Leavebill l WHERE l.numOfDays = :numDay")
	List<Leavebill> findByNumDay(@Param("numDay") int numDay);

	List<Leavebill> findByType(String type);

	@Query("SELECT u FROM User u WHERE u.id IN (SELECT ul.userId "
			+ "FROM UserLeavebill ul WHERE ul.leaveId IN (SELECT l.id "
			+ "FROM Leavebill l WHERE l.leaveDate = :day))")
	List<User> findByToday(@Param("day")String day);
	
	
}
