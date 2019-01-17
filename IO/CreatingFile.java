
// Wap to create a folder named GCES in Desktop and a file sandesh.txt inside that folder
import java.io.*;
import java.io.IOException;
class CreatingFile
{
	public static void main(String[] args) throws IOException //or you can do by try catch without throws
	{
		File file = new File("C:\\Users\\user\\Desktop\\GCES");
		file.mkdir();
		File f = new File("C:\\Users\\user\\Desktop\\GCES\\sandesh.txt");
		f.createNewFile();
		
	}
} 