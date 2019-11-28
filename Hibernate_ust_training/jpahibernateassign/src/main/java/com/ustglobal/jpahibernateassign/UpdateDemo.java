package com.ustglobal.jpahibernateassign;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpahibernateassign.dto.Student;

public class UpdateDemo {
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
			student.setSname("Sumita");
			System.out.println("Updated record");
			entityTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
		
	}

}
