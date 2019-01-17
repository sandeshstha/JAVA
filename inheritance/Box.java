class Box
{
	double length, breadth, height;
	Box(Box obj)
	{
		length = obj.length;
		breadth = obj.breadth;
		height = obj.height;

	}
	Box(double l, double b, double h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	Box(double len)
	{
		length = breadth = height = len;
	}
	double volume()
	{
		return length*breadth*height;
	}

}