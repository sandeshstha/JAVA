// wap to merge data form two files into third file
import java.io.*;
class MergingTwoFiles
{
	public static void main(String[] args) throws IOException 
	{

		PrintWriter pw = new PrintWriter("file3.txt");
		BufferedWriter bwriter1 = new BufferedWriter(new FileWriter("file1.txt"));
		BufferedWriter bwriter2 = new BufferedWriter(new FileWriter("file2.txt"));

		bwriter1.write("22");
		bwriter1.newLine();
		bwriter1.write("33");
		bwriter1.newLine();
		bwriter1.flush();
		bwriter1.close();

		bwriter2.write("AA");
		bwriter2.newLine();
		bwriter2.write("BB");
		bwriter2.newLine();
		bwriter2.flush();
		bwriter2.close();
// Now 2 ta file ko content read garera third file ma write garne
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		String s1 = br1.readLine(); //read a line
		while(s1 != null)
			{
				pw.println(s1); //prints a line
				s1 = br1.readLine();
			}
		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
		String s2 = br2.readLine();
		while(s2 != null)
		{
			pw.println(s2);
			s2 = br2.readLine();
		}
		pw.flush();
		pw.close();
	}

}