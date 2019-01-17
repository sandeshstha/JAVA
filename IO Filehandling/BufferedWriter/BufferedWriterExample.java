import java.io.*;
class BufferedWriterExample 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter writer = new FileWriter("gces.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("gces");
		bw.newLine();
		bw.write("2019");
		bw.newLine();
		bw.write("happy new year");
		bw.newLine();
		bw.flush();
		bw.close();
		
	}

}