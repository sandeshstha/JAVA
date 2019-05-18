class Driver
{
	public static void main(String[] args) 
	{
		Manager mObj = new Manager("Sandesh",21,6000);
		mObj.showData();	
		Employee eObj = new Employee("dummy",0,0);
		eObj.showData();
		Human hObj = new Human("manxeu",22);
		hObj.showData();
	}
}