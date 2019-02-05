// applet to java comversion

import java.awt.*;
import java.applet.*;
/*
	<applet code="FlowLayoutDemo" width = "100" height = "100">
	</applet>
*/
public class FlowLayoutDemo extends Applet 
{
	Button b1,b2,b3;
	public void init()
	{
		b1 = new Button("OK");
		b2 = new Button("Open");
		b3 = new Button("Close");

		setVisible(true);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
	}
}

import java.awt.*;

class FlowLayoutDemo extends Frame
{
	FlowLayoutDemo()
	{
		Button b1, b2, b3;
		b1 = new Button("OK");
		b2 = new Button("Open");
		b3 = new Button("Close");

		setVisible(true);
		setLayout(new FlowLayout()); //optional as FlowLayout is default

		add(b1);
		add(b2);
		add(b3);
	}
	public static void main(String[] args) {
		new FlowLayoutDemo();
	}
}

