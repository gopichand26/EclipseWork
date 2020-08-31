package com.dxc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dri = "com.mysql.jdbc.Driver" ;
		String url = "jdbc:mysql://localhost:3306/dxc";
		String un = "root" ;
		String pw = "root";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(dri);
			con = DriverManager.getConnection(url, un, pw);
			stmt = con.createStatement();
			String sql = "SELECT * FROM student" ;
			rs = stmt.executeQuery(sql);
			
			// ResultSet may have a chance to have more than a single record
			// in order to fetch all of the records, we are using loop
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString("email");
				String mobile = rs.getString("mobile");
				System.out.println(id+" "+name+" "+email+" "+mobile);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
