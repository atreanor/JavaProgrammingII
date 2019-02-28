package practical_01;
// import Scanner class
import java.util.Scanner;

/*
 * program reads distance to drive, fuel efficiency of car in miles per gallon, 
 * price per gallon and displays the cost of trip to console
 */
public class CostOfTrip {
	// main mehtod
	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input, store values
		System.out.println("Enter distance to travel in miles: ");
		double miles = input.nextDouble();
		System.out.println("Enter fuel efficiency in mpg: ");
		double mpg = input.nextDouble();
		System.out.println("Enter cost of fuel per gallon: ");
		double fuel = input.nextDouble();
		
		// calculate cost, print result to console
		double cost = (miles / mpg) * fuel;
		System.out.println("Cost of journey of " + miles + " miles is: " + cost);
		
		// close Scanner input object
		input.close();
	}

}
