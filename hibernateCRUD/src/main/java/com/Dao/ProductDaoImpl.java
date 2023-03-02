package com.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Product;



public class ProductDaoImpl implements ProductDao{

	public void insert() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  
// 	  to insert the data to database or table
 	  Product pd= new Product();
 	  pd.setName("Pen");
 	  pd.setCost(80);
 	  
 	  Transaction tx= s.beginTransaction();
 	  s.save(pd);
 	  tx.commit();
 	  s.close();
	}

	public void getAllProduct() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  
 	  
 	  
// 	  for get all the data from the table or database
 	  Query query=s.createQuery("from Product");
 	  List<Product> list=new ArrayList();
 	  list=query.list();
 	  
 	  for(Product x:list) {
 		  System.out.println(x.getId()+" "+x.getName()+" "+x.getCost());
 	  }
 	  
 	  s.close();
		
	}

	public void updateById(int id) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  Transaction tx= s.beginTransaction();
 	  
// 	  to update the name by using get method and it return something and set then 
 	  Product pd= s.get(Product.class, id);
 		pd.setName("Car");
 	  
 	  s.save(pd);
 	  tx.commit();
 	  s.close();
		
	}

	public void getProductById(int id) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  
// 	  to get the details of student by using id to use get method 
 	  Product pd= s.get(Product.class, id);
 	  System.out.println(pd);
 	  
 	  s.save(pd);
 	 
 	  s.close();
		
	}

	public void deleteProductById(int id) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
 	  SessionFactory sf= cfg.buildSessionFactory();
 	  Session s=sf.openSession();
 	  
 	  Product pd= s.get(Product.class, id);
 	  Transaction tx= s.beginTransaction();
 	  s.delete(pd);
 	  System.out.println("Delete Successfully");
 	  tx.commit();
 	  s.close();
		
	}
	
	
}
