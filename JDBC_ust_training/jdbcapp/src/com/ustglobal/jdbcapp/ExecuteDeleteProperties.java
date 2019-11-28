package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class ExecuteDeleteProperties {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader=null;
		
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//step 1 Load the driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			
			//step 2 get the connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//step 3 Issue sql query
			String sql = prop.getProperty("delete-query");
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			int count = pstmt.executeUpdate();
			
			
			//step 4 Read the result
			System.out.println(count+" row(s) deleted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// step 5 close the connection
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}


}
