package com.dxc.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;    
import java.util.Date;

public class Student {
	int id;
	String name;
	String email;
	String mobile;
	Date dob;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String email,String dob, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		try {
			this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
		
	@Override
	public String toString() {
		String strDob = new SimpleDateFormat("dd-MM-yyyy").format(dob); 
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", dob=" + strDob
				+ "]";
	}
	
	public String toCSV() {
		String strDob = new SimpleDateFormat("dd-MM-yyyy").format(dob); 
		return id + ", "+name+", "+strDob+", "+email+", "+mobile;
	}
	
	 
	public static Student parseStudent(String csvStudent) throws Exception{
		
		String[] values  = csvStudent.split(",");
		int id = Integer.parseInt(values[0]);
		String name = values[1];
		String strDob = values[2];
		String email = values[3];
		String mobile = values[4];
		
		Student student = new Student(id,name, strDob,email, mobile);
		return student;
	}
		
	}