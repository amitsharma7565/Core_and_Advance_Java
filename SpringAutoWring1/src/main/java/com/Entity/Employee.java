package com.Entity;

public class Employee {
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Employee(Address add) {
		super();
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + "]";
	}
	
}
