import java.awt.*;
// import java.awt.events.*;

public class GridBagPlusMenuDemo
{
	Frame frame;
	GridBagPlusMenuDemo() //default constructor
	{

		frame = new Frame("GridBag And Menus Demo"); //Frame is created with a title
		frame.setSize(800,800);
		frame.setVisible(true);

		// Menubar creation
		MenuBar menuBar = new MenuBar(); 

		//Creating New Menu File
		Menu fileMenu = new Menu("File"); 
		// MenuItem Creation
		MenuItem fileMenuItemNew = new MenuItem("New"); 
		MenuItem fileMebuItemOpen = new MenuItem("Open");
		MenuItem fileMenuItemExit = new MenuItem("Exit");

		Menu saveMenu = new Menu("Save"); 
		// For DropDowns in "Save"
		MenuItem saveMenuItemPng = new MenuItem("as .png");
		MenuItem saveMenuItemJpg = new MenuItem("as .jpg");
		MenuItem saveMenuItemJpeg = new MenuItem("as .jpeg");
		// add menuItems to SaveMenu
		saveMenu.add(saveMenuItemPng);
		saveMenu.add(saveMenuItemJpg);
		saveMenu.add(saveMenuItemJpeg);

		// Adding fileMenuItems to fileMenu
		fileMenu.add(fileMenuItemNew);
		fileMenu.add(fileMebuItemOpen);
		//// add the SaveMenu into the FileMenu
		fileMenu.add(saveMenu);
		fileMenu.add(fileMenuItemExit);

		// Creating New Menu Edit
		Menu editMenu = new Menu("Edit");
		//Creating MenuItems for Menu "Edit"
		MenuItem  editMenuItemUndo = new MenuItem("Undo");
		MenuItem  editMenuItemCut = new MenuItem("Cut");
		MenuItem  editMenuItemCopy = new MenuItem("Copy");
		MenuItem  editMenuItemPaste = new MenuItem("Paste");
		MenuItem  editMenuItemDelete = new MenuItem("Delete");
		// Adding MebuItems to Menu "Edit"
		editMenu.add(editMenuItemUndo);
		editMenu.add(editMenuItemCut);
		editMenu.add(editMenuItemCopy);
		editMenu.add(editMenuItemPaste);
		editMenu.add(editMenuItemDelete);

		// Adding Menu to MenuBar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		//Adding menubar to frame
		frame.setMenuBar(menuBar); 
	
	}

	void gridLayoutDemo()
	{
		Panel panel1 = new Panel();
		frame.add(panel1); //adding the panel into the frame
			
	      panel1.setBackground(Color.darkGray); //setting the color of panel1
	      panel1.setSize(500,500);

	      GridBagLayout layout = new GridBagLayout();
	      panel1.setLayout(layout);    //setting the layout of panel to GridbagLayout 

	      GridBagConstraints gbc = new GridBagConstraints();

	      gbc.fill = GridBagConstraints.HORIZONTAL; //how component is resized if component is smaller than its cell
	      gbc.gridx = 0; //x coordintes
	      gbc.gridy = 0; //y coordinates
	      Button b1 = new Button("Button 1");
	      layout.setConstraints(b1,gbc);
	      panel1.add(b1);

	      // gbc constraits will override
	      gbc.fill = GridBagConstraints.HORIZONTAL; //how component is resized if component is smaller than its cell
	      gbc.gridx = 1; //x coordintes
	      gbc.gridy = 0; //y coordinates
	      Button b2 = new Button("Button 2");
	      layout.setConstraints(b2,gbc);
	      panel1.add(b2);

	      gbc.fill = GridBagConstraints.HORIZONTAL; //how component is resized if component is smaller than its cell
	      gbc.gridx = 0; //x coordintes
	      gbc.gridy = 1; //y coordinates
	      gbc.ipady = 20; //component height in pexels //ipadx give width

 	      Button b3 = new Button("Button 3");
	      layout.setConstraints(b3,gbc);
	      panel1.add(b3);

	      gbc.fill = GridBagConstraints.HORIZONTAL; //how component is resized if component is smaller than its cell
	      gbc.gridx = 1; //x coordintes
	      gbc.gridy = 1; //y coordinates
	      gbc.ipady = 20; 
	      Button b4 = new Button("Button 4");
	      layout.setConstraints(b4,gbc);
	      panel1.add(b4);

	      gbc.fill = GridBagConstraints.HORIZONTAL;
		  gbc.gridx = 0;
	      gbc.gridy = 2; 
	      gbc.gridwidth = 2; //like colspan
	      Button b5 = new Button("Button 5");
	      layout.setConstraints(b5,gbc);
	      panel1.add(b5);
	}

	public static void main(String[] args) 
	{
		GridBagPlusMenuDemo obj = new GridBagPlusMenuDemo();
		obj.gridLayoutDemo();
	}
}
