interface Graphics
{
	public abstract void draw();

	default void initial()
	{
		System.out.println("initial Graphics");
	}

}