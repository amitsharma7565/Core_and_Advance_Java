package com.Entity;

public class Address {
	
private String city;
private String state;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}



public Address() {
	super();
	System.out.println("This is constructor default");
}
public Address(String city, String state) {
	super();
	this.city = city;
	this.state = state;
	System.out.println("This is constructor paramters");
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
