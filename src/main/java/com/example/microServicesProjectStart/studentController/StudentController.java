package com.example.microServicesProjectStart.studentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microServicesProjectStart.dto.StudentDto;
import com.example.microServicesProjectStart.entity.Student;
import com.example.microServicesProjectStart.services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentServices studentServices;
	
	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student>saveStudent(StudentDto studentDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(studentServices.saveStudent(studentDto));
	}
	
	
	public String test() {
		return "Tested";
	}
	public String devops() {
		return "";
	}

}
