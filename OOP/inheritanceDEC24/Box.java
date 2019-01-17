class Box
{
	double width, height, depth;
	Box(Box obj) //parameterized constructor with object as parameter
	{
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}
	Box(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	Box() //default constructor
	{
		width = 1;
		 height = 1;
		depth = 1;
	}
	Box(double len)
	{
		width = height = depth = len;
	}
	double volume()
	{
		return width*height*depth;
	}
}

