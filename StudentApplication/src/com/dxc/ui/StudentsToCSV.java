package com.dxc.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import com.dxc.dao.StudentJdbcDAO;

public class StudentsToCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Trying convert all students from DB to CSV");
			StudentJdbcDAO studentDao = new StudentJdbcDAO();
			String fullcsv = studentDao.csvAll();
			FileOutputStream fos = new FileOutputStream("students.txt");
			fos.write(fullcsv.getBytes());
			fos.close();
			System.out.println("Completed conversion");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
