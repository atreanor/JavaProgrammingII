package practical_01;
// import Scanner class
import java.util.Scanner;

/*
 * program reads subtotal & gratuity rate from the console, calculates & 
 * displays the gratuity & total amount to console
 */
public class GratuityCalc {
	// main method
	public static void main(String[] args) {
		// create scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Enter subtotal of bill: ");
		double subTotal = input.nextDouble();
		
		System.out.println("Enter gratuity rate: ");
		int gratRate = input.nextInt();
		
		// calculate gratuity amount & total, print result to console
		double gratAmount = (subTotal / 100.0) * gratRate; 
		System.out.println("Test: " + gratAmount);
		double total = subTotal + gratAmount;
		System.out.println("Gratuity Amount: " + gratAmount + "\nTotal Amount: " + total);
		
		// close scanner input object
		input.close();
	}

}
