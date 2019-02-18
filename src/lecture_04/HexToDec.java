package lecture_04;
// import Scanner class
import java.util.Scanner;

/*
 * program to convert a hexadecimal digit into a decimal value
 */

public class HexToDec {
	public static int dec;
	// main method
	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		// prompt user for hexadecimal digit
		System.out.println("Enter a Hexadecimal digit for conversion: ");
		
		// assign value to ch
		char ch = input.next().charAt(0);
		int decimal;
		System.out.println(ch); // test - print ch value
		
		// get decimal value for hex digit
		if (Character.isDigit(ch)) {
			decimal = ch - '0'; // Unicode decimal value for '0' is 48
		}
		else if (ch >= 'A' && ch <= 'F') {
			decimal = ch - 'A' + 10; // Unicode decimal value for 'A' is 65 
		}
		else {
			decimal = -1;
		}
		
		// print result to console
		if (decimal != -1) {
			System.out.println("The decimal value for " + ch + " is " + decimal);
		}
		else {
			System.out.println(ch + " is not a valid hex digit");
		}
		
		// close input object
		input.close();
	}

}
