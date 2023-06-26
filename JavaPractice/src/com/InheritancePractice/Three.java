package com.InheritancePractice;

public class Three extends Two{
	
//	public void read()
//	{
//		System.out.println("read Mode");
//	}
//	
//	public void write()
//	{
//		System.out.println("Write mode");
//	}
	
	
	
	public void edit()
	{
		super.read(); //This will be the read method in one class,we have two read methods, so If we want from parent class, we need to add super keyword
		System.out.println("Edit mode");
	}
	
	public void read()
	{
		System.out.println("Read mode in Three");
	}

}
