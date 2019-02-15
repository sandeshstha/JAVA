import java.io.*;
import java.net.*;

public class MyServer
{
	public static void main(String[] args) 
	{
		try
		{
			// first server should instatiate ServerSocker object
			ServerSocket ss = new ServerSocket(6666);//6666 is port address
			// then Server object envokes accept() method of 
			Socket s = ss.accept(); //establishes connection
			// this gets the message sent by the client
			DataInputStream dis = new DataInputStream(s.getInputStream());
			// typehinting the UTF message into String
			String str = (String)dis.readUTF();
			System.out.println("message = " +str);
			ss.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}