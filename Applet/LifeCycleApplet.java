import java.applet.*;
import java.awt.*;
public class LifeCycleApplet extends Applet
{
	String msg;
	public void init()
	{
		msg+="inside init";
	}
	public void start()
	{
		msg+="inside start";
	}
	public void paint(Graphics g)
	{
		msg+="inside paint()";
		g.drawString(msg,200,200);
	}
	public void destroy()
	{
		msg+="inside destroy";
	}
	public void stop()
	{
		msg+="inside stop";
	}
}