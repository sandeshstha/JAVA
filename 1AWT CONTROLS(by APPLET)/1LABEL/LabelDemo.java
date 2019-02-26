import java.applet.*;
import java.awt.*;

public class LabelDemo extends Applet 
{
	public void init()
	{
		Label name = new Label("Name", Label.LEFT);
		Label address = new Label("Address");
		Label roll = new Label("Roll");

		// adding component reference as label

		Label salary = new Label();
		salary.setText("negotiable");

		String naam = salary.getText();
		System.out.println("naam");
		System.out.println(Label.LEFT); 

		address.setAlignment(Label.RIGHT);


		add(name); // compiler see as this.add(name);
		add(address);
		add(roll);
	}
}