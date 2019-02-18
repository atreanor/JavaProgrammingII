package lecture_04;
// import Scanner class
import java.util.Scanner;

/*
 * program reads two cities from console & displays in alphabetical order
 */

public class OrderTwoCities {
	// main method
	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user to input two cities
		System.out.print("Enter the name of two cities, separated by a space & hit enter: ");
		
		// assign cities to variables
		String city1 = input.next();
		String city2 = input.next();
		
		// compare city1 vs city2 to define which has alphabetical precedence 
		if (city1.compareToIgnoreCase(city2) < 0) {
			System.out.println("Cities in alphabetical order: " + city2 + ", " + city1);
		}
		else {
			System.out.println("Cities in alphabeical order: " + city1 + ", " + city2);
		}
		// close input object
		input.close();
	}

}
