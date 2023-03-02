package com.bitLabs.HibernateDemo2;

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
//        need to create of Configuation class
    	Configuration cfg= new Configuration(); 
//    	to call the configure method present in configuration class
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sf=cfg.buildSessionFactory();
    	
    	Session s=sf.openSession();
    	
    	Product pd= new Product();
    	pd.setId(10001);
    	pd.setName("Mobile");
    	pd.setPrice(100);
    	
    	Transaction tx= s.beginTransaction();
    	
    	s.save(pd);
    	tx.commit();
    	s.close();
    }
}
