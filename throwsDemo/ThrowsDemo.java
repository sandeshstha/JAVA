class ThrowsDemo
{
	 //object ko reference chaEnna coz of static
	static void throwOne() throws IllegalAccessException //method le exception throw garyo =throw le derai excetion lai falna sakxa i.e done inside the declaration of method throw le euta matra garxa
	{
		System.out.println("inside throwOne"); 
		// throw new ArithmeticException("this is ArithmeticException"); //this is a run time exception so default handler hunxa so catch banaunai pardena and nabanayeni compile hunxa
		throw new IllegalAccessException("this is IllegalAccessException");  //this is not run time so yesko handler banaunai parxa i.e catch pani chaiyo so to remove this error use throws
		//yellai handler(catch) nabhai kana garauna lai throws rule launa parxa =jun le call garxa yo nethod lai tele handler banauna parxa

	}
	public static void main(String[] args) 
	{
		try
		{
			throwOne(); //rule ma bind garna paryo yo calling method lai
		}
		catch(IllegalAccessException e)
		{
			System.out.println("this is a IllegalAccessException");
		}
	}

}