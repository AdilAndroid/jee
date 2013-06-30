package com.freesoft.action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.freesoft.bean.IdCard;
import com.freesoft.bean.Student;
import com.freesoft.db.util.HibernateSessionFactory;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5883917687481239333L;

	public String insert() throws Exception {
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		try {
			Student student = new Student();
			student.setNumber(0001);
			
			IdCard card = new IdCard();
			card.setName("card01");
			card.setStudent(student);
			
			student.setIdcard(card);
			
			s.save(student);
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
