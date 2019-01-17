import java.io.*;
class FileWriterDemo
{
	public static void main(String[] args) throws IOException
	{	

		FileWriter fw = new FileWriter("abc.txt");
		fw.write(100); //prints d as unicode value of 100 is d
		fw.write("abc\nSoftware");
		fw.write("\n");
		char[] ch = {'a','b','c'};
		fw.write('\n');
		fw.flush();
		fw.close();
	}
}