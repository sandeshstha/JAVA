 class Student extends Person
{
	final String status = "senior";
	Student(String n, int p)
	{
		super(n,p);
	}
	@Override
	public String toString()
	{
		return super.getName();
	}
}
