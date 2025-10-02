package com.example.microServicesProjectStart.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="student")
@Data
public class Student {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sId;
	private String fullName;
	private String mobileNo;
	private String emailId;
	private String password;
	private String username;
	private Date dob;

	
}
