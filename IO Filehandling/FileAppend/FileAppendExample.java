import java.io.*;
class FileAppendExample
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\user\\Desktop\\JAVA\\IO Filehandling\\FileWriter\\sandesh.txt");

		FileWriter fw = new FileWriter(file,true); //true le text file ko last ma shrestha thapxa
		fw.write("shrestha"); 
		fw.flush();
		fw.close();
		
	}
}