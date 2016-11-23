package com.tju.application.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tju.application.entity.Leavebill;

public interface LeaveDao extends CrudRepository<Leavebill, Long> {

	@Query("SELECT l FROM Leavebill l WHERE l.num_of_days = :numDay")
    List<Leavebill> findByNumDay(@Param("numDay")int numDay);
	
//	List<Leave> findByNumOfDays(int NumOfDays);
	List<Leavebill> findByType(String type);
}
