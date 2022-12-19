package com.akhm.pms.service.vo;

import java.sql.Date;

import lombok.Data;
@Data
public class AdminVO {
	private Integer adminId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String mobileNumber;
	private String status;
	private Date createdOn;
	private Date updatedOn;
	

}
