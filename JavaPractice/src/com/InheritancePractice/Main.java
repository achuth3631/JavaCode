package com.InheritancePractice;

public class Main {
	
	public static void main(String[] args)  {
		one a = new one();
		a.read();
		
		
		Two b = new Two();
		b.read();
		b.write();
		
		
		Three c = new Three();
		//c.read();
		c.write();
		c.edit();
		c.read();
	}

}
