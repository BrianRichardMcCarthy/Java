/**
 * @author Brian McCarthy
 * @version 1.0
 * Student Number: 20063914
 * Date: 13/04/2016
 * Program Description Creates a thread that every one second prints a random number between 2 - 12 for 12 seconds
 */

package multimediaProgramming.assignmentFive;

import java.util.Random;

public class Assignment implements Runnable {

	/**
	 * @param runner (Thread)
	 * @param rand (Random)
	 */
	private Thread runner;
	private Random rand = new Random();

	/**
	 * Constructor for class Assignment.<br>
	 * creates a new Thread using this class and the parameter name.<br>
	 * Finally it starts the thread.
	 * @param name (String) name of new Thread.
	 */
	private Assignment(String name) {
		runner = new Thread(this, name);
		runner.start();
	}

	/**
	 * Tweleve times.<br> 
	 * a random number between 2 - 12 is generated.<br>
	 * Then the thread sleeps for one second.
	 * 
	 */
	public void run() {
		for (int x = 0; x < 12; x++) {
			/*
			 * rand.nextInt(11) + 2 generates a number between 0 - 10 and adds 2
			 * So if the rand.nextInt(11) is zero then num will be two
			 * Likewise if rand.nextInt(11) is ten then num will be twelve
			 */
			int num = rand.nextInt(11) + 2;
			System.out.println("Number: " + num);
			try {
				runner.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		new Assignment("Random Number Thread");
	}

}