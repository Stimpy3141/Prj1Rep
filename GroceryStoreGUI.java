package prj1Pkg;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


//import javax.swing.*;



public class GroceryStoreGUI extends JFrame{ //implements ActionListener{

	//public GroceryStoreGUI()
	super();
	
	mainPanel = new JPanel(new BorderLayout());
	createNewStoreProfileBtn = new JButton("Create New Store Profile");
	saveStoreProfileBtn = new JButton("Save Store Profile");
	
	
	storePanel = new JPanel(new BorderLayout());
	buttonPanel = new JPanel(new BorderLayout());
	
	
	this.add(mainPanel);
	mainPanel.add(storePanel, BorderLayout.CENTER);
	mainPanel.add(buttonPanel, BorderLayout.SOUTH);
	
	buttonPanel.add(createNewStoreProfileBtn);
	buttonPanel.add(saveStoreProfileBtn);
	

	
	/*
	@Override
	public void actionPerformed(ActionEvent arg0){
		switch (arg0.getActionCommand())
		{
		case "clear drawing button":

			break;
		case "save image button":
			
			break;
		}
	}//end actionPerformed()
	*/
	
}//end GroceryStoreGUI definition