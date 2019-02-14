import java.awt.*;

class BorderLayoutDemo extends Frame
{
	Button btnNorth,btnSouth,btnEast,btnWest,btnCenter;
	BorderLayoutDemo(String title)
	{	
		super(title);
		setVisible(true);	
		setSize(500,500);
		setLayout(new BorderLayout(5,5));
		btnNorth = new Button("North");
		btnSouth = new Button("South");
		btnWest = new Button("West");
		btnEast = new Button("East");
		btnCenter = new Button("Center");


		add("LDSKJF",btnNorth);
		add("SOUTH",btnSouth);
		
		// add(btnNorth,BorderLayout.NORTH);
		// add(btnSouth,BorderLayout.SOUTH);
		// add(btnEast,BorderLayout.EAST);
		// add(btnWest,BorderLayout.WEST);
		// add(btnCenter,BorderLayout.CENTER);

	}
	public static void main(String[] args) {
		BorderLayoutDemo bdr = new BorderLayoutDemo("demo");
		
	}
}