/*
 * Student Name: 	Brian McCarthy
 * Student Number:	20063914
 * Date:			25/02/2016
 * Assignment Name:	7.1. FlowWindow
 * Program Description: Program to display Buttons -
 * 						Check Box, 
 * 						Radio Button,
 * 						Text Field,
 * 						Text Area,
 * 						Password Field
 * */

package multimediaProgramming.assignmentThree;

// imports
import java.awt.*;

import javax.swing.*;

public class FlowWindow extends JFrame {

	// private static variables that won't change for each instance of the class
	private static Toolkit kit = Toolkit.getDefaultToolkit();
	private static Dimension screenSize = kit.getScreenSize();
	private static int WIDTH = screenSize.width, HEIGHT = screenSize.height;
	
	// private instance variables
	private Container pane = getContentPane();
	private JCheckBox cBox = new JCheckBox();
	private JRadioButton rButton1 = new JRadioButton();
	private JTextField tField = new JTextField("Hello world, Text Field", 15);
	private JPasswordField pw = new JPasswordField(10);
	private JTextArea tArea = new JTextArea("Hello world, Text Area", 1, 2);

	// constructor
	public FlowWindow() {
		
		add();
		set();
	
	}
	
	// method to add buttons and text field/area to pane
	private void add() {
		
		pane.setLayout(new FlowLayout());
		pane.add(cBox);
		pane.add(rButton1);
		pane.add(tField);
		pane.add(pw);
		pane.add(tArea);
	
	}

	// set size, location, close operation, visible
	private void set() {
	
		setTitle("Flow Window");
		setSize(WIDTH / 2, HEIGHT / 2);
		setLocation(WIDTH / 4, HEIGHT / 4);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		// new instance of FlowWindow
		new FlowWindow();
	
	}
	
}