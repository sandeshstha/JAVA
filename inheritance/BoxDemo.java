class BoxDemo
{
	public static void main(String[] args)
	{
		BoxWeight b1 = new BoxWeight(10,20,30,40);
		BoxWeight b2 = new BoxWeight(1,2,3,4);
		double vol;
		vol = b1.volume();
		System.out.println("volume of b1 is:"+vol);
		System.out.println("weight of b1 is:"+b1.weight);
		vol = b2.volume();
		System.out.println("volume of b2 is:"+vol);
		System.out.println("weight of b2 is:"+b2.weight);

		
	}
}