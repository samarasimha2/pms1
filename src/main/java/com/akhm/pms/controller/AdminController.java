package com.akhm.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.akhm.pms.service.AdminService;
import com.akhm.pms.service.vo.AdminVO;

public class AdminController {
	@Autowired
	private AdminService adminService;
	@PostMapping("/adminregistration")
	public ResponseEntity<AdminVO> register(@RequestBody AdminVO adminVO )
	{
		try {
			AdminVO admin = adminService.saveAdmin(adminVO);
			return new ResponseEntity(admin, HttpStatus.CREATED);
			
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	@PostMapping("/adminlogin")
	public ResponseEntity<AdminVO> login(@RequestBody AdminVO adminVO)
	{
		try {
		AdminVO admin=adminService.getAdmin(adminVO.getEmailId(),adminVO.getPassword());
		return new ResponseEntity(admin, HttpStatus.CREATED);
		}
		catch (Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		
	}

}
