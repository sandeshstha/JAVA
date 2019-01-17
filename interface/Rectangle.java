class Rectangle implements Shape, Graphics
{
	public void area()
	{
		System.out.println("Area of Rectangle");
	}
	public void draw()
	{
		System.out.println("drawing inside Rectangle");
	}
	public void initial()
	{
		Shape.super.initial();
		Graphics.super.initial();
	}
}