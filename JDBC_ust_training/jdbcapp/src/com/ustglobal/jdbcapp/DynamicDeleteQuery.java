package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {
	public static void main(String[] args) {
		Connection conn = null;
	//	Statement stmt = null;
		PreparedStatement pstmt = null;
		
		
		try {
			
			//step 1 Load the driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step 3 Issue sql query
			String sql = "delete from employee_info where id =?";
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
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}


}
