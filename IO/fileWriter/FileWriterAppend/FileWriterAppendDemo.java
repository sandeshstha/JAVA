import java.io.*;
class FileWriterAppendDemo
{
	public static void main(String[] args) throws IOException
	{
		// File fileObj = new File("C:\\Users\\user\\Desktop\\java\\IO\\fileWriter\\FileWriterAppend\\sandesh.txt");
		// fileObj.CreateNewFile();
		FileWriter fw = new FileWriter("sandesh.txt", true);
		fw.write("\nsandesh");
		fw.flush();
		fw.close();

	}
}
