package multimediaProgramming.assignmentFour;

/*	Student Name: Brian McCarthy
 * 	Student Number: 20063914
 * 	Date: 16/03/2016
 * 	Program Name: DatePanel
 * */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;


public class DatePanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// change the colour
		g.setColor(Color.RED);
		// draw the shape
		g.drawPolygon(new int[] { 150, 250, 250, 150 }, new int[] { 5, 5, 95, 95 }, 4);
		
		// chnage the font size
		Font currentFont = g.getFont();
		Font newFont = currentFont.deriveFont(currentFont.getSize() * 5F);
		g.setFont(newFont);
		g.drawString(day, 165, 70);
	}

	public void set(String date) {
		// update the date
		day = date;
		repaint();
	}
	// class variables
	private String day = "";
}