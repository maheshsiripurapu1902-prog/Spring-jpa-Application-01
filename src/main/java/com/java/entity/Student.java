package com.java.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity

@Table(name="tbl_Student",
       uniqueConstraints = @UniqueConstraint(
    		   name="email_unique",
    		   columnNames = "email_address"))

public class Student {
	
	
	@Id
	
	@SequenceGenerator(name="student_sequence",sequenceName = "student_sequence",allocationSize = 1)
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
	private long id;
	private String name;
	
	@Column(name="email_address")
	private String email;
	private String password;
	private String address;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", address="
				+ address + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
