class Outer
{
	int outerX = 100;
	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}
	class Inner
	{
		int y = 10;
		void display()
		{
			System.out.println("display:outerX="+outerX);
		}
	}
	void showY()
	{
		Inner inner1 = new Inner();
		System.out.println("value of y accessed from outer class method is:"+inner1.y);
	}
}
