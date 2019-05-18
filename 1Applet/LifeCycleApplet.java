import java.applet.*;
import java.awt.*;
/*<applet code="LifeCycleApplet" alt="cannot run java program" width="500" height="500" align="left">
	
	</applet>*/
public class LifeCycleApplet extends Applet
{	
	public void init()
	{
		System.out.println("applet initialized");
	}
	public void start()
	{
		System.out.println("applet started");
		
	}
	public void paint(Graphics g)
	{
		
		g.drawString("inside paint ",200,200);
	}
	public void destroy()
	{
		System.out.println("applet destroyed");
		
	}
	public void stop()
	{
		System.out.println("applet stopeed");
		
	}
}