package com.encapsulation;

public class Teacher {
	public static void main(String[] args) {
		Student stu = new Student(102);
		stu.setAttended(true);
		stu.getAttended();

	}
}


//we are just assigning values into student methods making as private variables and
//  aceessing them in other class by creating object.
//  It means that hiding the variables and showing only references methods in main class
// or Wrapping up data(variables and methods) into single unit(class).