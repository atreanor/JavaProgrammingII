package lecture_03;

import java.util.Scanner;

// import Scanner class
/*
 * program reads in a number & checks whether it is:
 * - divisible by both 2 & 3
 * - divisible by 2 or 3 or both
 * - divisible by 2 or 3 but not both
 */
public class TestBooleanOperators {
	// main method
	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for integer
		System.out.println("Enter an integer for testing: ");
		int num = input.nextInt();
		
		// check num divisible by both 2 & 3
		boolean and = (num % 2 == 0) && (num % 3 == 0);
		System.out.println("Is " + num + " divisible by both 2 & 3? Answer: " + and);
		
		// check num divisible by 2 or 3 or both
		boolean or = (num % 2 == 0) || (num % 3 == 0);
		System.out.println("Is " + num + " divisible by 2 or 3, or both? Answer: "+ or);
		
		// check num divisible by 2 or 3, but not both
		boolean xor = (num % 2 == 0) ^ (num % 3 == 0);
		System.out.println("Is " + num + " divisible by 2 or 3, but not both? Answer: " + xor);
		
		// close input object
		input.close();
	}

}
