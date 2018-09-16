package com.hithesh.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hithesh.DTO.LoginFormDTO;
import com.hithesh.DTO.UserDetailsDTO;


@FeignClient("LoginMS")
public interface DefectLoginFeign {
	// this interface is used no where, and only acts as an example on how to use it 
	@RequestMapping("/login/userDetails")
	public UserDetailsDTO authenticateAndRespond(@RequestBody LoginFormDTO loginForm);
}
