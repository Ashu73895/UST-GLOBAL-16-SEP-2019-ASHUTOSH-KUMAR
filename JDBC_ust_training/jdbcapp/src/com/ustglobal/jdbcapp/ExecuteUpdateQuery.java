package com.ustglobal.jdbcapp;
import java.sql.*;
public class ExecuteUpdateQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//step 1 Load the driver
			com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
			//step 2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step 3 issue sql query
			String sql = "Update employee_info set name='ABC',sal=50,gender='O' where id = 6";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//step 4 Read the result
			System.out.println(count + " row(s) updated");
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			//step 5 Close the connection
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}
				
			}catch(SQLException e) {
				
			}
		}
	}

}
