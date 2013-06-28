package com.freesoft.service;

import com.freesoft.bean.Customer;

public interface CustomerService {
	public void insert(Customer customer);
	public Customer find(long id);
}
