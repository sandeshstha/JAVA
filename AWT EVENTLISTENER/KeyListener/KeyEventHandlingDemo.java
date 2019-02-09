import java.awt.*;
import java.awt.event.*;

public class KeyEventHandlingDemo extends Frame implements KeyListener
{
	TextField tf;
	TextArea ta;
	public KeyEventHandlingDemo()
	{	
		this.setLayout(new FlowLayout());

		tf = new TextField(20);
		tf.setBounds(20,20,30,10);
		tf.setEditable(false);

		ta = new TextArea();
		tf.setBounds(20,30,20,40);

		ta.addKeyListener(this);
		 // ta (i.e source object) fires KeyEvent upon Pressing,releasing and typing
        // ta adds "this" object as an KeyEvent listener

		this.add(tf);
		this.add(ta);

		this.setSize(300,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new KeyEventHandlingDemo();
	}

	// KeyEvent Handlers
	// called back upon the Key being pressed , released and typed
	@Override
	public void keyPressed(KeyEvent ke)
	{
		tf.setText("the key is pressed");
	}
	@Override
	public void keyReleased(KeyEvent ke)
	{
		tf.setText("the key has been Released");
	}
	@Override
	public void keyTyped(KeyEvent ke)
	{
		tf.setText("typing");
	}
	
}