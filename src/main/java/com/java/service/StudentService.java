package com.java.service;

import java.util.List;

import com.java.entity.Student;

public interface StudentService {

	public Student getInsertingValue(Student student);
	
	public void getPrintSingleRecords(long id);
	
	public void getSaveMultipleRecords(List<Student>students);
	
	public void getDeletedSingleRecord(long id);
	
	public List<Student>getAllRecords();
	
	public void getdeletedAllRecords();
}
