import java.io.*;
class PrintWriterExample
{
	public static void main(String[] args) throws IOException 
	{
		PrintWriter pw = new PrintWriter("mn.txt");
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("gces");
		pw.flush();
		pw.close();
	}
}