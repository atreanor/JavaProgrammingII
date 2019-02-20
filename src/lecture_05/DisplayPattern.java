package lecture_05;
// import Scanner class
import java.util.Scanner;

/*
 * program reads integer from console & displays a pattern relative to number
 */

public class DisplayPattern {
	// main method
	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Enter an integer & hit enter: ");
		
		// assign input to variable
		int num = input.nextInt();
		
		// nested loop creates design
		for (int i = 1; i <= num; i++) { // outer loop
			System.out.println();
			for (int j = 1; j <= i; j++) { // inner loop
				System.out.print(j + " ");
			}
		}
		// close Scanner input object
		input.close();
	}

}
