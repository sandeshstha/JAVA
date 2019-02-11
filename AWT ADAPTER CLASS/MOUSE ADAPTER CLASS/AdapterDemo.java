import java.awt.*;
import java.awt.event.*;

public class AdapterDemo extends Frame
{
	public AdapterDemo()
	{
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		addMouseListener(new MyMouseAdapter(this)); //anounymous object of class MyMouseAdapter
		addMouseMotionListener(new MyMouseMotionAdapter(this));

	}
	class MyMouseAdapter extends MouseAdapter
	{
		AdapterDemo adapterDemo; //reference
		public MyMouseAdapter(AdapterDemo adapterDemo)
		{
			this.adapterDemo = adapterDemo;
		}
		// handles mouse clicked
		public void mouseClicked(MouseEvent me)
		{
			// adapterDemo.showStatus("mouse clicked");
			System.out.println("mouse clicked");
		}
	}

	class MyMouseMotionAdapter extends MouseMotionAdapter
	{
		AdapterDemo adapterDemo;
		public MyMouseMotionAdapter(AdapterDemo adapterDemo)
		{
			this.adapterDemo = adapterDemo;
		}
		// handles mouse dragged
		public void mouseDragged(MouseEvent me)
		{
			// adapterDemo.showStatus("mouse dragged");
			System.out.println("mouse dragged");
		}
	}
	public static void main(String[] args) {
		new AdapterDemo();
	}
}