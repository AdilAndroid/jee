package com.freesoft.console;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.freesoft.bean.Course;
import com.freesoft.bean.Student;
import com.freesoft.db.util.HibernateSessionFactory;

public class TestTeam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Team team = new Team();
//		team.setName("science");
//		
		Set<Course> courses = new HashSet<Course>();
		Course course1 = new Course();
		course1.setName("math");
		Course course2 = new Course();
		course2.setName("gym");
		courses.add(course1);
		courses.add(course2);
		
		
		Student student1 = new Student();
		student1.setStudent_number(1L);
		student1.setCourses(courses);
		
		Student student2 = new Student();
		student2.setStudent_number(2L);
		
		
		Set<Student> students = new HashSet<Student>();
		students.add(student1);
		students.add(student2);
//		team.setStudents(students);
		
		
//		IdCard idcard1 = new IdCard();
//		idcard1.setName("zhangsan");
//		idcard1.setStudent(student1);
//		student1.setIdcard(idcard1);
//		
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		try {			
			s.save(student1);
//			s.save(student2);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (s != null)
				s.close();
		}
		return ;
	}
}
