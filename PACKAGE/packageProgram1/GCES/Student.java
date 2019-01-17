package GCES; //Student.java is in GCES package
public class Student
{
	 String name; //they are initially in default which is package level
	 int roll;

	public Student(String name, int roll) //parameterized constructor
	{
		this.name = name;
		this.roll = roll;
	}
	public void displayDetails()
	{
		System.out.println("name of the student is:"+name);
		System.out.println("roll of the student is:"+roll);

	}
}