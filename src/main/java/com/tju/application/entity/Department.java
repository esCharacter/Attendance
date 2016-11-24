package com.tju.application.entity;

import javax.persistence.Column;
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
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name = "department_manager")
	private String departmentManager;
	
	@Column(name = "vice_general_manager")
	private String viceGeneralManager;
	
	@Column(name = "general_manager")
	private String generalManager;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartment_name() {
		return departmentManager;
	}
	public void setDepartment_name(String department_name) {
		this.departmentManager = department_name;
	}
	public String getDepartment_manager() {
		return departmentManager;
	}
	public void setDepartment_manager(String department_manager) {
		this.departmentManager = department_manager;
	}
	public String getVice_general_manager() {
		return departmentManager;
	}
	public void setVice_general_manager(String vice_general_manager) {
		this.departmentManager = vice_general_manager;
	}
	public String getGeneral_manager() {
		return generalManager;
	}
	public void setGeneral_manager(String general_manager) {
		this.generalManager = general_manager;
	}
}
