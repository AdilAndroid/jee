package com.freesoft.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.freesoft.bean.Person;
import com.freesoft.dao.PersonDAO;
import com.freesoft.db.util.HibernateSessionFactory;

public class PersonDAOImpl implements PersonDAO {
	@Override
	public void savePerson(Person p) {
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		try {
			s.save(p);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (s != null)
				s.close();
		}
	}
}
