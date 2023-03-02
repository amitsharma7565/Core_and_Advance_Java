package com.Entity;

public class Address {
	private int id;
	private String city;
	private String State;
	private Student std;
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", State=" + State + ", std=" + std + "]";
	}
	
	
}
