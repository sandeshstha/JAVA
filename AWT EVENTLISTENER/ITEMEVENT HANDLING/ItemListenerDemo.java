import java.awt.*;
import java.awt.event.*;

public class ItemListenerDemo extends Frame implements ItemListener
{
	private TextField ctextField,javatextField;
	private Checkbox cb1, cb2;
	ItemListenerDemo()
	{
		this.setLayout(new FlowLayout());
		this.setSize(500,500);
		this.setVisible(true);
		// to close the frame
		this.addWindowListener(new WindowAdapter()
		{
			@Override public void windowClosing(WindowEvent we){
				System.exit(0);
			}
				
		});

		ctextField = new TextField(100);
		javatextField = new TextField(100);
		cb2 = new Checkbox("Java");
		cb1 = new Checkbox("C++");


		add(ctextField);
		add(javatextField);
		add(cb1);
		add(cb2);

		cb1.addItemListener(this);
		cb2.addItemListener(this);

	}		
	@Override public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() == cb1) //if cb1 is the source of Event
		{
			ctextField.setText("C++ Checkbox:"+(e.getStateChange()==1 ? "checked" : "unchecked")); 
			//int getStateChange() return status of checkbox i.e checked or uncheckeb
		}
		if(e.getSource() == cb2) 
		{
			javatextField.setText("java Checkbox:"+(e.getStateChange()==1 ? "checked" : "unchecked"));
		}
	}
	public static void main(String[] args) {
		new ItemListenerDemo();
	}
}