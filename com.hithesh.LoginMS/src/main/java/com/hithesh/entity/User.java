package com.hithesh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	@Column(name="cust_id")
	private Integer custId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_role")
	private String userRole;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public User(String userName, Integer custId, String password, String userRole) {
		super();
		this.userName = userName;
		this.custId = custId;
		this.password = password;
		this.userRole = userRole;
	}
	public User() {
	}
	
	@Override
	public String toString() {
		return "User [custId=" + custId + ", userName=" + userName + ", password=" + password + ", userRole=" + userRole
				+ "]";
	}
	
	
}
