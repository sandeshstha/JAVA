import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = "KeyEventHandlingDemoApplet" width = "100" height = "100" alt = "cannot run the applet">
</applet>
*/

public class KeyEventHandlingDemoApplet extends Applet implements KeyListener
{
	TextField tFieldIn;
	TextArea tAreaOut;
	public void init()
	{
		this.setSize(200,200); //"super" sets size of applet
		this.setVisible(true);
		this.setLayout(new FlowLayout());

		tFieldIn = new TextField(20);
		tAreaOut = new TextArea(20,40);
		tAreaOut.setEditable(false);

		tFieldIn.addKeyListener(this);
		// tFieldIn(source of KeyEvent) fires keyEvent
		// tFieldIn adds "this" object as a KeyEvent Listener

		this.add(tFieldIn);
		this.add(tAreaOut);
	}
	@Override
	public void keyTyped(KeyEvent kEvent)
	{
		tAreaOut.setText("you typed " + kEvent.getKeyChar()); //getChar() is method of KeyEvent so access it via KeyEvent Object
	}
	@Override public void keyPressed(KeyEvent kEvent){System.out.println("key pressed");}
	@Override public void keyReleased(KeyEvent kEvent){System.out.println("key Released");}

}