package com.encapsulation;

public class Student {

	 int rollNumber;
	private boolean isAttended;
	
	
	//we are assigning a parameter and that should be stored in class value
	public Student(int rollNumber)
	{
		this.rollNumber=rollNumber;
		System.out.println("roll number is :"+ rollNumber);
	}


	public boolean getAttended() {
		System.out.println("Attendance marked by teacher");
		return isAttended;
	}


	public void setAttended(boolean flag) {
		this.isAttended = flag;
	}
	
	
	
	


}
