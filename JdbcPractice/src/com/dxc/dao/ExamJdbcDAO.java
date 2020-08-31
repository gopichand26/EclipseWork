package com.dxc.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.dxc.beans.Exam;

public class ExamJdbcDAO implements DAO<Exam> {
	
	Connection con = null;
	public ExamJdbcDAO() throws Exception{
		
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
	public boolean save(Exam exam) throws Exception {
		// TODO Auto-generated method stub
		boolean res = false;
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO exam VALUES(?,?)");
		
		pstmt.setInt(1, exam.getId());
		pstmt.setString(2, exam.getName());
		
		if (1== pstmt.executeUpdate()) {
			res = true;
			return res;
		} 
		
		return false;

		}

	@Override
	public boolean edit(Exam exam) throws Exception {
		// TODO Auto-generated method stub
		
	boolean res = false;
		
		PreparedStatement pstmt = con.prepareStatement("UPDATE exam SET name = ?  where id = ?");
		
		pstmt.setInt(1, exam.getId());
		pstmt.setString(2, exam.getName());
		

		if(1==pstmt.executeUpdate()) {
			res = true;
			return res;
		}
		else {
			return false;
		}

	}

	@Override
	public boolean delete(int id) throws Exception {
		// TODO Auto-generated method stub
		boolean res = false;
		PreparedStatement pstmt = con.prepareStatement("DELETE FROM exam WHERE id = ?");
		
			pstmt.setInt(1, id);
			if(1==pstmt.executeUpdate()) {
				res =true;
			}
			return res;
			}

	@Override
	public Exam find(int id) throws Exception {
		// TODO Auto-generated method stub
		Exam exam = null;
		
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM exam WHERE id = ?");
		
		pstmt.setInt(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			String name = rs.getString(2);
			
			
			
			exam = new Exam(id, name);
		}
		return exam;
	}

	@Override
	public List<Exam> findAll() throws Exception {
		// TODO Auto-generated method stub
	ArrayList<Exam> exams = new ArrayList<>();
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM exam");
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			
			Exam exam = new Exam(id, name);
			exams.add(exam);
		}
		return exams;
	}

	@Override
	public boolean delete(int id1, int id2) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Exam find(int studentID, int examId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}