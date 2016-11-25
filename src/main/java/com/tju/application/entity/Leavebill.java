package com.tju.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leavebill")
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

	@Column(name = "describes")
	private String describes;

	@Column(name = "state")
	private String state;

	public Leavebill() {
	}

	public Leavebill(String applicationTime, String leaveDate, int numOfDays, String type, String describe,
			String state) {
		super();
		this.applicationTime = applicationTime;
		this.leaveDate = leaveDate;
		this.numOfDays = numOfDays;
		this.type = type;
		this.describes = describes;
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApplicationTime() {
		return applicationTime;
	}

	public void setApplicationTime(String applicationTime) {
		this.applicationTime = applicationTime;
	}

	public String getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescribe() {
		return describes;
	}

	public void setDescribe(String describe) {
		this.describes = describe;
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
				+ numOfDays + ", type=" + type + ", describe=" + describes + ", state=" + state + "]";
	}

}
