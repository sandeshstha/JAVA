import java.io.*;
import java.net.*;

public class MyClient
{
	public static void main(String[] args) 
	{
		try
		{      
			// lets use port 6666
			Socket s=new Socket("localhost",6666);  //localhost = 127.0.0.1

			DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 

			 //writes the message in UTF 
			dout.writeUTF("Hello Server");  
			dout.flush();  
			dout.close();  
			s.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
		 
	}
}