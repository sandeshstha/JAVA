import java.io.*;
class BufferedReaderExample
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\JAVA\\IO Filehandling\\BufferedWriter\\gces.txt"));

		String s = br.readLine();
		while (s != null)
		{
			System.out.println(s);
			s = br.readLine(); //read line by line
		}
		// int i = br.read();
		// while(i != -1)
		// {
		// 	System.out.println((char)i);
		// 	i = br.read();
		// }
		// bw.close();
		
	}
}
