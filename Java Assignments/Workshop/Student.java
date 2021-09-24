package com.cybage.examples;

public class Student {
	
	private int id;
	private String name;
	private int roll_number;
	private String address;
	
	
	public Student(int id, String name, int roll_number, String address) {
		super();
		this.id = id;
		this.name = name;
		this.roll_number = roll_number;
		this.address = address;
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


	public int getRoll_number() {
		return roll_number;
	}


	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String Display() {
		return "Student [id=" + id + ", name=" + name + ", roll_number=" + roll_number + ", address=" + address + "]";
	}
	
	
	
	
	

}
