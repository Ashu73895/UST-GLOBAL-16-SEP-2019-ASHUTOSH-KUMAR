package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDemoJPQL {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction =null;
		
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			String jpql="update Product set pname='macbook' where pid=106";
			Query query=entityManager.createQuery(jpql);
			int res=query.executeUpdate();
			System.out.println(res+" row(s) updated");
			entityTransaction.commit();
			
			
		} catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
		}
		
		 entityManager.close();
	}

}
