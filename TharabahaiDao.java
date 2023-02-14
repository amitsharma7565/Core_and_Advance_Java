package com.bitlabs.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity.TharabhaiBatch;
import java.util.Scanner;

public class TharabahaiDao implements TharabahiDaoInterface{

	//insert the data (create operation)
	//get all studentds (read operation)
	//update studet by id (update operation)
	//delete student by id (delete operation)
	Scanner sc=new Scanner(System.in);
	
	public void insert() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	System.out.println("Enter Student name");
    	String name=sc.nextLine();
    	System.out.println("Enter Student emil");
    	String email=sc.nextLine();
    	System.out.println("Enter Student marks");
    	int marks=sc.nextInt();
    	
    	TharabhaiBatch obj=new TharabhaiBatch();
    	obj.setName(name);
    	obj.setEmail(email);
    	obj.setMarks(marks);
    	
    	s.save(obj);
    	System.out.println("Inserted data successfully");
    	tx.commit();
    	s.close();
	}
	public void getAllStudent() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	
    	Query query=s.createQuery("from TharabhaiBatch");
    	List<TharabhaiBatch> list=new ArrayList();
    	 list=query.list();
    	
    	for(TharabhaiBatch x: list) {
    		System.out.println(x.getId()+"    "+x.getName()+"   "+x.getEmail()+"   "+x.getMarks());
    		
    	}
    	
    	s.close();
	}
	public void updateById(int id) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	
    	TharabhaiBatch obj=s.get(TharabhaiBatch.class, id);
    	
    	obj.setName("vinay kumar");
    	
    	
    	s.save(obj);
    	System.out.println("updated data successfully");
    	tx.commit();
    	s.close();
		
	}
	
	public void getStudentById(int id) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	
    	TharabhaiBatch obj=s.get(TharabhaiBatch.class, id);
    	
    	System.out.println(obj);
    	
    	
    	s.save(obj);
    	
    	tx.commit();
    	s.close();
	}
	public void deleteStudentById(int id) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	
    	TharabhaiBatch obj=s.get(TharabhaiBatch.class, id);
    	
    	System.out.println(obj);
    	
    	
    	s.delete(obj);
    	System.out.println("Deletd data successfully");
    	tx.commit();
    	s.close();
	}
	
	
	 
	
	
	
	
	
	
	
	
}
