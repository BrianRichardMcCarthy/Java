package multimediaProgramming.finalAssignment;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {

	public String text = "Choose Genre";
	private int posX, posY;
	
	public Panel(String t, int x, int y) {
		setText(t);
		setX(x);
		setY(y);
		setLayout(new FlowLayout());
	}
	
	public Panel() {
		setLayout(new FlowLayout());
	}
	
	public void setText(String t) {
		this.text = t;
	}
	
	public void setX(int x) {
		this.posX = x;
	}
	
	public void setY(int y) {
		this.posY = y;
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!text.equals(null))
        	g.drawString(text, posX, posY);
    }
	
	public void addToPanel(Component g) {
		this.add(g);
	}
}