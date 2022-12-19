package com.akhm.repository.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="ADMIN_TL")
@Data
public class AdminTl {
	@Id
	@GeneratedValue
	@Column(name="ADMIN_ID")
	private Integer adminId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL_ID")
	private String emailId;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;
	@Column(name="STATUS")
	private String status;
	@Column(name="CREATED_ON")
	private Date createdOn;
	@Column(name="UPDATED_ON")
	private Date updatedOn;

}
