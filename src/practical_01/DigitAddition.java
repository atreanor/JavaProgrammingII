package practical_01;
// import Scanner class
import java.util.Scanner;

/*
 * program reads an integer between 0 - 999 from console & adds all the digits
 * in the integer. ie. int 932 = 9 + 3 + 2 = 14
 */

public class DigitAddition {
	// main method
	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Enter an integer between 0 - 999: ");
		int num = input.nextInt();
		
		// strip integer into digits
		int digit1 = num % 10;
		int num1 = num / 10;
		int digit2 = num1 % 10;
		int digit3 = num1 / 10;
		
		// sum digits
		int sum = digit1 + digit2 + digit3;
		System.out.println("Sum of digits of " + num + ": " + sum);
		
		// close scanner input object
		input.close();
	}

}
