/*
 * FlowWindowEvents .java
 * Event Listeners in Java using this class to create actionlisteners
 */
package multimediaProgramming.assignmentFour;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Events extends JFrame {
    
	// private fields for two buttons, text field, container and string message for text field
	JButton a, b;
	JTextField text = new JTextField(10);
	Container contentPane = getContentPane();
    
	public Events () {
		// constructor 
        
		// set layout of the contentPane
		contentPane.setLayout(new FlowLayout());
        
		// calling the method to create two new instance of JButton and adding it to the container
		contentPane.add(a = createButton("A"));
        contentPane.add(b = createButton("B"));
        
        // calling the method to create the text field
        textField();
        
        // setup the window
        setWindow();
    }
	private void textField() {

		// set the text field size
		text.setPreferredSize(new Dimension(100, 50));

		// using anonymous class to create the action listener
		text.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, e.getActionCommand());
			}

		});

		// add text field to the container
		contentPane.add(text);
	}

	private JButton createButton(String buttonName) {

		// create a new JButton with a label for it's name
		JButton button = new JButton(buttonName);
		
		// set the buttons size
		button.setPreferredSize(new Dimension(100, 50));

		button.addActionListener(new ActionListener() {
			// add the action listener for the button
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, buttonName + " button pressed");
			}

		});
		// return the button created
		return button;
	}

	private void setWindow() {
		// set close operation, window title, visible etc
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("FlowWindow");
		pack();
		setVisible(true);

	}

	public static void main(String args[]) {
		// run new instance of flow window events class
		new Events();
	}
}