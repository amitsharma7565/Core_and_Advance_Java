package com.bitLabs.hibernateMapping2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entity.Employee;
import Entity.Project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf= cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tx= s.beginTransaction();
       
      Employee emp1=new Employee();
      emp1.setId(101);
      emp1.setName("Amit");
      
      Employee emp2=new Employee();
      emp2.setId(102);
      emp2.setName("Vishal");
      
      Employee emp3=new Employee();
      emp3.setId(103);
      emp3.setName("Abhishek");
      
      Project p1 = new Project();
      p1.setId(201);
      p1.setProjectName("Java");
       
      Project p2 = new Project();
      p2.setId(202);
      p2.setProjectName("Python");
      
      Project p3 = new Project();
      p3.setId(203);
      p3.setProjectName("C++");
      
      List<Employee> listE= new ArrayList();
      List<Project> listP= new ArrayList(); 
      
      listE.add(emp1);
      listE.add(emp2);
      listE.add(emp3);
      
      listP.add(p1);
      listP.add(p2);
      listP.add(p3);
      
      emp1.setPr(listP);
      emp2.setPr(listP);
      emp3.setPr(listP);
      
      p1.setEmp(listE);
      p2.setEmp(listE);
      p3.setEmp(listE);
      
      s.save(emp1);
      s.save(emp2);
      s.save(emp3);
      
      s.save(p1);
      s.save(p2);
      s.save(p3);
      
      tx.commit();
      s.close();
      
      
      
    }
}
