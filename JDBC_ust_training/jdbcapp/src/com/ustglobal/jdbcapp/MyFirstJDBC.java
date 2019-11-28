package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//Step 1. Load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2. Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			conn = DriverManager.getConnection(url, "root", "root");
			
			
			//step 3.   Issue the SQL query
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
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
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally {
			
			// Step 5.  Close the connection  
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}// end of main()
}//end of MyFirstJDBC
