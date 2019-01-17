class A
{	
	int i;
}
class B extends A
{
	int i; //i in B hides the i in A . coz yo attribute ko scope le jitxa
	B(int a,int b)
	{
		super.i = a;
		i = b;
	}
	void show()
	{
		System.out.println("i in superclass:"+super.i);
		System.out.println("i in subclass:"+i);

	}
}
class UseSuper
{
	public static void main(String[] args)
	{
		B subobj = new B(1,2);
		subobj.show();
	}
}