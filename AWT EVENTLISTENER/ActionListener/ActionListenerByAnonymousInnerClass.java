import java.awt.*;
import java.awt.event.*;

public class ActionListenerByAnonymousInnerClass extends Frame //no need to implement ActionerLister as this class is not the Listener class
{
	private TextField tfDisplay;
	private Button btnIncrement, btnDecrement, btnReset;
	private int count = 0;

	// constructor to set up GUI components and event handlers
	public ActionListenerByAnonymousInnerClass()
	{
		this.setLayout(new FlowLayout());
		this.add(new Label()); // frame adds an anonymous instance of Label

		tfDisplay = new TextField("0",20);
		tfDisplay.setEditable(false);
		this.add(tfDisplay);

		btnIncrement = new Button("INCREMENT");
		btnDecrement = new Button("DECREMENT");
		btnReset = new Button("RESET");
		this.add(btnIncrement);
		this.add(btnDecrement);
		this.add(btnReset);

				// Construct an anonymous instance of an anonymous inner class.
      			// The source Button adds the anonymous instance as ActionEvent listener
			btnIncrement.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				++count;
				tfDisplay.setText(Integer.toString(count));
			}
			});

		
			btnDecrement.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				--count;
				tfDisplay.setText(Integer.toString(count));
			}
			});
		
			btnReset.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent ae)
				{
					count = 0;
					tfDisplay.setText(Integer.toString(count));
				}
			});

		this.setTitle("demo");
		this.setSize(500,500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ActionListenerByAnonymousInnerClass();
	}
}	
