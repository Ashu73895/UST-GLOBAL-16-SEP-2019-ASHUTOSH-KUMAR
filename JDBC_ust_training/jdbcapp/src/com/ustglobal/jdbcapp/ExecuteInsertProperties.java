package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ExecuteInsertProperties {
	public static void main(String[] args) {
		Connection conn=null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		try {
			//step 1 Load the driver
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//step 1 Load the driver
			
			Class.forName(prop.getProperty("driver-class-name"));
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			
			
			//step 2 get connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
//			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
//			conn=DriverManager.getConnection(url);
			
			
			//step 3  Issue sql query
			String sql = prop.getProperty("insert-query");;
			pstmt = conn.prepareStatement(sql);
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1,  id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal =args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			int count = pstmt.executeUpdate();
			
			
			//step 4 Read the result
			System.out.println(count +" row(s) inserted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//step 5. Close the connection
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
				
			}catch(Exception e) {
				
			}
		}
		
	}// of main()

}
