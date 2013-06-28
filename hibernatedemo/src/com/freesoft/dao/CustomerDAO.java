package com.freesoft.dao;

import com.freesoft.bean.Customer;

public interface CustomerDAO {
	public void insert(Customer customer);
	public Customer find(long id);
}
