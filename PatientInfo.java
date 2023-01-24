package com.hospital;

public class PatientInfo {
	private String name, gender, city,address, date_of_admission, guardian_name, guardian_address,recovery;
	private int id,age;
	private long addhar_card,contact_number,guardian_contact_number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate_of_admission() {
		return date_of_admission;
	}
	public void setDate_of_admission(String date_of_admission) {
		this.date_of_admission = date_of_admission;
	}
	public String getGuardian_name() {
		return guardian_name;
	}
	public void setGuardian_name(String guardian_name) {
		this.guardian_name = guardian_name;
	}
	public String getGuardian_address() {
		return guardian_address;
	}
	public void setGuardian_address(String guardian_address) {
		this.guardian_address = guardian_address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getAddhar_card() {
		return addhar_card;
	}
	public void setAddhar_card(long addhar_card) {
		this.addhar_card = addhar_card;
	}
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	public long getGuardian_contact_number() {
		return guardian_contact_number;
	}
	public void setGuardian_contact_number(long guardian_contact_number) {
		this.guardian_contact_number = guardian_contact_number;
	}
	public String getRecovery() {
		return recovery;
	}
	public void setRecovery(String recovery) {
		this.recovery = recovery;
	}
	
}
