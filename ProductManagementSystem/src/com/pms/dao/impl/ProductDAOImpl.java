package com.pms.dao.impl;

import com.pms.dao.ProductDAO;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public boolean verifyUnAndPw(String email, String password) {
		// TODO Auto-generated method stub
		CustomerDAOImpl custDao=new CustomerDAOImpl();
		//using customerdao reference varible viewCustomers
		for(User user : custDao.viewAllCustomers())
		{
			if(user.getEmail().equals(email)&&user.getPassWord().equals(password))
			{
				return true
			}
		}
		
		return false;
	}

	
}
