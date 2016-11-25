package com.tju.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_leave")
public class UserLeavebill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "leave_id")
	private Long leaveId;

	public UserLeavebill() {
		super();
	}

	public UserLeavebill(Long userId, Long leaveId) {
		super();
		this.userId = userId;
		this.leaveId = leaveId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(Long leaveId) {
		this.leaveId = leaveId;
	}

	@Override
	public String toString() {
		return "UserLeavebill [userid=" + userId + ", leaveid=" + leaveId + "]";
	}
}
