package com.java.service;

import java.util.List;

import com.java.entity.Student;

public interface StudentService {

	public Student getInsertingValue(Student student);
	
	public void getPrintSingleRecords(long id);
	
	public void getSaveMultipleRecords(List<Student>students);
}
