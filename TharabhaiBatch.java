package com.bitlabs.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TharabhaiBatch {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private int id;
	@Override
	public String toString() {
		return "TharabhaiBatch [id=" + id + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}
	@Column(name="student_name")
	private String name;
	@Column(name="student_email")
	private String email;
	@Column(name="student_marks")
	private int marks;
	
	
	
	public TharabhaiBatch(String name, String email, int marks) {
		super();
		
		this.name = name;
		this.email = email;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	
	public TharabhaiBatch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
