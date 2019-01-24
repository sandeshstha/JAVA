// wap to merge all the files inside the directory name notepad which is present in Desktop and write in output.txt
import java.io.*;
class MergingFilesInDesktopNotepad
{
	public static void main(String[] args) throws IOException
	{ 
		PrintWriter pw = new PrintWriter("output.txt");
		File file = new File("C:\\Users\\user\\Desktop\\notepad"); //saves a file object in file
		File[] fileList = file.listFiles();
		for(File f:fileList) //f works as key and fileList as array
		{
			if(f.getName().endsWith(".txt")) //if name of file ends with .txt
			{
				String eachFilePath = "C:\\Users\\user\\Desktop\\notepad\\"+f.getName(); //it gets name of each file
				BufferedReader br = new BufferedReader(new FileReader(eachFilePath));
				String s = br.readLine(); //reads a line of a file
				while(s != null)
				{
					pw.println(s); //write a line that was read 
					s = br.readLine();
				}
			}
		}
		pw.flush();
		pw.close();
	}
}
