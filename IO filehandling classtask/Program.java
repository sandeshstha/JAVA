// write a program that list all the files names when -f command is entered in java command line and if -d is entered it must lists all the directories and if no command line is entered it must list all the files and directories
//if the method getName() is not used in this program the files and directories with full path will come in the result
import java.io.*;
class Program

{
	public static void main(String[] args) 
	{
		// Command line argument format => java classname first argument
		if(args.length>1) 
		{
			System.out.println("This program cannot enter more than 1 command");
		}
		else
		{
			File defaultFileObject = new File("C:\\Users\\user\\Desktop"); //this is a default path
			if(args.length == 0) //if no argument is passed
			{
				System.out.println("the names of the all the files and the directories present in the Desktop are:");

				File[] listOfFiles = defaultFileObject.listFiles();//It return and array of File(class type) objects 
				//use this method if you want to do something with individual file or directory like using methods like getName() to check the file path and size etc.
		//String[] listOfFiles = defaultFileObject.list();
				//it return the array of string containing the names of all files and directories inside a directory
				//use this fi you just want the name of the files and the directories and do not need to perform any thing on the file or directory

				for(int i =0; i<listOfFiles.length; i++)
				{
					System.out.println(listOfFiles[i].getName()); //gives the names of files + directories
				}
	
			}
			else //argument pass garyo  bhane i.e ki -f ki -d is passed.
			{
				if(args[0].equals("-f"))  //if -f is passed as argument
				{
					System.out.println("the names of all the files present in the Desktop are:");
					File[] listOfFiles = defaultFileObject.listFiles();
					for(int i=0; i<listOfFiles.length; i++)
					{
						if(listOfFiles[i].isFile())
						{
							System.out.println(listOfFiles[i].getName());
						}
					}	
				}
				else if(args[0].equals("-d"))  //if -f is passed as argument
				{
					System.out.println("the names of all the files present in the Desktop are:");
					File[] listOfFiles = defaultFileObject.listFiles();
					for(int i=0; i<listOfFiles.length; i++)
					{
						if(listOfFiles[i].isDirectory())
						{
							System.out.println(listOfFiles[i].getName());
						}
					}	
				}
				else 
				{
					System.out.println("the command line can accept only -d and -f");
				}

			}
				
		}
	}
}