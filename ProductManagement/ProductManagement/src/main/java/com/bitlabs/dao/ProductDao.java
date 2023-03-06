package com.bitlabs.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bitlabs.model.Product;

@Repository
public class ProductDao {
@Autowired
private HibernateTemplate hibernateTemplate;

@Transactional
public void addProduct(Product product) {
	this.hibernateTemplate.saveOrUpdate(product);
	
}

public List<Product> getAllProducts(){
	List<Product>list=new ArrayList<Product>();
	list=this.hibernateTemplate.loadAll(Product.class);
	return list;
	
	
}

@Transactional
public void delete(int pid) {
	Product p=this.hibernateTemplate.get(Product.class,pid);
	this.hibernateTemplate.delete(p);
}

@Transactional
public void update(Product product) {
	this.hibernateTemplate.update(product);
	
}

public Product getProductById(int pid) {
	Product p=this.hibernateTemplate.get(Product.class,pid);
	return p;
}

}
