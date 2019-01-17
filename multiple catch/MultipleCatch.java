class MultipleCatch
{
	public static void main(String[] args) 
	{
		int d,a;
		int[] b = new int[5];

		try{
			d=0;
			a=12/d;
			b[6] = 1;
			System.out.println("This will not be printed");
		}

		catch(ArithmeticException e){

			System.out.println("Divide by zero");



		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("sljdkfl");
		}
		
	     System.out.println("After catch");
		

	}


}