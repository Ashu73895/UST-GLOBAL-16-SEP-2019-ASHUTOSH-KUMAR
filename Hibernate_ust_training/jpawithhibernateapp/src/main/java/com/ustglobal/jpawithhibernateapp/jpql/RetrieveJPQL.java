package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class RetrieveJPQL {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql="select pname from Product";
		Query query=entityManager.createQuery(jpql);
		
	//	List<Product> list=query.getResultList();
		//for (Product product : list) {
		/*System.out.println("Id :"+product.getPid());
		System.out.println("Pname :"+product.getPname());
		System.out.println("Quantity :"+product.getQuantity());
		System.out.println("==================================");
		}
		*/
		List<String> list=query.getResultList();
		for (String product : list) {
			
			System.out.println(product);
		}
		
		
		
		
		
		
		entityManager.close();
		
		
	
	
	}// end of main

}// end of class
