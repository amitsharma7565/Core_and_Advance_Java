package com.bitLabs.Entity;

public class Registration {
	private String username;
	private String email;
	private String passwrod;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	public Registration(String username, String email, String passwrod) {
		super();
		this.username = username;
		this.email = email;
		this.passwrod = passwrod;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Registration [username=" + username + ", email=" + email + ", passwrod=" + passwrod + "]";
	}
	
}
