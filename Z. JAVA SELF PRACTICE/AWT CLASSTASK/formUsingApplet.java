import java.awt.*;
import java.applet.*;

/*
	<applet code = "formUsingApplet" width = "500" height = "500">
	</applet>
*/

public class formUsingApplet extends Applet 
{
	Label nameLabel, passLabel, countryLabel, hobbiesLabel, genderLabel, youLoveLabel, bioLabel;
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		nameLabel = new Label("Name:");
		passLabel = new Label("Password:");
		countryLabel = new Label("country:");
		hobbiesLabel = new Label("hobbies:");
		genderLabel = new Label("gender:");
		youLoveLabel = new Label("Your Love:");
		bioLabel = new Label("Bio:");

		add(nameLabel);
		add(new TextField("enter your name",20)); 

		add(passLabel);
		TextField passTextField = new TextField(20);
		passTextField.setEchoChar('*');
		add(passTextField);

		add(countryLabel);
		Choice countryChoice = new Choice();
		countryChoice.add("Nepal");
		countryChoice.add("india");
		countryChoice.add("USA");
		countryChoice.add("Canada");
		countryChoice.add("Korea");
		countryChoice.add("UK");
		countryChoice.add("Australia");
		add(countryChoice); //countryChoice component is added to container Applet

		add(hobbiesLabel);
		List hobbiesList = new List(4);
		hobbiesList.add("singing");
		hobbiesList.add("dancing");
		hobbiesList.add("football");
		hobbiesList.add("guitar");
		hobbiesList.add("basketball");
		hobbiesList.add("ldskfj");
		add(hobbiesList);

		add(genderLabel);
		CheckboxGroup gender = new CheckboxGroup();
		Checkbox objMale = new Checkbox("Male:",gender,true);
		Checkbox objFemale = new Checkbox("Female:",gender,false);
		add(objMale);
		add(objFemale);
		add(new Checkbox("Other:",gender,false));

		add(youLoveLabel);
		Checkbox javaLove = new Checkbox("java"); //creates a checkbox named java
		Checkbox cLove = new Checkbox("C");
		Checkbox cppLove = new Checkbox("C++");
		add(javaLove);
		add(cLove);
		add(cppLove);

		add(bioLabel);
		TextArea bioTextArea = new TextArea("enter your bio",10,10,TextArea.SCROLLBARS_BOTH);
		add(bioTextArea);

		Button b1 = new Button("SUBMIT");
		Button b2 = new Button("CLEAR");
		add(b1);
		add(b2);

	}

}