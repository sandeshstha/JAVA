import java.awt.*;

public class LabelUsingFrame extends Frame
{
	Label lab1,lab2,lab3;
	public LabelUsingFrame() //default constructor
	{
		lab1 = new Label("this is a centered alighned text",Label.CENTER);
		lab2 = new Label("this is a left aligned text"); //by default left
		lab3 = new Label(); //label with empty string

		lab1.setBounds(50,50, 80,30);
		lab2.setBounds(50,50, 80,30);
	

		lab3.setText("This is a right aligned text");
		lab3.setAlignment(Label.RIGHT);
		lab3.setBounds(50,50, 80,30);

		add(lab1);
		add(lab2);
		add(lab3);

		setSize(1000,1000);
		setVisible(true);
	}
	public static void main(String[] args) 
	{	
		new LabelUsingFrame();
	}
}
/*
import java.awt.*;  
class LabelExample
{
	public static void main(String args[])
	{  
	    Frame f= new Frame("Label Example");  
	    Label lab1,lab2;  
	    lab1=new Label("First Label.");  
	    lab1.setBounds(50,100, 100,30);  
	    lab2=new Label("Second Label.");  
	    lab2.setBounds(50,150, 100,30);  
	    f.add(lab1);  //Frame bhitra component rakheko
	    f.add(lab2);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	}  
}  

*/