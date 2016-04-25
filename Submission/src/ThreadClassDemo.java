

/*
 * Reference: http://www.tutorialspoint.com/java/java_multithreading.htm
 * */

public class ThreadClassDemo {
	
	public static void main(String[] args) {
		
		// Create a new instance of display message class with "Hello" as its message
		Runnable hello = new DisplayMessage("Hello");
		// assign it to a new thread called thread1
		Thread thread1 = new Thread(hello);
		// set thread1 to a background thread
		thread1.setDaemon(true);
		// set thread name to "Hello"
		thread1.setName("Hello");
		// prints starting hello thread
		System.out.println("Starting Hello Thread");
		// start thread1
		thread1.start();
		
		// same process for thread 2 as thread one
		// just replace hello with goodbye
		Runnable bye = new DisplayMessage("GoodBye");
		Thread thread2 = new Thread(bye);
		thread2.setDaemon(true);
		thread2.setName("GoodBye");
		System.out.println("Starting GoodBye Thread");
		thread2.start();
		
		// prints the message starting thread 3
		System.out.println("Starting thread 3");
		// new instance of GuessANumber with the number 27
		Thread thread3 = new GuessANumber(27);
		// start thread3
		thread3.start();
		try {
			// join thread3 to other threads running
			// thread3 won't run until other threads are finish
			thread3.join();
		} catch (Exception e) {
			System.out.println("Thread Interrupted");
		}
		
		// prints the message starting thread 4
		System.out.println("Starting thread 4");
		// new instance of GuessANumber with the number 1
		Thread thread4 = new GuessANumber(1);
		// start thread4
		thread4.start();
		// prints the message that the main thread is ending
		System.out.println("Main Thread is ending.");
	}
	
}
