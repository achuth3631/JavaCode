package com.ExceptionHandling;

public class Test {
	
	public static void main(String[] args) {
		
		int FNumber = 10;
		int SNumber = 0;
		int result =0;

		
		System.out.println("Program Execution starts.....");
		
		try {
			result = FNumber /SNumber;
		} catch (Exception e) {
			e.printStackTrace();
			//throw e; 
			//Don't write any line after throw keyword, it will show error.
		}
		finally {
			System.out.println("Finally block is executed Irrespective of exception");
		}
		System.out.println("The result is : "+result);
		
		System.out.println("Program Execution Ends!!!!!!");
	}

}
