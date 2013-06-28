package com.freesoft.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.freesoft.bean.Customer;
import com.freesoft.dao.CustomerDAO;
import com.freesoft.db.util.HibernateSessionFactory;

public class CustomerDAOImpl implements CustomerDAO {
	@Override
	public void insert(Customer customer) {
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		try {
			s.save(customer);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (s != null)
				s.close();
		}
	}

	@Override
	public Customer find(long id) {
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		Customer c = null;
		try {
			c = (Customer) s.get(Customer.class, new Long(id));
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (s != null)
				s.close();
		}
		
		return c;
	}
}
