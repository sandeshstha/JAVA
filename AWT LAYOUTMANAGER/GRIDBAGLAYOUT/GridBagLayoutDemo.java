import java.awt.*;

class GridBagLayoutDemo extends Frame
{
	GridBagLayoutDemo()
	{
		GridBagLayout gbag = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints(); //gbc jasto 5 ota constraints
		setLayout(gbag);

		Checkbox window = new Checkbox("Windows",null,true);
		Checkbox android = new Checkbox("android");
		Checkbox solaris = new Checkbox("solaris");

		// define gridbag constraints

		gbc.weightx = 1.0; //use column weight of 1
		gbc.ipadx = 200; //component width
		// ipady = height
		gbc.anchor = GridBagConstraints.NORTHEAST;

		gbag.setConstraints(window,gbc);
		gbag.setConstraints(android,gbc);
		gbag.setConstraints(solaris,gbc);


		add(window);
		add(android);
		add(solaris);

		setVisible(true);

	}
	public static void main(String[] args) {
		 new GridBagLayoutDemo();
	}
}