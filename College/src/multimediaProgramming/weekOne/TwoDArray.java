package multimediaProgramming.weekOne;

import java.util.Scanner;

/*
* Student Name: Brian McCarthy
* Student Number: 20063914
* Date: 12/1/2016
* Program Name: TwoDArray
* Program Description: 	Program to allow the user to enter 
* 					   	the size of both the outer and inner
* 					   	2d array. Then allow the user to fill
* 						with integer values. Finally print
* 						out all the values in the array in
* 						in tabular forum.
* */
public class TwoDArray {

	public static void main(String args[]) {

		// Program to store user generated numbers into a two dimension array
		// and print values at each index.
		Scanner input = new Scanner(System.in);
		// get the length of outer array and inner array
		System.out.println("Enter size of outer array: ");
		int one = input.nextInt();
		System.out.println("Enter size of inner array: ");
		int two = input.nextInt();

		// declare the 2d array
		int[][] twoDArray = new int[one][two];

		// enter values for the array
		for (int a = 0; a < twoDArray.length; a++) {
			for (int b = 0; b < twoDArray[a].length; b++) {
				System.out.println("Enter Position: " + a + " Number: " + b);
				twoDArray[a][b] = input.nextInt();
			}
		}

		// print values for the array
		for (int c = 0; c < twoDArray.length; c++) {
			for (int d = 0; d < twoDArray[c].length; d++)
				System.out.print(twoDArray[c][d] + "\t");
			System.out.println();
		}
	}
}