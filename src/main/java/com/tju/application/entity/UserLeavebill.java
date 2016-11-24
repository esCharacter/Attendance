package com.tju.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_leave")
public class UserLeavebill {
	
	@Column(name = "user_id")
	private Long userId;
	
	@Id
	@Column(name = "leave_id")
	private Long leaveId;
	
	protected UserLeavebill() {
	}

	public UserLeavebill(Long userid, Long leaveid) {
		this.userId = userid;
		this.leaveId = leaveid;
	}
	
	public Long getUserid() {
		return userId;
	}

	public void setUserid(Long userid) {
		this.userId = userid;
	}

	public Long getLeaveid() {
		return leaveId;
	}

	public void setLeaveid(Long leaveid) {
		this.leaveId = leaveid;
	}
	
	@Override
	public String toString() {
		return "UserLeavebill [userid=" + userId + ", leaveid=" + leaveId + "]";
	}
}
