package com.bitLabs.HibernetDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//      1  need to create a object of confirgation class
    	Configuration cfg= new Configuration();
//    	2.call the configure method present in Configuration class
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session s= sf.openSession();
//   create a Employee or poxy or Entity class object
    	Employee emp= new Employee();
    	emp.setId(108);
    	emp.setName("Negi");
    	emp.setSalary(900000);
    	
//    	Transaction
    	Transaction tx= s.beginTransaction();
    	s.save(emp);
    	tx.commit();
    	s.close();
    	
    }
}
