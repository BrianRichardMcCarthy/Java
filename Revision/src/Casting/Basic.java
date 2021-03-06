package Casting;

/**
 * 
 * @author Brian McCarthy
 * Casting primative data types to other primative data types
 *
 */
public class Basic {

	public static void main(String[] args) {
		float fValue = 32.5f;
		int iValue = (int) fValue;
		
		// prints 32
		System.out.println("Number Casting: " + iValue);
		
		iValue = Math.round(fValue);
		
		// prints 33
		System.out.println("Math rounding: " + iValue);
	}

}
