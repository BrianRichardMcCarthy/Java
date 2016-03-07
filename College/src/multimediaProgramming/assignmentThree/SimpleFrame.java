/*
 * Student Name: 	Brian McCarthy
 * Student Number:	20063914
 * Date:			25/02/2016
 * Assignment Name:	6.1. SimpleFrameTest
 * Program Description: Program will display a simple frame in the top left corner of the screen
 * */

package multimediaProgramming.assignmentThree;

import javax.swing.JFrame;

public class SimpleFrame extends JFrame {
	
	// setting two ints for height and width
	private static final int WIDTH = 700, HEIGHT = 500;
	
	// constructor
	public SimpleFrame() {
		
		// set size
		setSize(WIDTH, HEIGHT);
		
		// set default close operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// set visible
		setVisible(true);
		
	}
	
}