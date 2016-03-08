/*
 * FlowWindowEvents .java
 * Event Listeners in Java using anonymous classes
 */
package multimediaProgramming.assignmentFour;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FlowWindowEvents extends JFrame implements ActionListener {

	// private fields Two JButtons, text field, and contentPane
	JButton a, b;
	JTextField text = new JTextField(10);
	Container contentPane = getContentPane();

	public FlowWindowEvents() {
		// constructor

		// set layout of the contentPane
		contentPane.setLayout(new FlowLayout());

		// calling the method to create two new instance of JButton and adding
		// it to the container
		contentPane.add(a = createButton("A"));
		contentPane.add(b = createButton("B"));

		// calling the method to create the text field
		textField();

		// setup the window
		setWindow();
	}

	private void textField() {
		// set text field size
		text.setPreferredSize(new Dimension(100, 50));
		
		// add action listen of this class to text field
		text.addActionListener(this);
		
		// add text field to contentPane
		contentPane.add(text);
	}
	
	private JButton createButton(String buttonName) {
		// create a new JButton with the string button name
		JButton button = new JButton(buttonName);
		
		// set button size
		button.setPreferredSize( new Dimension(100, 50)); // setMinimumSize, setMaximumSize will not work
		
		// add action listener for this class
		button.addActionListener(this);
		
		// return the button
		return button;
	}
		
	private void setWindow() {
		// set close operation, window title, visible etc
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("FlowWindow");
		pack();
		setVisible(true);

	}
	

	public void actionPerformed(ActionEvent event) {
		// method to handle action events
		if (event.getSource() == a) {
			// if the A button is pressed the message "A button pressed" is shown
			JOptionPane.showMessageDialog (null, "A button pressed");
		} else if (event.getSource() == b) {
			// if the A button is pressed the message "B button pressed" is shown
			JOptionPane.showMessageDialog (null, "B button pressed");
		} else if (event.getSource() == text) {
			// if the user enters text and hits the enter key, 
			// whatever they typed will be shown
			// but not any previous text
			JOptionPane.showMessageDialog (null, event.getActionCommand());
		}
	}
	
	public static void main(String args[]) {
		// run a new instance of Events Example class
		new Events();
	}
}