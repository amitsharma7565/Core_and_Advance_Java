package com.bitLabs.HibernateMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitLabs.Entity2.Answer1;
import com.bitLabs.Entity2.Question1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    	Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  Transaction tx= s.beginTransaction();
 	  
 	  Question1 q= new Question1();
 	  q.setId(201);
 	  q.setQuestionn("What is java");
 	  
 	  Answer1 a1= new Answer1();
 	  a1.setId(101);
 	  a1.setAnswer("java is paltform independet");
 	  a1.setQues(q);
 	  
 	 Answer1 a2= new Answer1();
	  a2.setId(102);
	  a2.setAnswer("java 100% object oreinted Programming");
	  a2.setQues(q);
	  
	  Answer1 a3= new Answer1();
 	  a3.setId(103);
 	  a3.setAnswer("java is very secure");
 	  a3.setQues(q);
 	  
 	  List<Answer1>list= new ArrayList();
 	  list.add(a1);
 	  list.add(a2);
 	  list.add(a3);
 	  
 	  q.setAns(list);
 	  
 	  s.save(a1);
 	  s.save(a2);
 	  s.save(a3);
 	  
 	  s.save(q);
 	  
 	  tx.commit();
 	  s.close();
 	  
 	  
    }
}
