/*
 * Student Name: 	Brian McCarthy
 * Student Number:	20063914
 * Date:			25/02/2016
 * Assignment Name:	6.2. CenteredFrameTest
 * Program Description: Program is a class which 
 * 						when instance is created 
 * 						will display a frame in 
 * 						the centre of the screen
 * 						and display a logo
 * */
// import java.awt.* and Javax.swing.Frame

package multimediaProgramming.assignmentThree;

import java.awt.*;

import javax.swing.JFrame;

// Centered Frame test class which extends JFrame class
public class CenteredFrameTest extends JFrame {
	
	// private static variables for setting the size of the program according to the screen size
	private static Toolkit kit = Toolkit.getDefaultToolkit();
	private static Dimension screenSize = kit.getScreenSize();
	private static int WIDTH = screenSize.width, HEIGHT = screenSize.height;
	
	// image icon for the logo
	private static Image logo = kit.getImage("src/multimediaProgramming/weekThree/logo.jpg");
	
	// Constructor
	public CenteredFrameTest() {
		
		// set size and location of the program
		setSize(WIDTH / 2, HEIGHT / 2);
		setLocation(WIDTH / 4, HEIGHT / 4);
		
		// set the default close operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// set the icon image
		setIconImage(logo);
		
		// show the frame
		setVisible(true);

	}

}