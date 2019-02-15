
import java.io.*;
import java.net.*;
public class ServerSide
{
  public static void main(String[] args) throws Exception
  {
      ServerSocket ss = new ServerSocket(6666);
      System.out.println("the Server  ready for chatting");
      Socket s = ss.accept( );                          
                              // reading from keyboard (keyboardRead object)
      BufferedReader keyboardRead = new BufferedReader(new InputStreamReader(System.in));
	                      // sending to client (pwrite object)
      OutputStream outStream = s.getOutputStream(); 
      PrintWriter pwrite = new PrintWriter(outStream, true);
 
                              // for incoming message ( receiveRead  object)
      InputStream inputStream = s.getInputStream();
      BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
 
      String receiveMessage, sendMessage;  
      receiveMessage = receiveRead.readLine();        
      while(true)
      {
        if(receiveMessage != null)  
        {
           System.out.println(receiveMessage);         
        }         
        sendMessage = keyboardRead.readLine(); 
        pwrite.println(sendMessage);             
        pwrite.flush();
      }               
    }                    
}   