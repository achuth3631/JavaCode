package com.AbstractionClass;

public abstract class AbstractionClass implements Laptop1 {
	public void copy()
	{
		System.out.println("Lenovo copy code");
	}
	
	public void cut()
	{
		System.out.println("Lenovo cut code");
	}
	
	public abstract void paste();
	
	public abstract void keyboard();

}
