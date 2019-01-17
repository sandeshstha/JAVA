class InterfaceDemo
{
	public static void main(String[] args) 
	{
		// Circle c = new Circle();
		// c.area();
		// c.draw();
		// Rectangle r = new Rectangle();
		// r.area();
		// r.draw();
		Shape shape; //reference of Shape type
		shape = new Circle();
		shape.area();
		// shape.draw(); //=>not allowed coz draw() is not in shape
		shape = new Rectangle();
		shape.area();
		shape.initial();
		// shape.draw();
		

		Graphics graph; //reference of Graphics type
		graph = new Circle();
		graph.draw();
		graph = new Rectangle();
		graph.draw();
		// graph.init();




	}
}