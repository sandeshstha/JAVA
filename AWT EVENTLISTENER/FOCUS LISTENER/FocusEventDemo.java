// FocusListener is used for receiving Keyboard FocusEvent

import java.awt.*;
import java.awt.event.*;

public class FocusEventDemo extends Frame 
{
	private TextField nametf, addresstf;
	private Label nameLabel,addressLabel;
	private Button save;
	FocusEventDemo()
	{
		this.setLayout(new FlowLayout()); //use setBounds for each compenent
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Focus Listener demo");
// for closing the frame
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});

//name
		nameLabel = new Label("Name:");
		this.add(nameLabel);
		nametf = new TextField(10);
		this.add(nametf);
//address
		addressLabel = new Label("Address:");
		this.add(addressLabel);
		addresstf = new TextField(10);
		this.add(addresstf);
//button
		save = new Button("save");
		this.add(save);

//Registering by inner class method //here it is calling inner class ko reference
		nametf.addFocusListener(new FocusListenerInnerClass("Name")); //inner class method with parameter string which is the implementing class 
		addresstf.addFocusListener(new FocusListenerInnerClass("Address")); //different string passed

	}

	public class FocusListenerInnerClass implements FocusListener
	{
		String componentName;
		FocusListenerInnerClass(String _componentName) //default constructor
		{
			componentName = _componentName;
		}

		@Override public void focusGained(FocusEvent fe)
		{
			displayMessage(" gained focus",fe); //fucntion call
		}
		@Override public void focusLost(FocusEvent fe)
		{
			displayMessage(" Lost focus",fe);
		}
		void displayMessage(String msg,FocusEvent fe)
		{
			System.out.println(componentName + msg + 
				fe.getComponent().getClass().getName() +
				"Opposite component:"+
				(fe.getOppositeComponent()!=null ? fe.getOppositeComponent().getClass().getName() : "null")
			+"\n");
		}

	}

	public static void main(String[] args) 
	{
		new FocusEventDemo();	
	}
}