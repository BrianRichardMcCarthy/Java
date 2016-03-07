/*
 * Student Name: Brian McCarthy
 * Student Number: 20063914
 * Date: 02/02/2016
 * Program Name: PolygonClient
 * */
 
package multimediaProgramming.assignmentTwo;
 // import java libraries
import java.awt.Color;
import java.awt.Graphics;

// imoprt javax libraries
import javax.swing.JApplet;

// class name and extention of JApplet
public class PolygonClient extends JApplet {
    
    // if this is not included in eclipse it gives a warning
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		super.paint(g);
        // paint graphics
        
        // declare three instances of PolygonAssignment,
        // one using default constructor,
        // two of constructor with parameter list
        // should have named PolygonAssignment something like myPolygon
		PolygonAssignment p = new PolygonAssignment(), p2 = new PolygonAssignment(150, 50, 2), p3 = new PolygonAssignment(350, 50, 2);
		
        // draw each of the instances of PolygonAssignment
        p.drawPoloygon(g, Color.BLUE);
		p2.drawPoloygon(g, Color.RED);
		p3.drawPoloygon(g, Color.GREEN);
	}
}
