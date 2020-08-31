package com.dxc.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import com.dxc.beans.Student;
import com.dxc.dao.StudentJdbcDAO;

public class InsertManyStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("students.txt");
			byte []barr = new byte[fis.available()];
			fis.read(barr);
			String content = new String(barr);
			
			String[] csvStudents = content.split("\n");
			
			for(String csvStudent : csvStudents) {
				
				Student student = Student.parseStudent(csvStudent);
//				System.out.println(student);
				StudentJdbcDAO studentDao = new StudentJdbcDAO();
				if(studentDao.save(student)) {
					System.out.println("Saved student id : "+student.getId());
				}
				else {
					System.out.println("Failed to Save student id : "+student.getId());
				}
				
			}
			fis.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
