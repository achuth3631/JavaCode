package EncapsulationPracticetwo;

public class Student {
	private int rollNum;
	private String name;
	

	private boolean isAttend;
	
	public Student(int myRoll)
	{
		this.rollNum = myRoll;
		
		System.out.println(myRoll);
	}
	
	
	public void setAttendance(boolean flag)
	{
		this.isAttend = flag;
		System.out.println("Teacher accessed the student portal successfully");
	}
	
	public boolean getAttendance()
	{
		System.out.println("Teacher gave attendance successfully");
		return isAttend;
	}
	
	public String getName() {
		System.out.println("Name of student is: "+this.name);
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
