package practical_01;
// import Scanner class
import java.util.Scanner;

/*
 * program reads coordinates from console (x1, y1) (x2, y2), calculates & displays distance
 */
public class DistanceCalc {
	// main method
	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for coordinates
		System.out.println("Enter first set of x y coordinates separated by space: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter second set of x y coordinates separated by space: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// calculate distance between coordinates, print result
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Distance between coordinates: " + distance);
		
		// close Scanner input object
		input.close();
	}

}
