interface Shape
{
	// creation of instance variables
	// double length; //this gives an error coz final ki static huna paryo ki dixed value huna pryo
	 final double length = 10.0; //final keyword narakhe ni hunxa coz default sab instance variable final hunxa in interference

	/*void area()
	{
		System.out.println("this is not allowed:");
	}*/
	// abstract void area(); //abstract narakheni hunxa coz interface ma sab method default abstract hunxa
	public abstract void area();


	// use of concrete method inside interference using default keyword
	default void initial()
	{
		System.out.println("intial Shape");
	}

}