package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeleteJPQL {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction =null;
		
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			String jpql="delete from Product where pid=:id";
			Query query=entityManager.createQuery(jpql);
			
			
			query.setParameter("id", 106);
			
			int res=query.executeUpdate();
			System.out.println(res+" row(s) deleted");
			entityTransaction.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		
		 entityManager.close();
	}
	

}
