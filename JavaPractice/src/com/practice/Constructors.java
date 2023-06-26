package com.practice;

public class Constructors {

	int i;
	public static void main(String[] args) {
		Constructors cs = new Constructors(20);
		System.out.println(cs.i);
		

	}
	
	//creating constructors
	public Constructors()
	{
		i=10;
		System.out.println("Constructor is called and the value is updated");
	}
	
	public Constructors(int a)
	{
		i = a;
	}

}
