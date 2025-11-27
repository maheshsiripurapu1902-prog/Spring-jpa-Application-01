package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.java.entity.Student;
import com.java.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}
	
	public Student getValueSaveing(Student student) {
		
		Student student2=service.getInsertingValue(student);
		
		return student2;
	}
	
	public void getPrintingSingleRecords(long id) {
		
		service.getPrintSingleRecords(id);
	}
	
	
	public void getInsertingMultipleRecords(List<Student>stduents) {
		
		service.getSaveMultipleRecords(stduents);
	}
	
}
