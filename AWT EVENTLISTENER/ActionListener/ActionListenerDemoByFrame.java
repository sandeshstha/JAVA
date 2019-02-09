import java.awt.*;
import java.awt.event.*;

class ActionListenerDemoByFrame extends Frame implements ActionListener
{
	// this class acts as listener for ActionEvent
	
	TextField tf;
	Button button;
	ActionListenerDemoByFrame()
	{
		// setting up the frame
		setSize(200,400);
		setVisible(true);
		setLayout(new FlowLayout());

		tf = new TextField(20);
		button = new Button("click to see magic");

		// registering eventListener
		button.addActionListener(this);

		add(tf);
		add(button);
	}
	// this method is invoked automatically when the button is clicked
	// ActionEvent Handler
	@Override
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("text appeared");
	}

	public static void main(String[] args) 
	{
		new ActionListenerDemoByFrame();
		
	}
	
}
