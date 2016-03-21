package multimediaProgramming.finalAssignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Button class for media player assignment.
 * <br> Extends class JButton.
 * @author Brian McCarthy.
 * @version 0.1.
 *
 */
public class Button extends JButton {
	
	private boolean state = false;
	
	/**
	 * Constructor for Button Class.
	 * @param state (boolean) state of button.
	 * @param name (String) name of button.
	 */
	public Button(boolean state, String name) {
		setText(name);
		setState(state);
	}

	/**
	 * Mutator method for state variable.
	 * @param state (boolean) set the current state of the button.
	 */
	public void setState(boolean state) {
		setEnabled(this.state = state);
	}
	
	/**
	 * change the state of the button to the opposite of previous state. 
	 * <br>E.g. (true to false, false to true).
	 */
	public void press() {
		setState(!state);
	}

	/** Accessor for the state variable.
	 * get the current state of the button.
	 * @return (boolean) state.
	 */
	public boolean getState() {
		return state;
	}	
	
}