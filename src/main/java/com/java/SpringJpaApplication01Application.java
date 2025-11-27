package com.java;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.controller.StudentController;
import com.java.entity.Student;

@SpringBootApplication
public class SpringJpaApplication01Application  implements CommandLineRunner{

	@Autowired
	private StudentController controller;
	
	
	public StudentController getController() {
		return controller;
	}

	public void setController(StudentController controller) {
		this.controller = controller;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
//		controller.getRemoveStudentSingleRecords(11);
		
		List<Student>all=controller.findAllRecords();
		all.forEach(
				student->{
					
					System.out.println(student);
				}
				);
		
		
		
		
		
		
		
		
		controller.getDeletedAllStudentRecords();

//		
//		Student student=new Student();
//		student.setName("abc");
//		student.setEmail("abc@gmail.com");
//		student.setPassword("abc@123");
//		student.setAddress("abc");
//		
//		
//		Student student1=new Student();
//		student1.setName("zzz");
//		student1.setEmail("zzz@gmail.com");
//		student1.setPassword("zzz@123");
//		student1.setAddress("zzz");
//		
//		Student student2=new Student();
//		student2.setName("xxx");
//		student2.setEmail("xxx@gmail.com");
//		student2.setPassword("xxx@123");
//		student2.setAddress("xxx");
//		
//		
//		Student student2=controller.getValueSaveing(student);
//		System.out.println(student2);
		
		
//		controller.getPrintingSingleRecords(3);
		
//		
//		List<Student>list=new ArrayList<>();
//		list.add(student);
//		list.add(student1);
//		list.add(student2);
//		
//		controller.getInsertingMultipleRecords(list);
	}

}
