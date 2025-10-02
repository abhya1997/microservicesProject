package com.example.microServicesProjectStart.reposotiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microServicesProjectStart.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
