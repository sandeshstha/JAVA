class Circle implements Shape, Graphics //interface implementing class
{	
	//every method of interface must be overridden here
	public void area()
	{
		System.out.println("Area of circle");
	}
	public void draw()
	{
		System.out.println("Drawing inside circle");
	}
	public void initial()
	{
		Shape.super.initial();
		Graphics.super.initial();
	}

}