class A
{
	A()
	{
		System.out.println("inside A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("inside B");
	}
}
class C extends B
{
	C()
	{
		System.out.println("inside C");
	}
}
class OrderOfDerivation
{
	public static void main(String[] args)
	{
		C c = new C();
	}
}
