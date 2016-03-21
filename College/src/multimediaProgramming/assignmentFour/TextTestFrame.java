package multimediaProgramming.assignmentFour;

/*	Student Name: Brian McCarthy
 * 	Student Number: 20063914
 * 	Program Name: TextTestFrame
 * 	Date: 16/03/2016
 * */
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class TextTestFrame extends JFrame implements DocumentListener {
	
	// class variables
	private JTextField hourField;
	private JTextField minuteField;
	private JTextField monthOutputField;
	private ClockPanel clock;
	public JTextField day;
	public JTextField month;
	public DatePanel date;
	private String[] months = { "January", "Febuary", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	public TextTestFrame() {

		Container contentPane = getContentPane();

		// setting up the panel and text fields for the south border
		JPanel panelClock = new JPanel();
		hourField = new JTextField("1", 3);
		panelClock.add(hourField);
		
		// listener
		hourField.getDocument().addDocumentListener(this);

		minuteField = new JTextField("00", 3);
		panelClock.add(minuteField);
		
		// listener
		minuteField.getDocument().addDocumentListener(this);

		monthOutputField = new JTextField("", 10);
		panelClock.add(monthOutputField);

		contentPane.add(panelClock, BorderLayout.SOUTH);
		
		// creating a new clock and adding it to the west
		clock = new ClockPanel();
		contentPane.add(clock, BorderLayout.WEST);

		JPanel panelMonth = new JPanel();
		day = new JTextField("3", 3);
		
		// listener
		day.getDocument().addDocumentListener(this);
		panelMonth.add(day);

		month = new JTextField("3", 3);
		
		// listener
		month.getDocument().addDocumentListener(this);
		panelMonth.add(month);

		date = new DatePanel();
		contentPane.add(date, BorderLayout.CENTER);
		contentPane.add(panelMonth, BorderLayout.NORTH);
		
		// set the close operation, title, size and visibility of the window
		setTitle("TextTest");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	


	public void check() {
		if (!hourField.getText().equals("") || !minuteField.getText().equals("")) {
			// checks if there is a value in the hour field or the minute field
			setClock();
		}
		if (!day.getText().equals("")) {
			// check the day field is not empty
			date.set(day.getText());
		}
		if (!month.getText().equals("")) {
			// check the month field is not empty
			printMonth();
		}

	}

	
	// document listener methods each calls the check method which validates the date
	public void insertUpdate(DocumentEvent e) {
		check();
	}

	public void removeUpdate(DocumentEvent e) {
		check();
	}

	public void changedUpdate(DocumentEvent e) {
		check();
	}

	public void setClock() {
		// set the clock hands
		int hours = Integer.parseInt(hourField.getText().trim());
		int minutes = Integer.parseInt(minuteField.getText().trim());
		clock.set(hours, minutes);
	}
	
	public void printMonth() {
		// method to print the month
		
		// index value to gget the month
		int index = Integer.parseInt(month.getText().trim());
		
		// check if index is a valid month
		if ((index <= 0) || (index > 12)) {
			// if statement is true when index is equal to or less that 0
			// greater than 12
			System.out.println("Wrong Value");
		} else {
			// else index is a valid month
			monthOutputField.setText(months[index - 1]);
		}
	}
	

}
