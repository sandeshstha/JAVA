class Outer
{
	int outerX = 100;
	int outerY = 200;
	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}
	void testM()
	{
		System.out.println("outerY="+outerY);
	}

	// inner class
	class Inner
	{
		void display()
		{
			System.out.println("outerX="+outerX);
			testM();
		}
	}
}