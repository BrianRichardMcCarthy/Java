/*
 * Student Name: Brian McCarthy
 * Student Number: 20063914
 * Date: 02/02/2016
 * Program Name: PolygonAssignment
 * */
 
package multimediaProgramming.assignmentTwo;
 // import java libraries
import java.awt.Polygon;
import java.awt.Color;
import java.awt.Graphics;

public class PolygonAssignment {
	
    // declare and instancate new polygon obect
	private Polygon p = new Polygon();
	
	public PolygonAssignment() {
        // default contructor
		p.addPoint(50, 50);
		p.addPoint(50, 100);
		p.addPoint(100, 150);
		p.addPoint(100, 100);
		p.addPoint(50, 50);
	}
	
	public PolygonAssignment(int xStart, int yStart, double scale) {
		// constructor with parameters
        p.addPoint(xStart, yStart);
		p.addPoint(xStart + xStart/2, yStart/2);
		p.addPoint(xStart + xStart, yStart);
		p.addPoint(xStart + xStart, (int) ( yStart * scale));
		p.addPoint(xStart, (int) ( yStart * scale));
	}
	
	public void drawPoloygon(Graphics g, Color color) {
        /* set color
         * fill polygon
         * draw polygon
		 * */
        g.setColor(color);
		g.fillPolygon(p);
		g.drawPolygon(p);
	}
}