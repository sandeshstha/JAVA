class NestedTry
{
	public static void main(String[] args) {
		try
		{
			int a= args.length; //args ma kunai value nahuda length =0 ;
			int b = 42/a;  //problematic statement =>jump to catch statement
			System.out.println("a="+a); //
			try
			{
				// nested try block
				a = a/(a-a);

			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array index out of "+e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by 0"+e);
		}
	}
}