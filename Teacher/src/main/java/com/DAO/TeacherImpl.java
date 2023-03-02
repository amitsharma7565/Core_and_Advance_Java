package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.Entity.Teacher;

public class TeacherImpl implements TeacherDao{

	public void insert() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s= sf.openSession();
	Transaction tx= s.beginTransaction();
	Teacher t= new Teacher();
	t.setId(105);
	t.setName("Harjit");
	t.setClassStd(8);
	t.setEmail("harjit123@gmail.com");
	
	s.save(t);
	tx.commit();
	s.close();
	}

	

	public void updateTeacherById(int id) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  Transaction tx= s.beginTransaction();
 	  
// 	  to update the name by using get method and it return something and set then 
 	  Teacher t= s.get(Teacher.class, id);
 		t.setName("Sharma");
 	  
 	  s.save(t);
 	  tx.commit();
 	  s.close();
		
		
	}

	public void deleteById(int id) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  
 	  Teacher t= s.get(Teacher.class, id);
 	  Transaction tx= s.beginTransaction();
 	  s.delete(t);
 	  System.out.println("Delete Successfully");
 	  tx.commit();
 	  s.close();
		
	}
	
	public void getAllTeacher() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s= sf.openSession();
	
	
	Query query = s.createQuery("from Teacher");
	List <Teacher>list= new ArrayList();
	list=query.list();
	
	for(Teacher x:list) {
		System.out.println(x.getId()+" "+x.getEmail()+" "+x.getName()+" "+x.getClass());
	}
	s.close();
	
		
	}
	
	
	
	
}
