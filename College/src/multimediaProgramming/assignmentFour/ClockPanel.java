package multimediaProgramming.assignmentFour;

/*	Student Name: Brian McCarthy
 * 	Student Number: 20063914
 * 	Date: 16/03/2016
 * 	Program Name: ClockPanel
 * */

import java.awt.Graphics;

import javax.swing.JPanel;

class ClockPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		// set the size of JPanel
		setSize(120, 120);
		// draw the clock
		g.drawOval(0, 0, 100, 100);
		
		// draw the clock hands
		double hourAngle = 2 * Math.PI * (minutes - 3 * 60) / (12 * 60);
		double minuteAngle = 2 * Math.PI * (minutes - 15) / 60;
		g.drawLine(50, 50, 50 + (int) (30 * Math.cos(hourAngle)), 50 + (int) (30 * Math.sin(hourAngle)));
		g.drawLine(50, 50, 50 + (int) (45 * Math.cos(minuteAngle)), 50 + (int) (45 * Math.sin(minuteAngle)));
	}

	public void set(int h, int m) {
		// update the hands
		minutes = h * 60 + m;
		repaint();
	}
	// class variables
	private int minutes = 0;
}