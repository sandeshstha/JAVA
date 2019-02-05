import java.awt.*;

class ByCreatingObjectOfFrame
{
	ByCreatingObjectOfFrame()
	{
		Frame fObj = new Frame();
		Label name = new Label("Name:");
		fObj.add(name);
		fObj.setVisible(true);
		fObj.setSize(500,500);
		// fObj.setLayout(null); //layout is cleared
		// fObj.setBounds(10,10,200,200); //manually positioni set
	}
	public static void main(String[] args) {
		ByCreatingObjectOfFrame f = new ByCreatingObjectOfFrame();
	}
}