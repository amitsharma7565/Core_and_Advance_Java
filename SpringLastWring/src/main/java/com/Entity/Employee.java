package com.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
@Autowired
@Qualifier("add2")
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	

	public Employee() {
		super();
		System.out.println("This is constructor default");
	}

	public Employee(Address add) {
		super();
		this.add = add;
		System.out.println("This is constructor Paramters");
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + "]";
	}
	
}
