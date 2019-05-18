class Human
{
	String name;
	int age;
	Human(String n, int a)
	{
		name = n;
		age = a;
	}
	void showData()
	{
		System.out.println("Name is:"+name+" ,"+"age is:"+age);
	}

}
class Employee extends Human
{
	int salary;
	Employee(String n, int a, int s)
	{
		super(n,a);
		salary = s;

	}
	void showData() //overriding
	{
		System.out.println("Name is:"+name+" ,"+"age is:"+age+"and"+"salary is:"+salary);
	}
}
class Manager extends Employee
{
	Manager(String n,int a, int s)
	{
		super(n,a,s);
	}
	void showData() //overriding
	{
		System.out.println("Manager: Name:"+name+" ,"+"age is:"+age+"and"+"salary is:"+salary);
	}
}
