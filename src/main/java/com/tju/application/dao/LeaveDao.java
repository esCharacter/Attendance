package com.tju.application.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tju.application.entity.Leave;

public interface LeaveDao extends CrudRepository<Leave, Long> {

//	@Query("SELECT application_time FROM Leave WHERE num_of_days = 1")
//    List<Leave> findByNumDay1(int num_of_days);
	
//	List<Leave> findByNumOfDays(int NumOfDays);
	List<Leave> findByType(String type);
}
