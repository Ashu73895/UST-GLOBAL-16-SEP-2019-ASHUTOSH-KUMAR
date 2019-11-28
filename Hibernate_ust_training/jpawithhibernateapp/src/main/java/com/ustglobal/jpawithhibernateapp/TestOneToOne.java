package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {
		
		VoterCard vc=new VoterCard();
		vc.setVid(10);
		vc.setVname("Ram");
		
		Person p = new Person();
		p.setPid(1);
		p.setPname("Ram");
		p.setVoterCard(vc);
		
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;
		
		try {
			 entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			//entityManager.persist(p);
			VoterCard vCard = entityManager.find(VoterCard.class,10);
			System.out.println(vCard.getPerson().getPid());
			System.out.println("Record saved");
			entityTransaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
