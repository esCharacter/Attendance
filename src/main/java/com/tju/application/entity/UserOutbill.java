package com.tju.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_out")
public class UserOutbill {
	@Column(name = "user_id")
	private Long userId;
	
	@Id
	@Column(name = "out_id")
	private Long outId;
	
	protected UserOutbill(){
		
	}
	
	public UserOutbill(Long userId,Long outId){
		this.userId = userId;
		this.outId = outId;
	}
	
	public Long getUserId(){
		return userId;
	}
	public void setUserId(Long userId){
		this.userId = userId;
	}
	
	public Long getOutId(){
		return outId;
	}
	public void setOutId(Long outId){
		this.outId = outId;
	}
	
	@Override
	public String toString() {
		return "UserOutbill [userid=" + userId + ", outid=" + outId + "]";
	}
}
