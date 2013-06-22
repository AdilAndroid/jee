package com.freesoft.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.freesoft.bean.People;
import com.freesoft.dao.PeopleDAO;
import com.freesoft.db.util.HibernateSessionFactory;

public class PeopleDAOImpl implements PeopleDAO {
	@Override
	public void insert(People people) {
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		try {
			s.save(people);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (s != null)
				s.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<People> list() {
		List<People> result = null;
		Session s = HibernateSessionFactory.getSession();
		try {
			Query q = s.createQuery("from People");
			result = (List<People>)q.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (s != null)
				s.close();
		}
		
		return result;
	}
}
