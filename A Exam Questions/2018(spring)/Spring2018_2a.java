class Employee
{
	private int id;
	private String name;
	Employee(int id,String name)
	{
		this.id = id;
		this.name = name;//this object contains the reference object of the current classs
	}
	@Override
	public String toString() //it must return a string
	{
		return ("name:"+this.name+" "+"id:"+id);
	}
}
class Spring2018_2a
{
	public static void main(String[] args) 
	{
		Employee d = new Employee(5,"sandesh");
		System.out.println(d.toString());
		// System.out.println(d);
	}
}