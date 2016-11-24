package com.tju.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leavebill")
public class Leavebill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "application_time")
	private String applicationTime;
	
	@Column(name = "leave_date")
	private String leaveDate;
	
	@Column(name = "num_of_days")
	private int numOfDays;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "describe")
	private String describe;
	
	@Column(name = "state")
	private String state;

	 public Leavebill() {  
	    }  
	 
	public Leavebill(Long id, String application_time, String leaveDate, int num_of_days) {  
        this.id = id;  
        this.applicationTime = application_time;  
        this.leaveDate = leaveDate;  
        this.numOfDays = num_of_days;  
    }  
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getApplication_time() {
		return applicationTime;
	}
	public void setApplication_time(String application_time) {
		this.applicationTime = application_time;
	}
	

	public String getLeave_date() {
		return leaveDate;
	}
	public void setLeave_date(String leave_date) {
		this.leaveDate = leave_date;
	}
	

	public int getNum_of_days() {
		return numOfDays;
	}
	public void setNum_of_days(int num_of_days) {
		this.numOfDays = num_of_days;
	}
	

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Leave [id=" + id + ", applicationTime=" + applicationTime + ", leaveDate=" + leaveDate + ", numOfDays="
				+ numOfDays + ", type=" + type + ", describe=" + describe + ", state=" + state + "]";
	}
	
	
}
