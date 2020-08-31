package com.dxc.beans;

public class Marks {

	
	int studentID;
	int examId;
	int sub1,sub2,sub3;
	
	public Marks(int studentID , int examId, int sub1, int sub2, int sub3) {
		
		this.studentID = studentID;
		this.examId = examId;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	@Override
	public String toString() {
		return "Marks [studentID=" + studentID + ", examId=" + examId + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3="
				+ sub3 + "]";
	}
	
	public String toCSV() {
		
		return studentID +","+ examId +","+ sub1+","+sub2+","+sub3;
	}
	
	public static Marks parseMarks(String csvMarks) throws Exception{
		
		String[] values  = csvMarks.split(",");
		int studentID = Integer.parseInt(values[0]);
		int  examId   = Integer.parseInt(values[1]);
		int sub1      = Integer.parseInt(values[2]);
		int sub2      = Integer.parseInt(values[3]);
		int sub3      = Integer.parseInt(values[4]);
		
		Marks marks = new Marks(studentID,examId, sub1,sub2, sub3);
		return marks;
	}
		
}