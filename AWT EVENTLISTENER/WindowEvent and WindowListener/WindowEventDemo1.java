import java.awt.*;
import java.awt.event.*;

public class WindowEventDemo1 extends Frame implements WindowListener
{	
	public WindowEventDemo1()
	{
		setVisible(true);
		addWindowListener(this);
		// setTitle("WindowListener demo");

	}
	public static void main(String[] args) 
	{
		new WindowEventDemo1();	
	}
	@Override
	public void windowClosing(WindowEvent evt)
	{
		System.exit(0);
	}
	@Override 
	public void windowOpened(WindowEvent evt) {  }
   @Override 
   public void windowClosed(WindowEvent evt) {}
   // For Debugging
   @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
   @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
   @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
   @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }


}