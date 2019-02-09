// anonymous instance / anonymous inner class(defined inside a registration method) are different
import java.awt.*;
import java.awt.event.*;

public class ActionListenerByNamedInnerClass extends Frame //this is not a ActionListner so not implements
{	
	// actionPerformed() need to access this private variables
	private TextField tfDisplay;
	private Button btnCount;
	private int count = 0;

	// constructor to set up GUI components and event handlers
	public ActionListenerByNamedInnerClass()
	{
		this.setLayout(new FlowLayout());
		this.add(new Label("Counter")); //an anonymous instance of Label
		tfDisplay = new TextField("0",20);
		tfDisplay.setEditable(false);
		this.add(tfDisplay);

		btnCount = new Button("Increment");
		this.add(btnCount);

		// construct an anonymous instance(instance banaxaina so) of BtnCountListner(a named inner class)
		// btnCount add this instance as an Actionlistener
		btnCount.addActionListener(new BtnCountListner());
			/////similar to 
			/*
				BtnCountListner listener = new BtnCountListner();
				btnCount.addActionListener(listener);
			*/

		this.setTitle("demo");
		this.setSize(500,500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ActionListenerByNamedInnerClass();
	}

	// BtnCountListner is a named inner class used as ActionListener
	// this inner class can access the private members of the outer class
	private class BtnCountListner implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent ae)
		{
			++count;
			tfDisplay.setText(Integer.toString(count));
		}
	}
}