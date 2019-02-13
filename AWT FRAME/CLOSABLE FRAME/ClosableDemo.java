import java.awt.*;
import java.awt.event.*;

public class ClosableDemo extends Frame
{
	ClosableDemo()
	{
		this.setVisible(true);
	this.addWindowListener(new WindowAdapter()
	{	public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}}
		);
	}
	public static void main(String[] args) {
		new ClosableDemo();
	}
}