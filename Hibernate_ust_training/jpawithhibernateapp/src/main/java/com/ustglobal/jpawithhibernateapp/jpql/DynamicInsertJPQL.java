package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsertJPQL {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction =null;
		
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			String jpql="insert into product values(:id,:name,:quantity)";
			Query query=entityManager.createNativeQuery(jpql);
			query.setParameter("id", 107);
			query.setParameter("name", "qwert");
			query.setParameter("quantity", 17);
			
			
			
			int res=query.executeUpdate();
			System.out.println(res+" row(s) inserted");
			entityTransaction.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		
		 entityManager.close();
		
	}

}
