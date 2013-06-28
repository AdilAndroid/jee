package com.freesoft.service.impl;

import com.freesoft.bean.Customer;
import com.freesoft.dao.CustomerDAO;
import com.freesoft.dao.impl.CustomerDAOImpl;
import com.freesoft.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void insert(Customer customer) {
		CustomerDAO dao = new CustomerDAOImpl();
		dao.insert(customer);
	}

	@Override
	public Customer find(long id) {
		CustomerDAO dao = new CustomerDAOImpl();
		return dao.find(id);
	}
}
