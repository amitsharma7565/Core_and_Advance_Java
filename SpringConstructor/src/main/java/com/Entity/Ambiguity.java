package com.Entity;

public class Ambiguity {
	private int a;
	private int b;
	
	public Ambiguity(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("This is integer constructor");
	}
	
	public Ambiguity(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("This is String constructor");
	}
	
	@Override
	public String toString() {
		return "Ambiguity [a=" + a + ", b=" + b + "]";
	}

	public void show() {
		System.out.println(a*b);
	}
	
}
