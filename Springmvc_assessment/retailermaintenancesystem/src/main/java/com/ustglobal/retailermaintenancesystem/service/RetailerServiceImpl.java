package com.ustglobal.retailermaintenancesystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.retailermaintenancesystem.dao.RetailerDAO;
import com.ustglobal.retailermaintenancesystem.dto.ProductBean;
import com.ustglobal.retailermaintenancesystem.dto.RetailerBean;
@Service
public class RetailerServiceImpl implements RetailerService{
	@Autowired
	private RetailerDAO dao;

	@Override
	public int createProfile(RetailerBean bean) {
		// TODO Auto-generated method stub
		return dao.createProfile(bean);
	}

	@Override
	public RetailerBean login(int rId, String password) {
		// TODO Auto-generated method stub
		return dao.login(rId, password);
	}

	@Override
	public RetailerBean search(int rId) {
		// TODO Auto-generated method stub
		return dao.search(rId);
	}

	@Override
	public boolean changePassword(int rId, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(rId, password);
	}

	@Override
	public int amountPayable(int rId) {
		// TODO Auto-generated method stub
		return dao.amountPayable(rId);
	}

	@Override
	public ProductBean orders(int rId) {
		// TODO Auto-generated method stub
		return dao.orders(rId);
	}

}
