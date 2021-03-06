package com.ali.spring.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ali.spring.entity.Student;

@RestController
public class StudentRestController {

	private List<Student> students;
	
	@PostConstruct
	public void loadData() {
		
		students = new ArrayList<>();
		students.add(new Student("Ali", "Test"));
		students.add(new Student("Ali2", "Test2"));
		students.add(new Student("Ali3", "Test3"));
		
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return students;
	}
	
	// Buscamos el objeto por indice de la lista
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if(studentId >= students.size() || studentId < 0) {
			throw new StudentNotFoundException("Student id not found = "+studentId);
		}
		
		return students.get(studentId);
	}
	
	
	
}
