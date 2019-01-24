import java.awt.*;
import java.applet.*;

// the commented code will execute in browser
// <applet code = "Test" height = "100" width = "100"></applet>
public class Test extends Applet 
{
	public void paint(Graphics g)
	{
		g.drawString("hello guys",100,100);
	}
}