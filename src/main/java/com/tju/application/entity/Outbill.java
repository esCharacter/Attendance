package com.tju.application.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "outbill")
public class Outbill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "application_time")
	private String application_time;
	
	@Column(name = "out_time")
	private String out_time;
	
	@Column(name = "num_of_hours")
	private float num_of_hours;
	
	@Column(name = "describe")
	private String describe;
	
	@Column(name = "state")
	private int state;
	
	public Outbill(){
		
	}
	
	public Outbill(Long id,String application_time,String out_time,int num_of_hours){
		this.id = id;
		this.application_time = application_time;
		this.out_time = out_time;
		this.num_of_hours = num_of_hours;
		this.state = 0;
	}
	
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
	
	public String getApplicationTime(){
		return application_time;
	}
	public void setApplicationTime(String application_time){
		this.application_time = application_time;
	}
	
	public String getOutTime(){
		return out_time;
	}
	public void setOutTime(String out_time){
		this.out_time = out_time;
	}
	
	public float getNumOfHours(){
		return num_of_hours;
	}
	public void setNumOfHours(float num_of_hours){
		this.num_of_hours = num_of_hours;
	}
	
	public String getDescribe(){
		return describe;
	}
	public void setDescribe(String describe){
		this.describe = describe;
	}
	
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Out [id=" + id + ", applicationTime=" + application_time + ", out_time=" + out_time + ", numOfHours="
				+ num_of_hours + ", describe=" + describe + ", state=" + state + "]";
	}
}

