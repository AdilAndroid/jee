package com.freesoft.dao.impl;

import java.util.List;

import org.hibernate.Query;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> listPerson() {
		Session s = HibernateSessionFactory.getSession();
		List<Person> personList = null;
		try {
			Query q = s.createQuery("from Person");
			// HQL利用类名查询(通过hbm文件)
			// Query q =
			// s.createQuery("select * from com.freesoft.bean.Person");
			personList = q.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (s != null)
				s.close();
		}
		return personList;
	}

	@Override
	public Person personDescribe(int id) {
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		Person p = null;
		try {
			p = (Person) s.get(Person.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (s != null)
				s.close();
		}
		return p;
	}

	@Override
	public void deletePerson(int id) {
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		try {
			// load认为对象存在,如果不存在则抛出异常
			// get方法,如果对象不存在,返回null
			Person person = (Person) s.load(Person.class, id);
			s.delete(person);
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
	public void updatePerson(Person p) {
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		try {
			s.update(p);
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
