package com.ustglobal.jpahibernateassign;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpahibernateassign.dto.Student;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student studentDetail=entityManager.find(Student.class, 101);
		System.out.println("ID----"+studentDetail.getSid());
		System.out.println("Name----"+studentDetail.getSname());
		System.out.println("Quantity----"+studentDetail.getSalary());
		entityManager.close();
		
		
	}// end of main method

}// end of class
