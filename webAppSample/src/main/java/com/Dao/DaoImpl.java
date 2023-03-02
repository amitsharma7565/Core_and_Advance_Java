package com.Dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;

public class DaoImpl implements Dao {
	
	SessionFactory sf=null;
	public DaoImpl() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cgf.xml");
		SessionFactory sf=  cfg.buildSessionFactory();
		
	}
	public void register(Student stu) {
		
		Session s=sf.openSession();
		Transaction tx= s.beginTransaction();
		s.save(stu);
		tx.commit();
		s.close();
		
		
		
	}

	public void login(Student stu) {
		Session s=sf.openSession();
	Query q=	s.createQuery();
		
	}





	

}
