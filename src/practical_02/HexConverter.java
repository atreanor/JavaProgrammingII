package practical_02;
// import Scanner class
import java.util.Scanner;

/*
 * Program reads input from console between 0 -15 & prints Hex value to console
 */

public class HexConverter {
	//main method
	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input between 0 - 15
		System.out.println("Enter an integer between 0 - 15: ");
		int num = input.nextInt();
		char hex = 'A';
		if (num < 0 || num > 15) {
			System.out.println("Error, number must be between 0 - 15.");
		}
		else if (num >= 0 && num <= 9) {
			hex = (char)num;
		}
		else {
			switch (num) {
			case 10:
				hex = 'A';
			case 11:
				hex = 'B';
			case 12:
				hex = 'C';
			case 13:
				hex = 'D';
			case 14:
				hex = 'E';
			case 15:
				hex = 'F';
		}
			
		System.out.println("Hex value of " + num + ": " + hex);
		
		// close Scanner input object
		input.close();
		}
	}

}
