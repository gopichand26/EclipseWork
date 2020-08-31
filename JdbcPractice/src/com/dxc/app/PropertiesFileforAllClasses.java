package com.dxc.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileforAllClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.setProperty("dri", "com.mysql.jdbc.Driver");
		properties.setProperty("url", "jdbc:mysql://localhost:3306/dxc");
		properties.setProperty("un", "root");
		properties.setProperty("pw", "root");
		
		try {
			properties.store(new FileOutputStream("db.prop"), "Regular Properties to run JDBC Applications");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
