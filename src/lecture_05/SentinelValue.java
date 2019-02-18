package lecture_05;
// import Scanner class
import java.util.Scanner;

/*
 * program reads & sums an unspecified number of integers.
 * the input '0' (sentinel value) signifies the end of input.
 */
public class SentinelValue {
	// main method
	public static void main(String[] args) {
		
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Enter an int value (0 to exit): ");
		int num = input.nextInt();
		
		// compute sum & read next number
		int sum = 0;
		while (num != 0) {
			sum += num;
			
			// read next number
			System.out.println("Enter an int value (0 to exit): ");
			num = input.nextInt();
		}
		// print result to console
		System.out.println("The sum is: " + sum);
		
		// close Scanner input object
		input.close();
	}

}
