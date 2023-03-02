package Dao;



import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Product;

public class DaoImpl {
	public void insert() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx= s.beginTransaction();
	
	Product pd= new Product();
	pd.setId(101);
	pd.setpName("Pen");
	pd.setPrice(300);
	
	s.save(pd);
	tx.commit();
	s.close();
	}
	
	public void getAllProduct() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		 Query query= s.createQuery("from Product");
		 List<Product> list= new ArrayList();
		list= query.list();
		 for(Product x:list) {
			 System.out.println(x.getId()+" "+x.getpName()+" "+x.getPrice());
		 }
		 s.close();
	}
	public void updateById(int id) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx= s.beginTransaction();
		
		Product pd= s.get(Product.class, id);
		pd.setpName("Vinay");
		s.save(pd);
		tx.commit();
		s.close();
	}
	public void getProductById(int id) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();

		
		Product pd= s.get(Product.class, id);
		System.out.println(pd);
		s.save(pd);
	
		s.close();
	}
	
public void deleteProductById(int id) {
	Configuration cfg= new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	SessionFactory sf=cfg.buildSessionFactory();
	Session s= sf.openSession();
	Transaction tx= s.beginTransaction();
	
	Product pd= new Product();
	pd= s.get(Product.class, id);
	s.delete(pd);
	tx.commit();
	s.close();
	
}
}
