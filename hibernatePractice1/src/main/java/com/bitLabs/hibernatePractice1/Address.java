package com.bitLabs.hibernatePractice1;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String address;
	private String bGroup;
	@Override
	public String toString() {
		return "Address [address=" + address + ", bGroup=" + bGroup + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getbGroup() {
		return bGroup;
	}
	public void setbGroup(String bGroup) {
		this.bGroup = bGroup;
	}
	
}
