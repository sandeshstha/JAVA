public class Array
{
	public static void main(String[] args)
	{	
		String[] cars = {"volvo", "bmw", "rover", "ferrari"};
		cars[0] = "lamborgini";
		System.out.println(cars[0]);
		// array length
		System.out.println(cars.length ); //gives output 4

		// loop through an array
		System.out.println("using for loop");
		for(int i=0; i<cars.length; i++)
		{
			System.out.println(cars[i]);
		}


		// loop through and array with for-each

		System.out.println("using for each loop through an array");
		/*
		syntax:
		for(type variable : arrayname)
		{
			//code
		}
		*/

		for(String i : cars)
		{
			System.out.println(i);
		}

		System.out.println("array initialization:");
		// creation
		int[] num = new int[5];
		// create a new instance/object of Array
		public Array()
		{
			num[5] = {1,2,3,4,5};
			System.out.println(num[2]);
		}
		
	}
}

