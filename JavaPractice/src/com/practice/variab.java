package com.practice;

import java.util.Scanner;

public class variab {


	public static void main(String[] args) {
		

		Scanner scrn = new Scanner(System.in);
		System.out.println("Enter the value :");
		int num = scrn.nextInt();
		System.out.println("Entered value is : "+ num);
		switch (num)
		{
		case 0 : 
			System.out.println("This is first Value");
			break;

		case 10 :
			System.out.println("This is second value");
			break;

		default :
			System.out.println("This is default statement");
			break;
		}
	}

}
