class Employee extends Person
{
	private int salary;
	Employee(String n, int p,int s)
	{
		super(n,p);
		salary = s;
	}
	@Override
	public String toString()
	{
		return super.getName();
	}
	
}