package com.dxc.beans;

import java.util.TreeSet;

public class StudentTreeSet_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> students = new TreeSet<>();
		students.add(new Student(101, "Kishor", "CSE", 56, 77, 87, "99887766"));
		students.add(new Student(102, "Kumar", "ECE", 89, 89, 99, "65878998"));
		students.add(new Student(103, "Swathi", "Civil", 88, 77, 66, "45485485784"));
		students.add(new Student(104, "Mahesh", "EEE", 89, 89, 99, "65878998"));
		
		for ( Student student : students ) {
			System.out.println(student);
			System.out.println("Total : "+student.getTotal());
		}

	}

}
