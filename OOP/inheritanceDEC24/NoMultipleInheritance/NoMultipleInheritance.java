// java doesn't suppport multiple inheritance. Multiple inheritance in the type if inheritance in 
// which a subclass is derived from two superclasses
// the problem occurs in case of method with same signatures -(number, order and type of parameter)
// on calling that method class method cannot determine which class method to call or which one to give higher priority

class Parent1
{
	void test()
	{
		System.out.println("this is a test of Parent1");
	}
}
class Parent2
{
	void test()
	{
		System.out.println("this is a test of Parent2");
	}
}
class child extends Parent1 , Parent2
{
	public static void main(String[] args)
	{
		Child c = new Child();
		c.test();
	}
}