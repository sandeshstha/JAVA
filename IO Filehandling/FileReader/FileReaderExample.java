import java.io.*;
class FileReaderExample
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("C:\\Users\\user\\Desktop\\JAVA\\IO Filehandling\\FileWriter\\sandesh.txt");
		char[] c = new char[(int)file.length()]; //gives length of character

		FileReader reader = new FileReader(file);
		reader.read(c); //reads the content to the array
		//for printing
		for(char key : c)
		{
			System.out.println(key);
		}
		reader.close();

		/*File file = new File("C:\\Users\\user\\Desktop\\JAVA\\IO Filehandling\\FileWriter\\sandesh.txt");
		FileReader fr = new FileReader(file);
		int i = fr.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i = fr.read();
		}
		fr.close();*/
	}
}
