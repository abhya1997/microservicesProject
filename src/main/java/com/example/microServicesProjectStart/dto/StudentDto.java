package com.example.microServicesProjectStart.dto;

import java.util.Date;

import lombok.Data;

@Data
public class StudentDto {
	
	private String fullName;
	private String mobileNo;
	private String emailId;
	private String password;
	private String username;
	private Date dob;


}
