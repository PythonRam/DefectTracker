package com.hithesh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hithesh.DTO.DefectDTO;
import com.hithesh.DTO.LoginFormDTO;
import com.hithesh.entity.Defect;
import com.hithesh.feign.DefectLoginFeign;
import com.hithesh.service.DefectService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

// uncomment feignClient to see how it works


@RestController
public class DefectController {
	@Autowired
	DefectService defectService;
	
//	@Autowired
//	DefectLoginFeign feignClient;
	
	@RequestMapping(value = "/defects/addDefect", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@HystrixCommand(fallbackMethod="addDefectFallback")
	public List<DefectDTO> addDefect(@RequestBody DefectDTO defectForm) {
		defectService.addDefect(defectForm);
		return defectService.getAllDefects();
	}
	
	@HystrixCommand(fallbackMethod="getAllDefectsFallback")
	@RequestMapping(value="/defects/getAllDefects", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DefectDTO> getAllDefects(){
//		System.out.println(feignClient.authenticateAndRespond(new LoginFormDTO("Bob", "dev@123")));
		return defectService.getAllDefects();
	}
	
	@HystrixCommand(fallbackMethod="updateDefectFallback")
	@RequestMapping(value="/defects/updateDefect/{defectId}", method = RequestMethod.PUT)
	public List<DefectDTO> updateDefect(@PathVariable("defectId") Integer defectId) {
		defectService.closeDefect(defectId);
		return defectService.getAllDefects();
	}
	
// ***************	Fallbacks  **************************
	
	public List<DefectDTO> addDefectFallback(@RequestBody DefectDTO defectForm) {
		return new ArrayList<DefectDTO>();
	}
	
	public List<DefectDTO> getAllDefectsFallback(){
		return new ArrayList<DefectDTO>();
	}
	
	public List<DefectDTO> updateDefectFallback(@PathVariable("defectId") Integer defectId) {
		// void
		return new ArrayList<DefectDTO>();
	}
	
	
	
}
