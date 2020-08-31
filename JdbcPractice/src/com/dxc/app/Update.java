package com.dxc.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Update {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Properties properties = new Properties();
			try {
				properties.load(new FileInputStream("db.prop"));
				String dri = properties.getProperty("dri");
				String url = properties.getProperty("url");
				String un = properties.getProperty("un");
				String pw = properties.getProperty("pw");
				
				Connection con = null;
				Statement stmt = null;
				
				Class.forName(dri);
				con = DriverManager.getConnection(url, un, pw);
				stmt = con.createStatement();
				
			
				Scanner input = new Scanner(System.in);
				
				System.out.println("Enter id :");
				int id=input.nextInt();
				
				
				

				String sql = "UPDATE studenttable set name='Prabha' WHERE id = "+id+"";
				int n =stmt.executeUpdate(sql);
				
				if (n==1)
				{
					System.out.println("Updated successfully");
				}
				else
					System.out.println("Failed to Update");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
