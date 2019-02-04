import java.awt.*;
import java.applet.*;
/*
<applet code="ClassTask1" alt="cannot run java program" width="100" height="500" align="left">
	
	</applet>
*/
public class ClassTask1 extends Applet 
{
	public void init()
	{
		Label username = new Label("username");
		Label password = new Label("Password");

		TextField usernameText = new TextField("enter username",100);
		TextField passwordText = new TextField("enter password",100);

		Button login = new Button("login");
		Button cancel = new Button("cancel");

		add(username);
		add(usernameText);

		add(password);
		add(passwordText);
		passwordText.setEchoChar('*');
	}

}
