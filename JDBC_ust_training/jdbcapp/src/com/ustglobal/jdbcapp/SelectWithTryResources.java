package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectWithTryResources {
	
		public static void main(String[] args) {
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			FileReader reader = null;
			try {
				reader = new FileReader("db.properties");
				Properties prop = new Properties();
				prop.load(reader);
				
				
				
				
//				//Step 1. Load the driver
//				Driver driver = new Driver();
//				DriverManager.registerDriver(driver);
				
				Class.forName(prop.getProperty("driver-class-name"));
				
				//Step 2. Get the connection
				
				String url = prop.getProperty("url");
				conn = DriverManager.getConnection(url,prop);
				
				
				//step 3.   Issue the SQL query
				stmt = conn.createStatement();
				String sql = prop.getProperty("select-query");
				rs=stmt.executeQuery(sql);
				
				
				//Step 4.   Read the result
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int sal = rs.getInt("sal");
					String gender = rs.getString("gender");
					System.out.println("Id is "+id);
					System.out.println("Name is "+name);
					System.out.println("Salary is "+sal);
					System.out.println("Gender is "+gender);
					System.out.println("========================");
				}
				
			}catch(Exception e){
				e.printStackTrace();
				
			}
	}

}
