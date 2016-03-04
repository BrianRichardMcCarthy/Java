/*
 * Name: Brian McCarthy
 * Date: 04/03/2016
 * Program Name: Hello
 * Program Description: create a simple JFrame to display hello world.
 * 						This is merely just a test program for practicing 
 * 						uploading projects and source code to GitHub.
 * */
// package for java file
package testHello;

// imports for swing and awt libraries 
import java.awt.*;
import javax.swing.*;

// class name and extension
public class Hello extends JFrame {

	// class variables for setting up the location and size of screen
	private static final Toolkit kit = Toolkit.getDefaultToolkit();
	private static final Dimension screensize = kit.getScreenSize();
	private static final int HEIGHT = screensize.height, WIDTH = screensize.width;
	
	// class variables for the JPanel, Container, JTextArea
	private JPanel panel = new JPanel(new FlowLayout());
	private Container pane = getContentPane();
	private JTextArea helloWorld = new JTextArea("Hello World", 1, 2);
	
	// constructor
	public Hello() {
		// method call to set up the frame
		setFrame();
		// calling the drawString method to draw the message to the screen
		drawString();
	}
	
	private void setFrame() {

		// set the title, location, size, icon image, default close operation and visible
		setTitle("Hello World");
		setLocation(WIDTH/4, HEIGHT/4);
		setSize(WIDTH/2, HEIGHT/2);
		setIconImage(kit.getImage("images/profile.jpg"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private void drawString() {
		
		// add string message to the JPanel
		panel.add(helloWorld);
		
		// add JPanel to the Container
		pane.add(panel);
	
	}
	
	public static void main(String[] args) {
		
		// run a new instance of the Hello class, not assigning it to a variable
		new Hello();
	}
}