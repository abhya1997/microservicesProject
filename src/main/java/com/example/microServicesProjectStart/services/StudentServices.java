package com.example.microServicesProjectStart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microServicesProjectStart.dto.StudentDto;
import com.example.microServicesProjectStart.entity.Student;
import com.example.microServicesProjectStart.reposotiries.StudentRepo;

@Service
public class StudentServices {
	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveStudent(StudentDto studentDto) {
		
		return studentRepo.save(StudentDtoToStudent(studentDto));
	}
	public Student StudentDtoToStudent(StudentDto studentDto) {
		Student student=new Student();
		student.setFullName(studentDto.getFullName());
		student.setEmailId(studentDto.getEmailId());
		student.setMobileNo(studentDto.getMobileNo());
		student.setPassword(studentDto.getPassword());
		student.setUsername(studentDto.getUsername());
		return student;
	}
	
	public List<Student>allStudent(){
		return studentRepo.findAll();
	}
	

}
