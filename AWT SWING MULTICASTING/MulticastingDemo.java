import java.awt.*;
import java.awt.event.*;
class MulticastingDemo 
{
    Frame frame;
    static int count=0;
    Button newWindow;
    Button closeAll;
    public static void main(String[] args)
    {
        new MulticastingDemo();
    }
    MulticastingDemo()
    {
        frame=new Frame("Main Window");
        newWindow=new Button("New Window");
        closeAll=new Button("Close All Windows");

        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setLayout(new FlowLayout());
        
        frame.add(newWindow);
        frame.add(closeAll);

        newWindow.addActionListener(new ActionListener(){
        	   public void actionPerformed(ActionEvent ae)
			    {
			        CloseFrame f=new CloseFrame();
			        count++;
			        f.setTitle("Window "+count);
			        f.setVisible(true);
			        f.setSize(250,150);
			        f.setLocation(40*count,40*count);
			        closeAll.addActionListener(f);        
			    }
        });
        

    }
    
    
}
class CloseFrame extends Frame implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        setVisible(false);
    }
}











// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;

// public class MulticastingDemo extends JPanel implements ActionListener
// {
// 	private int counter = 0;
// 	private Button closeAllButton;
// 	 public MulticastingDemo()
// 	 {
// 	 	setLayout(new FlowLayout());
// 	 	setVisible(true);
// 	 	setSize(400,400);

// 	 	JButton newButton = new JButton("New");
// 	 	add(newButton);

// 	 	newButton.addActionListener(this);

// 	 	closeAllButton = new JButton("close all");
// 	 	add(closeAllButton);
// 	 }	

// 	 @Override
// 	 public void actionPerformed(ActionEvent ae)
// 	 {
// 	 	CloseFrame f = new CloseFrame(); //nested class

// 	 	counter++;	
// 	 	f.setTitle("window"+counter);
// 	 	f.setBounds(30*counter,30*counter,200,200);
// 	 	f.setVisible(true);

// 	 	closeAllButton.addActionListener(f);
// 	 }

// 	 public class CloseFrame extends JFrame implements ActionListener
// 	 {
// 	 	public void actionPerformed(ActionEvent ae)
// 	 	{
// 	 		setVisible(false);
// 	 	}
// 	 }
// 	 public static void main(String[] args) 
// 	 {
// 	 	JFrame frame = new JFrame();
// 	 	frame.setTitle("multicastTest");
// 	 	frame.setSize(200,299);

// 	 	Container contentPane = frame.getContentPane();
// 	 	contentPane.add(new MulticastingDemo());
// 	 	frame.setVisible(true);
// 	  }
// }