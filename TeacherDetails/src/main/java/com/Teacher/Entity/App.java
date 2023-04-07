package com.Teacher.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.details.Entity.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       create the object of configuration class
    	Configuration cfg= new Configuration();
//    	call configure method
    	cfg.configure("hibernate.cfg.xml");
//    	call method called build session factory present in configure class it return session factory
    	SessionFactory sf= cfg.buildSessionFactory();
//    	call method called session present in sessionFactory class and it return session
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	Teacher t= new Teacher();
    	t.setId(103);
    	t.setName("Vinay");
    	t.setDept("Saftey");
    	
    	s.save(t);
    	tx.commit();
    	s.close();
    	
    }
}
