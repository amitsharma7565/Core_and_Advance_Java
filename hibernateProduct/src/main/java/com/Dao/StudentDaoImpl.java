package com.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.Entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	
	
	
	public void inserData() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  
 	 Transaction tx = s.beginTransaction();;
 	  Student std= new Student();
 	  
 	  Scanner sc= new Scanner(System.in);
 	  for(int i=1;i<=1;i++) {
 		  System.out.println("Enter the Name of the Student");
 		 std.setName(sc.next());
 		System.out.println("Enter the City of the Student");
 	 	  std.setCity(sc.next());
 	 	System.out.println("Enter the Marks of the Student");
 	 	  std.setMarks(sc.nextInt());
 	 	System.out.println("Enter the Grade of the Student");
 	 	  std.setGrade(sc.next());
 	 	
 	 	  s.save(std);
 	  }
 	  tx.commit();
 	  s.close();
		
	}

	public void marksByDesc() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  
 	  
 	  

 	  Query query=s.createQuery("from Student order by marks desc");
 	  List<Student> list=new ArrayList();
 	  list=query.list();
 	  
 	  for(Student x:list) {
 		  System.out.println(x.getId()+" "+x.getName()+" "+x.getMarks()+" "+x.getGrade()+" "+x.getCity());
 	  }
 	  
 	  s.close();
		
	}
	
	
	public void marksBetween() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  int num1=50;
 	  int num2=70;

 	  Query query=s.createQuery("from Student where marks between :start and :end ");
 	  query.setParameter("start", num1);
 	  query.setParameter("end", num2);
 	  List<Student> list=new ArrayList();
 	  list=query.list();
 	  
 	  for(Student x:list) {
 		  System.out.println(x.getId()+" "+x.getName()+" "+x.getMarks()+" "+x.getGrade()+" "+x.getCity());
 		  
 	  }
 	  
 	  s.close();
	}



	public void displayGradeHigh() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  
 	  
 	  

 	  Query query=s.createQuery("from Student order by grade");
 	  List<Student> list=new ArrayList();
 	  list=query.list();
 	  
 	  for(Student x:list) {
 		  System.out.println(x.getId()+" "+x.getName()+" "+x.getMarks()+" "+x.getGrade()+" "+x.getCity());
 		 
 	  }
 	  
 	  s.close();
		
	}

	public void displayGradeLow() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  
 	  
 	  

 	  Query query=s.createQuery("from Student order by grade desc");
 	  List<Student> list=new ArrayList();
 	  list=query.list();
 	  
 	  for(Student x:list) {
 		  System.out.println(x.getId()+" "+x.getName()+" "+x.getMarks()+" "+x.getGrade()+" "+x.getCity());
 		 
 	  }
 	  
 	  s.close();
		
		
	}
	

	public void displayCityWise() { 
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  
 	  
 	 String hql = "SELECT count(name), city FROM Student group by city";
 	  Query query=s.createQuery(hql);
 	  List<Object[]> list=new ArrayList();
 	  list=query.list();
 	  
 	 for (Object[] result : list) {
 	 System.out.println("Number of students in " + result[1] + " " + result[0]);
 	
 	  }
 	  s.close();

	}

	
	
}
