package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class ExecuteUpdateProperties {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader=null;
		
		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			
			//step 1 Load the driver
//			com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			
			
			
			//step 2 Get the connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//step 3 issue sql query
			String sql = prop.getProperty("update-query");
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			String name = args[1];
			String empsal =args[2];
			int sal = Integer.parseInt(empsal);
			String gender = args[3];
			
			
			pstmt.setInt(4,  id);
			
			
			pstmt.setString(1, name);
			
			
			pstmt.setInt(2, sal);
			
			
			pstmt.setString(3, gender);
			int count = pstmt.executeUpdate();
			
			//step 4 Read the result
			System.out.println(count + " row(s) updated");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			//step 5 Close the connection
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}if(reader!=null) {
					reader.close();
				}
				
			}catch(Exception e) {
				
			}
		}
	}

}
