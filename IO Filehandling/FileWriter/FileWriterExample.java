import java.io.*;
class FileWriterExample
{
	public static void main(String[] args) throws IOException
	{
	
		// FileWriter fw = new FileWriter("khosta.txt"); //yele pani new file create garxa

		// fw.write(100);
		// fw.write("abc\nSoftware");
		// fw.flush();
		// fw.close();

		File file = new File("sandesh.txt");
		FileWriter writer = new FileWriter(file);
		writer.write("My \n name");
		writer.write("is\nsandesh");
		writer.flush();
		writer.close();
	}
}