package multimediaProgramming.assignmentFive;

/*
 * Reference: http://www.tutorialspoint.com/java/java_multithreading.htm
 * */

/**
 * 
 * @author Brian<br>
 * Student number: 20063914<br>
 * Date: 13/04/2016
 * Program Description: By extending the Thread class.
 * 						Create a method that will run to guess a user generated number.
 * 						Also Track the number of guesses it takes the computer.
 */

public class GuessANumber extends Thread {
	
	// number to be guessed
	private int number;
	
	// constructor
	// assigns a value to class variable number
	public GuessANumber(int number) {
		this.number = number;
	}
	
	public void run() {
		// local variables to track total guess, and the guessed number
		int counter = 0, guess = 0;
		
		// do while loop to repeat the process of guessing
		do {
			// assigns a number between 1 - 100
			guess = (int) (Math.random() * 100 + 1);
			// prints the computers guess
			System.out.println(this.getName() + " guesses " + guess);
			// increments counter
			counter++;
		} while (guess != number);
		// loop repeats an unknown number of times until the computer guesses the correct number
		// numbers can be guessed more than once
		
		// prints the total number of guess 
		System.out.println("Correct! " + this.getName() + " in " + counter + " guesses.");
	}
	
	public static void main(String[] args) {
		new GuessANumber(100).run();
	}
}