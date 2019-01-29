import java.applet.*;
import java.awt.*;

public class LabelDemo extends Applet 
{
	public void init()
	{
		Label name = new Label("Name");
		Label address = new Label("Address");
		Label roll = new Label("Roll");

		// adding component reference as label

	add(name);
	add(address);
	add(roll);
	}
}