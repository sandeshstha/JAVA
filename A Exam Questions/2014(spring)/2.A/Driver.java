import java.lang.reflect.*;

class Driver
{
	public static void main(String[] args) 
	{
		Student sObj = new Student("sandesh",9);
		Employee eObj = new Employee("abiral",98456,2000);	

		System.out.println(sObj.toString());
		System.out.println(eObj);

		System.out.println("class name of sObj is:"+sObj.getClass().getName());
		System.out.println("class name of eObj is:"+eObj.getClass().getName());

	}
}