package com.Interface;

public interface InterfaceClass {

	//This is Interface class that where we can what to do we can write and 
	//how to do we can write only after java-1.8 versions
	//like this is useful for the documentation purposes and we can use this interface using
	//   other classes by using implements keyword.
	// Before 1.8 java we can only assign the methods 
	//  After 1.8 we can implement methods in interface itself

	//Default it will be public 
	//we can use the default keyword after 1.8 version and it can be called class.method
	//we can use the methods as private as well as static after 1.9 versions.

	//All these methods are abstract methods i.e., unimplemented methods we call it as abstract
	//If you want to implement the method in interface itself use default-1.8/private-1.9
	//we can use override keyword in class to override the interface methods if you want.


	// Before 1.8 It is compulsory that we have to use all the methods in class that is mentioned in interface.
	//After 1.8 It is not mandatory,like its our wish , but method in interface must be private/default.

	public void cut();
	public void copy();
	public void paste();

	private static void chip()
	{
		mouse();
		System.out.println("This is implemented directly in interface");
	}
	default void keyboard()
	{

		System.out.println("This is Implemented from Interface");
	}

	static void mouse()
	{

		System.out.println("common code");
	}




}
