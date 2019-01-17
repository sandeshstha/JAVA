class TryDemo
{
	public static void main(String[] args) 
	{
		int d,a;
		try{
			d=0;
			a=12/d;
			System.out.println("This will not be printed");
		}

		catch(ArithmeticException e){

			System.out.println("Divide by zero");

		}
	     System.out.println("After catch");

	}


}