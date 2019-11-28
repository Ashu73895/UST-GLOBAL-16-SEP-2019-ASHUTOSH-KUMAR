package com.ustglobal.jdbcapp;
import java.sql.Connection;

import com.mysql.jdbc.Driver;

import java.sql.*;
public class ExecuteDeleteQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			
			//step 1 Load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2 get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step 3 Issue sql query
			String sql = "delete from employee_info where id = 6";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			
			//step 4 Read the result
			System.out.println(count+" row(s) deleted");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			// step 5 close the connection
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
