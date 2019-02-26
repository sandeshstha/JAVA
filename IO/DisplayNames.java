
// WAP to display name of all the files and directories present in the Desktop
import java.io.*;
class DisplayNames
{
	public static void main(String[] args)
	{
		System.out.println("the names of the all the files and the directories present in the Desktop are:");
		File fileObject = new File("C:\\Users\\user\\Desktop"); //desktop samma ko lai fileObject bhanne file object ma rakhxa
		File[] namesArray = fileObject.listFiles();

		
			System.out.println("the names of the directories is desktop are:");
			for(int i = 0;i<namesArray.length;i++)
			{
				if(namesArray[i].isDirectory())
				{
				
				System.out.println(namesArray[i].getName());
				}
			}
		

		// for(int i =0; i<namesArray.length; i++)
		// {
		// 	String name = namesArray[i];
		// 	System.out.println(name); 
		// }
		
	}
}