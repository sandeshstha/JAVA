// this is very very fucking important
// sandesh lai pathau hai mula

class FinallyDemo
{

	static void finallyOne()
	{
		int b = 1,a; //b ko thau  ma 0 ni check
		try
		{
			System.out.println("inside try");
			a = 2/b;
			return;
		   
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside catch");

		}
		
		finally //try block le return garda matra yo execute hunxa
		{
			System.out.println("good bye");
		}
	}
	public static void main(String[] args) 
	{
		finallyOne();
		
	}
}