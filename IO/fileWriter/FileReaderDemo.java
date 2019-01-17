// import java.io.*;
// class FileReaderDemo
// {
// 	public static void main(String[] args) throws IOException
// 	{
// 		FileReader fr = new FileReader("abc.txt");
// 		int i = fr.read();
// 		while(i!=-1)
// 		{
// 			System.out.println((char)i);
// 			i = fr.read();
// 		}
// 		fr.close();
		
// 	}
// }
import java.io.*;
import java.IOException.*;
class FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{	
		File f= new File("abc.txt");
		char[] ch = new char[(int)f.length()];
		FileReader fr = new FileReader(f);
		fr.read();
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
		fr.close();
	}
}