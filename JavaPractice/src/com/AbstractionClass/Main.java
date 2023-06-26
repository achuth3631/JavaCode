package com.AbstractionClass;

public class Main {
	public static void main(String[] args) {
//		Lenovo1 len = new Lenovo1();
//		len.copy();
//		len.copy();
//		len.paste();
//		len.keyboard();
		
		HP1 hp = new HP1();
		hp.copy();
		hp.cut();
		hp.keyboard();
		hp.paste();
		
		
		/*If you want to achieve only the abstraction. i.e.,hiding the 
		  implementation and showing its functionalities....
		  
		  go with below code. */
		
		Laptop1 len = new Lenovo1();
		len.copy();
		len.copy();
		len.paste();
		len.keyboard();   
	}

}
