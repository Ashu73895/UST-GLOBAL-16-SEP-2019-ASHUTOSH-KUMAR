package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;

public class TestManyToMany {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;
		
		
		
		Course course=new Course();
		course.setCid(1);
		course.setCname("Java");
		
		Course course1=new Course();
		course1.setCid(2);
		course1.setCname("Sql");
		
		Course course2=new Course();
		course2.setCid(3);
		course2.setCname("Python");
		
		ArrayList<Course> al=new ArrayList<Course>();
		al.add(course);
		al.add(course1);
		al.add(course2);
		
	    Student student = new Student();
	    student.setSid(1);
	    student.setSname("Rahul");
	    student.setCourses(al);
		
		
		
		try {
			 entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			System.out.println("Record saved");
		
			entityManager.persist(student);
			entityTransaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
