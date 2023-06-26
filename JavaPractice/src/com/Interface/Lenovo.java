package com.Interface;

public class Lenovo implements InterfaceClass {

	@Override
	public void cut() {
		System.out.println("cut method is called from Interface");
	}

	@Override
	public void copy() {
		System.out.println("copy method is called from Interface");

	}

	@Override
	public void paste() {
		System.out.println("paste method is called from Interface");

	}
	
	@Override
	public void keyboard()
	{
		System.out.println("This is updated and overrided implementation");
	}

	
	public void chip() {
		System.out.println("chip method is called from Interface");

	}
	


}
