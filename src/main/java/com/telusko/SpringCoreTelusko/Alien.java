package com.telusko.SpringCoreTelusko;

public class Alien {
	
	private int age;
	private Computer com;
	

	
	
	public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}
	public Alien() {
		System.out.println("Alien object is created..");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Age Assigned");
		this.age = age;
	}
	
	
	public void code() {
		System.out.println("I am coding");
		com.compile();
	}
}
