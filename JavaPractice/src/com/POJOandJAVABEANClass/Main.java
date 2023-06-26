package com.POJOandJAVABEANClass;

public class Main {
	public static void main(String[] args) {
		
		POJOExample pe = new POJOExample(20);
		pe.setId(25);
		pe.salary = 123.4;
		
		System.out.println(pe.getId());
		System.out.println(pe.salary);
		
		
		JavaBeanExample je = new JavaBeanExample();
		je.setId(12);
		je.setName("Arr");
		je.setMarks(12.9);
		
	}

}
