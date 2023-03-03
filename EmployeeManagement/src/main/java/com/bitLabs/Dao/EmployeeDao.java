package com.bitLabs.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bitLabs.Model.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void addUser( Employee emp) {	
		this.hibernateTemplate.saveOrUpdate(emp);
	}
	
	public List<Employee> getAll(){
		List<Employee> list= new ArrayList<Employee>();
		list=this.hibernateTemplate.loadAll(Employee.class);
		return list;
	}
	
	@Transactional
	public void delete(int id) {
	Employee emp=this.hibernateTemplate.get(Employee.class, id);
	this.hibernateTemplate.delete(emp);
	}
	
	
	public Employee updateByID(int id) {
		Employee emp= this.hibernateTemplate.get(Employee.class,id);
		return emp;
	}
}
