// import java.io.*;
// class FileWriterDemo
// {
// 	public static void main(String[] args) throws IOException
// 	{	

// 		FileWriter fw = new FileWriter("abc.txt");
// 		fw.write(100); //prints d as unicode value of 100 is d
// 		fw.write("abc\nSoftware");
// 		fw.write("\n");
// 		char[] ch = {'a','b','c'};
// 		fw.write('\n');
// 		fw.flush();
// 		fw.close();
// 	}
// }
import java.io.*;
class FileWriterDemo
{
	public static void main(String[] args) throws IOException 
	{

	  FileWriter writer = new FileWriter("xyz.txt"); 
      
      // Writes the content to the file
      writer.write("This\n is\n an\n example\n"); 
      writer.flush();
      writer.close();

      // Creates a FileReader Object
      FileReader fr = new FileReader("xyz.txt"); 
      char [] a = new char[50];
      fr.read(a);   // reads the content to the array
      
      for(char c : a)
         System.out.print(c);   // prints the characters one by one
      fr.close();
   }
}
		