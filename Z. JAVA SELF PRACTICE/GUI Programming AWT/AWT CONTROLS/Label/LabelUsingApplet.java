import java.awt.*;
import java.applet.*;

/*
	<applet code = "LabelUsingApplet" width = "500" height = "500">
	</applet>
*/

public class LabelUsingApplet extends Applet 
{
	public void init()
	{
			// Applet obj = new Applet("label example");

		Label text1 = new Label(); //creates a label with empty string
		text1.setText("this is text1");
		text1.setBounds(50,50,100,100); //(x,y,width,height);

		Label text2 = new Label("this is text2");
		text2.setBounds(50,50,100,100);

		Label text3 = new Label("this is text3",Label.CENTER);
		

			// obj.add(text1);
			// obj.add(text2);

		add(text1);
		add(text2);
		add(text3);

	
	}
}