package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		EntityTransaction transaction=null;
		EntityManager entityManager=null;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		Product product=entityManager.getReference(Product.class, 101);
		System.out.println("ID----"+product.getPid());
		System.out.println("Name----"+product.getPname());
		System.out.println("Quantity----"+product.getQuantity());
		entityManager.close();
	}

}
