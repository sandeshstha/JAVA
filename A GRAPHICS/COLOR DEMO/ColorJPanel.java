import java.awt.*;
import javax.swing.*;


public class ColorJPanel extends JPanel
{

	public void paintComponent(Graphics g)
	{

		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		// set new drawing color using integers
		g.setColor(new Color(255,0,0));
		g.fillRect(15,50,100,20);
		g.drawString("current RGB:"+g.getColor(),130,40);

	}

}

