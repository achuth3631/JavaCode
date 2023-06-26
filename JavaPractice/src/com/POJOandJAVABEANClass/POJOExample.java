package com.POJOandJAVABEANClass;

public class POJOExample {

	private int id;
	public String name;
	protected double salary;

	public POJOExample(int id)
	{
		this.id = id;
		System.out.println(id);
	}
	//Setter and getter for ID
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	
	

}
