package com.dxc.beans;

public class Exam {
	
	int id;
	String name;



	public Exam(int id, String name) {
	
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + name + "]";
	}

	public String toCSV() {
	
		return id+ ","+name;
	}
	public static Exam parseStudent(String csvExam) throws Exception{
		
		String[] values  = csvExam.split(",");
		int id = Integer.parseInt(values[0]);
		String name = values[1];
		
		Exam exam = new Exam(id,name);
		return exam;
	}

	}