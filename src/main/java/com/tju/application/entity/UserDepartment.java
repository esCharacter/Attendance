package com.tju.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_department")
public class UserDepartment {
	@Column(name = "employee_id")
	Long employeeId;
	
	@Id
	@Column(name = "department_id")
	Long departmentId;
	
	protected UserDepartment(){
		
	}
	
	public UserDepartment(Long employeeId,Long departmentId){
		this.employeeId = employeeId;
		this.departmentId = departmentId;
	}
	
	public Long getEmployeeId(){
		return employeeId;
	}
	public void setEmployeeId(Long id){
		this.employeeId = id;
	}
	
	public Long getDepartmentId(){
		return departmentId;
	}
	public void setDepartmentId(Long id){
		this.departmentId = id;
	}
	
	@Override
	public String toString(){
		return "UserDepartment [employeeId="+employeeId+", departmentId="+departmentId+"]";
	}
}
