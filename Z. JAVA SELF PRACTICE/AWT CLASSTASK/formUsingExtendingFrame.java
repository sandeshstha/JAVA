import java.awt.*;

class formUsingExtendingFrame extends Frame 
{
	formUsingExtendingFrame()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new Label("Name:"));
		add(new TextField("enter your name",20)); 

		add(new Label("Password:"));
		TextField passTextField = new TextField(20);
		passTextField.setEchoChar('*');
		add(passTextField);

		add(new Label("country:"));
		Choice countryChoice = new Choice();
		countryChoice.add("Nepal");
		countryChoice.add("india");
		countryChoice.add("USA");
		countryChoice.add("Canada");
		countryChoice.add("Korea");
		countryChoice.add("UK");
		countryChoice.add("Australia");
		add(countryChoice); //countryChoice component is added to container Applet

		add(new Label("hobbies:"));
		List hobbiesList = new List(4);
		hobbiesList.add("singing");
		hobbiesList.add("dancing");
		hobbiesList.add("football");
		hobbiesList.add("guitar");
		hobbiesList.add("basketball");
		hobbiesList.add("ldskfj");
		add(hobbiesList);

		add(new Label("gender:"));
		CheckboxGroup gender = new CheckboxGroup();
		Checkbox objMale = new Checkbox("Male:",gender,true);
		Checkbox objFemale = new Checkbox("Female:",gender,false);
		add(objMale);
		add(objFemale);
		add(new Checkbox("Other:",gender,false));

		add(new Label("Your Love:"));
		Checkbox javaLove = new Checkbox("java"); //creates a checkbox named java
		Checkbox cLove = new Checkbox("C");
		Checkbox cppLove = new Checkbox("C++");
		add(javaLove);
		add(cLove);
		add(cppLove);

		add(new Label("Bio:"));
		TextArea bioTextArea = new TextArea("enter your bio",10,10,TextArea.SCROLLBARS_BOTH);
		add(bioTextArea);

		Button b1 = new Button("SUBMIT");
		Button b2 = new Button("CLEAR");
		add(b1);
		add(b2);

	}
	public static void main(String[] args) 
	{
		new formUsingExtendingFrame();
	}
}