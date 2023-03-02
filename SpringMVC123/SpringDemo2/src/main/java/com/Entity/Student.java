package com.Entity;

import java.util.List;

public class Student {

	
	
	private int id;
	private String name;
	private List<Integer> phoneNo;
	
	
	public List<Integer> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<Integer> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
