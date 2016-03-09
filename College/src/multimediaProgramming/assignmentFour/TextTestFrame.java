package multimediaProgramming.assignmentFour;

/**
 * @version 1.20 2 Jul 1998
 * @author Cay Horstmann
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class TextTestFrame extends JFrame implements DocumentListener {
	
	private JTextField hourField;
	private JTextField minuteField;
	private ClockPanel clock;
	private int h = 12, m = 0;

	public TextTestFrame() {
		setTitle("TextTest");
		setSize(300, 200);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Container contentPane = getContentPane();

		// create panel for text field and place it in SOUTH area
		JPanel p = new JPanel();
		hourField = new JTextField("12", 3);
		p.add(hourField);
		// hourField.getDocument().addDocumentListener(this);
		hourField.getDocument().addDocumentListener(new DocumentListener() {
			public void insertUpdate(DocumentEvent e) {
				setClock();
				System.out.println("insert");
			}

			public void removeUpdate(DocumentEvent e) {
				setClock();
				System.out.println("update");
			}

			public void changedUpdate(DocumentEvent e) {
				System.out.println("change");
			}
		});
		minuteField = new JTextField("00", 3);
		p.add(minuteField);
		// minuteField.getDocument().addDocumentListener(this);
		hourField.getDocument().addDocumentListener(new DocumentListener() {
			public void insertUpdate(DocumentEvent e) {
				setClock();
			}

			public void removeUpdate(DocumentEvent e) {
				setClock();
			}

			public void changedUpdate(DocumentEvent e) {
				System.out.println("change");
			}
		});
		// create clock panel and place it in CENTER area
		contentPane.add(p, "South");
		clock = new ClockPanel();
		contentPane.add(clock, "Center");
		setVisible(true);
	}

	// methods in DocumentListener
	public void insertUpdate(DocumentEvent e) {
		// setClock();
	}

	public void removeUpdate(DocumentEvent e) {
//		setClock();
	}

	public void changedUpdate(DocumentEvent e) {
	}
	
	public void setClock() {
		try {
			if (!hourField.getText().isEmpty()) {
				h = Integer.parseInt(hourField.getText().trim());
			} 
			if (!minuteField.getText().isEmpty()) {
				m = Integer.parseInt(minuteField.getText().trim());
			}
		} catch (NumberFormatException e) {
			h = 12; 
			m = 0;
		}
		clock.setTime(h, m);			
	}

}