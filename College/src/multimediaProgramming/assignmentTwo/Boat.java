/*
 * Student Name: Brian McCarthy
 * Student Number: 20063914
 * Date: 02/02/2016
 * Program Name: Boat
 * */
package multimediaProgramming.assignmentTwo;
 
// import java libraries
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

// import javax libraries
import javax.swing.JApplet;

// class name and extention of JApplet
public class Boat extends JApplet {
	
    // if this is not included in eclipse it gives a warning
	private static final long serialVersionUID = 1L;

    
	public void paint ( Graphics g) {
        super.paint(g);
        // draw the mast
        g.drawLine(100, 100, 100, 250);
		
        // draw the inner rectangle for the base of the boat
        g.drawRect(50, 250, 100, 50);
        
        // declare two sails and outer base for the boat
		Polygon p = new Polygon(), p2 = new Polygon(), p3 = new Polygon();
		
        // add the points to the first polygon for the left sail
		p.addPoint(97, 100);
		p.addPoint(30, 240);
		p.addPoint(97, 240);
		
        // add the points to the second polygon for the right sail
		p2.addPoint(103, 100);
		p2.addPoint(173, 240);
		p2.addPoint(103, 240);
		
        // add the points to third polygon for the base of the boat
		p3.addPoint(40, 260);
		p3.addPoint(160, 260);
		p3.addPoint(150, 300);
		p3.addPoint(50, 300);
		
        // add color to each polygon and rectangle
		g.setColor(Color.BLUE);
		g.fillRect(50, 250, 100, 50);
		g.setColor(Color.GREEN);
		g.fillPolygon(p3);
		g.setColor(Color.GRAY);
		g.fillPolygon(p);
		g.fillPolygon(p2);
		
        // draw each polygon
		g.drawPolygon(p);
		g.drawPolygon(p2);
		g.drawPolygon(p3);
	}
}