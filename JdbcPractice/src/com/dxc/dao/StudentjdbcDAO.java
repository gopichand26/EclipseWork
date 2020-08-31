package com.dxc.dao;

import java.io.FileInputStream;
import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import com.dxc.beans.Student;

public class StudentjdbcDAO implements DAO<Student> {
	
	Connection con = null;
	public StudentjdbcDAO() throws Exception{
		
		Properties properties = new Properties();
		properties.load(new FileInputStream("db.prop"));
		
		String dri = properties.getProperty("dri");
		String url = properties.getProperty("url");
		String un = properties.getProperty("un");
		String pw = properties.getProperty("pw");
		
		Class.forName(dri);
		con = DriverManager.getConnection(url, un, pw);
	}
	
	@Override
	public boolean save(Student student) throws Exception {
		// TODO Auto-generated method stub
		boolean res = false;
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
		
		pstmt.setInt(1, student.getId());
		pstmt.setString(2, student.getName());
		pstmt.setDate(3, (Date) student.getDob());
		pstmt.setString(4, student.getEmail());
		pstmt.setString(5, student.getMobile());
		

			if (1== pstmt.executeUpdate()) {
				res = true;
				return res;
			} 
			
			return false;

			}

	@Override
	public boolean edit(Student student) throws Exception {
		// TODO Auto-generated method stub
		boolean res = false;
		
		PreparedStatement pstmt = con.prepareStatement("UPDATE student SET name =?,dob = ?,email = ?,mobile= ?  where id = ?");
		
		pstmt.setInt(1, student.getId());
		pstmt.setString(2, student.getName());
		pstmt.setDate(3, (Date) student.getDob());
		pstmt.setString(4, student.getEmail());
		pstmt.setString(5, student.getMobile());
		
			if(1==pstmt.executeUpdate()) {
				res = true;
				return res;
			}
			else {
				return false;
			}
	}

	@Override
	public boolean delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		
		boolean res = false;
		PreparedStatement pstmt = con.prepareStatement("DELETE FROM student WHERE id = ?");
		
			pstmt.setInt(1, id);
			if(1==pstmt.executeUpdate()) {
				res =true;
			}
			return res;
			}
				

	@Override
	public Student find(int id) throws SQLException {
		
		Student student = null;
	
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM student WHERE id = ?");
		
		pstmt.setInt(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			String name = rs.getString(2);
			
			java.util.Date dd = rs.getDate(3);
			String strDob = new SimpleDateFormat("dd-MM-yyyy").format(dd);
			String email = rs.getString(4);
			String mobile = rs.getString(5);
			
			student= new Student(id, name, strDob, email, mobile);
		}
		return student;
	}
	
	@Override
	public List<Student> findAll() throws SQLException {
		//  Auto-generated method stub
		
		ArrayList<Student> students = new ArrayList<>();
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM student");
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			java.util.Date dd = rs.getDate("dob");
			String strDob = new SimpleDateFormat("dd-MM-yyyy").format(dd);
			String email = rs.getString("email");
			String mobile = rs.getString("mobile");
			
			Student student = new Student(id, name, strDob, email, mobile);
			students.add(student);
		}
		return students;
		
	}

	@Override
	public boolean delete(int id1, int id2) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student find(int studentID, int examId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}