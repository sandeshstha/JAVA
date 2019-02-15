import java.io.*;
import java.net.*;
public class ClientSide
{
  public static void main(String[] args) throws Exception
  {
     Socket s = new Socket("localhost",6666);
                               // reading from keyboard (keyboardRead object)
     BufferedReader keyboardRead = new BufferedReader(new InputStreamReader(System.in));
                              // sending to client (pwrite object)
     OutputStream outputStream = s.getOutputStream(); 
     PrintWriter pwrite = new PrintWriter(outputStream, true);
 
                              // receiving from server ( receiveRead  object)
     InputStream inputStream = s.getInputStream();
     BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
 
     System.out.println("Now you can chat with the server,type some message and type enter");
 
     String receiveMessage, sendMessage;               
     while(true)
     {
        sendMessage = keyboardRead.readLine();  // keyboard reading
        pwrite.println(sendMessage);       // sending to server
        pwrite.flush();                    // flush the data
        if((receiveMessage = receiveRead.readLine()) != null) //receive from server
        {
            System.out.println(receiveMessage); // displaying at DOS prompt
        }         
      }               
    }                    
}                      