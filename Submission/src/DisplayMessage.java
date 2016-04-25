

/*
 * Reference: http://www.tutorialspoint.com/java/java_multithreading.htm
 * */

/**
 * 
 * @author Brian<br>
 * Student number: 20063914<br>
 * Date: 13/04/2016
 * Program Description: using the runnable interface to display a message to the console.
 */

public class DisplayMessage implements Runnable {
	
	private String message;
	
	public DisplayMessage(String message) {
		// constructor
		// simply assigns the value of message to the class variable
		this.message = message;
	}

	public void run() {
		while (true) {
			// infinite loop
			// prints out the message on a new line
			System.out.println(message);
		}
	}
	
	public static void main(String[] args) {
		new DisplayMessage("Message").run();
	}
}