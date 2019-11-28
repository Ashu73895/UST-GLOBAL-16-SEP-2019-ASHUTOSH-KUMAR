package com.ustglobal.jpahibernateassign;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpahibernateassign.dto.Student;

public class InsertDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setSid(106);
		student.setSname("Sumit");
		student.setSalary(25000);
		
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;
		
		try {
			 entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			System.out.println("Record saved");
			entityTransaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		entityManager.close();
	}//main method ended

}//class ended
