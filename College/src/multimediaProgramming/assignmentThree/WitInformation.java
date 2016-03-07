/*
 * Student Name: 	Brian McCarthy
 * Student Number:	20063914
 * Date:			25/02/2016
 * Assignment Name:	6.3. Create a GUI to display the Waterford IT Logo
 * Program Description: Program will display the contact information of WIT on a panel
 * */

package multimediaProgramming.assignmentThree;

import java.awt.*;

import javax.swing.JPanel;

public class WitInformation extends JPanel {

	// private static variables for image and array of details
	private static Image witLogo = WITInfo.kit.getImage("src/multimediaProgramming/weekThree/WITLogo.jpg");
	private static String[] details = {"Waterford Institute of Technology,", "Main Campus,", "Cork Road,", "Waterford City,", "Co. Waterford, Ireland.", "phone: +353 51 30 2000", "www.wit.ie"};
	
	// constructor
	public WitInformation() { }

	// Accessor for logo
	public Image getLogo() {
	
		return witLogo;
	
	}
	
	
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);

		// draw the logo
		g.drawImage(witLogo, 100, 100, null);
		
		// starting point Y for the text
		int y = 120;

		for (int x = 0; x < details.length; x++) {
			// draw the text information
			g.drawString(details[x], 250, y);
			// move text to a new line
			y += 20;
		}
	
	}

}