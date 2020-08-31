package com.dxc.examples;

public class StudentParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1,Kishor,kishorgn@gmail.com,5093845043";
		String[] vals = str.split(",") ;
		
		int id = Integer.parseInt(vals[0]);
		String name = vals[1];
		String email = vals[2];
		String mobile = vals[3];
		
		Student student = new Student(id, name, email, mobile);
		
		System.out.println("student object : "+student);

	}

}
