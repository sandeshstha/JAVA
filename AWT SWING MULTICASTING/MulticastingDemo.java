import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MulticastingDemo extends JPanel implements ActionListener
{
	private int counter = 0;
	private JButton closeAllButton;
	 public MulticastingDemo()
	 {
	 	setLayout(new FlowLayout());
	 	setVisible(true);
	 	setSize(400,400);

	 	JButton newButton = new JButton("New");
	 	add(newButton);

	 	newButton.addActionListener(this);

	 	closeAllButton = new JButton("close all");
	 	add(closeAllButton);
	 }	

	 @Override
	 public void actionPerformed(ActionEvent ae)
	 {
	 	CloseFrame f = new CloseFrame(); //nested class

	 	counter++;	
	 	f.setTitle("window"+counter);
	 	f.setBounds(30*counter,30*counter,200,200);
	 	f.setVisible(true);

	 	closeAllButton.addActionListener(f);
	 }

	 public class CloseFrame extends JFrame implements ActionListener
	 {
	 	public void actionPerformed(ActionEvent ae)
	 	{
	 		setVisible(false);
	 	}
	 }
	 public static void main(String[] args) 
	 {
	 	JFrame frame = new JFrame();
	 	frame.setTitle("multicastTest");
	 	frame.setSize(200,299);

	 	Container contentPane = frame.getContentPane();
	 	contentPane.add(new MulticastingDemo());
	 	frame.setVisible(true);
	  }
}