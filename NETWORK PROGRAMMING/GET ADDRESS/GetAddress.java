import java.net.*;

public class GetAddress
{
	public static void main(String[] args)  throws Exception
	{
		InetAddress ip = InetAddress.getByName("www.google.com");
		System.out.println("HostName:"+ip.getHostName());
		System.out.println("IP address:"+ip.getHostAddress());
	}
}