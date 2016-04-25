package multimediaProgramming.assignmentFive;

/*
 * Reference: http://www.tutorialspoint.com/java/java_multithreading.htm
 * */

/**
 * 
 * @author Brian<br>
 * Student number: 20063914<br>
 * Date: 13/04/2016
 * Program Description: using the runnable interface. 
 * 						create two instances of this class. 
 * 						run their threads. 
 * 						each time their thread is run print their assigned name.
 */

public class RunnableDemo implements Runnable {

	private Thread t;
	private String name;
	
	// constructor takes one string as a parameter
	public RunnableDemo(String name) {
		// assigns the name parameter to the local variable name
		this.name = name;
		// prints the thread is created although it actually isn't until the start method is called
		System.out.println("Thread " + this.name + " Created.");
	}
	
	public void run() {
		System.out.println("Running Thread " + name);
		try {
			// print out the threads name
			// infinite loop
			for (int i = 4; 1 > 0; i--) {
				System.out.println(name);
				// sleep the thread for one second
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// only printed when an exception is thrown
			System.out.println("Thread " + name + " interrupted.");
		}
		// doesn't get printed
		System.out.println("Thread " + name + " exiting.");
	}
	
	public void start() {
		// print a message that the thread is starting
		System.out.println("Thread " + name + " starting.");
		
		// check if t has been assigned a new thread
		if (t == null) {
			// if not the using the thread constructor and this class and class variable string name create a new thread
			t = new Thread(this, name);
			// start the thread
			t.start();
		}
	}
	
	public static void main(String[] args) {
		
		// create two instances of the Runnable demo class. Once created call their start methods.
		RunnableDemo r1 = new RunnableDemo("One");
		r1.start();
		RunnableDemo r2 = new RunnableDemo("Two");
		r2.start();
	}

}
