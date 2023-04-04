package com.xenonstack.dto;



public class StudentDto 
{
	private long id;

	private String firstName;

	private String lastName;
	
	private long rollno;
	
	private String email;
 
	private String token;
   private String Role="Student";
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
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
public String getToken() {
	return token;
}
public void setToken(String token) {
	this.token = token;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
public StudentDto(long id, String firstName, String lastName, long rollno, String email, String token, String role) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.rollno = rollno;
	this.email = email;
	this.token = token;
	Role = role;
}
@Override
public String toString() {
	return "StudentDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", rollno=" + rollno
			+ ", email=" + email + ", token=" + token + ", Role=" + Role + "]";
}
  
   
}
