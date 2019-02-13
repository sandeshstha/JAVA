// JFrame by extending 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDemo extends JFrame implements ActionListener
{
	JLabel label;
	public JFrameDemo()
	{
		this.setLayout(new FlowLayout());

		JButton btn = new JButton("click");
		label = new JLabel();

		btn.addActionListener(this);

		this.add(label);
		this.add(btn);

		this.setSize(500,500);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		label.setText("you clickedslkfj");
	}


	public static void main(String[] args) {
		new JFrameDemo();
	}
}