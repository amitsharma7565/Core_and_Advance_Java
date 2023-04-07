package com.car.Dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.car.Entity.CarDetail;

public class DaoImpl implements Dao {

	public void insert() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		CarDetail c= new CarDetail();
		c.setId(5);
		c.setBrandName("kia");
		c.setWheelDrive(2);
		
		Transaction tx=s.beginTransaction();
		s.save(c);
		tx.commit();
		s.close();
		
		
	}

	public void getAllCars() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
//		for get all the data from the database
		Query query=s.createQuery("from CarDetail");
		
		List<CarDetail> list= new ArrayList();
		list=query.list();
		
		for(CarDetail c:list) {
			System.out.println(c.getId()+" "+c.getBrandName()+" "+c.getWheelDrive());
		}
		
		s.close();
		
		
		
	}

	public void updateById(int id) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  Transaction tx= s.beginTransaction();
 	  
// 	  to update such coloumn in the database then we can use set method
 	 CarDetail c= s.get(CarDetail.class, id);
 	 c.setBrandName("Mahindra");
 	 s.save(c);
 	 tx.commit();
 	 s.close();
		
	}

	public void getCarById(int id) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	 CarDetail c= s.get(CarDetail.class, id);
 	 System.out.println(c);
 
 	 s.close();
	}

	public void deleteById(int id) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	 CarDetail c= s.get(CarDetail.class, id);
 	 Transaction tx= s.beginTransaction();
 	 s.delete(c);
 	 System.out.println("Delete sucessfully");
 	 tx.commit();
 	 s.close();
		
	}


	

	

}
