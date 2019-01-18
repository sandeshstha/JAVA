import java.io.*;
class MergingTwoFilesChallenge
{
	public static void main(String[] args) throws IOException 
	{

		PrintWriter pw = new PrintWriter("fileC.txt");
		PrintWriter pwriter1 = new PrintWriter(new FileWriter("fileA.txt")); //PrintWriter can be used in place of it
		PrintWriter pwriter2 = new PrintWriter(new FileWriter("fileB.txt"));

		pwriter1.println(22);
		pwriter1.println(33);
		pwriter1.flush();
		pwriter1.close();

		pwriter2.println("AA");
		pwriter2.println("BB");
		pwriter2.println("cc");
		pwriter2.flush();
		pwriter2.close();
// Printwriter ko reader hunna so use BufferedReader
		BufferedReader br1 = new BufferedReader(new FileReader("fileA.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("fileB.txt"));

		String s1 = br1.readLine();
		String s2 = br2.readLine();

		while(s1 != null || s2 != null)
		{
			pw.println(s1);
			pw.println(s2);
			s1 = br1.readLine();
			s2 = br2.readLine();
		}
		pw.flush();
		pw.close();
	}

}