package com.bitLabs.HibernateSecondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
         SessionFactory sf= cfg.buildSessionFactory();
         Session s1= sf.openSession();
         Transaction tx= s1.beginTransaction();
         
         Employee emp= new Employee();
         emp.setId(100);
         emp.setName("Amit");
         emp.setSalary(50000);         
         s1.save(emp);
         tx.commit();
         s1.close();
         
  
         
         
    }
}
