package com.Entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private List<Integer> phoneNo;
	private Set<Integer>aadharCard;
	private Map<Integer, String> courseName;
	
	public Map<Integer, String> getCourseName() {
		return courseName;
	}
	public void setCourseName(Map<Integer, String> courseName) {
		this.courseName = courseName;
	}
	public Set<Integer> getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(Set<Integer> aadharCard) {
		this.aadharCard = aadharCard;
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
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<Integer> phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", aadharCard=" + aadharCard
				+ ", courseName=" + courseName + "]";
	}
	
	
	
	
}
