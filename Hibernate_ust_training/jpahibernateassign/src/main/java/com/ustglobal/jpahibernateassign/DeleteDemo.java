package com.ustglobal.jpahibernateassign;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpahibernateassign.dto.Student;

public class DeleteDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction =null;
		try {
			 entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager=entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Student student=entityManager.find(Student.class, 106);
			entityManager.remove(student);
			System.out.println("record deleted");
			entityTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
	}// end of main

}//end of class
