package com.hithesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hithesh.DTO.UserDetailsDTO;
import com.hithesh.entity.User;
import com.hithesh.repository.UserRepository;
@Service
public class LoginService {
	@Autowired
	private UserRepository userRepository;

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public UserDetailsDTO validateLogin(String userName, String password) {
		User user = userRepository.findByUserNameAndPassword(userName, password);
		UserDetailsDTO response; 
		if(user==null) {
			response = new UserDetailsDTO(false,"Invalid",null,"invalid");
		}else {
			response = new UserDetailsDTO(true, "Valid", user.getUserName(), user.getUserRole());
		}
		return response;
	}
	
}
