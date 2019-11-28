package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;

public class TestOneToMany {
	public static void main(String[] args) {
		
		PencilBox peBox=new PencilBox();
		peBox.setBid(1);
		peBox.setBname("Apsara");
		
		Pencil pencil = new Pencil();
		pencil.setPid(11);
		pencil.setColor("black");
		pencil.setPencilBox(peBox);
		
		Pencil pencil1 = new Pencil();
		pencil1.setPid(12);
		pencil1.setColor("red");
		pencil1.setPencilBox(peBox);
		
		
		
		
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;
		
		try {
			 entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			/*entityManager.persist(pencil);
			entityManager.persist(pencil1);*/
			PencilBox pBox = entityManager.find(PencilBox.class,1);
			System.out.println(pBox.getPencil().get(1));
			System.out.println("Record saved");
			entityTransaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		entityManager.close();
	}

}
