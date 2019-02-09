//actionPerformed() is invoked automatically whenever you click on the registered component.
// ActionEvent is generated when Button is pressed and the the ActionEvent object is caught by Listener

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code = "ActionListenerDemo" width = "100" height = "100">
</applet>
*/
public class ActionListenerDemo extends Applet implements ActionListener 
{
	// this class acts as listener for ActionEvent
	TextArea outputTextArea;
	Button button;
	public void init()
	{	
		outputTextArea = new TextArea();
		button = new Button("Click to see result");

		// registering the listener
		button.addActionListener(this);

		this.setSize(200,200);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		
		this.add(outputTextArea);
		this.add(button);

	}
	public void actionPerformed(ActionEvent e)
	{
		outputTextArea.setText("OOPs you clicked that button.");
	
	}
}