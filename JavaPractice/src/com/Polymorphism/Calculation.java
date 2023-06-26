package com.Polymorphism;

//Polymorphism means multiple forms
//two types will be there:
// 1. Compile time polymorphism--Achieved through --Method Overloading//Static//Early binding
// 2. Run Time Polymorphism--Achieved through -- Method Overriding//Dynamic
//Method overloading--We can write one method as multiple times

public class Calculation {

	//private static int d = 110;
	public void add(int a, int b)
	{
		System.out.println(a+b);
		
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		 Calculation cal = new Calculation();
		 cal.add(1, 2);
		 cal.add(1, 2, 3);
		 //System.out.println(d);
	}
}
