package com.gces.jdbc;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Demo extends Frame
{
//	DECLARATIONS FOR DATABASE PART
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/book_registration";
	public static final String UNAME = "root";
	public static final String PASSWORD = "";
	String insertQuery;
	
//	for GUI PART
	Label bookNameLabel, authorNameLabel,warningLabel;
	TextField bookTextField, authorTextField;
	Button saveButton;

	Demo() 
	{
		prepareGUI();
	}
	// main function
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		obj.dataBaseFunction(); 
	}
	public void prepareGUI()
	{
		this.setTitle("Book Registration System");
		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		// closable frame
		this.addWindowListener(new WindowAdapter()
				{
					@Override public void windowClosing(WindowEvent we)
					{
						System.exit(0);
					}
				});
		bookNameLabel = new Label("Book:");
		bookTextField = new TextField("Enter the name of Book",50);
		authorNameLabel = new Label("Author:");
		authorTextField = new TextField("Enter the name of author",50);
		saveButton = new Button("SAVE");
		warningLabel = new Label();
		this.add(bookNameLabel);
		this.add(bookTextField);
		this.add(authorNameLabel);
		this.add(authorTextField);
		this.add(saveButton);
		this.add(warningLabel);

		// when user focus on textFields the initial text should be gone. This is for Keyboard focus
		bookTextField.addFocusListener(new FocusListener()
			{
				public void focusGained(FocusEvent f)
				{
					bookTextField.setText("");
				}
			
				public void focusLost(FocusEvent f)
				{
					if(bookTextField.getText().equals(""))
					bookTextField.setText("Enter the name of book");
				}
			});
		authorTextField.addFocusListener(new FocusListener()
			{
				public void focusGained(FocusEvent f)
				{
					authorTextField.setText("");
				}
			
				public void focusLost(FocusEvent f)
				{
					if(authorTextField.getText().equals(""))
					authorTextField.setText("Enter the name of author");
				}
			});
	}
	//database roles comes when user enter the data and click save button
	public void dataBaseFunction()
	{
		saveButton.addActionListener(new ActionListener() 
			{
				@Override public void actionPerformed(ActionEvent e)
				{
						try 
						{
							insertQuery = "INSERT INTO `books_table`(`book_name`,`author_name`)"+"VALUES(?,?)";
							
							Class.forName(JDBC_DRIVER);
							
							Connection con = DriverManager.getConnection(DB_URL,UNAME,PASSWORD);
							
							PreparedStatement pst = con.prepareStatement(insertQuery);
							pst.setString(1,bookTextField.getText());
							pst.setString(2,authorTextField.getText());
							pst.executeUpdate();
							
							pst.close();
							con.close();
						} 
						catch (ClassNotFoundException e1) {
							e1.printStackTrace();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
				}
			});
	}

}
