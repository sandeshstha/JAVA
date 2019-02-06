import java.awt.*;

class GridLayoutDemo extends Frame
{
	Button btn1,btn2,btn3,btn4,btn5,btn6;
	GridLayoutDemo()
	{	
		// super(title);
		setVisible(true);	
		setSize(500,500);
		setLayout(new GridLayout(2,3));
		btn1 = new Button("1");
		btn2 = new Button("2");
		btn4 = new Button("4");
		btn3 = new Button("3");
		btn5 = new Button("5");
		btn6 = new Button("6");




		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);

	}
	public static void main(String[] args) {
		new GridLayoutDemo();
		
	}
}