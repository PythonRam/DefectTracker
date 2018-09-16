package com.hithesh.DTO;
// not used anywhere, added only for feign client 
public class UserDetailsDTO {
	private Boolean validUser;
	private String message;
	private String userName;
	private String role;
	public Boolean getValidUser() {
		return validUser;
	}
	public void setValidUser(Boolean validUser) {
		this.validUser = validUser;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UserDetailsDTO(Boolean validUser, String message, String userName, String role) {
		super();
		this.validUser = validUser;
		this.message = message;
		this.userName = userName;
		this.role = role;
	}
	public UserDetailsDTO() {
		super();
		
	}
	@Override
	public String toString() {
		return "UserDetailsDTO [validUser=" + validUser + ", message=" + message + ", userName=" + userName + ", role="
				+ role + "]";
	}
	
	
}
