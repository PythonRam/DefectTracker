package com.hithesh.DTO;
// not used anywhere, added only for feign client 
public class LoginFormDTO {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginFormDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public LoginFormDTO() {
	}
	
}
