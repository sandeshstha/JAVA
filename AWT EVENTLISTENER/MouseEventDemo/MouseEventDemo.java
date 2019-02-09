// this program gives the X and Y coordinates when the user clicks inside the frame(source of MouseEvent)
// also it gives the current position of the mouse pointer through MouseMotionListener
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener
{
	private TextField tfMouseX;
	private TextField tfMouseY;

	private TextField tfMouseXPosition;
	private TextField tfMouseYPosition;

	// constructor to set up the UI components and event handlers
	MouseEventDemo()
	{
		setLayout(new FlowLayout()); //"super" frame sets it layout to FlowLayout

		add(new Label("X-clicks:")); //"super" frame adds Label component
		// TextField for X-Clicks
		tfMouseX = new TextField(30); //30 colums
		tfMouseX.setEditable(false); //read-only
		add(tfMouseX); //"super" frame adds TextField component

		add(new Label("Y-Clicks")); //"super" frame adds Label component
		// TextField for Y-clicks
		tfMouseY = new TextField(30);
		tfMouseY.setEditable(false);
		add(tfMouseY); //"super" frame adds TextField component


		add(new Label("X-Position"));
		tfMouseXPosition = new TextField(30);
		tfMouseXPosition.setEditable(false);
		add(tfMouseXPosition); //"super" frame adds TextField component

		add(new Label("Y-Position"));
		tfMouseYPosition = new TextField(30);
		tfMouseYPosition.setEditable(false);
		add(tfMouseYPosition);//"super" frame adds TextField component


		addMouseListener(this); 
		//"super" frame(i.e source) fires the MouseEvent
		//"super" frame adds  "this" object as MouseListener
		addMouseMotionListener(this);
		//"super" frame(i.e source) fires the MouseEvent
		//"super" frame adds  "this" object as MouseMotionListener

		setTitle("MouseEvent handling");
		setSize(500,500);
		setVisible(true); 
	}
	public static void main(String[] args) 
	{	
			new MouseEventDemo(); //let the constructor do the job
	}

	// MouseEvent Handlers
	// this handler is called upon the mouse click
	@Override
	 public void mouseClicked(MouseEvent mouseEventobj)
	 {
	 	tfMouseX.setText(mouseEventobj.getX() + " ");
	 	tfMouseY.setText(mouseEventobj.getY() + " ");
	 }
	 // unused method that need to be overriden
	 //the print statements is for checking the overriding
	@Override public void mousePressed(MouseEvent mouseEventobj){System.out.println("mousePressed");}
	@Override public void mouseReleased(MouseEvent mouseEventobj){System.out.println("mouseReleased");}
	@Override public void mouseEntered(MouseEvent mouseEventobj){System.out.println("mouseEntered");}
	@Override public void mouseExited(MouseEvent mouseEventobj){System.out.println("mouseExited");}

	// this handler is called upon the motion of mouse
	@Override
	public void mouseMoved(MouseEvent mouseEventobj)
	{
		tfMouseXPosition.setText(mouseEventobj.getX()+" ");
		tfMouseYPosition.setText(mouseEventobj.getY()+" ");
	}
	// used method
	@Override public void mouseDragged(MouseEvent mouseEventobj){ System.out.println("mouse is dragging");}

}