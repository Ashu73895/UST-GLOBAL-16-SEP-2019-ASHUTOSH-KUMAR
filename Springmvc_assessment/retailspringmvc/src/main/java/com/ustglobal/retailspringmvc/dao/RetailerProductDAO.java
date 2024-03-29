package com.ustglobal.retailspringmvc.dao;

import com.ustglobal.retailspringmvc.dto.ProductBean;
import com.ustglobal.retailspringmvc.dto.RetailerBean;

public interface RetailerProductDAO {

	public RetailerBean login(int id, String password);

	public int register(RetailerBean bean);
	
	public ProductBean searchProduct(int pid);
	
	public int updatePassword(int rid, String newpassword);
	
	public ProductBean buyOneProduct(int bid);

}
