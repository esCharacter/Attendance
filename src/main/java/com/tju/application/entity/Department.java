package com.tju.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String department_name;
	private String department_manager;
	private String vice_general_manager;
	private String general_manager;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getDepartment_manager() {
		return department_manager;
	}
	public void setDepartment_manager(String department_manager) {
		this.department_manager = department_manager;
	}
	public String getVice_general_manager() {
		return vice_general_manager;
	}
	public void setVice_general_manager(String vice_general_manager) {
		this.vice_general_manager = vice_general_manager;
	}
	public String getGeneral_manager() {
		return general_manager;
	}
	public void setGeneral_manager(String general_manager) {
		this.general_manager = general_manager;
	}
}
