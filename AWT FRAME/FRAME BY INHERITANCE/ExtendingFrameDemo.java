import java.awt.*;

class ExtendingFrameDemo extends Frame 
{
	 ExtendingFrameDemo()
	 {
	 	Label name = new Label("Name:");
	 	add(name); //adding label into frame 
	 	//this.add(name);

	 	setVisible(true); //now frame will be visible, by default not visible
	 	setSize(500,500);
	 }
	 public static void main(String[] args) 
	 {
		ExtendingFrameDemo efd = new ExtendingFrameDemo();	  
	   // new ExtendingFrameDemo();	

	 }
}