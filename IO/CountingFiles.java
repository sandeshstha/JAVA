// WAP for counting the file only in Dekstop
import java.io.*;
class CountingFiles
{
	public static void main(String[] args)
	{
		System.out.println("The total numbers of files present are:");
		File fileObject = new File("C:\\Users\\user\\Desktop");

		String[] filenames = fileObject.list();
		int total = filenames.length; //length of array nikalyo
		System.out.println(total);
		
	}
}