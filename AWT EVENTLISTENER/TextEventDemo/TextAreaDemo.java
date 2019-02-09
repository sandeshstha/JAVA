import java.awt.*;
import java.awt.event.*;	
import java.applet.*;
/*
	<applet code = "TextAreaDemo.class" width = "300" height = "300">
	</applet>	
*/
public class TextAreaDemo extends Applet implements TextListener
{
	TextArea echo1,echo2;
	LayoutManager layout;
	public void init()
	{
		echo1 = new TextArea(2,40); //generates TextEvent
		echo2 = new TextArea(2,40);

		layout = new FlowLayout();
		setLayout(layout);

		// registering in same class(implementing class is TextListener)
		echo1.addTextListener(this);  //this => (TestListener obj) This class is the Listener class
		echo2.setEditable(false);

		add(echo1);
		add(echo2);

		// echo1.setText("enter some text in this area");


	}
	//overriding 
	public void textValueChanged(TextEvent e)
	{
		String entry = echo1.getText();
		echo2.setText(entry);
	}
}