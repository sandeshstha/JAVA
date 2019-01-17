class Classtask
{
	public static void main(String[] args)
	{
		int a = args.length;
		if(a <= 2)
		{
				try
				{
					throw new ArithmeticException("Arithmetic Exception occured");
				}
				catch(ArithmeticException e)
				{
					System.out.println(e.getMessage());
				}
		}
		else
		{
				try
				{
					throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException occured");
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e.getMessage());
				}
		}
		System.out.println("bye bye");

		
	}
}