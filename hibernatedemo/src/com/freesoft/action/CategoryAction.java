package com.freesoft.action;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.freesoft.bean.Category;
import com.freesoft.db.util.HibernateSessionFactory;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6381869997336508799L;

	public String insert() {
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		try {
			Category g1 = new Category("level1");
			
			Category g2 = new Category("level2", g1);
			Category g3 = new Category("level2", g1);
			
			Category g4 = new Category("level3", g2);
			Category g5 = new Category("level3", g2);
			Category g6 = new Category("level3", g3);
			Category g7 = new Category("level3", g3);
			
			Set<Category> set1 = new HashSet<Category>();
			set1.add(g2);
			set1.add(g3);
			g1.setChild(set1);
			
			Set<Category> set2 = new HashSet<Category>();
			set2.add(g4);
			set2.add(g5);
			g2.setChild(set2);
			
			Set<Category> set3 = new HashSet<Category>();
			set3.add(g6);
			set3.add(g7);
			g3.setChild(set3);
			
			s.save(g1);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (s != null)
				s.close();
		}
		return SUCCESS;
	}
}
