package com.ustglobal.jdbcapp;

import java.io.Closeable;
import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt = null;
		try {
			//step 1 Load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			
			
			//step 2 get connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url);
			
			
			//step 3  Issue sql query
			String sql = "insert into employee_info values(6,'Priyanka',13000,'F')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			
			//step 4 Read the result
			System.out.println(count +" row(s) inserted");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			//step 5. Close the connection
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					conn.close();
				}
				
			}catch(SQLException e) {
				
			}
		}
		
	}// of main()

}// end of ExecuteInsertQuery
