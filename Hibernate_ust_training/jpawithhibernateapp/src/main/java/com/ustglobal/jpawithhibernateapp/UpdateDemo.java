package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

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
			Product product=entityManager.find(Product.class, 106);
			product.setPname("Mac");
			System.out.println("Updated record");
			entityTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
		
	}

}
