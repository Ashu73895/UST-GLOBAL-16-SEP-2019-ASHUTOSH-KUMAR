package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");
		
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		
		switch (ch) {
		case 1 :
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			
			for (EmployeeBean bean : result) {
				System.out.println(" Id is "+bean.getId());
				System.out.println(" Name is "+bean.getName());
				System.out.println(" Gender is "+bean.getGender());
				System.out.println(" Salary is "+bean.getSal());
			}
		break;
		
		case 2:
			break;
		
		
		case 3:
			break;
		
		case 4:
			break;
		
		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter id :");
			int id = scn.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id);
			if(bean!=null) {
				System.out.println(" Id is "+bean.getId());
				System.out.println(" Name is "+bean.getName());
				System.out.println(" Gender is "+bean.getGender());
				System.out.println(" Salary is "+bean.getSal());
				
			}else {
				System.out.println("No data found ");
			}
			break;
				
	}// end of switch

}// end of main
}
