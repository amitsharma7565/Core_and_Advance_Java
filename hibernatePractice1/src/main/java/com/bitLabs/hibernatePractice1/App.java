package com.bitLabs.hibernatePractice1;





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
//        System.out.println( "Hello World!" );
    	Configuration cfg= new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf= cfg.buildSessionFactory();
    	
    	
    	Session s= sf.openSession();
    	
    	
    	Address ad= new Address();
    	ad.setAddress("Doon");
    	ad.setbGroup("Z+");
    	
    	
    	Person p= new Person();
    	p.setId(103);
    	p.setName("Rohit");
    	p.setSalary(14633);
    	p.setAd(ad);
    	
    	
    	Transaction tx=  s.beginTransaction();
    	
    	
//    	s.save(p);
    	 Person p1=  (Person)s.get(Person.class, 102);
    	 System.out.println(p1.getId()+"-"+p1.getName()+"-"+p1.getAd());
    	 
//    	 Person p2=(Person)s.load(Person.class, 103);
//    	 System.out.println(p2.getId()+"-"+p2.getName()+"-"+p2.getAd());
    	tx.commit();
    	s.close();
    	
    }
}
