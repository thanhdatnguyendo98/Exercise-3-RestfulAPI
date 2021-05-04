package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
	  Student findLargestStudent(List<Student> stu);
	  
	  Student findLowestStudent(List<Student> stu);
}
