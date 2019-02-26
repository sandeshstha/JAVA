
import java.io.*;
class Question2a
{
  public static void main(String[] args) throws Exception
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("enter your name");
    String name = reader.readLine();
    System.out.println("the nane is:"+name);

    System.out.println("enter your roll number:");
    int roll = Integer.parseInt(reader.readLine()); //convert string like "23" to integer but throw NumberFormatException is String is "23kd"
    System.out.println("the roll is :"+roll); 
  }
}