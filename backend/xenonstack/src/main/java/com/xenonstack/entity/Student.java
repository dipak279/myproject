package com.xenonstack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity

public class Student {
 
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(unique = true,nullable = false)
	private long rollno;
	@Column(unique = true,nullable = false)
	private String email;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(String firstName, String lastName, long rollno, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollno = rollno;
		this.email = email;
	}
	
	
	
}

