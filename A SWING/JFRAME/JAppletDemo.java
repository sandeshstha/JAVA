import javax.swing.*;
import java.awt.*;
/*
<applet code = "JAppletDemo.class" width = "100" height = "100">
</applet>
*/

public class JAppletDemo extends JApplet
{
	public void init()
	{
		this.setLayout(new FlowLayout());
		this.setSize(200,200);
		this.setVisible(true);

		add(new JLabel("NUm 1:")); 
		add(new JTextField(20));
		add(new JLabel("NUm2:"));
		add(new JTextField(20));
		add(new JButton("click"));
	}
}