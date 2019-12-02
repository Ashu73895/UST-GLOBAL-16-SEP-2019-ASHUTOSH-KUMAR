package com.ustglobal.retailermaintenancesystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.ustglobal.retailermaintenancesystem.dto.ProductBean;
import com.ustglobal.retailermaintenancesystem.dto.RetailerBean;
@Repository
public class RetailerDAOImpl implements RetailerDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public int createProfile(RetailerBean bean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getrId();
		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();
			return -1;
		}
	}

	@Override
	public RetailerBean login(int rId, String password) {
		String jpql = "from RetailerBean  where id=:id and password =:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<RetailerBean> query = manager.createQuery(jpql,RetailerBean.class);
		query.setParameter("id", rId);
		query.setParameter("pass", password);
		try {
			RetailerBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

	}

	@Override
	public RetailerBean search(int rId) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(RetailerBean.class, rId);
	}

	@Override
	public boolean changePassword(int rId, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		RetailerBean bean = manager.find(RetailerBean.class, rId);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public int amountPayable(int rId) {
	EntityManager manager=factory.createEntityManager();
	ProductBean bean = manager.find(ProductBean.class, rId);
	return bean.getAmountPay();
	}

	@Override
	public ProductBean orders(int rId) {
		EntityManager manager=factory.createEntityManager();
		ProductBean bean = manager.find(ProductBean.class, rId);
		return bean;
		
	}

}
