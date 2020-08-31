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
import com.dxc.beans.Marks;

public class MarksJdbcDAO implements DAO<Marks> {
	
	Connection con = null;
	public MarksJdbcDAO() throws Exception{
		
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
	public boolean save(Marks marks) throws Exception {
		// TODO Auto-generated method stub
		boolean res = false;
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO marks VALUES(?,?,?,?,?)");
		
		pstmt.setInt(1, marks.getStudentID());
		pstmt.setInt(2, marks.getExamId());
		pstmt.setInt(3, marks.getSub1());
		pstmt.setInt(4, marks.getSub2());
		pstmt.setInt(5, marks.getSub3());
		if (1== pstmt.executeUpdate()) {
			res = true;
			return res;
		} 
		
		return false;

		}

	@Override
	public boolean edit(Marks marks) throws Exception {
		// TODO Auto-generated method stub
		
	boolean res = false;
		
		PreparedStatement pstmt = con.prepareStatement("UPDATE marks SET sub1 = ?,sub2 =?, sub3=?  where studentId = ?,examId=?");
		
		pstmt.setInt(1, marks.getStudentID());
		pstmt.setInt(2, marks.getExamId());
		pstmt.setInt(3, marks.getSub1());
		pstmt.setInt(4, marks.getSub2());
		pstmt.setInt(5, marks.getSub3());
		

		if(1==pstmt.executeUpdate()) {
			res = true;
			return res;
		}
		else {
			return false;
		}

	}

	@Override
	public boolean delete(int studentID,int examId) throws Exception {
		// TODO Auto-generated method stub
		boolean res = false;
		PreparedStatement pstmt = con.prepareStatement("DELETE FROM marks WHERE studentID = ?,examId=?");
		
			pstmt.setInt(1, studentID);
			pstmt.setInt(2, examId);
			
			if(1==pstmt.executeUpdate()) {
				res =true;
			}
			return res;
			}

	@Override
	public Marks find(int id) throws Exception {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Marks> findAll() throws Exception {
		// TODO Auto-generated method stub
	ArrayList<Marks> ms = new ArrayList<>();
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM marks");
		
		while(rs.next()) {
			int studentID = rs.getInt("studentID");
			int examId = rs.getInt("examId");
			int sub1 = rs.getInt("sub1");
			int sub2 = rs.getInt("sub2");
			int sub3 = rs.getInt("sub3");
			
			Marks marks = new Marks(studentID,examId,sub1,sub2,sub3);
			ms.add(marks);
		}
		return ms;
	}

	@Override
	public Marks find(int studentID, int examId) throws Exception {
		// TODO Auto-generated method stub
		Marks marks = null;
		
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM marks WHERE (studentId = ?) and (examId = ?)");
		
		pstmt.setInt(1, studentID);
		pstmt.setInt(2, examId);
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			int sub1  = rs.getInt(3);
			int sub2  = rs.getInt(4);
			int sub3  = rs.getInt(5);
			
			
			marks = new Marks(studentID, examId, sub1, sub2, sub3);
		}
		return marks;
	}

	@Override
	public boolean delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}



}