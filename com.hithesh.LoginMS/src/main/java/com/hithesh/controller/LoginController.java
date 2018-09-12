package com.hithesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hithesh.DTO.LoginFormDTO;
import com.hithesh.DTO.UserDetailsDTO;
import com.hithesh.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping(value = "/login/userDetails", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDetailsDTO> authenticateAndRespond(@RequestBody LoginFormDTO loginForm) {
		return new ResponseEntity<UserDetailsDTO>(
				loginService.validateLogin(loginForm.getUsername(), loginForm.getPassword()), HttpStatus.OK);
	}
}