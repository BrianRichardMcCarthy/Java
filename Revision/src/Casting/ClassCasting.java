package Casting;

public class ClassCasting {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Enemy e1 = new Enemy();
		
		// Before Running, expected output: 1 Hello Citizien
		// Actual output: 2 Hello Citizen
		// Because Enemy extends Person and person contrustor 
		p1.speak();
		
		// 1 Hand over your wallet
		e1.speak();
		
		// Keep your wallet
		e1.surrender();
		
		// upcasting
		Person p2 = e1;
		// 1 Hello Citizien
		p2.speak();
		
		try {
			// downcasting
			Person p3 = new Person();
			Enemy e3 = (Enemy) p3;
			e3.speak();
			e3.surrender();
		} catch (Exception e) {
			// 
		}

	}

}


class Person {
	
	private static int total = 0;
	
	public Person() { total++; }
	public void speak() { System.out.println(total + " Hello Citizien"); }
	
}

class Enemy extends Person {
	
	private static int total = 0;
	
	public Enemy() { total++; }
	public void rob() { System.out.println(total + " Hand over your wallet"); }
	public void surrender() { System.out.println("Keep your wallet"); }
	
}