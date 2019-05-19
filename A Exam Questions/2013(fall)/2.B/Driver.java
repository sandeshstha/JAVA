class Driver
{
	int sumOfArray(int[] array)
	{
		int sum = 0;
		for(int i=0;i<5;i++)//length is the property of array  
		{
			if(array[i]%2==0)
			{
				sum = sum + array[i];
			}
		}  
		return sum;
	}
	public static void main(String[] args) 
	{
		int[] a = new int[5];
		a[0]=1;
		a[1]=2;  
		a[2]=4;  
		a[3]=4;  
		a[4]=5; 
		Driver obj = new Driver();
		
		System.out.println(obj.sumOfArray(a));
	}
}